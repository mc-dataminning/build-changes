import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface eee {
   Codec<eee> b = eef.b;
   Codec<js<eee>> c = akz.a(me.aQ, b);
   Codec<eee> d = c.xmap(eef.j::new, $$0 -> (js)($$0 instanceof eef.j $$1 ? $$1.j() : new js.a<>($$0)));

   double a(eee.b var1);

   void a(double[] var1, eee.a var2);

   eee a(eee.f var1);

   double a();

   double b();

   azd<? extends eee> c();

   default eee a(double $$0, double $$1) {
      return new eef.g(this, $$0, $$1);
   }

   default eee d() {
      return eef.a(this, eef.k.a.a);
   }

   default eee e() {
      return eef.a(this, eef.k.a.b);
   }

   default eee f() {
      return eef.a(this, eef.k.a.c);
   }

   default eee g() {
      return eef.a(this, eef.k.a.d);
   }

   default eee h() {
      return eef.a(this, eef.k.a.e);
   }

   default eee i() {
      return eef.a(this, eef.k.a.f);
   }

   public interface a {
      eee.b a(int var1);

      void a(double[] var1, eee var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default efn d() {
         return efn.a();
      }
   }

   public static record c(js<etw.a> b, @Nullable etw c) {
      public static final Codec<eee.c> a = etw.a.b.xmap($$0 -> new eee.c($$0, null), eee.c::b);

      public c(js<etw.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends eee {
      @Override
      default void a(double[] $$0, eee.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default eee a(eee.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements eee.b {
   }

   public interface f {
      eee apply(eee var1);

      default eee.c a(eee.c $$0) {
         return $$0;
      }
   }
}
