import javax.annotation.Nullable;

public sealed interface bta permits bta.d, bta.a, bta.c, bta.f {
   bta.d a = new bta.d(bta.e.b, bta.b.b);
   bta.d b = new bta.d(bta.e.c, bta.b.b);
   bta.d c = new bta.d(bta.e.a, bta.b.b);
   bta.a d = new bta.a();
   bta.c e = new bta.c();
   bta.f f = new bta.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bta {
   }

   public static record b(boolean c, @Nullable cxg d) {
      static bta.b a = new bta.b(false, null);
      static bta.b b = new bta.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cxg b() {
         return this.d;
      }
   }

   public static record c() implements bta {
   }

   public static record d(bta.e g, bta.b h) implements bta {
      @Override
      public boolean a() {
         return true;
      }

      public bta.d a(cxg $$0) {
         return new bta.d(this.g, new bta.b(true, $$0));
      }

      public bta.d b() {
         return new bta.d(this.g, bta.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cxg d() {
         return this.h.d;
      }

      public bta.e e() {
         return this.g;
      }

      public bta.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bta {
   }
}
