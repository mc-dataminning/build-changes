import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dld {
   Codec<dld> b = dle.b;
   Codec<ib<dld>> c = afs.a(jz.au, b);
   Codec<dld> d = c.xmap(dle.j::new, $$0 -> (ib)($$0 instanceof dle.j $$1 ? $$1.j() : new ib.a<>($$0)));

   double a(dld.b var1);

   void a(double[] var1, dld.a var2);

   dld a(dld.f var1);

   double a();

   double b();

   ass<? extends dld> c();

   default dld a(double $$0, double $$1) {
      return new dle.g(this, $$0, $$1);
   }

   default dld d() {
      return dle.a(this, dle.k.a.a);
   }

   default dld e() {
      return dle.a(this, dle.k.a.b);
   }

   default dld f() {
      return dle.a(this, dle.k.a.c);
   }

   default dld g() {
      return dle.a(this, dle.k.a.d);
   }

   default dld h() {
      return dle.a(this, dle.k.a.e);
   }

   default dld i() {
      return dle.a(this, dle.k.a.f);
   }

   public interface a {
      dld.b a(int var1);

      void a(double[] var1, dld var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dmm d() {
         return dmm.a();
      }
   }

   public static record c(ib<eah.a> b, @Nullable eah c) {
      public static final Codec<dld.c> a = eah.a.b.xmap($$0 -> new dld.c($$0, null), dld.c::b);

      public c(ib<eah.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dld {
      @Override
      default void a(double[] $$0, dld.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dld a(dld.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dld.b {
   }

   public interface f {
      dld apply(dld var1);

      default dld.c a(dld.c $$0) {
         return $$0;
      }
   }
}
