import javax.annotation.Nullable;

public sealed interface bud permits bud.d, bud.a, bud.c, bud.f {
   bud.d a = new bud.d(bud.e.b, bud.b.b);
   bud.d b = new bud.d(bud.e.c, bud.b.b);
   bud.d c = new bud.d(bud.e.a, bud.b.b);
   bud.a d = new bud.a();
   bud.c e = new bud.c();
   bud.f f = new bud.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bud {
   }

   public static record b(boolean c, @Nullable czd d) {
      static bud.b a = new bud.b(false, null);
      static bud.b b = new bud.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public czd b() {
         return this.d;
      }
   }

   public static record c() implements bud {
   }

   public static record d(bud.e g, bud.b h) implements bud {
      @Override
      public boolean a() {
         return true;
      }

      public bud.d a(czd $$0) {
         return new bud.d(this.g, new bud.b(true, $$0));
      }

      public bud.d b() {
         return new bud.d(this.g, bud.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public czd d() {
         return this.h.d;
      }

      public bud.e e() {
         return this.g;
      }

      public bud.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bud {
   }
}
