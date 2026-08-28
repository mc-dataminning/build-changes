import javax.annotation.Nullable;

public sealed interface brk permits brk.d, brk.a, brk.c, brk.f {
   brk.d a = new brk.d(brk.e.b, brk.b.b);
   brk.d b = new brk.d(brk.e.c, brk.b.b);
   brk.d c = new brk.d(brk.e.a, brk.b.b);
   brk.a d = new brk.a();
   brk.c e = new brk.c();
   brk.f f = new brk.f();

   default boolean a() {
      return false;
   }

   public static record a() implements brk {
   }

   public static record b(boolean c, @Nullable cvl d) {
      static brk.b a = new brk.b(false, null);
      static brk.b b = new brk.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cvl b() {
         return this.d;
      }
   }

   public static record c() implements brk {
   }

   public static record d(brk.e g, brk.b h) implements brk {
      @Override
      public boolean a() {
         return true;
      }

      public brk.d a(cvl $$0) {
         return new brk.d(this.g, new brk.b(true, $$0));
      }

      public brk.d b() {
         return new brk.d(this.g, brk.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cvl d() {
         return this.h.d;
      }

      public brk.e e() {
         return this.g;
      }

      public brk.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements brk {
   }
}
