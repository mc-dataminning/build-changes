import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface ebj {
   Codec<ebj> b = ebk.b;
   Codec<jq<ebj>> c = alf.a(ma.aK, b);
   Codec<ebj> d = c.xmap(ebk.j::new, $$0 -> (jq)($$0 instanceof ebk.j $$1 ? $$1.j() : new jq.a<>($$0)));

   double a(ebj.b var1);

   void a(double[] var1, ebj.a var2);

   ebj a(ebj.f var1);

   double a();

   double b();

   azf<? extends ebj> c();

   default ebj a(double $$0, double $$1) {
      return new ebk.g(this, $$0, $$1);
   }

   default ebj d() {
      return ebk.a(this, ebk.k.a.a);
   }

   default ebj e() {
      return ebk.a(this, ebk.k.a.b);
   }

   default ebj f() {
      return ebk.a(this, ebk.k.a.c);
   }

   default ebj g() {
      return ebk.a(this, ebk.k.a.d);
   }

   default ebj h() {
      return ebk.a(this, ebk.k.a.e);
   }

   default ebj i() {
      return ebk.a(this, ebk.k.a.f);
   }

   public interface a {
      ebj.b a(int var1);

      void a(double[] var1, ebj var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default ecs d() {
         return ecs.a();
      }
   }

   public static record c(jq<eqy.a> b, @Nullable eqy c) {
      public static final Codec<ebj.c> a = eqy.a.b.xmap($$0 -> new ebj.c($$0, null), ebj.c::b);

      public c(jq<eqy.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends ebj {
      @Override
      default void a(double[] $$0, ebj.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default ebj a(ebj.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements ebj.b {
   }

   public interface f {
      ebj apply(ebj var1);

      default ebj.c a(ebj.c $$0) {
         return $$0;
      }
   }
}
