import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public class fkd {
   public static final int a = -1;
   private final List<fke> b;
   private final List<String> c;
   private final int d;
   private final int e;
   private final int[] f = new int[32];
   @Nullable
   private fkb g;

   fkd(List<fke> $$0, List<String> $$1, IntList $$2, int $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$3;
      this.e = $$0.stream().mapToInt(fke::a).reduce(0, ($$0x, $$1x) -> $$0x | $$1x);

      for (int $$4 = 0; $$4 < this.f.length; $$4++) {
         fke $$5 = fke.a($$4);
         int $$6 = $$5 != null ? $$0.indexOf($$5) : -1;
         this.f[$$4] = $$6 != -1 ? $$2.getInt($$6) : -1;
      }
   }

   public static fkd.a a() {
      return new fkd.a();
   }

   public void a(int $$0) {
      int $$1 = 0;

      for (String $$2 : this.d()) {
         GlStateManager._glBindAttribLocation($$0, $$1, $$2);
         $$1++;
      }
   }

   @Override
   public String toString() {
      return "VertexFormat" + this.c;
   }

   public int b() {
      return this.d;
   }

   public List<fke> c() {
      return this.b;
   }

   public List<String> d() {
      return this.c;
   }

   public int[] e() {
      return this.f;
   }

   public int a(fke $$0) {
      return this.f[$$0.c()];
   }

   public boolean b(fke $$0) {
      return (this.e & $$0.a()) != 0;
   }

   public int f() {
      return this.e;
   }

   public String c(fke $$0) {
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
         if ($$0 instanceof fkd $$1 && this.e == $$1.e && this.d == $$1.d && this.c.equals($$1.c) && Arrays.equals(this.f, $$1.f)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.e * 31 + Arrays.hashCode(this.f);
   }

   public void g() {
      RenderSystem.assertOnRenderThread();
      int $$0 = this.b();

      for (int $$1 = 0; $$1 < this.b.size(); $$1++) {
         GlStateManager._enableVertexAttribArray($$1);
         fke $$2 = this.b.get($$1);
         $$2.a($$1, (long)this.a($$2), $$0);
      }
   }

   public void h() {
      RenderSystem.assertOnRenderThread();

      for (int $$0 = 0; $$0 < this.b.size(); $$0++) {
         GlStateManager._disableVertexAttribArray($$0);
      }
   }

   public fkb i() {
      fkb $$0 = this.g;
      if ($$0 == null) {
         this.g = $$0 = new fkb(fhm.a);
      }

      return $$0;
   }

   public static class a {
      private final Builder<String, fke> a = ImmutableMap.builder();
      private final IntList b = new IntArrayList();
      private int c;

      a() {
      }

      public fkd.a a(String $$0, fke $$1) {
         this.a.put($$0, $$1);
         this.b.add(this.c);
         this.c = this.c + $$1.b();
         return this;
      }

      public fkd.a a(int $$0) {
         this.c += $$0;
         return this;
      }

      public fkd a() {
         ImmutableMap<String, fke> $$0 = this.a.buildOrThrow();
         ImmutableList<fke> $$1 = $$0.values().asList();
         ImmutableList<String> $$2 = $$0.keySet().asList();
         return new fkd($$1, $$2, this.b, this.c);
      }
   }

   public static enum b {
      a(5123, 2),
      b(5125, 4);

      public final int c;
      public final int d;

      private b(final int $$0, final int $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public static fkd.b a(int $$0) {
         return ($$0 & -65536) != 0 ? b : a;
      }
   }

   public static enum c {
      a(4, 2, 2, false),
      b(5, 2, 1, true),
      c(1, 2, 2, false),
      d(3, 2, 1, true),
      e(4, 3, 3, false),
      f(5, 3, 1, true),
      g(6, 3, 1, true),
      h(4, 4, 4, false);

      public final int i;
      public final int j;
      public final int k;
      public final boolean l;

      private c(final int $$0, final int $$1, final int $$2, final boolean $$3) {
         this.i = $$0;
         this.j = $$1;
         this.k = $$2;
         this.l = $$3;
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
