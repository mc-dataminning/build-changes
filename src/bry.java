import javax.annotation.Nullable;

public sealed interface bry permits bry.d, bry.a, bry.c, bry.f {
   bry.d a = new bry.d(bry.e.b, bry.b.b);
   bry.d b = new bry.d(bry.e.c, bry.b.b);
   bry.d c = new bry.d(bry.e.a, bry.b.b);
   bry.a d = new bry.a();
   bry.c e = new bry.c();
   bry.f f = new bry.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bry {
   }

   public static record b(boolean c, @Nullable cvx d) {
      static bry.b a = new bry.b(false, null);
      static bry.b b = new bry.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cvx b() {
         return this.d;
      }
   }

   public static record c() implements bry {
   }

   public static record d(bry.e g, bry.b h) implements bry {
      @Override
      public boolean a() {
         return true;
      }

      public bry.d a(cvx $$0) {
         return new bry.d(this.g, new bry.b(true, $$0));
      }

      public bry.d b() {
         return new bry.d(this.g, bry.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cvx d() {
         return this.h.d;
      }

      public bry.e e() {
         return this.g;
      }

      public bry.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bry {
   }
}
