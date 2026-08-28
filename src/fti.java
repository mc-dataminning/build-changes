import java.util.function.Consumer;

public class fti implements ftf {
   private final ftd a;
   private final fti.a b;
   private int c = 0;

   private fti(fti.a $$0) {
      this(0, 0, $$0);
   }

   public fti(int $$0, int $$1, fti.a $$2) {
      this.a = new ftd($$0, $$1);
      this.b = $$2;
   }

   public fti a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fth b() {
      return this.a.b();
   }

   public fth c() {
      return this.a.c();
   }

   public <T extends ftg> T a(T $$0, fth $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends ftg> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends ftg> T a(T $$0, Consumer<fth> $$1) {
      return this.b.a(this.a, $$0, this.c++, af.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<ftg> $$0) {
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

   public static fti d() {
      return new fti(fti.a.b);
   }

   public static fti e() {
      return new fti(fti.a.a);
   }

   public static enum a {
      a,
      b;

      void a(ftd $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends ftg> T a(ftd $$0, T $$1, int $$2, fth $$3) {
         return (T)(switch (this) {
            case a -> (ftg)$$0.a($$1, 0, $$2, $$3);
            case b -> (ftg)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
