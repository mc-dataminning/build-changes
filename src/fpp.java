import java.util.function.Consumer;

public class fpp implements fpm {
   private final fpk a;
   private final fpp.a b;
   private int c = 0;

   private fpp(fpp.a $$0) {
      this(0, 0, $$0);
   }

   public fpp(int $$0, int $$1, fpp.a $$2) {
      this.a = new fpk($$0, $$1);
      this.b = $$2;
   }

   public fpp a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fpo b() {
      return this.a.b();
   }

   public fpo c() {
      return this.a.c();
   }

   public <T extends fpn> T a(T $$0, fpo $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fpn> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fpn> T a(T $$0, Consumer<fpo> $$1) {
      return this.b.a(this.a, $$0, this.c++, ae.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fpn> $$0) {
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

   public static fpp d() {
      return new fpp(fpp.a.b);
   }

   public static fpp e() {
      return new fpp(fpp.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fpk $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fpn> T a(fpk $$0, T $$1, int $$2, fpo $$3) {
         return (T)(switch (this) {
            case a -> (fpn)$$0.a($$1, 0, $$2, $$3);
            case b -> (fpn)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
