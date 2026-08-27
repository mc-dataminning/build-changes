import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dsf {
   Codec<dsf> b = dsg.b;
   Codec<il<dsf>> c = ajd.a(kj.ay, b);
   Codec<dsf> d = c.xmap(dsg.j::new, $$0 -> (il)($$0 instanceof dsg.j $$1 ? $$1.j() : new il.a<>($$0)));

   double a(dsf.b var1);

   void a(double[] var1, dsf.a var2);

   dsf a(dsf.f var1);

   double a();

   double b();

   awq<? extends dsf> c();

   default dsf a(double $$0, double $$1) {
      return new dsg.g(this, $$0, $$1);
   }

   default dsf d() {
      return dsg.a(this, dsg.k.a.a);
   }

   default dsf e() {
      return dsg.a(this, dsg.k.a.b);
   }

   default dsf f() {
      return dsg.a(this, dsg.k.a.c);
   }

   default dsf g() {
      return dsg.a(this, dsg.k.a.d);
   }

   default dsf h() {
      return dsg.a(this, dsg.k.a.e);
   }

   default dsf i() {
      return dsg.a(this, dsg.k.a.f);
   }

   public interface a {
      dsf.b a(int var1);

      void a(double[] var1, dsf var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dto d() {
         return dto.a();
      }
   }

   public static record c(il<ehq.a> b, @Nullable ehq c) {
      public static final Codec<dsf.c> a = ehq.a.b.xmap($$0 -> new dsf.c($$0, null), dsf.c::b);

      public c(il<ehq.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dsf {
      @Override
      default void a(double[] $$0, dsf.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dsf a(dsf.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dsf.b {
   }

   public interface f {
      dsf apply(dsf var1);

      default dsf.c a(dsf.c $$0) {
         return $$0;
      }
   }
}
