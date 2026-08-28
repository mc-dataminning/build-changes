import javax.annotation.Nullable;

public sealed interface bte permits bte.d, bte.a, bte.c, bte.f {
   bte.d a = new bte.d(bte.e.b, bte.b.b);
   bte.d b = new bte.d(bte.e.c, bte.b.b);
   bte.d c = new bte.d(bte.e.a, bte.b.b);
   bte.a d = new bte.a();
   bte.c e = new bte.c();
   bte.f f = new bte.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bte {
   }

   public static record b(boolean c, @Nullable cxk d) {
      static bte.b a = new bte.b(false, null);
      static bte.b b = new bte.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cxk b() {
         return this.d;
      }
   }

   public static record c() implements bte {
   }

   public static record d(bte.e g, bte.b h) implements bte {
      @Override
      public boolean a() {
         return true;
      }

      public bte.d a(cxk $$0) {
         return new bte.d(this.g, new bte.b(true, $$0));
      }

      public bte.d b() {
         return new bte.d(this.g, bte.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cxk d() {
         return this.h.d;
      }

      public bte.e e() {
         return this.g;
      }

      public bte.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bte {
   }
}
