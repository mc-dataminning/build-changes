import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface edi {
   Codec<edi> b = edj.b;
   Codec<jq<edi>> c = alv.a(mb.aM, b);
   Codec<edi> d = c.xmap(edj.j::new, $$0 -> (jq)($$0 instanceof edj.j $$1 ? $$1.j() : new jq.a<>($$0)));

   double a(edi.b var1);

   void a(double[] var1, edi.a var2);

   edi a(edi.f var1);

   double a();

   double b();

   azx<? extends edi> c();

   default edi a(double $$0, double $$1) {
      return new edj.g(this, $$0, $$1);
   }

   default edi d() {
      return edj.a(this, edj.k.a.a);
   }

   default edi e() {
      return edj.a(this, edj.k.a.b);
   }

   default edi f() {
      return edj.a(this, edj.k.a.c);
   }

   default edi g() {
      return edj.a(this, edj.k.a.d);
   }

   default edi h() {
      return edj.a(this, edj.k.a.e);
   }

   default edi i() {
      return edj.a(this, edj.k.a.f);
   }

   public interface a {
      edi.b a(int var1);

      void a(double[] var1, edi var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default eer d() {
         return eer.a();
      }
   }

   public static record c(jq<esz.a> b, @Nullable esz c) {
      public static final Codec<edi.c> a = esz.a.b.xmap($$0 -> new edi.c($$0, null), edi.c::b);

      public c(jq<esz.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends edi {
      @Override
      default void a(double[] $$0, edi.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default edi a(edi.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements edi.b {
   }

   public interface f {
      edi apply(edi var1);

      default edi.c a(edi.c $$0) {
         return $$0;
      }
   }
}
