import java.util.function.Consumer;

public class fat implements faq {
   private final fao a;
   private final fat.a b;
   private int c = 0;

   private fat(fat.a $$0) {
      this(0, 0, $$0);
   }

   public fat(int $$0, int $$1, fat.a $$2) {
      this.a = new fao($$0, $$1);
      this.b = $$2;
   }

   public fat a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fas b() {
      return this.a.b();
   }

   public fas c() {
      return this.a.c();
   }

   public <T extends far> T a(T $$0, fas $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends far> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends far> T a(T $$0, Consumer<fas> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<far> $$0) {
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

   public static fat d() {
      return new fat(fat.a.b);
   }

   public static fat e() {
      return new fat(fat.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fao $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends far> T a(fao $$0, T $$1, int $$2, fas $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
