import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dka {
   Codec<dka> b = dkb.b;
   Codec<hf<dka>> c = ael.a(jd.at, b);
   Codec<dka> d = c.xmap(dkb.j::new, $$0 -> (hf)($$0 instanceof dkb.j $$1 ? $$1.j() : new hf.a<>($$0)));

   double a(dka.b var1);

   void a(double[] var1, dka.a var2);

   dka a(dka.f var1);

   double a();

   double b();

   ari<? extends dka> c();

   default dka a(double $$0, double $$1) {
      return new dkb.g(this, $$0, $$1);
   }

   default dka d() {
      return dkb.a(this, dkb.k.a.a);
   }

   default dka e() {
      return dkb.a(this, dkb.k.a.b);
   }

   default dka f() {
      return dkb.a(this, dkb.k.a.c);
   }

   default dka g() {
      return dkb.a(this, dkb.k.a.d);
   }

   default dka h() {
      return dkb.a(this, dkb.k.a.e);
   }

   default dka i() {
      return dkb.a(this, dkb.k.a.f);
   }

   public interface a {
      dka.b a(int var1);

      void a(double[] var1, dka var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dlj d() {
         return dlj.a();
      }
   }

   public static record c(hf<dze.a> b, @Nullable dze c) {
      public static final Codec<dka.c> a = dze.a.b.xmap($$0 -> new dka.c($$0, null), dka.c::b);

      public c(hf<dze.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dka {
      @Override
      default void a(double[] $$0, dka.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dka a(dka.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dka.b {
   }

   public interface f {
      dka apply(dka var1);

      default dka.c a(dka.c $$0) {
         return $$0;
      }
   }
}
