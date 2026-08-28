import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface edb {
   Codec<edb> b = edc.b;
   Codec<jq<edb>> c = alv.a(mb.aL, b);
   Codec<edb> d = c.xmap(edc.j::new, $$0 -> (jq)($$0 instanceof edc.j $$1 ? $$1.j() : new jq.a<>($$0)));

   double a(edb.b var1);

   void a(double[] var1, edb.a var2);

   edb a(edb.f var1);

   double a();

   double b();

   azx<? extends edb> c();

   default edb a(double $$0, double $$1) {
      return new edc.g(this, $$0, $$1);
   }

   default edb d() {
      return edc.a(this, edc.k.a.a);
   }

   default edb e() {
      return edc.a(this, edc.k.a.b);
   }

   default edb f() {
      return edc.a(this, edc.k.a.c);
   }

   default edb g() {
      return edc.a(this, edc.k.a.d);
   }

   default edb h() {
      return edc.a(this, edc.k.a.e);
   }

   default edb i() {
      return edc.a(this, edc.k.a.f);
   }

   public interface a {
      edb.b a(int var1);

      void a(double[] var1, edb var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default eek d() {
         return eek.a();
      }
   }

   public static record c(jq<ess.a> b, @Nullable ess c) {
      public static final Codec<edb.c> a = ess.a.b.xmap($$0 -> new edb.c($$0, null), edb.c::b);

      public c(jq<ess.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends edb {
      @Override
      default void a(double[] $$0, edb.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default edb a(edb.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements edb.b {
   }

   public interface f {
      edb apply(edb var1);

      default edb.c a(edb.c $$0) {
         return $$0;
      }
   }
}
