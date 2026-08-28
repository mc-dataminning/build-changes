import javax.annotation.Nullable;

public sealed interface bsd permits bsd.d, bsd.a, bsd.c, bsd.f {
   bsd.d a = new bsd.d(bsd.e.b, bsd.b.b);
   bsd.d b = new bsd.d(bsd.e.c, bsd.b.b);
   bsd.d c = new bsd.d(bsd.e.a, bsd.b.b);
   bsd.a d = new bsd.a();
   bsd.c e = new bsd.c();
   bsd.f f = new bsd.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bsd {
   }

   public static record b(boolean c, @Nullable cwb d) {
      static bsd.b a = new bsd.b(false, null);
      static bsd.b b = new bsd.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cwb b() {
         return this.d;
      }
   }

   public static record c() implements bsd {
   }

   public static record d(bsd.e g, bsd.b h) implements bsd {
      @Override
      public boolean a() {
         return true;
      }

      public bsd.d a(cwb $$0) {
         return new bsd.d(this.g, new bsd.b(true, $$0));
      }

      public bsd.d b() {
         return new bsd.d(this.g, bsd.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cwb d() {
         return this.h.d;
      }

      public bsd.e e() {
         return this.g;
      }

      public bsd.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bsd {
   }
}
