import javax.annotation.Nullable;

public sealed interface bvc permits bvc.d, bvc.a, bvc.c, bvc.f {
   bvc.d a = new bvc.d(bvc.e.b, bvc.b.b);
   bvc.d b = new bvc.d(bvc.e.c, bvc.b.b);
   bvc.d c = new bvc.d(bvc.e.a, bvc.b.b);
   bvc.a d = new bvc.a();
   bvc.c e = new bvc.c();
   bvc.f f = new bvc.f();

   default boolean a() {
      return false;
   }

   public static record a() implements bvc {
   }

   public static record b(boolean c, @Nullable dak d) {
      static bvc.b a = new bvc.b(false, null);
      static bvc.b b = new bvc.b(true, null);

      public boolean a() {
         return this.c;
      }

      @Nullable
      public dak b() {
         return this.d;
      }
   }

   public static record c() implements bvc {
   }

   public static record d(bvc.e g, bvc.b h) implements bvc {
      @Override
      public boolean a() {
         return true;
      }

      public bvc.d a(dak $$0) {
         return new bvc.d(this.g, new bvc.b(true, $$0));
      }

      public bvc.d b() {
         return new bvc.d(this.g, bvc.b.a);
      }

      public boolean c() {
         return this.h.c;
      }

      @Nullable
      public dak d() {
         return this.h.d;
      }

      public bvc.e e() {
         return this.g;
      }

      public bvc.b f() {
         return this.h;
      }
   }

   public static enum e {
      a,
      b,
      c;
   }

   public static record f() implements bvc {
   }
}
