import java.util.function.Consumer;

public class fcx implements fcu {
   private final fcs a;
   private final fcx.a b;
   private int c = 0;

   private fcx(fcx.a $$0) {
      this(0, 0, $$0);
   }

   public fcx(int $$0, int $$1, fcx.a $$2) {
      this.a = new fcs($$0, $$1);
      this.b = $$2;
   }

   public fcx a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fcw b() {
      return this.a.b();
   }

   public fcw c() {
      return this.a.c();
   }

   public <T extends fcv> T a(T $$0, fcw $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fcv> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fcv> T a(T $$0, Consumer<fcw> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fcv> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int w() {
      return this.a.w();
   }

   @Override
   public int u() {
      return this.a.u();
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
   public int B() {
      return this.a.B();
   }

   @Override
   public int C() {
      return this.a.C();
   }

   public static fcx d() {
      return new fcx(fcx.a.b);
   }

   public static fcx e() {
      return new fcx(fcx.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fcs $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fcv> T a(fcs $$0, T $$1, int $$2, fcw $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
