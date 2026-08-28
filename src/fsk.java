import java.util.function.Consumer;

public class fsk implements fsh {
   private final fsf a;
   private final fsk.a b;
   private int c = 0;

   private fsk(fsk.a $$0) {
      this(0, 0, $$0);
   }

   public fsk(int $$0, int $$1, fsk.a $$2) {
      this.a = new fsf($$0, $$1);
      this.b = $$2;
   }

   public fsk a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fsj b() {
      return this.a.b();
   }

   public fsj c() {
      return this.a.c();
   }

   public <T extends fsi> T a(T $$0, fsj $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fsi> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fsi> T a(T $$0, Consumer<fsj> $$1) {
      return this.b.a(this.a, $$0, this.c++, af.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fsi> $$0) {
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

   public static fsk d() {
      return new fsk(fsk.a.b);
   }

   public static fsk e() {
      return new fsk(fsk.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fsf $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fsi> T a(fsf $$0, T $$1, int $$2, fsj $$3) {
         return (T)(switch (this) {
            case a -> (fsi)$$0.a($$1, 0, $$2, $$3);
            case b -> (fsi)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
