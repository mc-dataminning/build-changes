import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dkg {
   Codec<dkg> b = dkh.b;
   Codec<hg<dkg>> c = aeq.a(je.at, b);
   Codec<dkg> d = c.xmap(dkh.j::new, $$0 -> (hg)($$0 instanceof dkh.j $$1 ? $$1.j() : new hg.a<>($$0)));

   double a(dkg.b var1);

   void a(double[] var1, dkg.a var2);

   dkg a(dkg.f var1);

   double a();

   double b();

   arm<? extends dkg> c();

   default dkg a(double $$0, double $$1) {
      return new dkh.g(this, $$0, $$1);
   }

   default dkg d() {
      return dkh.a(this, dkh.k.a.a);
   }

   default dkg e() {
      return dkh.a(this, dkh.k.a.b);
   }

   default dkg f() {
      return dkh.a(this, dkh.k.a.c);
   }

   default dkg g() {
      return dkh.a(this, dkh.k.a.d);
   }

   default dkg h() {
      return dkh.a(this, dkh.k.a.e);
   }

   default dkg i() {
      return dkh.a(this, dkh.k.a.f);
   }

   public interface a {
      dkg.b a(int var1);

      void a(double[] var1, dkg var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dlp d() {
         return dlp.a();
      }
   }

   public static record c(hg<dzk.a> b, @Nullable dzk c) {
      public static final Codec<dkg.c> a = dzk.a.b.xmap($$0 -> new dkg.c($$0, null), dkg.c::b);

      public c(hg<dzk.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dkg {
      @Override
      default void a(double[] $$0, dkg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dkg a(dkg.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dkg.b {
   }

   public interface f {
      dkg apply(dkg var1);

      default dkg.c a(dkg.c $$0) {
         return $$0;
      }
   }
}
