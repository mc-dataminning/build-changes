import java.util.function.Consumer;

public class fld implements fla {
   private final fky a;
   private final fld.a b;
   private int c = 0;

   private fld(fld.a $$0) {
      this(0, 0, $$0);
   }

   public fld(int $$0, int $$1, fld.a $$2) {
      this.a = new fky($$0, $$1);
      this.b = $$2;
   }

   public fld a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public flc b() {
      return this.a.b();
   }

   public flc c() {
      return this.a.c();
   }

   public <T extends flb> T a(T $$0, flc $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends flb> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends flb> T a(T $$0, Consumer<flc> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<flb> $$0) {
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

   public static fld d() {
      return new fld(fld.a.b);
   }

   public static fld e() {
      return new fld(fld.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fky $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends flb> T a(fky $$0, T $$1, int $$2, flc $$3) {
         return (T)(switch (this) {
            case a -> (flb)$$0.a($$1, 0, $$2, $$3);
            case b -> (flb)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
