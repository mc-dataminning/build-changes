import java.util.function.Consumer;

public class frx implements fru {
   private final frs a;
   private final frx.a b;
   private int c = 0;

   private frx(frx.a $$0) {
      this(0, 0, $$0);
   }

   public frx(int $$0, int $$1, frx.a $$2) {
      this.a = new frs($$0, $$1);
      this.b = $$2;
   }

   public frx a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public frw b() {
      return this.a.b();
   }

   public frw c() {
      return this.a.c();
   }

   public <T extends frv> T a(T $$0, frw $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends frv> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends frv> T a(T $$0, Consumer<frw> $$1) {
      return this.b.a(this.a, $$0, this.c++, ae.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<frv> $$0) {
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
   public void k(int $$0) {
      this.a.k($$0);
   }

   @Override
   public void l(int $$0) {
      this.a.l($$0);
   }

   @Override
   public int D() {
      return this.a.D();
   }

   @Override
   public int E() {
      return this.a.E();
   }

   public static frx d() {
      return new frx(frx.a.b);
   }

   public static frx e() {
      return new frx(frx.a.a);
   }

   public static enum a {
      a,
      b;

      void a(frs $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends frv> T a(frs $$0, T $$1, int $$2, frw $$3) {
         return (T)(switch (this) {
            case a -> (frv)$$0.a($$1, 0, $$2, $$3);
            case b -> (frv)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
