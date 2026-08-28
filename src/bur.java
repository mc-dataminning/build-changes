import javax.annotation.Nullable;

public sealed interface bur permits bur.d, bur.a, bur.c, bur.f {
   bur.d a = new bur.d(bur.e.b, bur.b.b);
   bur.d b = new bur.d(bur.e.c, bur.b.b);
   bur.d c = new bur.d(bur.e.a, bur.b.b);
   bur.a d = new bur.a();
   bur.c e = new bur.c();
   bur.f f = new bur.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bur {
   }

   public static record b(boolean c, @Nullable czy d) {
      static bur.b a = new bur.b(false, null);
      static bur.b b = new bur.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public czy b() {
         return this.d;
      }
   }

   public static record c() implements bur {
   }

   public static record d(bur.e g, bur.b h) implements bur {
      @Override
      public boolean a() {
         return true;
      }

      public bur.d a(czy $$0) {
         return new bur.d(this.g, new bur.b(true, $$0));
      }

      public bur.d b() {
         return new bur.d(this.g, bur.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public czy d() {
         return this.h.d;
      }

      public bur.e e() {
         return this.g;
      }

      public bur.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bur {
   }
}
