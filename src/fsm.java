import java.util.function.Consumer;

public class fsm implements fsj {
   private final fsh a;
   private final fsm.a b;
   private int c = 0;

   private fsm(fsm.a $$0) {
      this(0, 0, $$0);
   }

   public fsm(int $$0, int $$1, fsm.a $$2) {
      this.a = new fsh($$0, $$1);
      this.b = $$2;
   }

   public fsm a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fsl b() {
      return this.a.b();
   }

   public fsl c() {
      return this.a.c();
   }

   public <T extends fsk> T a(T $$0, fsl $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fsk> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fsk> T a(T $$0, Consumer<fsl> $$1) {
      return this.b.a(this.a, $$0, this.c++, af.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fsk> $$0) {
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

   public static fsm d() {
      return new fsm(fsm.a.b);
   }

   public static fsm e() {
      return new fsm(fsm.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fsh $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fsk> T a(fsh $$0, T $$1, int $$2, fsl $$3) {
         return (T)(switch (this) {
            case a -> (fsk)$$0.a($$1, 0, $$2, $$3);
            case b -> (fsk)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
