import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface edh {
   Codec<edh> b = edi.b;
   Codec<jr<edh>> c = akq.a(mc.aN, b);
   Codec<edh> d = c.xmap(edi.j::new, $$0 -> (jr)($$0 instanceof edi.j $$1 ? $$1.j() : new jr.a<>($$0)));

   double a(edh.b var1);

   void a(double[] var1, edh.a var2);

   edh a(edh.f var1);

   double a();

   double b();

   ays<? extends edh> c();

   default edh a(double $$0, double $$1) {
      return new edi.g(this, $$0, $$1);
   }

   default edh d() {
      return edi.a(this, edi.k.a.a);
   }

   default edh e() {
      return edi.a(this, edi.k.a.b);
   }

   default edh f() {
      return edi.a(this, edi.k.a.c);
   }

   default edh g() {
      return edi.a(this, edi.k.a.d);
   }

   default edh h() {
      return edi.a(this, edi.k.a.e);
   }

   default edh i() {
      return edi.a(this, edi.k.a.f);
   }

   public interface a {
      edh.b a(int var1);

      void a(double[] var1, edh var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default eeq d() {
         return eeq.a();
      }
   }

   public static record c(jr<esz.a> b, @Nullable esz c) {
      public static final Codec<edh.c> a = esz.a.b.xmap($$0 -> new edh.c($$0, null), edh.c::b);

      public c(jr<esz.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends edh {
      @Override
      default void a(double[] $$0, edh.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default edh a(edh.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements edh.b {
   }

   public interface f {
      edh apply(edh var1);

      default edh.c a(edh.c $$0) {
         return $$0;
      }
   }
}
