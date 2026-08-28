import javax.annotation.Nullable;

public sealed interface bsh permits bsh.d, bsh.a, bsh.c, bsh.f {
   bsh.d a = new bsh.d(bsh.e.b, bsh.b.b);
   bsh.d b = new bsh.d(bsh.e.c, bsh.b.b);
   bsh.d c = new bsh.d(bsh.e.a, bsh.b.b);
   bsh.a d = new bsh.a();
   bsh.c e = new bsh.c();
   bsh.f f = new bsh.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bsh {
   }

   public static record b(boolean c, @Nullable cwf d) {
      static bsh.b a = new bsh.b(false, null);
      static bsh.b b = new bsh.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cwf b() {
         return this.d;
      }
   }

   public static record c() implements bsh {
   }

   public static record d(bsh.e g, bsh.b h) implements bsh {
      @Override
      public boolean a() {
         return true;
      }

      public bsh.d a(cwf $$0) {
         return new bsh.d(this.g, new bsh.b(true, $$0));
      }

      public bsh.d b() {
         return new bsh.d(this.g, bsh.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cwf d() {
         return this.h.d;
      }

      public bsh.e e() {
         return this.g;
      }

      public bsh.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bsh {
   }
}
