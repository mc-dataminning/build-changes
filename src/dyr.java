import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dyr {
   Codec<dyr> b = dys.b;
   Codec<jm<dyr>> c = akn.a(lu.aJ, b);
   Codec<dyr> d = c.xmap(dys.j::new, $$0 -> (jm)($$0 instanceof dys.j $$1 ? $$1.j() : new jm.a<>($$0)));

   double a(dyr.b var1);

   void a(double[] var1, dyr.a var2);

   dyr a(dyr.f var1);

   double a();

   double b();

   ayh<? extends dyr> c();

   default dyr a(double $$0, double $$1) {
      return new dys.g(this, $$0, $$1);
   }

   default dyr d() {
      return dys.a(this, dys.k.a.a);
   }

   default dyr e() {
      return dys.a(this, dys.k.a.b);
   }

   default dyr f() {
      return dys.a(this, dys.k.a.c);
   }

   default dyr g() {
      return dys.a(this, dys.k.a.d);
   }

   default dyr h() {
      return dys.a(this, dys.k.a.e);
   }

   default dyr i() {
      return dys.a(this, dys.k.a.f);
   }

   public interface a {
      dyr.b a(int var1);

      void a(double[] var1, dyr var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default eaa d() {
         return eaa.a();
      }
   }

   public static record c(jm<eoh.a> b, @Nullable eoh c) {
      public static final Codec<dyr.c> a = eoh.a.b.xmap($$0 -> new dyr.c($$0, null), dyr.c::b);

      public c(jm<eoh.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dyr {
      @Override
      default void a(double[] $$0, dyr.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dyr a(dyr.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dyr.b {
   }

   public interface f {
      dyr apply(dyr var1);

      default dyr.c a(dyr.c $$0) {
         return $$0;
      }
   }
}
