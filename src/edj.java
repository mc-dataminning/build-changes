import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface edj {
   Codec<edj> b = edk.b;
   Codec<jq<edj>> c = alv.a(mb.aM, b);
   Codec<edj> d = c.xmap(edk.j::new, $$0 -> (jq)($$0 instanceof edk.j $$1 ? $$1.j() : new jq.a<>($$0)));

   double a(edj.b var1);

   void a(double[] var1, edj.a var2);

   edj a(edj.f var1);

   double a();

   double b();

   azx<? extends edj> c();

   default edj a(double $$0, double $$1) {
      return new edk.g(this, $$0, $$1);
   }

   default edj d() {
      return edk.a(this, edk.k.a.a);
   }

   default edj e() {
      return edk.a(this, edk.k.a.b);
   }

   default edj f() {
      return edk.a(this, edk.k.a.c);
   }

   default edj g() {
      return edk.a(this, edk.k.a.d);
   }

   default edj h() {
      return edk.a(this, edk.k.a.e);
   }

   default edj i() {
      return edk.a(this, edk.k.a.f);
   }

   public interface a {
      edj.b a(int var1);

      void a(double[] var1, edj var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default ees d() {
         return ees.a();
      }
   }

   public static record c(jq<eta.a> b, @Nullable eta c) {
      public static final Codec<edj.c> a = eta.a.b.xmap($$0 -> new edj.c($$0, null), edj.c::b);

      public c(jq<eta.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends edj {
      @Override
      default void a(double[] $$0, edj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default edj a(edj.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements edj.b {
   }

   public interface f {
      edj apply(edj var1);

      default edj.c a(edj.c $$0) {
         return $$0;
      }
   }
}
