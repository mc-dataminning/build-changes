import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public interface dor {
   Codec<dor> b = dos.b;
   Codec<ih<dor>> c = ahd.a(ke.ax, b);
   Codec<dor> d = c.xmap(dos.j::new, $$0 -> (ih)($$0 instanceof dos.j $$1 ? $$1.j() : new ih.a<>($$0)));

   double a(dor.b var1);

   void a(double[] var1, dor.a var2);

   dor a(dor.f var1);

   double a();

   double b();

   auj<? extends dor> c();

   default dor a(double $$0, double $$1) {
      return new dos.g(this, $$0, $$1);
   }

   default dor d() {
      return dos.a(this, dos.k.a.a);
   }

   default dor e() {
      return dos.a(this, dos.k.a.b);
   }

   default dor f() {
      return dos.a(this, dos.k.a.c);
   }

   default dor g() {
      return dos.a(this, dos.k.a.d);
   }

   default dor h() {
      return dos.a(this, dos.k.a.e);
   }

   default dor i() {
      return dos.a(this, dos.k.a.f);
   }

   public interface a {
      dor.b a(int var1);

      void a(double[] var1, dor var2);
   }

   public interface b {
      int a();

      int b();

      int c();

      default dqa d() {
         return dqa.a();
      }
   }

   public static record c(ih<eec.a> b, @Nullable eec c) {
      public static final Codec<dor.c> a = eec.a.b.xmap($$0 -> new dor.c($$0, null), dor.c::b);

      public c(ih<eec.a> $$0) {
         this($$0, null);
      }

      public double a(double $$0, double $$1, double $$2) {
         return this.c == null ? 0.0 : this.c.a($$0, $$1, $$2);
      }

      public double a() {
         return this.c == null ? 2.0 : this.c.a();
      }
   }

   public interface d extends dor {
      @Override
      default void a(double[] $$0, dor.a $$1) {
         $$1.a($$0, this);
      }

      @Override
      default dor a(dor.f $$0) {
         return $$0.apply(this);
      }
   }

   public static record e(int a, int b, int c) implements dor.b {
   }

   public interface f {
      dor apply(dor var1);

      default dor.c a(dor.c $$0) {
         return $$0;
      }
   }
}
