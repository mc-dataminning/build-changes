import java.util.function.Consumer;

public class fuf implements fuc {
   private final fua a;
   private final fuf.a b;
   private int c = 0;

   private fuf(fuf.a $$0) {
      this(0, 0, $$0);
   }

   public fuf(int $$0, int $$1, fuf.a $$2) {
      this.a = new fua($$0, $$1);
      this.b = $$2;
   }

   public fuf a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fue b() {
      return this.a.b();
   }

   public fue c() {
      return this.a.c();
   }

   public <T extends fud> T a(T $$0, fue $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fud> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fud> T a(T $$0, Consumer<fue> $$1) {
      return this.b.a(this.a, $$0, this.c++, af.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fud> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int A() {
      return this.a.A();
   }

   @Override
   public int y() {
      return this.a.y();
   }

   @Override
   public void j(int $$0) {
      this.a.j($$0);
   }

   @Override
   public void k(int $$0) {
      this.a.k($$0);
   }

   @Override
   public int F() {
      return this.a.F();
   }

   @Override
   public int G() {
      return this.a.G();
   }

   public static fuf d() {
      return new fuf(fuf.a.b);
   }

   public static fuf e() {
      return new fuf(fuf.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fua $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fud> T a(fua $$0, T $$1, int $$2, fue $$3) {
         return (T)(switch (this) {
            case a -> (fud)$$0.a($$1, 0, $$2, $$3);
            case b -> (fud)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
