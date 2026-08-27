import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;

public class fac {
   public static final int a = Integer.MAX_VALUE;
   private static final int b = 2;
   private final eys c;
   private final List<fac.a> d = Lists.newArrayList();
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

   public fac(eys $$0, int $$1) {
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
         String $$1 = this.d(aa.a($$0, true));
         fac.a $$2 = this.e();
         this.e = new StringBuilder(this.e).replace($$2.a, $$2.b, $$1).toString();
         this.f = $$2.a + $$1.length();
         this.g = this.f;
         this.n();
      }
   }

   public void b(int $$0) {
      if (!this.i()) {
         this.g = awh.a(this.f + $$0, 0, this.e.length());
      }

      this.b("");
   }

   public int d() {
      return this.f;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   public fac.a e() {
      return new fac.a(Math.min(this.g, this.f), Math.max(this.g, this.f));
   }

   public int f() {
      return this.d.size();
   }

   public int g() {
      for (int $$0 = 0; $$0 < this.d.size(); $$0++) {
         fac.a $$1 = this.d.get($$0);
         if (this.f >= $$1.a && this.f <= $$1.b) {
            return $$0;
         }
      }

      return -1;
   }

   public fac.a c(int $$0) {
      return this.d.get(awh.a($$0, 0, this.d.size() - 1));
   }

   public void a(fat $$0, int $$1) {
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

      this.f = awh.a(this.f, 0, this.e.length());
      this.l.run();
      if (!this.h) {
         this.g = this.f;
      }
   }

   public void d(int $$0) {
      if ($$0 != 0) {
         int $$1 = this.c.b(this.e.substring(this.m().a, this.f)) + 2;
         fac.a $$2 = this.f($$0);
         int $$3 = this.c.a(this.e.substring($$2.a, $$2.b), $$1).length();
         this.a(fat.a, $$2.a + $$3);
      }
   }

   public void a(double $$0, double $$1) {
      int $$2 = awh.a($$0);
      int $$3 = awh.a($$1 / 9.0);
      fac.a $$4 = this.d.get(awh.a($$3, 0, this.d.size() - 1));
      int $$5 = this.c.a(this.e.substring($$4.a, $$4.b), $$2).length();
      this.a(fat.a, $$4.a + $$5);
   }

   public boolean e(int $$0) {
      this.h = ffe.v();
      if (ffe.f($$0)) {
         this.f = this.e.length();
         this.g = 0;
         return true;
      } else if (ffe.e($$0)) {
         exh.O().o.a(this.j());
         return true;
      } else if (ffe.d($$0)) {
         this.b(exh.O().o.a());
         return true;
      } else if (ffe.c($$0)) {
         exh.O().o.a(this.j());
         this.b("");
         return true;
      } else {
         switch ($$0) {
            case 257:
            case 335:
               this.b("\n");
               return true;
            case 259:
               if (ffe.t()) {
                  fac.a $$3 = this.k();
                  this.b($$3.a - this.f);
               } else {
                  this.b(-1);
               }

               return true;
            case 261:
               if (ffe.t()) {
                  fac.a $$4 = this.l();
                  this.b($$4.a - this.f);
               } else {
                  this.b(1);
               }

               return true;
            case 262:
               if (ffe.t()) {
                  fac.a $$2 = this.l();
                  this.a(fat.a, $$2.a);
               } else {
                  this.a(fat.b, 1);
               }

               return true;
            case 263:
               if (ffe.t()) {
                  fac.a $$1 = this.k();
                  this.a(fat.a, $$1.a);
               } else {
                  this.a(fat.b, -1);
               }

               return true;
            case 264:
               if (!ffe.t()) {
                  this.d(1);
               }

               return true;
            case 265:
               if (!ffe.t()) {
                  this.d(-1);
               }

               return true;
            case 266:
               this.a(fat.a, 0);
               return true;
            case 267:
               this.a(fat.c, 0);
               return true;
            case 268:
               if (ffe.t()) {
                  this.a(fat.a, 0);
               } else {
                  this.a(fat.a, this.m().a);
               }

               return true;
            case 269:
               if (ffe.t()) {
                  this.a(fat.c, 0);
               } else {
                  this.a(fat.a, this.m().b);
               }

               return true;
            default:
               return false;
         }
      }
   }

   public Iterable<fac.a> h() {
      return this.d;
   }

   public boolean i() {
      return this.g != this.f;
   }

   @VisibleForTesting
   public String j() {
      fac.a $$0 = this.e();
      return this.e.substring($$0.a, $$0.b);
   }

   private fac.a m() {
      return this.f(0);
   }

   private fac.a f(int $$0) {
      int $$1 = this.g();
      if ($$1 < 0) {
         throw new IllegalStateException("Cursor is not within text (cursor = " + this.f + ", length = " + this.e.length() + ")");
      } else {
         return this.d.get(awh.a($$1 + $$0, 0, this.d.size() - 1));
      }
   }

   @VisibleForTesting
   public fac.a k() {
      if (this.e.isEmpty()) {
         return fac.a.c;
      } else {
         int $$0 = awh.a(this.f, 0, this.e.length() - 1);

         while ($$0 > 0 && Character.isWhitespace(this.e.charAt($$0 - 1))) {
            $$0--;
         }

         while ($$0 > 0 && !Character.isWhitespace(this.e.charAt($$0 - 1))) {
            $$0--;
         }

         return new fac.a($$0, this.g($$0));
      }
   }

   @VisibleForTesting
   public fac.a l() {
      if (this.e.isEmpty()) {
         return fac.a.c;
      } else {
         int $$0 = awh.a(this.f, 0, this.e.length() - 1);

         while ($$0 < this.e.length() && !Character.isWhitespace(this.e.charAt($$0))) {
            $$0++;
         }

         while ($$0 < this.e.length() && Character.isWhitespace(this.e.charAt($$0))) {
            $$0++;
         }

         return new fac.a($$0, this.g($$0));
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
         this.d.add(fac.a.c);
      } else {
         this.c.b().a(this.e, this.j, wn.a, false, ($$0, $$1, $$2) -> this.d.add(new fac.a($$1, $$2)));
         if (this.e.charAt(this.e.length() - 1) == '\n') {
            this.d.add(new fac.a(this.e.length(), this.e.length()));
         }
      }
   }

   private String c(String $$0) {
      return this.b() ? axd.a($$0, this.i, false) : $$0;
   }

   private String d(String $$0) {
      if (this.b()) {
         int $$1 = this.i - this.e.length();
         return axd.a($$0, $$1, false);
      } else {
         return $$0;
      }
   }

   protected static record a(int a, int b) {
      static final fac.a c = new fac.a(0, 0);
   }
}
