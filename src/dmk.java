import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dmk {
   Codec<dmk> b = dml.b;
   Codec<ib<dmk>> c = age.a(jz.av, b);
   Codec<dmk> d = c.xmap(dml.j::new, $$0 -> (ib)($$0 instanceof dml.j $$1 ? $$1.j() : new ib.a<>($$0)));

   double a(dmk.b var1);

   void a(double[] var1, dmk.a var2);

   dmk a(dmk.f var1);

   double a();

   double b();

   atg<? extends dmk> c();

   default dmk a(double $$0, double $$1) {
      return new dml.g(this, $$0, $$1);
   }

   default dmk d() {
      return dml.a(this, dml.k.a.a);
   }

   default dmk e() {
      return dml.a(this, dml.k.a.b);
   }

   default dmk f() {
      return dml.a(this, dml.k.a.c);
   }

   default dmk g() {
      return dml.a(this, dml.k.a.d);
   }

   default dmk h() {
      return dml.a(this, dml.k.a.e);
   }

   default dmk i() {
      return dml.a(this, dml.k.a.f);
   }

   public interface a {
      dmk.b a(int var1);

      void a(double[] var1, dmk var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dnt d() {
         return dnt.a();
      }
   }

   public static record c(ib<ebv.a> b, @Nullable ebv c) {
      public static final Codec<dmk.c> a = ebv.a.b.xmap($$0 -> new dmk.c($$0, null), dmk.c::b);

      public c(ib<ebv.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dmk {
      @Override
      default void a(double[] $$0, dmk.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dmk a(dmk.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dmk.b {
   }

   public interface f {
      dmk apply(dmk var1);

      default dmk.c a(dmk.c $$0) {
         return $$0;
      }
   }
}
