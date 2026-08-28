import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class frn {
   private final Supplier<String> a;
   private final Consumer<String> b;
   private final Supplier<String> c;
   private final Consumer<String> d;
   private final Predicate<String> e;
   private int f;
   private int g;

   public frn(Supplier<String> $$0, Consumer<String> $$1, Supplier<String> $$2, Consumer<String> $$3, Predicate<String> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f();
   }

   public static Supplier<String> a(flj $$0) {
      return () -> b($$0);
   }

   public static String b(flj $$0) {
      return n.a($$0.p.a().replaceAll("\\r", ""));
   }

   public static Consumer<String> c(flj $$0) {
      return $$1 -> a($$0, $$1);
   }

   public static void a(flj $$0, String $$1) {
      $$0.p.a($$1);
   }

   public boolean a(char $$0) {
      if (azw.a($$0)) {
         this.a(this.a.get(), Character.toString($$0));
      }

      return true;
   }

   public boolean a(int $$0) {
      if (fuk.f($$0)) {
         this.d();
         return true;
      } else if (fuk.e($$0)) {
         this.c();
         return true;
      } else if (fuk.d($$0)) {
         this.b();
         return true;
      } else if (fuk.c($$0)) {
         this.a();
         return true;
      } else {
         frn.a $$1 = fuk.s() ? frn.a.b : frn.a.a;
         if ($$0 == 259) {
            this.a(-1, $$1);
            return true;
         } else {
            if ($$0 == 261) {
               this.a(1, $$1);
            } else {
               if ($$0 == 263) {
                  this.a(-1, fuk.t(), $$1);
                  return true;
               }

               if ($$0 == 262) {
                  this.a(1, fuk.t(), $$1);
                  return true;
               }

               if ($$0 == 268) {
                  this.a(fuk.t());
                  return true;
               }

               if ($$0 == 269) {
                  this.b(fuk.t());
                  return true;
               }
            }

            return false;
         }
      }
   }

   private int h(int $$0) {
      return ayz.a($$0, 0, this.a.get().length());
   }

   private void a(String $$0, String $$1) {
      if (this.g != this.f) {
         $$0 = this.c($$0);
      }

      this.f = ayz.a(this.f, 0, $$0.length());
      String $$2 = new StringBuilder($$0).insert(this.f, $$1).toString();
      if (this.e.test($$2)) {
         this.b.accept($$2);
         this.g = this.f = Math.min($$2.length(), this.f + $$1.length());
      }
   }

   public void a(String $$0) {
      this.a(this.a.get(), $$0);
   }

   private void c(boolean $$0) {
      if (!$$0) {
         this.g = this.f;
      }
   }

   public void a(int $$0, boolean $$1, frn.a $$2) {
      switch ($$2) {
         case a:
            this.a($$0, $$1);
            break;
         case b:
            this.b($$0, $$1);
      }
   }

   public void b(int $$0) {
      this.a($$0, false);
   }

   public void a(int $$0, boolean $$1) {
      this.f = af.a(this.a.get(), this.f, $$0);
      this.c($$1);
   }

   public void c(int $$0) {
      this.b($$0, false);
   }

   public void b(int $$0, boolean $$1) {
      this.f = flt.a(this.a.get(), $$0, this.f, true);
      this.c($$1);
   }

   public void a(int $$0, frn.a $$1) {
      switch ($$1) {
         case a:
            this.e($$0);
            break;
         case b:
            this.d($$0);
      }
   }

   public void d(int $$0) {
      int $$1 = flt.a(this.a.get(), $$0, this.f, true);
      this.e($$1 - this.f);
   }

   public void e(int $$0) {
      String $$1 = this.a.get();
      if (!$$1.isEmpty()) {
         String $$2;
         if (this.g != this.f) {
            $$2 = this.c($$1);
         } else {
            int $$3 = af.a($$1, this.f, $$0);
            int $$4 = Math.min($$3, this.f);
            int $$5 = Math.max($$3, this.f);
            $$2 = new StringBuilder($$1).delete($$4, $$5).toString();
            if ($$0 < 0) {
               this.g = this.f = $$4;
            }
         }

         this.b.accept($$2);
      }
   }

   public void a() {
      String $$0 = this.a.get();
      this.d.accept(this.b($$0));
      this.b.accept(this.c($$0));
   }

   public void b() {
      this.a(this.a.get(), this.c.get());
      this.g = this.f;
   }

   public void c() {
      this.d.accept(this.b(this.a.get()));
   }

   public void d() {
      this.g = 0;
      this.f = this.a.get().length();
   }

   private String b(String $$0) {
      int $$1 = Math.min(this.f, this.g);
      int $$2 = Math.max(this.f, this.g);
      return $$0.substring($$1, $$2);
   }

   private String c(String $$0) {
      if (this.g == this.f) {
         return $$0;
      } else {
         int $$1 = Math.min(this.f, this.g);
         int $$2 = Math.max(this.f, this.g);
         String $$3 = $$0.substring(0, $$1) + $$0.substring($$2);
         this.g = this.f = $$1;
         return $$3;
      }
   }

   public void e() {
      this.a(false);
   }

   public void a(boolean $$0) {
      this.f = 0;
      this.c($$0);
   }

   public void f() {
      this.b(false);
   }

   public void b(boolean $$0) {
      this.f = this.a.get().length();
      this.c($$0);
   }

   public int g() {
      return this.f;
   }

   public void f(int $$0) {
      this.c($$0, true);
   }

   public void c(int $$0, boolean $$1) {
      this.f = this.h($$0);
      this.c($$1);
   }

   public int h() {
      return this.g;
   }

   public void g(int $$0) {
      this.g = this.h($$0);
   }

   public void a(int $$0, int $$1) {
      int $$2 = this.a.get().length();
      this.f = ayz.a($$0, 0, $$2);
      this.g = ayz.a($$1, 0, $$2);
   }

   public boolean i() {
      return this.f != this.g;
   }

   public static enum a {
      a,
      b;
   }
}
