import java.util.function.Consumer;

public class fmd implements fma {
   private final fly a;
   private final fmd.a b;
   private int c = 0;

   private fmd(fmd.a $$0) {
      this(0, 0, $$0);
   }

   public fmd(int $$0, int $$1, fmd.a $$2) {
      this.a = new fly($$0, $$1);
      this.b = $$2;
   }

   public fmd a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fmc b() {
      return this.a.b();
   }

   public fmc c() {
      return this.a.c();
   }

   public <T extends fmb> T a(T $$0, fmc $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fmb> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fmb> T a(T $$0, Consumer<fmc> $$1) {
      return this.b.a(this.a, $$0, this.c++, ad.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fmb> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int y() {
      return this.a.y();
   }

   @Override
   public int w() {
      return this.a.w();
   }

   @Override
   public void m(int $$0) {
      this.a.m($$0);
   }

   @Override
   public void n(int $$0) {
      this.a.n($$0);
   }

   @Override
   public int D() {
      return this.a.D();
   }

   @Override
   public int E() {
      return this.a.E();
   }

   public static fmd d() {
      return new fmd(fmd.a.b);
   }

   public static fmd e() {
      return new fmd(fmd.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fly $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fmb> T a(fly $$0, T $$1, int $$2, fmc $$3) {
         return (T)(switch (this) {
            case a -> (fmb)$$0.a($$1, 0, $$2, $$3);
            case b -> (fmb)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
