import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dnr {
   Codec<dnr> b = dns.b;
   Codec<ie<dnr>> c = agp.a(kc.aw, b);
   Codec<dnr> d = c.xmap(dns.j::new, $$0 -> (ie)($$0 instanceof dns.j $$1 ? $$1.j() : new ie.a<>($$0)));

   double a(dnr.b var1);

   void a(double[] var1, dnr.a var2);

   dnr a(dnr.f var1);

   double a();

   double b();

   ats<? extends dnr> c();

   default dnr a(double $$0, double $$1) {
      return new dns.g(this, $$0, $$1);
   }

   default dnr d() {
      return dns.a(this, dns.k.a.a);
   }

   default dnr e() {
      return dns.a(this, dns.k.a.b);
   }

   default dnr f() {
      return dns.a(this, dns.k.a.c);
   }

   default dnr g() {
      return dns.a(this, dns.k.a.d);
   }

   default dnr h() {
      return dns.a(this, dns.k.a.e);
   }

   default dnr i() {
      return dns.a(this, dns.k.a.f);
   }

   public interface a {
      dnr.b a(int var1);

      void a(double[] var1, dnr var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dpa d() {
         return dpa.a();
      }
   }

   public static record c(ie<edc.a> b, @Nullable edc c) {
      public static final Codec<dnr.c> a = edc.a.b.xmap($$0 -> new dnr.c($$0, null), dnr.c::b);

      public c(ie<edc.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dnr {
      @Override
      default void a(double[] $$0, dnr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dnr a(dnr.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dnr.b {
   }

   public interface f {
      dnr apply(dnr var1);

      default dnr.c a(dnr.c $$0) {
         return $$0;
      }
   }
}
