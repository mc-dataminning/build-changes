import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface ehi {
   Codec<ehi> b = ehj.b;
   Codec<jg<ehi>> c = aln.a(mi.aO, b);
   Codec<ehi> d = c.xmap(ehj.j::new, $$0 -> (jg)($$0 instanceof ehj.j $$1 ? $$1.j() : new jg.a<>($$0)));

   double a(ehi.b var1);

   void a(double[] var1, ehi.a var2);

   ehi a(ehi.f var1);

   double a();

   double b();

   azs<? extends ehi> c();

   default ehi a(double $$0, double $$1) {
      return new ehj.g(this, $$0, $$1);
   }

   default ehi d() {
      return ehj.a(this, ehj.k.a.a);
   }

   default ehi e() {
      return ehj.a(this, ehj.k.a.b);
   }

   default ehi f() {
      return ehj.a(this, ehj.k.a.c);
   }

   default ehi g() {
      return ehj.a(this, ehj.k.a.d);
   }

   default ehi h() {
      return ehj.a(this, ehj.k.a.e);
   }

   default ehi i() {
      return ehj.a(this, ehj.k.a.f);
   }

   public interface a {
      ehi.b a(int var1);

      void a(double[] var1, ehi var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default eir d() {
         return eir.a();
      }
   }

   public static record c(jg<exd.a> b, @Nullable exd c) {
      public static final Codec<ehi.c> a = exd.a.b.xmap($$0 -> new ehi.c($$0, null), ehi.c::b);

      public c(jg<exd.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends ehi {
      @Override
      default void a(double[] $$0, ehi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default ehi a(ehi.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements ehi.b {
   }

   public interface f {
      ehi apply(ehi var1);

      default ehi.c a(ehi.c $$0) {
         return $$0;
      }
   }
}
