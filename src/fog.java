import java.util.function.Consumer;

public class fog implements fod {
   private final fob a;
   private final fog.a b;
   private int c = 0;

   private fog(fog.a $$0) {
      this(0, 0, $$0);
   }

   public fog(int $$0, int $$1, fog.a $$2) {
      this.a = new fob($$0, $$1);
      this.b = $$2;
   }

   public fog a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fof b() {
      return this.a.b();
   }

   public fof c() {
      return this.a.c();
   }

   public <T extends foe> T a(T $$0, fof $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends foe> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends foe> T a(T $$0, Consumer<fof> $$1) {
      return this.b.a(this.a, $$0, this.c++, ad.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<foe> $$0) {
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

   public static fog d() {
      return new fog(fog.a.b);
   }

   public static fog e() {
      return new fog(fog.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fob $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends foe> T a(fob $$0, T $$1, int $$2, fof $$3) {
         return (T)(switch (this) {
            case a -> (foe)$$0.a($$1, 0, $$2, $$3);
            case b -> (foe)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
