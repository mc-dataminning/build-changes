import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dyn {
   Codec<dyn> b = dyo.b;
   Codec<ja<dyn>> c = akp.a(li.aD, b);
   Codec<dyn> d = c.xmap(dyo.j::new, $$0 -> (ja)($$0 instanceof dyo.j $$1 ? $$1.j() : new ja.a<>($$0)));

   double a(dyn.b var1);

   void a(double[] var1, dyn.a var2);

   dyn a(dyn.f var1);

   double a();

   double b();

   ayg<? extends dyn> c();

   default dyn a(double $$0, double $$1) {
      return new dyo.g(this, $$0, $$1);
   }

   default dyn d() {
      return dyo.a(this, dyo.k.a.a);
   }

   default dyn e() {
      return dyo.a(this, dyo.k.a.b);
   }

   default dyn f() {
      return dyo.a(this, dyo.k.a.c);
   }

   default dyn g() {
      return dyo.a(this, dyo.k.a.d);
   }

   default dyn h() {
      return dyo.a(this, dyo.k.a.e);
   }

   default dyn i() {
      return dyo.a(this, dyo.k.a.f);
   }

   public interface a {
      dyn.b a(int var1);

      void a(double[] var1, dyn var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dzw d() {
         return dzw.a();
      }
   }

   public static record c(ja<eoh.a> b, @Nullable eoh c) {
      public static final Codec<dyn.c> a = eoh.a.b.xmap($$0 -> new dyn.c($$0, null), dyn.c::b);

      public c(ja<eoh.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dyn {
      @Override
      default void a(double[] $$0, dyn.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dyn a(dyn.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dyn.b {
   }

   public interface f {
      dyn apply(dyn var1);

      default dyn.c a(dyn.c $$0) {
         return $$0;
      }
   }
}
