import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fqw extends fql {
   private static final fsa d = new fsa(ald.b("widget/text_field"), ald.b("widget/text_field_highlighted"));
   public static final int a = -1;
   public static final int b = 1;
   private static final int e = 1;
   private static final int f = -3092272;
   private static final String m = "_";
   public static final int c = 14737632;
   private static final int n = 300;
   private final fpx o;
   private String p = "";
   private int q = 32;
   private boolean r = true;
   private boolean s = true;
   private boolean u = true;
   private int v;
   private int w;
   private int x;
   private int y = 14737632;
   private int z = 7368816;
   @Nullable
   private String A;
   @Nullable
   private Consumer<String> B;
   private Predicate<String> C = Objects::nonNull;
   private BiFunction<String, Integer, ayw> D = ($$0x, $$1x) -> ayw.forward($$0x, xs.a);
   @Nullable
   private wv E;
   private long F = af.c();

   public fqw(fpx $$0, int $$1, int $$2, wv $$3) {
      this($$0, 0, 0, $$1, $$2, $$3);
   }

   public fqw(fpx $$0, int $$1, int $$2, int $$3, int $$4, wv $$5) {
      this($$0, $$1, $$2, $$3, $$4, null, $$5);
   }

   public fqw(fpx $$0, int $$1, int $$2, int $$3, int $$4, @Nullable fqw $$5, wv $$6) {
      super($$1, $$2, $$3, $$4, $$6);
      this.o = $$0;
      if ($$5 != null) {
         this.a($$5.a());
      }
   }

   public void b(Consumer<String> $$0) {
      this.B = $$0;
   }

   public void a(BiFunction<String, Integer, ayw> $$0) {
      this.D = $$0;
   }

   @Override
   protected xj d() {
      wv $$0 = this.B();
      return wv.a("gui.narrate.editBox", $$0, this.p);
   }

   public void a(String $$0) {
      if (this.C.test($$0)) {
         if ($$0.length() > this.q) {
            this.p = $$0.substring(0, this.q);
         } else {
            this.p = $$0;
         }

         this.c(false);
         this.o(this.w);
         this.d($$0);
      }
   }

   public String a() {
      return this.p;
   }

   public String b() {
      int $$0 = Math.min(this.w, this.x);
      int $$1 = Math.max(this.w, this.x);
      return this.p.substring($$0, $$1);
   }

   public void a(Predicate<String> $$0) {
      this.C = $$0;
   }

   public void b(String $$0) {
      int $$1 = Math.min(this.w, this.x);
      int $$2 = Math.max(this.w, this.x);
      int $$3 = this.q - this.p.length() - ($$1 - $$2);
      if ($$3 > 0) {
         String $$4 = bah.g($$0);
         int $$5 = $$4.length();
         if ($$3 < $$5) {
            if (Character.isHighSurrogate($$4.charAt($$3 - 1))) {
               $$3--;
            }

            $$4 = $$4.substring(0, $$3);
            $$5 = $$3;
         }

         String $$6 = new StringBuilder(this.p).replace($$1, $$2, $$4).toString();
         if (this.C.test($$6)) {
            this.p = $$6;
            this.e($$1 + $$5);
            this.o(this.w);
            this.d(this.p);
         }
      }
   }

   private void d(String $$0) {
      if (this.B != null) {
         this.B.accept($$0);
      }
   }

   private void q(int $$0) {
      if (fwf.s()) {
         this.a($$0);
      } else {
         this.b($$0);
      }
   }

   public void a(int $$0) {
      if (!this.p.isEmpty()) {
         if (this.x != this.w) {
            this.b("");
         } else {
            this.c(this.d($$0));
         }
      }
   }

   public void b(int $$0) {
      this.c(this.r($$0));
   }

   public void c(int $$0) {
      if (!this.p.isEmpty()) {
         if (this.x != this.w) {
            this.b("");
         } else {
            int $$1 = Math.min($$0, this.w);
            int $$2 = Math.max($$0, this.w);
            if ($$1 != $$2) {
               String $$3 = new StringBuilder(this.p).delete($$1, $$2).toString();
               if (this.C.test($$3)) {
                  this.p = $$3;
                  this.b($$1, false);
               }
            }
         }
      }
   }

   public int d(int $$0) {
      return this.a($$0, this.e());
   }

   private int a(int $$0, int $$1) {
      return this.a($$0, $$1, true);
   }

   private int a(int $$0, int $$1, boolean $$2) {
      int $$3 = $$1;
      boolean $$4 = $$0 < 0;
      int $$5 = Math.abs($$0);

      for (int $$6 = 0; $$6 < $$5; $$6++) {
         if (!$$4) {
            int $$7 = this.p.length();
            $$3 = this.p.indexOf(32, $$3);
            if ($$3 == -1) {
               $$3 = $$7;
            } else {
               while ($$2 && $$3 < $$7 && this.p.charAt($$3) == ' ') {
                  $$3++;
               }
            }
         } else {
            while ($$2 && $$3 > 0 && this.p.charAt($$3 - 1) == ' ') {
               $$3--;
            }

            while ($$3 > 0 && this.p.charAt($$3 - 1) != ' ') {
               $$3--;
            }
         }
      }

      return $$3;
   }

   public void a(int $$0, boolean $$1) {
      this.b(this.r($$0), $$1);
   }

   private int r(int $$0) {
      return af.a(this.p, this.w, $$0);
   }

   public void b(int $$0, boolean $$1) {
      this.e($$0);
      if (!$$1) {
         this.o(this.w);
      }

      this.d(this.p);
   }

   public void e(int $$0) {
      this.w = azk.a($$0, 0, this.p.length());
      this.s(this.w);
   }

   public void b(boolean $$0) {
      this.b(0, $$0);
   }

   public void c(boolean $$0) {
      this.b(this.p.length(), $$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (this.E() && this.aI_()) {
         switch ($$0) {
            case 259:
               if (this.u) {
                  this.q(-1);
               }

               return true;
            case 260:
            case 264:
            case 265:
            case 266:
            case 267:
            default:
               if (fwf.f($$0)) {
                  this.c(false);
                  this.o(0);
                  return true;
               } else if (fwf.e($$0)) {
                  fnd.Q().p.a(this.b());
                  return true;
               } else if (fwf.d($$0)) {
                  if (this.l()) {
                     this.b(fnd.Q().p.a());
                  }

                  return true;
               } else {
                  if (fwf.c($$0)) {
                     fnd.Q().p.a(this.b());
                     if (this.l()) {
                        this.b("");
                     }

                     return true;
                  }

                  return false;
               }
            case 261:
               if (this.u) {
                  this.q(1);
               }

               return true;
            case 262:
               if (fwf.s()) {
                  this.b(this.d(1), fwf.t());
               } else {
                  this.a(1, fwf.t());
               }

               return true;
            case 263:
               if (fwf.s()) {
                  this.b(this.d(-1), fwf.t());
               } else {
                  this.a(-1, fwf.t());
               }

               return true;
            case 268:
               this.b(fwf.t());
               return true;
            case 269:
               this.c(fwf.t());
               return true;
         }
      } else {
         return false;
      }
   }

   public boolean c() {
      return this.E() && this.aI_() && this.l();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (!this.c()) {
         return false;
      } else if (bah.a($$0)) {
         if (this.u) {
            this.b(Character.toString($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void a(double $$0, double $$1) {
      int $$2 = azk.a($$0) - this.F();
      if (this.r) {
         $$2 -= 4;
      }

      String $$3 = this.o.a(this.p.substring(this.v), this.h());
      this.b(this.o.a($$3, $$2).length() + this.v, fwf.t());
   }

   @Override
   public void a(hlv $$0) {
   }

   @Override
   public void b(fpz $$0, int $$1, int $$2, float $$3) {
      if (this.i()) {
         if (this.g()) {
            ald $$4 = d.a(this.E(), this.aI_());
            $$0.a(goi::H, $$4, this.F(), this.G(), this.A(), this.y());
         }

         int $$5 = this.u ? this.y : this.z;
         int $$6 = this.w - this.v;
         String $$7 = this.o.a(this.p.substring(this.v), this.h());
         boolean $$8 = $$6 >= 0 && $$6 <= $$7.length();
         boolean $$9 = this.aI_() && (af.c() - this.F) / 300L % 2L == 0L && $$8;
         int $$10 = this.r ? this.F() + 4 : this.F();
         int $$11 = this.r ? this.G() + (this.h - 8) / 2 : this.G();
         int $$12 = $$10;
         int $$13 = azk.a(this.x - this.v, 0, $$7.length());
         if (!$$7.isEmpty()) {
            String $$14 = $$8 ? $$7.substring(0, $$6) : $$7;
            $$12 = $$0.b(this.o, this.D.apply($$14, this.v), $$10, $$11, $$5);
         }

         boolean $$15 = this.w < this.p.length() || this.p.length() >= this.k();
         int $$16 = $$12;
         if (!$$8) {
            $$16 = $$6 > 0 ? $$10 + this.g : $$10;
         } else if ($$15) {
            $$16 = $$12 - 1;
            $$12--;
         }

         if (!$$7.isEmpty() && $$8 && $$6 < $$7.length()) {
            $$0.b(this.o, this.D.apply($$7.substring($$6), this.w), $$12, $$11, $$5);
         }

         if (this.E != null && $$7.isEmpty() && !this.aI_()) {
            $$0.b(this.o, this.E, $$12, $$11, $$5);
         }

         if (!$$15 && this.A != null) {
            $$0.b(this.o, this.A, $$16 - 1, $$11, -8355712);
         }

         if ($$9) {
            if ($$15) {
               $$0.a(goi.L(), $$16, $$11 - 1, $$16 + 1, $$11 + 1 + 9, -3092272);
            } else {
               $$0.b(this.o, "_", $$16, $$11, $$5);
            }
         }

         if ($$13 != $$6) {
            int $$17 = $$10 + this.o.b($$7.substring(0, $$13));
            this.a($$0, $$16, $$11 - 1, $$17 - 1, $$11 + 1 + 9);
         }
      }
   }

   private void a(fpz $$0, int $$1, int $$2, int $$3, int $$4) {
      if ($$1 < $$3) {
         int $$5 = $$1;
         $$1 = $$3;
         $$3 = $$5;
      }

      if ($$2 < $$4) {
         int $$6 = $$2;
         $$2 = $$4;
         $$4 = $$6;
      }

      if ($$3 > this.F() + this.g) {
         $$3 = this.F() + this.g;
      }

      if ($$1 > this.F() + this.g) {
         $$1 = this.F() + this.g;
      }

      $$0.a(goi.N(), $$1, $$2, $$3, $$4, -16776961);
   }

   public void f(int $$0) {
      this.q = $$0;
      if (this.p.length() > $$0) {
         this.p = this.p.substring(0, $$0);
         this.d(this.p);
      }
   }

   private int k() {
      return this.q;
   }

   public int e() {
      return this.w;
   }

   public boolean g() {
      return this.r;
   }

   public void d(boolean $$0) {
      this.r = $$0;
   }

   public void m(int $$0) {
      this.y = $$0;
   }

   public void n(int $$0) {
      this.z = $$0;
   }

   @Override
   public void a(boolean $$0) {
      if (this.s || $$0) {
         super.a($$0);
         if ($$0) {
            this.F = af.c();
         }
      }
   }

   private boolean l() {
      return this.u;
   }

   public void e(boolean $$0) {
      this.u = $$0;
   }

   public int h() {
      return this.g() ? this.g - 8 : this.g;
   }

   public void o(int $$0) {
      this.x = azk.a($$0, 0, this.p.length());
      this.s(this.x);
   }

   private void s(int $$0) {
      if (this.o != null) {
         this.v = Math.min(this.v, this.p.length());
         int $$1 = this.h();
         String $$2 = this.o.a(this.p.substring(this.v), $$1);
         int $$3 = $$2.length() + this.v;
         if ($$0 == this.v) {
            this.v = this.v - this.o.a(this.p, $$1, true).length();
         }

         if ($$0 > $$3) {
            this.v += $$0 - $$3;
         } else if ($$0 <= this.v) {
            this.v = this.v - (this.v - $$0);
         }

         this.v = azk.a(this.v, 0, this.p.length());
      }
   }

   public void f(boolean $$0) {
      this.s = $$0;
   }

   public boolean i() {
      return this.k;
   }

   public void g(boolean $$0) {
      this.k = $$0;
   }

   public void c(@Nullable String $$0) {
      this.A = $$0;
   }

   public int p(int $$0) {
      return $$0 > this.p.length() ? this.F() : this.F() + this.o.b(this.p.substring(0, $$0));
   }

   @Override
   public void a(fuk $$0) {
      $$0.a(fuj.a, this.d());
   }

   public void c(wv $$0) {
      this.E = $$0;
   }
}
