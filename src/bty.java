import javax.annotation.Nullable;

public sealed interface bty permits bty.d, bty.a, bty.c, bty.f {
   bty.d a = new bty.d(bty.e.b, bty.b.b);
   bty.d b = new bty.d(bty.e.c, bty.b.b);
   bty.d c = new bty.d(bty.e.a, bty.b.b);
   bty.a d = new bty.a();
   bty.c e = new bty.c();
   bty.f f = new bty.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bty {
   }

   public static record b(boolean c, @Nullable cys d) {
      static bty.b a = new bty.b(false, null);
      static bty.b b = new bty.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cys b() {
         return this.d;
      }
   }

   public static record c() implements bty {
   }

   public static record d(bty.e g, bty.b h) implements bty {
      @Override
      public boolean a() {
         return true;
      }

      public bty.d a(cys $$0) {
         return new bty.d(this.g, new bty.b(true, $$0));
      }

      public bty.d b() {
         return new bty.d(this.g, bty.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cys d() {
         return this.h.d;
      }

      public bty.e e() {
         return this.g;
      }

      public bty.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bty {
   }
}
