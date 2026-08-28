import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public class flu {
   public static final int a = -1;
   private final List<flv> b;
   private final List<String> c;
   private final int d;
   private final int e;
   private final int[] f = new int[32];
   @Nullable
   private fii g;
   @Nullable
   private fii h;

   flu(List<flv> $$0, List<String> $$1, IntList $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$3;
      this.e = $$0.stream().mapToInt(flv::a).reduce(0, ($$0x, $$1x) -> $$0x | $$1x);

      for (int $$4 = 0; $$4 < this.f.length; $$4++) {
         flv $$5 = flv.a($$4);
         int $$6 = $$5 != null ? $$0.indexOf($$5) : -1;
         this.f[$$4] = $$6 != -1 ? $$2.getInt($$6) : -1;
      }
   }

   public static flu.a a() {
      return new flu.a();
   }

   @Override
   public String toString() {
      return "VertexFormat" + this.c;
   }

   public int b() {
      return this.d;
   }

   public List<flv> c() {
      return this.b;
   }

   public List<String> d() {
      return this.c;
   }

   public int[] e() {
      return this.f;
   }

   public int a(flv $$0) {
      return this.f[$$0.c()];
   }

   public boolean b(flv $$0) {
      return (this.e & $$0.a()) != 0;
   }

   public int f() {
      return this.e;
   }

   public String c(flv $$0) {
      int $$1 = this.b.indexOf($$0);
      if ($$1 == -1) {
         throw new IllegalArgumentException($$0 + " is not contained in format");
      } else {
         return this.c.get($$1);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof flu $$1 && this.e == $$1.e && this.d == $$1.d && this.c.equals($$1.c) && Arrays.equals(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.e * 31 + Arrays.hashCode(this.f);
   }

   public fii a(ByteBuffer $$0) {
      flc $$1 = RenderSystem.getDevice();
      if (this.g == null) {
         this.g = $$1.a(() -> "Immediate vertex buffer for " + this, fig.a, fih.a, $$0);
      } else {
         flb $$2 = $$1.b();
         if (this.g.a() < $$0.remaining()) {
            this.g.close();
            this.g = $$1.a(() -> "Immediate vertex buffer for " + this, fig.a, fih.a, $$0);
         } else {
            $$2.a(this.g, $$0, 0);
         }
      }

      return this.g;
   }

   public fii b(ByteBuffer $$0) {
      flc $$1 = RenderSystem.getDevice();
      if (this.h == null) {
         this.h = RenderSystem.getDevice().a(() -> "Immediate index buffer for " + this, fig.b, fih.a, $$0);
      } else {
         flb $$2 = $$1.b();
         if (this.h.a() < $$0.remaining()) {
            this.h.close();
            this.h = RenderSystem.getDevice().a(() -> "Immediate index buffer for " + this, fig.b, fih.a, $$0);
         } else {
            $$2.a(this.h, $$0, 0);
         }
      }

      return this.h;
   }

   public static class a {
      private final Builder<String, flv> a = ImmutableMap.builder();
      private final IntList b = new IntArrayList();
      private int c;

      a() {
      }

      public flu.a a(String $$0, flv $$1) {
         this.a.put($$0, $$1);
         this.b.add(this.c);
         this.c = this.c + $$1.b();
         return this;
      }

      public flu.a a(int $$0) {
         this.c += $$0;
         return this;
      }

      public flu a() {
         ImmutableMap<String, flv> $$0 = this.a.buildOrThrow();
         ImmutableList<flv> $$1 = $$0.values().asList();
         ImmutableList<String> $$2 = $$0.keySet().asList();
         return new flu($$1, $$2, this.b, this.c);
      }
   }

   public static enum b {
      a(2),
      b(4);

      public final int c;

      private b(final int $$0) {
         this.c = $$0;
      }

      public static flu.b a(int $$0) {
         return ($$0 & -65536) != 0 ? b : a;
      }
   }

   public static enum c {
      a(2, 2, false),
      b(2, 1, true),
      c(2, 2, false),
      d(2, 1, true),
      e(3, 3, false),
      f(3, 1, true),
      g(3, 1, true),
      h(4, 4, false);

      public final int i;
      public final int j;
      public final boolean k;

      private c(final int $$0, final int $$1, final boolean $$2) {
         this.i = $$0;
         this.j = $$1;
         this.k = $$2;
      }

      public int a(int $$0) {
         return switch (this) {
            case a, h -> $$0 / 4 * 6;
            case b, c, d, e, f, g -> $$0;
            default -> 0;
         };
      }
   }
}
