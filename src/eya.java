import java.util.function.Consumer;

public class eya implements exx {
   private final exv a;
   private final eya.a b;
   private int c = 0;

   private eya(eya.a $$0) {
      this(0, 0, $$0);
   }

   public eya(int $$0, int $$1, eya.a $$2) {
      this.a = new exv($$0, $$1);
      this.b = $$2;
   }

   public eya a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public exz b() {
      return this.a.b();
   }

   public exz c() {
      return this.a.c();
   }

   public <T extends exy> T a(T $$0, exz $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends exy> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends exy> T a(T $$0, Consumer<exz> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<exy> $$0) {
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

   public static eya d() {
      return new eya(eya.a.b);
   }

   public static eya e() {
      return new eya(eya.a.a);
   }

   public static enum a {
      a,
      b;

      void a(exv $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends exy> T a(exv $$0, T $$1, int $$2, exz $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
