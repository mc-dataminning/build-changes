import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ets extends eth implements eum {
   private static final euw d = new euw(new afw("widget/text_field"), new afw("widget/text_field_highlighted"));
   public static final int a = -1;
   public static final int b = 1;
   private static final int e = 1;
   private static final int l = -3092272;
   private static final String m = "_";
   public static final int c = 14737632;
   private static final int n = 300;
   private final esw o;
   private String p = "";
   private int q = 32;
   private boolean s = true;
   private boolean t = true;
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
   private BiFunction<String, Integer, ask> D = ($$0x, $$1x) -> ask.forward($$0x, vf.a);
   @Nullable
   private ui E;
   private long F = ac.b();

   public ets(esw $$0, int $$1, int $$2, ui $$3) {
      this($$0, 0, 0, $$1, $$2, $$3);
   }

   public ets(esw $$0, int $$1, int $$2, int $$3, int $$4, ui $$5) {
      this($$0, $$1, $$2, $$3, $$4, null, $$5);
   }

   public ets(esw $$0, int $$1, int $$2, int $$3, int $$4, @Nullable ets $$5, ui $$6) {
      super($$1, $$2, $$3, $$4, $$6);
      this.o = $$0;
      if ($$5 != null) {
         this.a($$5.a());
      }
   }

   public void b(Consumer<String> $$0) {
      this.B = $$0;
   }

   public void a(BiFunction<String, Integer, ask> $$0) {
      this.D = $$0;
   }

   @Override
   protected uw aI_() {
      ui $$0 = this.l();
      return ui.a("gui.narrate.editBox", $$0, this.p);
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
      String $$4 = aa.a($$0);
      int $$5 = $$4.length();
      if ($$3 < $$5) {
         $$4 = $$4.substring(0, $$3);
         $$5 = $$3;
      }

      String $$6 = new StringBuilder(this.p).replace($$1, $$2, $$4).toString();
      if (this.C.test($$6)) {
         this.p = $$6;
         this.k($$1 + $$5);
         this.o(this.w);
         this.d(this.p);
      }
   }

   private void d(String $$0) {
      if (this.B != null) {
         this.B.accept($$0);
      }
   }

   private void q(int $$0) {
      if (ezd.p()) {
         this.a($$0);
      } else {
         this.i($$0);
      }
   }

   public void a(int $$0) {
      if (!this.p.isEmpty()) {
         if (this.x != this.w) {
            this.b("");
         } else {
            this.i(this.j($$0) - this.w);
         }
      }
   }

   public void i(int $$0) {
      if (!this.p.isEmpty()) {
         if (this.x != this.w) {
            this.b("");
         } else {
            int $$1 = this.r($$0);
            int $$2 = Math.min($$1, this.w);
            int $$3 = Math.max($$1, this.w);
            if ($$2 != $$3) {
               String $$4 = new StringBuilder(this.p).delete($$2, $$3).toString();
               if (this.C.test($$4)) {
                  this.p = $$4;
                  this.b($$2, false);
               }
            }
         }
      }
   }

   public int j(int $$0) {
      return this.a($$0, this.f());
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
      return ac.a(this.p, this.w, $$0);
   }

   public void b(int $$0, boolean $$1) {
      this.k($$0);
      if (!$$1) {
         this.o(this.w);
      }

      this.d(this.p);
   }

   public void k(int $$0) {
      this.w = asy.a($$0, 0, this.p.length());
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
      if (!this.e()) {
         return false;
      } else if (ezd.g($$0)) {
         this.c(false);
         this.o(0);
         return true;
      } else if (ezd.f($$0)) {
         ero.O().o.a(this.b());
         return true;
      } else if (ezd.e($$0)) {
         if (this.u) {
            this.b(ero.O().o.a());
         }

         return true;
      } else if (ezd.d($$0)) {
         ero.O().o.a(this.b());
         if (this.u) {
            this.b("");
         }

         return true;
      } else {
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
               return false;
            case 261:
               if (this.u) {
                  this.q(1);
               }

               return true;
            case 262:
               if (ezd.p()) {
                  this.b(this.j(1), ezd.q());
               } else {
                  this.a(1, ezd.q());
               }

               return true;
            case 263:
               if (ezd.p()) {
                  this.b(this.j(-1), ezd.q());
               } else {
                  this.a(-1, ezd.q());
               }

               return true;
            case 268:
               this.b(ezd.q());
               return true;
            case 269:
               this.c(ezd.q());
               return true;
         }
      }
   }

   public boolean e() {
      return this.u() && this.aG_() && this.w();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (!this.e()) {
         return false;
      } else if (aa.a($$0)) {
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
      int $$2 = asy.a($$0) - this.p();
      if (this.s) {
         $$2 -= 4;
      }

      String $$3 = this.o.a(this.p.substring(this.v), this.h());
      this.b(this.o.a($$3, $$2).length() + this.v, ezd.q());
   }

   @Override
   public void a(gem $$0) {
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      if (this.u()) {
         if (this.g()) {
            afw $$4 = d.a(this.aJ_(), this.aG_());
            $$0.a($$4, this.p(), this.r(), this.k(), this.i());
         }

         int $$5 = this.u ? this.y : this.z;
         int $$6 = this.w - this.v;
         String $$7 = this.o.a(this.p.substring(this.v), this.h());
         boolean $$8 = $$6 >= 0 && $$6 <= $$7.length();
         boolean $$9 = this.aG_() && (ac.b() - this.F) / 300L % 2L == 0L && $$8;
         int $$10 = this.s ? this.p() + 4 : this.p();
         int $$11 = this.s ? this.r() + (this.g - 8) / 2 : this.r();
         int $$12 = $$10;
         int $$13 = asy.a(this.x - this.v, 0, $$7.length());
         if (!$$7.isEmpty()) {
            String $$14 = $$8 ? $$7.substring(0, $$6) : $$7;
            $$12 = $$0.b(this.o, this.D.apply($$14, this.v), $$10, $$11, $$5);
         }

         boolean $$15 = this.w < this.p.length() || this.p.length() >= this.v();
         int $$16 = $$12;
         if (!$$8) {
            $$16 = $$6 > 0 ? $$10 + this.f : $$10;
         } else if ($$15) {
            $$16 = $$12 - 1;
            $$12--;
         }

         if (!$$7.isEmpty() && $$8 && $$6 < $$7.length()) {
            $$0.b(this.o, this.D.apply($$7.substring($$6), this.w), $$12, $$11, $$5);
         }

         if (this.E != null && $$7.isEmpty() && !this.aG_()) {
            $$0.b(this.o, this.E, $$12, $$11, $$5);
         }

         if (!$$15 && this.A != null) {
            $$0.b(this.o, this.A, $$16 - 1, $$11, -8355712);
         }

         if ($$9) {
            if ($$15) {
               $$0.a(fpj.D(), $$16, $$11 - 1, $$16 + 1, $$11 + 1 + 9, -3092272);
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

   private void a(esy $$0, int $$1, int $$2, int $$3, int $$4) {
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

      if ($$3 > this.p() + this.f) {
         $$3 = this.p() + this.f;
      }

      if ($$1 > this.p() + this.f) {
         $$1 = this.p() + this.f;
      }

      $$0.a(fpj.E(), $$1, $$2, $$3, $$4, -16776961);
   }

   public void l(int $$0) {
      this.q = $$0;
      if (this.p.length() > $$0) {
         this.p = this.p.substring(0, $$0);
         this.d(this.p);
      }
   }

   private int v() {
      return this.q;
   }

   public int f() {
      return this.w;
   }

   public boolean g() {
      return this.s;
   }

   public void d(boolean $$0) {
      this.s = $$0;
   }

   public void m(int $$0) {
      this.y = $$0;
   }

   public void n(int $$0) {
      this.z = $$0;
   }

   @Nullable
   @Override
   public esv a(exi $$0) {
      return this.j && this.u ? super.a($$0) : null;
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return this.j && $$0 >= (double)this.p() && $$0 < (double)(this.p() + this.f) && $$1 >= (double)this.r() && $$1 < (double)(this.r() + this.g);
   }

   @Override
   public void b_(boolean $$0) {
      if (this.t || $$0) {
         super.b_($$0);
         if ($$0) {
            this.F = ac.b();
         }
      }
   }

   private boolean w() {
      return this.u;
   }

   public void e(boolean $$0) {
      this.u = $$0;
   }

   public int h() {
      return this.g() ? this.f - 8 : this.f;
   }

   public void o(int $$0) {
      this.x = asy.a($$0, 0, this.p.length());
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

         this.v = asy.a(this.v, 0, this.p.length());
      }
   }

   public void f(boolean $$0) {
      this.t = $$0;
   }

   public boolean u() {
      return this.j;
   }

   public void g(boolean $$0) {
      this.j = $$0;
   }

   public void c(@Nullable String $$0) {
      this.A = $$0;
   }

   public int p(int $$0) {
      return $$0 > this.p.length() ? this.p() : this.p() + this.o.b(this.p.substring(0, $$0));
   }

   @Override
   public void a(exc $$0) {
      $$0.a(exb.a, this.aI_());
   }

   public void c(ui $$0) {
      this.E = $$0;
   }
}
