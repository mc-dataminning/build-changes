import java.util.function.Consumer;

public class fas implements fap {
   private final fan a;
   private final fas.a b;
   private int c = 0;

   private fas(fas.a $$0) {
      this(0, 0, $$0);
   }

   public fas(int $$0, int $$1, fas.a $$2) {
      this.a = new fan($$0, $$1);
      this.b = $$2;
   }

   public fas a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public far b() {
      return this.a.b();
   }

   public far c() {
      return this.a.c();
   }

   public <T extends faq> T a(T $$0, far $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends faq> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends faq> T a(T $$0, Consumer<far> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<faq> $$0) {
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
   public void n(int $$0) {
      this.a.n($$0);
   }

   @Override
   public void o(int $$0) {
      this.a.o($$0);
   }

   @Override
   public int B() {
      return this.a.B();
   }

   @Override
   public int C() {
      return this.a.C();
   }

   public static fas d() {
      return new fas(fas.a.b);
   }

   public static fas e() {
      return new fas(fas.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fan $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends faq> T a(fan $$0, T $$1, int $$2, far $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
