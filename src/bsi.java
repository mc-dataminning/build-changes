import javax.annotation.Nullable;

public sealed interface bsi permits bsi.d, bsi.a, bsi.c, bsi.f {
   bsi.d a = new bsi.d(bsi.e.b, bsi.b.b);
   bsi.d b = new bsi.d(bsi.e.c, bsi.b.b);
   bsi.d c = new bsi.d(bsi.e.a, bsi.b.b);
   bsi.a d = new bsi.a();
   bsi.c e = new bsi.c();
   bsi.f f = new bsi.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bsi {
   }

   public static record b(boolean c, @Nullable cwn d) {
      static bsi.b a = new bsi.b(false, null);
      static bsi.b b = new bsi.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cwn b() {
         return this.d;
      }
   }

   public static record c() implements bsi {
   }

   public static record d(bsi.e g, bsi.b h) implements bsi {
      @Override
      public boolean a() {
         return true;
      }

      public bsi.d a(cwn $$0) {
         return new bsi.d(this.g, new bsi.b(true, $$0));
      }

      public bsi.d b() {
         return new bsi.d(this.g, bsi.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cwn d() {
         return this.h.d;
      }

      public bsi.e e() {
         return this.g;
      }

      public bsi.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bsi {
   }
}
