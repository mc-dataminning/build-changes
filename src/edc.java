import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface edc {
   Codec<edc> b = edd.b;
   Codec<jq<edc>> c = all.a(mb.aM, b);
   Codec<edc> d = c.xmap(edd.j::new, $$0 -> (jq)($$0 instanceof edd.j $$1 ? $$1.j() : new jq.a<>($$0)));

   double a(edc.b var1);

   void a(double[] var1, edc.a var2);

   edc a(edc.f var1);

   double a();

   double b();

   azn<? extends edc> c();

   default edc a(double $$0, double $$1) {
      return new edd.g(this, $$0, $$1);
   }

   default edc d() {
      return edd.a(this, edd.k.a.a);
   }

   default edc e() {
      return edd.a(this, edd.k.a.b);
   }

   default edc f() {
      return edd.a(this, edd.k.a.c);
   }

   default edc g() {
      return edd.a(this, edd.k.a.d);
   }

   default edc h() {
      return edd.a(this, edd.k.a.e);
   }

   default edc i() {
      return edd.a(this, edd.k.a.f);
   }

   public interface a {
      edc.b a(int var1);

      void a(double[] var1, edc var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default eel d() {
         return eel.a();
      }
   }

   public static record c(jq<est.a> b, @Nullable est c) {
      public static final Codec<edc.c> a = est.a.b.xmap($$0 -> new edc.c($$0, null), edc.c::b);

      public c(jq<est.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends edc {
      @Override
      default void a(double[] $$0, edc.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default edc a(edc.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements edc.b {
   }

   public interface f {
      edc apply(edc var1);

      default edc.c a(edc.c $$0) {
         return $$0;
      }
   }
}
