import java.util.function.Consumer;

public class evy implements evv {
   private final evt a;
   private final evy.a b;
   private int c = 0;

   private evy(evy.a $$0) {
      this(0, 0, $$0);
   }

   public evy(int $$0, int $$1, evy.a $$2) {
      this.a = new evt($$0, $$1);
      this.b = $$2;
   }

   public evy a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public evx b() {
      return this.a.b();
   }

   public evx c() {
      return this.a.c();
   }

   public <T extends evw> T a(T $$0, evx $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends evw> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends evw> T a(T $$0, Consumer<evx> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<evw> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int l() {
      return this.a.l();
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
   public int r() {
      return this.a.r();
   }

   @Override
   public int t() {
      return this.a.t();
   }

   public static evy d() {
      return new evy(evy.a.b);
   }

   public static evy e() {
      return new evy(evy.a.a);
   }

   public static enum a {
      a,
      b;

      void a(evt $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends evw> T a(evt $$0, T $$1, int $$2, evx $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
