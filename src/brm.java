import java.util.function.Supplier;

public interface brm {
   String b = "root";

   void a();

   void b();

   void a(String var1);

   void a(Supplier<String> var1);

   void c();

   void b(String var1);

   void b(Supplier<String> var1);

   default void e(String $$0) {
   }

   default void a(long $$0) {
   }

   default void a(int $$0) {
   }

   default brr d(String $$0) {
      this.a($$0);
      return new brr(this);
   }

   default brr c(Supplier<String> $$0) {
      this.a($$0);
      return new brr(this);
   }

   void a(bsv var1);

   default void f(String $$0) {
      this.a($$0, 1);
   }

   void a(String var1, int var2);

   default void d(Supplier<String> $$0) {
      this.a($$0, 1);
   }

   void a(Supplier<String> var1, int var2);

   static brm a(brm $$0, brm $$1) {
      if ($$0 == bri.a) {
         return $$1;
      } else {
         return (brm)($$1 == bri.a ? $$0 : new brm.a($$0, $$1));
      }
   }

   public static class a implements brm {
      private final brm a;
      private final brm c;

      public a(brm $$0, brm $$1) {
         this.a = $$0;
         this.c = $$1;
      }

      @Override
      public void a() {
         this.a.a();
         this.c.a();
      }

      @Override
      public void b() {
         this.a.b();
         this.c.b();
      }

      @Override
      public void a(String $$0) {
         this.a.a($$0);
         this.c.a($$0);
      }

      @Override
      public void a(Supplier<String> $$0) {
         this.a.a($$0);
         this.c.a($$0);
      }

      @Override
      public void a(bsv $$0) {
         this.a.a($$0);
         this.c.a($$0);
      }

      @Override
      public void c() {
         this.a.c();
         this.c.c();
      }

      @Override
      public void b(String $$0) {
         this.a.b($$0);
         this.c.b($$0);
      }

      @Override
      public void b(Supplier<String> $$0) {
         this.a.b($$0);
         this.c.b($$0);
      }

      @Override
      public void a(String $$0, int $$1) {
         this.a.a($$0, $$1);
         this.c.a($$0, $$1);
      }

      @Override
      public void a(Supplier<String> $$0, int $$1) {
         this.a.a($$0, $$1);
         this.c.a($$0, $$1);
      }

      @Override
      public void e(String $$0) {
         this.a.e($$0);
         this.c.e($$0);
      }

      @Override
      public void a(long $$0) {
         this.a.a($$0);
         this.c.a($$0);
      }

      @Override
      public void a(int $$0) {
         this.a.a($$0);
         this.c.a($$0);
      }
   }
}
