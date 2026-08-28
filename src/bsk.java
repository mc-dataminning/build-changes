import javax.annotation.Nullable;

public sealed interface bsk permits bsk.d, bsk.a, bsk.c, bsk.f {
   bsk.d a = new bsk.d(bsk.e.b, bsk.b.b);
   bsk.d b = new bsk.d(bsk.e.c, bsk.b.b);
   bsk.d c = new bsk.d(bsk.e.a, bsk.b.b);
   bsk.a d = new bsk.a();
   bsk.c e = new bsk.c();
   bsk.f f = new bsk.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bsk {
   }

   public static record b(boolean c, @Nullable cwm d) {
      static bsk.b a = new bsk.b(false, null);
      static bsk.b b = new bsk.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cwm b() {
         return this.d;
      }
   }

   public static record c() implements bsk {
   }

   public static record d(bsk.e g, bsk.b h) implements bsk {
      @Override
      public boolean a() {
         return true;
      }

      public bsk.d a(cwm $$0) {
         return new bsk.d(this.g, new bsk.b(true, $$0));
      }

      public bsk.d b() {
         return new bsk.d(this.g, bsk.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cwm d() {
         return this.h.d;
      }

      public bsk.e e() {
         return this.g;
      }

      public bsk.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bsk {
   }
}
