import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class faf {
   private final ImmutableList<fag> a;
   private final ImmutableMap<String, fag> b;
   private final IntList c = new IntArrayList();
   private final int d;
   @Nullable
   private fad e;

   public faf(ImmutableMap<String, fag> $$0) {
      this.b = $$0;
      this.a = $$0.values().asList();
      int $$1 = 0;
      UnmodifiableIterator var3 = $$0.values().iterator();

      while (var3.hasNext()) {
         fag $$2 = (fag)var3.next();
         this.c.add($$1);
         $$1 += $$2.e();
      }

      this.d = $$1;
   }

   @Override
   public String toString() {
      return "format: " + this.b.size() + " elements: " + this.b.entrySet().stream().map(Object::toString).collect(Collectors.joining(" "));
   }

   public int a() {
      return this.b() / 4;
   }

   public int b() {
      return this.d;
   }

   public ImmutableList<fag> c() {
      return this.a;
   }

   public ImmutableList<String> d() {
      return this.b.keySet().asList();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         faf $$1 = (faf)$$0;
         return this.d != $$1.d ? false : this.b.equals($$1.b);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public void e() {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(this::h);
      } else {
         this.h();
      }
   }

   private void h() {
      int $$0 = this.b();
      List<fag> $$1 = this.c();

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         $$1.get($$2).a($$2, (long)this.c.getInt($$2), $$0);
      }
   }

   public void f() {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(this::i);
      } else {
         this.i();
      }
   }

   private void i() {
      ImmutableList<fag> $$0 = this.c();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         fag $$2 = (fag)$$0.get($$1);
         $$2.a($$1);
      }
   }

   public fad g() {
      fad $$0 = this.e;
      if ($$0 == null) {
         this.e = $$0 = new fad(fad.a.b);
      }

      return $$0;
   }

   public static enum a {
      a(5123, 2),
      b(5125, 4);

      public final int c;
      public final int d;

      private a(final int $$0, final int $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      public static faf.a a(int $$0) {
         return ($$0 & -65536) != 0 ? b : a;
      }
   }

   public static enum b {
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

      private b(final int $$0, final int $$1, final int $$2, final boolean $$3) {
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
