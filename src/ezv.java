import java.util.function.Consumer;

public class ezv implements ezs {
   private final ezq a;
   private final ezv.a b;
   private int c = 0;

   private ezv(ezv.a $$0) {
      this(0, 0, $$0);
   }

   public ezv(int $$0, int $$1, ezv.a $$2) {
      this.a = new ezq($$0, $$1);
      this.b = $$2;
   }

   public ezv a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public ezu b() {
      return this.a.b();
   }

   public ezu c() {
      return this.a.c();
   }

   public <T extends ezt> T a(T $$0, ezu $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends ezt> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends ezt> T a(T $$0, Consumer<ezu> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<ezt> $$0) {
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

   public static ezv d() {
      return new ezv(ezv.a.b);
   }

   public static ezv e() {
      return new ezv(ezv.a.a);
   }

   public static enum a {
      a,
      b;

      void a(ezq $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends ezt> T a(ezq $$0, T $$1, int $$2, ezu $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
