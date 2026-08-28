import java.util.function.Supplier;

public interface bot {
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

   default boy d(String $$0) {
      this.a($$0);
      return new boy(this);
   }

   default boy c(Supplier<String> $$0) {
      this.a($$0);
      return new boy(this);
   }

   void a(bqc var1);

   default void f(String $$0) {
      this.a($$0, 1);
   }

   void a(String var1, int var2);

   default void d(Supplier<String> $$0) {
      this.a($$0, 1);
   }

   void a(Supplier<String> var1, int var2);

   static bot a(bot $$0, bot $$1) {
      if ($$0 == bop.a) {
         return $$1;
      } else {
         return (bot)($$1 == bop.a ? $$0 : new bot.a($$0, $$1));
      }
   }

   public static class a implements bot {
      private final bot a;
      private final bot c;

      public a(bot $$0, bot $$1) {
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
      public void a(bqc $$0) {
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
