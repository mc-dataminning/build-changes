import javax.annotation.Nullable;

public sealed interface bsj permits bsj.d, bsj.a, bsj.c, bsj.f {
   bsj.d a = new bsj.d(bsj.e.b, bsj.b.b);
   bsj.d b = new bsj.d(bsj.e.c, bsj.b.b);
   bsj.d c = new bsj.d(bsj.e.a, bsj.b.b);
   bsj.a d = new bsj.a();
   bsj.c e = new bsj.c();
   bsj.f f = new bsj.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bsj {
   }

   public static record b(boolean c, @Nullable cwo d) {
      static bsj.b a = new bsj.b(false, null);
      static bsj.b b = new bsj.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cwo b() {
         return this.d;
      }
   }

   public static record c() implements bsj {
   }

   public static record d(bsj.e g, bsj.b h) implements bsj {
      @Override
      public boolean a() {
         return true;
      }

      public bsj.d a(cwo $$0) {
         return new bsj.d(this.g, new bsj.b(true, $$0));
      }

      public bsj.d b() {
         return new bsj.d(this.g, bsj.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cwo d() {
         return this.h.d;
      }

      public bsj.e e() {
         return this.g;
      }

      public bsj.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bsj {
   }
}
