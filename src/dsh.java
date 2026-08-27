import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dsh {
   Codec<dsh> b = dsi.b;
   Codec<il<dsh>> c = ajd.a(kj.ay, b);
   Codec<dsh> d = c.xmap(dsi.j::new, $$0 -> (il)($$0 instanceof dsi.j $$1 ? $$1.j() : new il.a<>($$0)));

   double a(dsh.b var1);

   void a(double[] var1, dsh.a var2);

   dsh a(dsh.f var1);

   double a();

   double b();

   awq<? extends dsh> c();

   default dsh a(double $$0, double $$1) {
      return new dsi.g(this, $$0, $$1);
   }

   default dsh d() {
      return dsi.a(this, dsi.k.a.a);
   }

   default dsh e() {
      return dsi.a(this, dsi.k.a.b);
   }

   default dsh f() {
      return dsi.a(this, dsi.k.a.c);
   }

   default dsh g() {
      return dsi.a(this, dsi.k.a.d);
   }

   default dsh h() {
      return dsi.a(this, dsi.k.a.e);
   }

   default dsh i() {
      return dsi.a(this, dsi.k.a.f);
   }

   public interface a {
      dsh.b a(int var1);

      void a(double[] var1, dsh var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dtq d() {
         return dtq.a();
      }
   }

   public static record c(il<ehs.a> b, @Nullable ehs c) {
      public static final Codec<dsh.c> a = ehs.a.b.xmap($$0 -> new dsh.c($$0, null), dsh.c::b);

      public c(il<ehs.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dsh {
      @Override
      default void a(double[] $$0, dsh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dsh a(dsh.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dsh.b {
   }

   public interface f {
      dsh apply(dsh var1);

      default dsh.c a(dsh.c $$0) {
         return $$0;
      }
   }
}
