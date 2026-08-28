import java.util.function.Consumer;

public class flx implements flu {
   private final fls a;
   private final flx.a b;
   private int c = 0;

   private flx(flx.a $$0) {
      this(0, 0, $$0);
   }

   public flx(int $$0, int $$1, flx.a $$2) {
      this.a = new fls($$0, $$1);
      this.b = $$2;
   }

   public flx a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public flw b() {
      return this.a.b();
   }

   public flw c() {
      return this.a.c();
   }

   public <T extends flv> T a(T $$0, flw $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends flv> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends flv> T a(T $$0, Consumer<flw> $$1) {
      return this.b.a(this.a, $$0, this.c++, ad.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<flv> $$0) {
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

   public static flx d() {
      return new flx(flx.a.b);
   }

   public static flx e() {
      return new flx(flx.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fls $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends flv> T a(fls $$0, T $$1, int $$2, flw $$3) {
         return (T)(switch (this) {
            case a -> (flv)$$0.a($$1, 0, $$2, $$3);
            case b -> (flv)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
