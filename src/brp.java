import javax.annotation.Nullable;

public sealed interface brp permits brp.d, brp.a, brp.c, brp.f {
   brp.d a = new brp.d(brp.e.b, brp.b.b);
   brp.d b = new brp.d(brp.e.c, brp.b.b);
   brp.d c = new brp.d(brp.e.a, brp.b.b);
   brp.a d = new brp.a();
   brp.c e = new brp.c();
   brp.f f = new brp.f();

   default boolean a() {
      return false;
   }

   public static record a() implements brp {
   }

   public static record b(boolean c, @Nullable cvp d) {
      static brp.b a = new brp.b(false, null);
      static brp.b b = new brp.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cvp b() {
         return this.d;
      }
   }

   public static record c() implements brp {
   }

   public static record d(brp.e g, brp.b h) implements brp {
      @Override
      public boolean a() {
         return true;
      }

      public brp.d a(cvp $$0) {
         return new brp.d(this.g, new brp.b(true, $$0));
      }

      public brp.d b() {
         return new brp.d(this.g, brp.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cvp d() {
         return this.h.d;
      }

      public brp.e e() {
         return this.g;
      }

      public brp.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements brp {
   }
}
