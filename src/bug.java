import javax.annotation.Nullable;

public sealed interface bug permits bug.d, bug.a, bug.c, bug.f {
   bug.d a = new bug.d(bug.e.b, bug.b.b);
   bug.d b = new bug.d(bug.e.c, bug.b.b);
   bug.d c = new bug.d(bug.e.a, bug.b.b);
   bug.a d = new bug.a();
   bug.c e = new bug.c();
   bug.f f = new bug.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bug {
   }

   public static record b(boolean c, @Nullable czk d) {
      static bug.b a = new bug.b(false, null);
      static bug.b b = new bug.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public czk b() {
         return this.d;
      }
   }

   public static record c() implements bug {
   }

   public static record d(bug.e g, bug.b h) implements bug {
      @Override
      public boolean a() {
         return true;
      }

      public bug.d a(czk $$0) {
         return new bug.d(this.g, new bug.b(true, $$0));
      }

      public bug.d b() {
         return new bug.d(this.g, bug.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public czk d() {
         return this.h.d;
      }

      public bug.e e() {
         return this.g;
      }

      public bug.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bug {
   }
}
