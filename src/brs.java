import javax.annotation.Nullable;

public sealed interface brs permits brs.d, brs.a, brs.c, brs.f {
   brs.d a = new brs.d(brs.e.b, brs.b.b);
   brs.d b = new brs.d(brs.e.c, brs.b.b);
   brs.d c = new brs.d(brs.e.a, brs.b.b);
   brs.a d = new brs.a();
   brs.c e = new brs.c();
   brs.f f = new brs.f();

   default boolean a() {
      return false;
   }

   public static record a() implements brs {
   }

   public static record b(boolean c, @Nullable cvs d) {
      static brs.b a = new brs.b(false, null);
      static brs.b b = new brs.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cvs b() {
         return this.d;
      }
   }

   public static record c() implements brs {
   }

   public static record d(brs.e g, brs.b h) implements brs {
      @Override
      public boolean a() {
         return true;
      }

      public brs.d a(cvs $$0) {
         return new brs.d(this.g, new brs.b(true, $$0));
      }

      public brs.d b() {
         return new brs.d(this.g, brs.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cvs d() {
         return this.h.d;
      }

      public brs.e e() {
         return this.g;
      }

      public brs.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements brs {
   }
}
