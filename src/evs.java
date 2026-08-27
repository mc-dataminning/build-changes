import java.util.function.Consumer;

public class evs implements evp {
   private final evn a;
   private final evs.a b;
   private int c = 0;

   public evs(evs.a $$0) {
      this(0, 0, $$0);
   }

   public evs(int $$0, int $$1, evs.a $$2) {
      this.a = new evn($$0, $$1);
      this.b = $$2;
   }

   public evs a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public evr b() {
      return this.a.b();
   }

   public evr c() {
      return this.a.c();
   }

   public <T extends evq> T a(T $$0, evr $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends evq> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends evq> T a(T $$0, Consumer<evr> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<evq> $$0) {
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
   public int h() {
      return this.a.h();
   }

   @Override
   public void e(int $$0) {
      this.a.e($$0);
   }

   @Override
   public void f(int $$0) {
      this.a.f($$0);
   }

   @Override
   public int p() {
      return this.a.p();
   }

   @Override
   public int r() {
      return this.a.r();
   }

   public static evs d() {
      return new evs(evs.a.b);
   }

   public static evs e() {
      return new evs(evs.a.a);
   }

   public static enum a {
      a,
      b;

      void a(evn $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends evq> T a(evn $$0, T $$1, int $$2, evr $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
