import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;

public class fgv {
   public static final int a = Integer.MAX_VALUE;
   private static final int b = 2;
   private final ffl c;
   private final List<fgv.a> d = Lists.newArrayList();
   private String e;
   private int f;
   private int g;
   private boolean h;
   private int i = Integer.MAX_VALUE;
   private final int j;
   private Consumer<String> k = $$0x -> {
   };
   private Runnable l = () -> {
   };

   public fgv(ffl $$0, int $$1) {
      this.c = $$0;
      this.j = $$1;
      this.a("");
   }

   public int a() {
      return this.i;
   }

   public void a(int $$0) {
      if ($$0 < 0) {
         throw new IllegalArgumentException("Character limit cannot be negative");
      } else {
         this.i = $$0;
      }
   }

   public boolean b() {
      return this.i != Integer.MAX_VALUE;
   }

   public void a(Consumer<String> $$0) {
      this.k = $$0;
   }

   public void a(Runnable $$0) {
      this.l = $$0;
   }

   public void a(String $$0) {
      this.e = this.c($$0);
      this.f = this.e.length();
      this.g = this.f;
      this.n();
   }

   public String c() {
      return this.e;
   }

   public void b(String $$0) {
      if (!$$0.isEmpty() || this.i()) {
         String $$1 = this.d(aza.a($$0, true));
         fgv.a $$2 = this.e();
         this.e = new StringBuilder(this.e).replace($$2.a, $$2.b, $$1).toString();
         this.f = $$2.a + $$1.length();
         this.g = this.f;
         this.n();
      }
   }

   public void b(int $$0) {
      if (!this.i()) {
         this.g = ayf.a(this.f + $$0, 0, this.e.length());
      }

      this.b("");
   }

   public int d() {
      return this.f;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   public fgv.a e() {
      return new fgv.a(Math.min(this.g, this.f), Math.max(this.g, this.f));
   }

   public int f() {
      return this.d.size();
   }

   public int g() {
      for (int $$0 = 0; $$0 < this.d.size(); $$0++) {
         fgv.a $$1 = this.d.get($$0);
         if (this.f >= $$1.a && this.f <= $$1.b) {
            return $$0;
         }
      }

      return -1;
   }

   public fgv.a c(int $$0) {
      return this.d.get(ayf.a($$0, 0, this.d.size() - 1));
   }

   public void a(fhm $$0, int $$1) {
      switch ($$0) {
         case a:
            this.f = $$1;
            break;
         case b:
            this.f += $$1;
            break;
         case c:
            this.f = this.e.length() + $$1;
      }

      this.f = ayf.a(this.f, 0, this.e.length());
      this.l.run();
      if (!this.h) {
         this.g = this.f;
      }
   }

   public void d(int $$0) {
      if ($$0 != 0) {
         int $$1 = this.c.b(this.e.substring(this.m().a, this.f)) + 2;
         fgv.a $$2 = this.f($$0);
         int $$3 = this.c.a(this.e.substring($$2.a, $$2.b), $$1).length();
         this.a(fhm.a, $$2.a + $$3);
      }
   }

   public void a(double $$0, double $$1) {
      int $$2 = ayf.a($$0);
      int $$3 = ayf.a($$1 / 9.0);
      fgv.a $$4 = this.d.get(ayf.a($$3, 0, this.d.size() - 1));
      int $$5 = this.c.a(this.e.substring($$4.a, $$4.b), $$2).length();
      this.a(fhm.a, $$4.a + $$5);
   }

   public boolean e(int $$0) {
      this.h = flz.s();
      if (flz.f($$0)) {
         this.f = this.e.length();
         this.g = 0;
         return true;
      } else if (flz.e($$0)) {
         feb.Q().o.a(this.j());
         return true;
      } else if (flz.d($$0)) {
         this.b(feb.Q().o.a());
         return true;
      } else if (flz.c($$0)) {
         feb.Q().o.a(this.j());
         this.b("");
         return true;
      } else {
         switch ($$0) {
            case 257:
            case 335:
               this.b("\n");
               return true;
            case 259:
               if (flz.r()) {
                  fgv.a $$3 = this.k();
                  this.b($$3.a - this.f);
               } else {
                  this.b(-1);
               }

               return true;
            case 261:
               if (flz.r()) {
                  fgv.a $$4 = this.l();
                  this.b($$4.a - this.f);
               } else {
                  this.b(1);
               }

               return true;
            case 262:
               if (flz.r()) {
                  fgv.a $$2 = this.l();
                  this.a(fhm.a, $$2.a);
               } else {
                  this.a(fhm.b, 1);
               }

               return true;
            case 263:
               if (flz.r()) {
                  fgv.a $$1 = this.k();
                  this.a(fhm.a, $$1.a);
               } else {
                  this.a(fhm.b, -1);
               }

               return true;
            case 264:
               if (!flz.r()) {
                  this.d(1);
               }

               return true;
            case 265:
               if (!flz.r()) {
                  this.d(-1);
               }

               return true;
            case 266:
               this.a(fhm.a, 0);
               return true;
            case 267:
               this.a(fhm.c, 0);
               return true;
            case 268:
               if (flz.r()) {
                  this.a(fhm.a, 0);
               } else {
                  this.a(fhm.a, this.m().a);
               }

               return true;
            case 269:
               if (flz.r()) {
                  this.a(fhm.c, 0);
               } else {
                  this.a(fhm.a, this.m().b);
               }

               return true;
            default:
               return false;
         }
      }
   }

   public Iterable<fgv.a> h() {
      return this.d;
   }

   public boolean i() {
      return this.g != this.f;
   }

   @VisibleForTesting
   public String j() {
      fgv.a $$0 = this.e();
      return this.e.substring($$0.a, $$0.b);
   }

   private fgv.a m() {
      return this.f(0);
   }

   private fgv.a f(int $$0) {
      int $$1 = this.g();
      if ($$1 < 0) {
         throw new IllegalStateException("Cursor is not within text (cursor = " + this.f + ", length = " + this.e.length() + ")");
      } else {
         return this.d.get(ayf.a($$1 + $$0, 0, this.d.size() - 1));
      }
   }

   @VisibleForTesting
   public fgv.a k() {
      if (this.e.isEmpty()) {
         return fgv.a.c;
      } else {
         int $$0 = ayf.a(this.f, 0, this.e.length() - 1);

         while ($$0 > 0 && Character.isWhitespace(this.e.charAt($$0 - 1))) {
            $$0--;
         }

         while ($$0 > 0 && !Character.isWhitespace(this.e.charAt($$0 - 1))) {
            $$0--;
         }

         return new fgv.a($$0, this.g($$0));
      }
   }

   @VisibleForTesting
   public fgv.a l() {
      if (this.e.isEmpty()) {
         return fgv.a.c;
      } else {
         int $$0 = ayf.a(this.f, 0, this.e.length() - 1);

         while ($$0 < this.e.length() && !Character.isWhitespace(this.e.charAt($$0))) {
            $$0++;
         }

         while ($$0 < this.e.length() && Character.isWhitespace(this.e.charAt($$0))) {
            $$0++;
         }

         return new fgv.a($$0, this.g($$0));
      }
   }

   private int g(int $$0) {
      int $$1 = $$0;

      while ($$1 < this.e.length() && !Character.isWhitespace(this.e.charAt($$1))) {
         $$1++;
      }

      return $$1;
   }

   private void n() {
      this.o();
      this.k.accept(this.e);
      this.l.run();
   }

   private void o() {
      this.d.clear();
      if (this.e.isEmpty()) {
         this.d.add(fgv.a.c);
      } else {
         this.c.b().a(this.e, this.j, xu.a, false, ($$0, $$1, $$2) -> this.d.add(new fgv.a($$1, $$2)));
         if (this.e.charAt(this.e.length() - 1) == '\n') {
            this.d.add(new fgv.a(this.e.length(), this.e.length()));
         }
      }
   }

   private String c(String $$0) {
      return this.b() ? aza.a($$0, this.i, false) : $$0;
   }

   private String d(String $$0) {
      if (this.b()) {
         int $$1 = this.i - this.e.length();
         return aza.a($$0, $$1, false);
      } else {
         return $$0;
      }
   }

   protected static record a(int a, int b) {
      static final fgv.a c = new fgv.a(0, 0);
   }
}
