import javax.annotation.Nullable;

public sealed interface but permits but.d, but.a, but.c, but.f {
   but.d a = new but.d(but.e.b, but.b.b);
   but.d b = new but.d(but.e.c, but.b.b);
   but.d c = new but.d(but.e.a, but.b.b);
   but.a d = new but.a();
   but.c e = new but.c();
   but.f f = new but.f();

   default boolean a() {
      return false;
   }

   public static record a() implements but {
   }

   public static record b(boolean c, @Nullable daa d) {
      static but.b a = new but.b(false, null);
      static but.b b = new but.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public daa b() {
         return this.d;
      }
   }

   public static record c() implements but {
   }

   public static record d(but.e g, but.b h) implements but {
      @Override
      public boolean a() {
         return true;
      }

      public but.d a(daa $$0) {
         return new but.d(this.g, new but.b(true, $$0));
      }

      public but.d b() {
         return new but.d(this.g, but.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public daa d() {
         return this.h.d;
      }

      public but.e e() {
         return this.g;
      }

      public but.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements but {
   }
}
