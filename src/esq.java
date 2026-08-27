import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class esq extends esf implements eti {
   private static final ets e = new ets(new aer("widget/text_field"), new aer("widget/text_field_highlighted"));
   public static final int a = -1;
   public static final int b = 1;
   public static final int c = 4;
   private static final int l = 1;
   private static final int m = -3092272;
   private static final String n = "_";
   public static final int d = 14737632;
   private static final int o = 300;
   private final eru p;
   private String q = "";
   private int s = 32;
   private boolean t = true;
   private boolean u = true;
   private boolean v = true;
   private int w;
   private int x;
   private int y;
   private int z = 14737632;
   private int A = 7368816;
   @Nullable
   private String B;
   @Nullable
   private Consumer<String> C;
   private Predicate<String> D = Objects::nonNull;
   private BiFunction<String, Integer, arc> E = ($$0x, $$1x) -> arc.forward($$0x, ub.a);
   @Nullable
   private tf F;
   private long G = ac.b();

   public esq(eru $$0, int $$1, int $$2, tf $$3) {
      this($$0, 0, 0, $$1, $$2, $$3);
   }

   public esq(eru $$0, int $$1, int $$2, int $$3, int $$4, tf $$5) {
      this($$0, $$1, $$2, $$3, $$4, null, $$5);
   }

   public esq(eru $$0, int $$1, int $$2, int $$3, int $$4, @Nullable esq $$5, tf $$6) {
      super($$1, $$2, $$3, $$4, $$6);
      this.p = $$0;
      if ($$5 != null) {
         this.a($$5.a());
      }
   }

   public void b(Consumer<String> $$0) {
      this.C = $$0;
   }

   public void a(BiFunction<String, Integer, arc> $$0) {
      this.E = $$0;
   }

   @Override
   protected ts aB_() {
      tf $$0 = this.l();
      return tf.a("gui.narrate.editBox", $$0, this.q);
   }

   public void a(String $$0) {
      if (this.D.test($$0)) {
         if ($$0.length() > this.s) {
            this.q = $$0.substring(0, this.s);
         } else {
            this.q = $$0;
         }

         this.c(false);
         this.n(this.x);
         this.d($$0);
      }
   }

   public String a() {
      return this.q;
   }

   public String b() {
      int $$0 = Math.min(this.x, this.y);
      int $$1 = Math.max(this.x, this.y);
      return this.q.substring($$0, $$1);
   }

   public void a(Predicate<String> $$0) {
      this.D = $$0;
   }

   public void b(String $$0) {
      int $$1 = Math.min(this.x, this.y);
      int $$2 = Math.max(this.x, this.y);
      int $$3 = this.s - this.q.length() - ($$1 - $$2);
      String $$4 = aa.a($$0);
      int $$5 = $$4.length();
      if ($$3 < $$5) {
         $$4 = $$4.substring(0, $$3);
         $$5 = $$3;
      }

      String $$6 = new StringBuilder(this.q).replace($$1, $$2, $$4).toString();
      if (this.D.test($$6)) {
         this.q = $$6;
         this.j($$1 + $$5);
         this.n(this.x);
         this.d(this.q);
      }
   }

   private void d(String $$0) {
      if (this.C != null) {
         this.C.accept($$0);
      }
   }

   private void p(int $$0) {
      if (exz.p()) {
         this.a($$0);
      } else {
         this.h($$0);
      }
   }

   public void a(int $$0) {
      if (!this.q.isEmpty()) {
         if (this.y != this.x) {
            this.b("");
         } else {
            this.h(this.i($$0) - this.x);
         }
      }
   }

   public void h(int $$0) {
      if (!this.q.isEmpty()) {
         if (this.y != this.x) {
            this.b("");
         } else {
            int $$1 = this.q($$0);
            int $$2 = Math.min($$1, this.x);
            int $$3 = Math.max($$1, this.x);
            if ($$2 != $$3) {
               String $$4 = new StringBuilder(this.q).delete($$2, $$3).toString();
               if (this.D.test($$4)) {
                  this.q = $$4;
                  this.b($$2, false);
               }
            }
         }
      }
   }

   public int i(int $$0) {
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
            int $$7 = this.q.length();
            $$3 = this.q.indexOf(32, $$3);
            if ($$3 == -1) {
               $$3 = $$7;
            } else {
               while ($$2 && $$3 < $$7 && this.q.charAt($$3) == ' ') {
                  $$3++;
               }
            }
         } else {
            while ($$2 && $$3 > 0 && this.q.charAt($$3 - 1) == ' ') {
               $$3--;
            }

            while ($$3 > 0 && this.q.charAt($$3 - 1) != ' ') {
               $$3--;
            }
         }
      }

      return $$3;
   }

   public void a(int $$0, boolean $$1) {
      this.b(this.q($$0), $$1);
   }

   private int q(int $$0) {
      return ac.a(this.q, this.x, $$0);
   }

   public void b(int $$0, boolean $$1) {
      this.j($$0);
      if (!$$1) {
         this.n(this.x);
      }

      this.d(this.q);
   }

   public void j(int $$0) {
      this.x = arp.a($$0, 0, this.q.length());
      this.r(this.x);
   }

   public void b(boolean $$0) {
      this.b(0, $$0);
   }

   public void c(boolean $$0) {
      this.b(this.q.length(), $$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.e()) {
         return false;
      } else if (exz.g($$0)) {
         this.c(false);
         this.n(0);
         return true;
      } else if (exz.f($$0)) {
         eqm.O().o.a(this.b());
         return true;
      } else if (exz.e($$0)) {
         if (this.v) {
            this.b(eqm.O().o.a());
         }

         return true;
      } else if (exz.d($$0)) {
         eqm.O().o.a(this.b());
         if (this.v) {
            this.b("");
         }

         return true;
      } else {
         switch ($$0) {
            case 259:
               if (this.v) {
                  this.p(-1);
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
               if (this.v) {
                  this.p(1);
               }

               return true;
            case 262:
               if (exz.p()) {
                  this.b(this.i(1), exz.q());
               } else {
                  this.a(1, exz.q());
               }

               return true;
            case 263:
               if (exz.p()) {
                  this.b(this.i(-1), exz.q());
               } else {
                  this.a(-1, exz.q());
               }

               return true;
            case 268:
               this.b(exz.q());
               return true;
            case 269:
               this.c(exz.q());
               return true;
         }
      }
   }

   public boolean e() {
      return this.v() && this.ax_() && this.x();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (!this.e()) {
         return false;
      } else if (aa.a($$0)) {
         if (this.v) {
            this.b(Character.toString($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void a(double $$0, double $$1) {
      int $$2 = arp.a($$0) - this.p();
      if (this.t) {
         $$2 -= 4;
      }

      String $$3 = this.p.a(this.q.substring(this.w), this.u());
      this.b(this.p.a($$3, $$2).length() + this.w, exz.q());
   }

   @Override
   public void a(gcx $$0) {
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      if (this.v()) {
         if (this.g()) {
            aer $$4 = e.a(this.az_(), this.ax_());
            $$0.a($$4, this.p(), this.r(), this.k(), this.h());
         }

         int $$5 = this.v ? this.z : this.A;
         int $$6 = this.x - this.w;
         String $$7 = this.p.a(this.q.substring(this.w), this.u());
         boolean $$8 = $$6 >= 0 && $$6 <= $$7.length();
         boolean $$9 = this.ax_() && (ac.b() - this.G) / 300L % 2L == 0L && $$8;
         int $$10 = this.t ? this.p() + 4 : this.p();
         int $$11 = this.t ? this.r() + (this.g - 8) / 2 : this.r();
         int $$12 = $$10;
         int $$13 = arp.a(this.y - this.w, 0, $$7.length());
         if (!$$7.isEmpty()) {
            String $$14 = $$8 ? $$7.substring(0, $$6) : $$7;
            $$12 = $$0.b(this.p, this.E.apply($$14, this.w), $$10, $$11, $$5);
         }

         boolean $$15 = this.x < this.q.length() || this.q.length() >= this.w();
         int $$16 = $$12;
         if (!$$8) {
            $$16 = $$6 > 0 ? $$10 + this.f : $$10;
         } else if ($$15) {
            $$16 = $$12 - 1;
            $$12--;
         }

         if (!$$7.isEmpty() && $$8 && $$6 < $$7.length()) {
            $$0.b(this.p, this.E.apply($$7.substring($$6), this.x), $$12, $$11, $$5);
         }

         if (this.F != null && $$7.isEmpty() && !this.ax_()) {
            $$0.b(this.p, this.F, $$12, $$11, $$5);
         }

         if (!$$15 && this.B != null) {
            $$0.b(this.p, this.B, $$16 - 1, $$11, -8355712);
         }

         if ($$9) {
            if ($$15) {
               $$0.a(fnt.D(), $$16, $$11 - 1, $$16 + 1, $$11 + 1 + 9, -3092272);
            } else {
               $$0.b(this.p, "_", $$16, $$11, $$5);
            }
         }

         if ($$13 != $$6) {
            int $$17 = $$10 + this.p.b($$7.substring(0, $$13));
            this.a($$0, $$16, $$11 - 1, $$17 - 1, $$11 + 1 + 9);
         }
      }
   }

   private void a(erw $$0, int $$1, int $$2, int $$3, int $$4) {
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

      $$0.a(fnt.E(), $$1, $$2, $$3, $$4, -16776961);
   }

   public void k(int $$0) {
      this.s = $$0;
      if (this.q.length() > $$0) {
         this.q = this.q.substring(0, $$0);
         this.d(this.q);
      }
   }

   private int w() {
      return this.s;
   }

   public int f() {
      return this.x;
   }

   public boolean g() {
      return this.t;
   }

   public void d(boolean $$0) {
      this.t = $$0;
   }

   public void l(int $$0) {
      this.z = $$0;
   }

   public void m(int $$0) {
      this.A = $$0;
   }

   @Nullable
   @Override
   public ert a(ewd $$0) {
      return this.j && this.v ? super.a($$0) : null;
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return this.j && $$0 >= (double)this.p() && $$0 < (double)(this.p() + this.f) && $$1 >= (double)this.r() && $$1 < (double)(this.r() + this.g);
   }

   @Override
   public void c_(boolean $$0) {
      if (this.u || $$0) {
         super.c_($$0);
         if ($$0) {
            this.G = ac.b();
         }
      }
   }

   private boolean x() {
      return this.v;
   }

   public void e(boolean $$0) {
      this.v = $$0;
   }

   public int u() {
      return this.g() ? this.f - 8 : this.f;
   }

   public void n(int $$0) {
      this.y = arp.a($$0, 0, this.q.length());
      this.r(this.y);
   }

   private void r(int $$0) {
      if (this.p != null) {
         this.w = Math.min(this.w, this.q.length());
         int $$1 = this.u();
         String $$2 = this.p.a(this.q.substring(this.w), $$1);
         int $$3 = $$2.length() + this.w;
         if ($$0 == this.w) {
            this.w = this.w - this.p.a(this.q, $$1, true).length();
         }

         if ($$0 > $$3) {
            this.w += $$0 - $$3;
         } else if ($$0 <= this.w) {
            this.w = this.w - (this.w - $$0);
         }

         this.w = arp.a(this.w, 0, this.q.length());
      }
   }

   public void f(boolean $$0) {
      this.u = $$0;
   }

   public boolean v() {
      return this.j;
   }

   public void g(boolean $$0) {
      this.j = $$0;
   }

   public void c(@Nullable String $$0) {
      this.B = $$0;
   }

   public int o(int $$0) {
      return $$0 > this.q.length() ? this.p() : this.p() + this.p.b(this.q.substring(0, $$0));
   }

   @Override
   public void a(evx $$0) {
      $$0.a(evw.a, this.aB_());
   }

   public void c(tf $$0) {
      this.F = $$0;
   }
}
