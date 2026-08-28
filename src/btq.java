import javax.annotation.Nullable;

public sealed interface btq permits btq.d, btq.a, btq.c, btq.f {
   btq.d a = new btq.d(btq.e.b, btq.b.b);
   btq.d b = new btq.d(btq.e.c, btq.b.b);
   btq.d c = new btq.d(btq.e.a, btq.b.b);
   btq.a d = new btq.a();
   btq.c e = new btq.c();
   btq.f f = new btq.f();

   default boolean a() {
      return false;
   }

   public static record a() implements btq {
   }

   public static record b(boolean c, @Nullable cxy d) {
      static btq.b a = new btq.b(false, null);
      static btq.b b = new btq.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cxy b() {
         return this.d;
      }
   }

   public static record c() implements btq {
   }

   public static record d(btq.e g, btq.b h) implements btq {
      @Override
      public boolean a() {
         return true;
      }

      public btq.d a(cxy $$0) {
         return new btq.d(this.g, new btq.b(true, $$0));
      }

      public btq.d b() {
         return new btq.d(this.g, btq.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cxy d() {
         return this.h.d;
      }

      public btq.e e() {
         return this.g;
      }

      public btq.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements btq {
   }
}
