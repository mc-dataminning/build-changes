import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface egg {
   Codec<egg> b = egh.b;
   Codec<jf<egg>> c = alc.a(mh.aO, b);
   Codec<egg> d = c.xmap(egh.j::new, $$0 -> (jf)($$0 instanceof egh.j $$1 ? $$1.j() : new jf.a<>($$0)));

   double a(egg.b var1);

   void a(double[] var1, egg.a var2);

   egg a(egg.f var1);

   double a();

   double b();

   azf<? extends egg> c();

   default egg a(double $$0, double $$1) {
      return new egh.g(this, $$0, $$1);
   }

   default egg d() {
      return egh.a(this, egh.k.a.a);
   }

   default egg e() {
      return egh.a(this, egh.k.a.b);
   }

   default egg f() {
      return egh.a(this, egh.k.a.c);
   }

   default egg g() {
      return egh.a(this, egh.k.a.d);
   }

   default egg h() {
      return egh.a(this, egh.k.a.e);
   }

   default egg i() {
      return egh.a(this, egh.k.a.f);
   }

   public interface a {
      egg.b a(int var1);

      void a(double[] var1, egg var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default ehp d() {
         return ehp.a();
      }
   }

   public static record c(jf<evy.a> b, @Nullable evy c) {
      public static final Codec<egg.c> a = evy.a.b.xmap($$0 -> new egg.c($$0, null), egg.c::b);

      public c(jf<evy.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends egg {
      @Override
      default void a(double[] $$0, egg.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default egg a(egg.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements egg.b {
   }

   public interface f {
      egg apply(egg var1);

      default egg.c a(egg.c $$0) {
         return $$0;
      }
   }
}
