import java.util.function.Consumer;

public class ewx implements ewu {
   private final ews a;
   private final ewx.a b;
   private int c = 0;

   private ewx(ewx.a $$0) {
      this(0, 0, $$0);
   }

   public ewx(int $$0, int $$1, ewx.a $$2) {
      this.a = new ews($$0, $$1);
      this.b = $$2;
   }

   public ewx a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public eww b() {
      return this.a.b();
   }

   public eww c() {
      return this.a.c();
   }

   public <T extends ewv> T a(T $$0, eww $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends ewv> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends ewv> T a(T $$0, Consumer<eww> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<ewv> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int k() {
      return this.a.k();
   }

   @Override
   public int i() {
      return this.a.i();
   }

   @Override
   public void f(int $$0) {
      this.a.f($$0);
   }

   @Override
   public void g(int $$0) {
      this.a.g($$0);
   }

   @Override
   public int p() {
      return this.a.p();
   }

   @Override
   public int r() {
      return this.a.r();
   }

   public static ewx d() {
      return new ewx(ewx.a.b);
   }

   public static ewx e() {
      return new ewx(ewx.a.a);
   }

   public static enum a {
      a,
      b;

      void a(ews $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends ewv> T a(ews $$0, T $$1, int $$2, eww $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
