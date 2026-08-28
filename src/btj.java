import javax.annotation.Nullable;

public sealed interface btj permits btj.d, btj.a, btj.c, btj.f {
   btj.d a = new btj.d(btj.e.b, btj.b.b);
   btj.d b = new btj.d(btj.e.c, btj.b.b);
   btj.d c = new btj.d(btj.e.a, btj.b.b);
   btj.a d = new btj.a();
   btj.c e = new btj.c();
   btj.f f = new btj.f();

   default boolean a() {
      return false;
   }

   public static record a() implements btj {
   }

   public static record b(boolean c, @Nullable cxp d) {
      static btj.b a = new btj.b(false, null);
      static btj.b b = new btj.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public cxp b() {
         return this.d;
      }
   }

   public static record c() implements btj {
   }

   public static record d(btj.e g, btj.b h) implements btj {
      @Override
      public boolean a() {
         return true;
      }

      public btj.d a(cxp $$0) {
         return new btj.d(this.g, new btj.b(true, $$0));
      }

      public btj.d b() {
         return new btj.d(this.g, btj.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public cxp d() {
         return this.h.d;
      }

      public btj.e e() {
         return this.g;
      }

      public btj.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements btj {
   }
}
