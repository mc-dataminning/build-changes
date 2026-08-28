import javax.annotation.Nullable;

public sealed interface bti permits bti.d, bti.a, bti.c, bti.f {
   bti.d a = new bti.d(bti.e.b, bti.b.b);
   bti.d b = new bti.d(bti.e.c, bti.b.b);
   bti.d c = new bti.d(bti.e.a, bti.b.b);
   bti.a d = new bti.a();
   bti.c e = new bti.c();
   bti.f f = new bti.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bti {
   }

   public static record b(boolean c, @Nullable cxo d) {
      static bti.b a = new bti.b(false, null);
      static bti.b b = new bti.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cxo b() {
         return this.d;
      }
   }

   public static record c() implements bti {
   }

   public static record d(bti.e g, bti.b h) implements bti {
      @Override
      public boolean a() {
         return true;
      }

      public bti.d a(cxo $$0) {
         return new bti.d(this.g, new bti.b(true, $$0));
      }

      public bti.d b() {
         return new bti.d(this.g, bti.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cxo d() {
         return this.h.d;
      }

      public bti.e e() {
         return this.g;
      }

      public bti.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bti {
   }
}
