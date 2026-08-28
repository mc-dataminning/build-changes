import javax.annotation.Nullable;

public sealed interface bsl permits bsl.d, bsl.a, bsl.c, bsl.f {
   bsl.d a = new bsl.d(bsl.e.b, bsl.b.b);
   bsl.d b = new bsl.d(bsl.e.c, bsl.b.b);
   bsl.d c = new bsl.d(bsl.e.a, bsl.b.b);
   bsl.a d = new bsl.a();
   bsl.c e = new bsl.c();
   bsl.f f = new bsl.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bsl {
   }

   public static record b(boolean c, @Nullable cwq d) {
      static bsl.b a = new bsl.b(false, null);
      static bsl.b b = new bsl.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cwq b() {
         return this.d;
      }
   }

   public static record c() implements bsl {
   }

   public static record d(bsl.e g, bsl.b h) implements bsl {
      @Override
      public boolean a() {
         return true;
      }

      public bsl.d a(cwq $$0) {
         return new bsl.d(this.g, new bsl.b(true, $$0));
      }

      public bsl.d b() {
         return new bsl.d(this.g, bsl.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cwq d() {
         return this.h.d;
      }

      public bsl.e e() {
         return this.g;
      }

      public bsl.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bsl {
   }
}
