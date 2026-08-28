import java.util.function.Consumer;

public class frw implements frt {
   private final frr a;
   private final frw.a b;
   private int c = 0;

   private frw(frw.a $$0) {
      this(0, 0, $$0);
   }

   public frw(int $$0, int $$1, frw.a $$2) {
      this.a = new frr($$0, $$1);
      this.b = $$2;
   }

   public frw a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public frv b() {
      return this.a.b();
   }

   public frv c() {
      return this.a.c();
   }

   public <T extends fru> T a(T $$0, frv $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fru> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fru> T a(T $$0, Consumer<frv> $$1) {
      return this.b.a(this.a, $$0, this.c++, ae.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fru> $$0) {
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

   public static frw d() {
      return new frw(frw.a.b);
   }

   public static frw e() {
      return new frw(frw.a.a);
   }

   public static enum a {
      a,
      b;

      void a(frr $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fru> T a(frr $$0, T $$1, int $$2, frv $$3) {
         return (T)(switch (this) {
            case a -> (fru)$$0.a($$1, 0, $$2, $$3);
            case b -> (fru)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
