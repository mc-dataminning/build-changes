import java.util.function.Consumer;

public class frr implements fro {
   private final frm a;
   private final frr.a b;
   private int c = 0;

   private frr(frr.a $$0) {
      this(0, 0, $$0);
   }

   public frr(int $$0, int $$1, frr.a $$2) {
      this.a = new frm($$0, $$1);
      this.b = $$2;
   }

   public frr a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public frq b() {
      return this.a.b();
   }

   public frq c() {
      return this.a.c();
   }

   public <T extends frp> T a(T $$0, frq $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends frp> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends frp> T a(T $$0, Consumer<frq> $$1) {
      return this.b.a(this.a, $$0, this.c++, ae.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<frp> $$0) {
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

   public static frr d() {
      return new frr(frr.a.b);
   }

   public static frr e() {
      return new frr(frr.a.a);
   }

   public static enum a {
      a,
      b;

      void a(frm $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends frp> T a(frm $$0, T $$1, int $$2, frq $$3) {
         return (T)(switch (this) {
            case a -> (frp)$$0.a($$1, 0, $$2, $$3);
            case b -> (frp)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
