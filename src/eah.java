import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface eah {
   Codec<eah> b = eai.b;
   Codec<jo<eah>> c = ala.a(lw.aL, b);
   Codec<eah> d = c.xmap(eai.j::new, $$0 -> (jo)($$0 instanceof eai.j $$1 ? $$1.j() : new jo.a<>($$0)));

   double a(eah.b var1);

   void a(double[] var1, eah.a var2);

   eah a(eah.f var1);

   double a();

   double b();

   ayy<? extends eah> c();

   default eah a(double $$0, double $$1) {
      return new eai.g(this, $$0, $$1);
   }

   default eah d() {
      return eai.a(this, eai.k.a.a);
   }

   default eah e() {
      return eai.a(this, eai.k.a.b);
   }

   default eah f() {
      return eai.a(this, eai.k.a.c);
   }

   default eah g() {
      return eai.a(this, eai.k.a.d);
   }

   default eah h() {
      return eai.a(this, eai.k.a.e);
   }

   default eah i() {
      return eai.a(this, eai.k.a.f);
   }

   public interface a {
      eah.b a(int var1);

      void a(double[] var1, eah var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default ebq d() {
         return ebq.a();
      }
   }

   public static record c(jo<epw.a> b, @Nullable epw c) {
      public static final Codec<eah.c> a = epw.a.b.xmap($$0 -> new eah.c($$0, null), eah.c::b);

      public c(jo<epw.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends eah {
      @Override
      default void a(double[] $$0, eah.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default eah a(eah.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements eah.b {
   }

   public interface f {
      eah apply(eah var1);

      default eah.c a(eah.c $$0) {
         return $$0;
      }
   }
}
