import javax.annotation.Nullable;

public sealed interface bsy permits bsy.d, bsy.a, bsy.c, bsy.f {
   bsy.d a = new bsy.d(bsy.e.b, bsy.b.b);
   bsy.d b = new bsy.d(bsy.e.c, bsy.b.b);
   bsy.d c = new bsy.d(bsy.e.a, bsy.b.b);
   bsy.a d = new bsy.a();
   bsy.c e = new bsy.c();
   bsy.f f = new bsy.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bsy {
   }

   public static record b(boolean c, @Nullable cxh d) {
      static bsy.b a = new bsy.b(false, null);
      static bsy.b b = new bsy.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cxh b() {
         return this.d;
      }
   }

   public static record c() implements bsy {
   }

   public static record d(bsy.e g, bsy.b h) implements bsy {
      @Override
      public boolean a() {
         return true;
      }

      public bsy.d a(cxh $$0) {
         return new bsy.d(this.g, new bsy.b(true, $$0));
      }

      public bsy.d b() {
         return new bsy.d(this.g, bsy.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cxh d() {
         return this.h.d;
      }

      public bsy.e e() {
         return this.g;
      }

      public bsy.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bsy {
   }
}
