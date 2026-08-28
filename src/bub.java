import javax.annotation.Nullable;

public sealed interface bub permits bub.d, bub.a, bub.c, bub.f {
   bub.d a = new bub.d(bub.e.b, bub.b.b);
   bub.d b = new bub.d(bub.e.c, bub.b.b);
   bub.d c = new bub.d(bub.e.a, bub.b.b);
   bub.a d = new bub.a();
   bub.c e = new bub.c();
   bub.f f = new bub.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bub {
   }

   public static record b(boolean c, @Nullable cyy d) {
      static bub.b a = new bub.b(false, null);
      static bub.b b = new bub.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cyy b() {
         return this.d;
      }
   }

   public static record c() implements bub {
   }

   public static record d(bub.e g, bub.b h) implements bub {
      @Override
      public boolean a() {
         return true;
      }

      public bub.d a(cyy $$0) {
         return new bub.d(this.g, new bub.b(true, $$0));
      }

      public bub.d b() {
         return new bub.d(this.g, bub.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cyy d() {
         return this.h.d;
      }

      public bub.e e() {
         return this.g;
      }

      public bub.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bub {
   }
}
