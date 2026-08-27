import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class esr extends esg implements etj {
   public static final int a = -1;
   public static final int b = 1;
   public static final int c = 4;
   private static final int e = 1;
   private static final int l = -3092272;
   private static final String m = "_";
   public static final int d = 14737632;
   private static final int n = -1;
   private static final int o = -6250336;
   private static final int p = -16777216;
   private static final int q = 300;
   private final erv s;
   private String t = "";
   private int u = 32;
   private boolean v = true;
   private boolean w = true;
   private boolean x = true;
   private int y;
   private int z;
   private int A;
   private int B = 14737632;
   private int C = 7368816;
   @Nullable
   private String D;
   @Nullable
   private Consumer<String> E;
   private Predicate<String> F = Objects::nonNull;
   private BiFunction<String, Integer, ara> G = ($$0x, $$1x) -> ara.forward($$0x, ua.a);
   @Nullable
   private te H;
   private long I = ac.b();

   public esr(erv $$0, int $$1, int $$2, te $$3) {
      this($$0, 0, 0, $$1, $$2, $$3);
   }

   public esr(erv $$0, int $$1, int $$2, int $$3, int $$4, te $$5) {
      this($$0, $$1, $$2, $$3, $$4, null, $$5);
   }

   public esr(erv $$0, int $$1, int $$2, int $$3, int $$4, @Nullable esr $$5, te $$6) {
      super($$1, $$2, $$3, $$4, $$6);
      this.s = $$0;
      if ($$5 != null) {
         this.a($$5.a());
      }
   }

   public void b(Consumer<String> $$0) {
      this.E = $$0;
   }

   public void a(BiFunction<String, Integer, ara> $$0) {
      this.G = $$0;
   }

   @Override
   protected tr aB_() {
      te $$0 = this.l();
      return te.a("gui.narrate.editBox", $$0, this.t);
   }

   public void a(String $$0) {
      if (this.F.test($$0)) {
         if ($$0.length() > this.u) {
            this.t = $$0.substring(0, this.u);
         } else {
            this.t = $$0;
         }

         this.c(false);
         this.n(this.z);
         this.d($$0);
      }
   }

   public String a() {
      return this.t;
   }

   public String b() {
      int $$0 = Math.min(this.z, this.A);
      int $$1 = Math.max(this.z, this.A);
      return this.t.substring($$0, $$1);
   }

   public void a(Predicate<String> $$0) {
      this.F = $$0;
   }

   public void b(String $$0) {
      int $$1 = Math.min(this.z, this.A);
      int $$2 = Math.max(this.z, this.A);
      int $$3 = this.u - this.t.length() - ($$1 - $$2);
      String $$4 = aa.a($$0);
      int $$5 = $$4.length();
      if ($$3 < $$5) {
         $$4 = $$4.substring(0, $$3);
         $$5 = $$3;
      }

      String $$6 = new StringBuilder(this.t).replace($$1, $$2, $$4).toString();
      if (this.F.test($$6)) {
         this.t = $$6;
         this.j($$1 + $$5);
         this.n(this.z);
         this.d(this.t);
      }
   }

   private void d(String $$0) {
      if (this.E != null) {
         this.E.accept($$0);
      }
   }

   private void p(int $$0) {
      if (exv.p()) {
         this.a($$0);
      } else {
         this.h($$0);
      }
   }

   public void a(int $$0) {
      if (!this.t.isEmpty()) {
         if (this.A != this.z) {
            this.b("");
         } else {
            this.h(this.i($$0) - this.z);
         }
      }
   }

   public void h(int $$0) {
      if (!this.t.isEmpty()) {
         if (this.A != this.z) {
            this.b("");
         } else {
            int $$1 = this.q($$0);
            int $$2 = Math.min($$1, this.z);
            int $$3 = Math.max($$1, this.z);
            if ($$2 != $$3) {
               String $$4 = new StringBuilder(this.t).delete($$2, $$3).toString();
               if (this.F.test($$4)) {
                  this.t = $$4;
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
            int $$7 = this.t.length();
            $$3 = this.t.indexOf(32, $$3);
            if ($$3 == -1) {
               $$3 = $$7;
            } else {
               while ($$2 && $$3 < $$7 && this.t.charAt($$3) == ' ') {
                  $$3++;
               }
            }
         } else {
            while ($$2 && $$3 > 0 && this.t.charAt($$3 - 1) == ' ') {
               $$3--;
            }

            while ($$3 > 0 && this.t.charAt($$3 - 1) != ' ') {
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
      return ac.a(this.t, this.z, $$0);
   }

   public void b(int $$0, boolean $$1) {
      this.j($$0);
      if (!$$1) {
         this.n(this.z);
      }

      this.d(this.t);
   }

   public void j(int $$0) {
      this.z = aro.a($$0, 0, this.t.length());
      this.r(this.z);
   }

   public void b(boolean $$0) {
      this.b(0, $$0);
   }

   public void c(boolean $$0) {
      this.b(this.t.length(), $$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.e()) {
         return false;
      } else if (exv.g($$0)) {
         this.c(false);
         this.n(0);
         return true;
      } else if (exv.f($$0)) {
         eqn.N().o.a(this.b());
         return true;
      } else if (exv.e($$0)) {
         if (this.x) {
            this.b(eqn.N().o.a());
         }

         return true;
      } else if (exv.d($$0)) {
         eqn.N().o.a(this.b());
         if (this.x) {
            this.b("");
         }

         return true;
      } else {
         switch ($$0) {
            case 259:
               if (this.x) {
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
               if (this.x) {
                  this.p(1);
               }

               return true;
            case 262:
               if (exv.p()) {
                  this.b(this.i(1), exv.q());
               } else {
                  this.a(1, exv.q());
               }

               return true;
            case 263:
               if (exv.p()) {
                  this.b(this.i(-1), exv.q());
               } else {
                  this.a(-1, exv.q());
               }

               return true;
            case 268:
               this.b(exv.q());
               return true;
            case 269:
               this.c(exv.q());
               return true;
         }
      }
   }

   public boolean e() {
      return this.u() && this.ax_() && this.x();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (!this.e()) {
         return false;
      } else if (aa.a($$0)) {
         if (this.x) {
            this.b(Character.toString($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void a(double $$0, double $$1) {
      int $$2 = aro.a($$0) - this.p();
      if (this.v) {
         $$2 -= 4;
      }

      String $$3 = this.s.a(this.t.substring(this.y), this.g());
      this.b(this.s.a($$3, $$2).length() + this.y, exv.q());
   }

   @Override
   public void a(gcs $$0) {
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      if (this.u()) {
         if (this.w()) {
            int $$4 = this.ax_() ? -1 : -6250336;
            $$0.a(this.p() - 1, this.r() - 1, this.p() + this.f + 1, this.r() + this.g + 1, $$4);
            $$0.a(this.p(), this.r(), this.p() + this.f, this.r() + this.g, -16777216);
         }

         int $$5 = this.x ? this.B : this.C;
         int $$6 = this.z - this.y;
         String $$7 = this.s.a(this.t.substring(this.y), this.g());
         boolean $$8 = $$6 >= 0 && $$6 <= $$7.length();
         boolean $$9 = this.ax_() && (ac.b() - this.I) / 300L % 2L == 0L && $$8;
         int $$10 = this.v ? this.p() + 4 : this.p();
         int $$11 = this.v ? this.r() + (this.g - 8) / 2 : this.r();
         int $$12 = $$10;
         int $$13 = aro.a(this.A - this.y, 0, $$7.length());
         if (!$$7.isEmpty()) {
            String $$14 = $$8 ? $$7.substring(0, $$6) : $$7;
            $$12 = $$0.b(this.s, this.G.apply($$14, this.y), $$10, $$11, $$5);
         }

         boolean $$15 = this.z < this.t.length() || this.t.length() >= this.v();
         int $$16 = $$12;
         if (!$$8) {
            $$16 = $$6 > 0 ? $$10 + this.f : $$10;
         } else if ($$15) {
            $$16 = $$12 - 1;
            $$12--;
         }

         if (!$$7.isEmpty() && $$8 && $$6 < $$7.length()) {
            $$0.b(this.s, this.G.apply($$7.substring($$6), this.z), $$12, $$11, $$5);
         }

         if (this.H != null && $$7.isEmpty() && !this.ax_()) {
            $$0.b(this.s, this.H, $$12, $$11, $$5);
         }

         if (!$$15 && this.D != null) {
            $$0.b(this.s, this.D, $$16 - 1, $$11, -8355712);
         }

         if ($$9) {
            if ($$15) {
               $$0.a(fno.D(), $$16, $$11 - 1, $$16 + 1, $$11 + 1 + 9, -3092272);
            } else {
               $$0.b(this.s, "_", $$16, $$11, $$5);
            }
         }

         if ($$13 != $$6) {
            int $$17 = $$10 + this.s.b($$7.substring(0, $$13));
            this.a($$0, $$16, $$11 - 1, $$17 - 1, $$11 + 1 + 9);
         }
      }
   }

   private void a(erx $$0, int $$1, int $$2, int $$3, int $$4) {
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

      $$0.a(fno.E(), $$1, $$2, $$3, $$4, -16776961);
   }

   public void k(int $$0) {
      this.u = $$0;
      if (this.t.length() > $$0) {
         this.t = this.t.substring(0, $$0);
         this.d(this.t);
      }
   }

   private int v() {
      return this.u;
   }

   public int f() {
      return this.z;
   }

   private boolean w() {
      return this.v;
   }

   public void d(boolean $$0) {
      this.v = $$0;
   }

   public void l(int $$0) {
      this.B = $$0;
   }

   public void m(int $$0) {
      this.C = $$0;
   }

   @Nullable
   @Override
   public eru a(evz $$0) {
      return this.j && this.x ? super.a($$0) : null;
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return this.j && $$0 >= (double)this.p() && $$0 < (double)(this.p() + this.f) && $$1 >= (double)this.r() && $$1 < (double)(this.r() + this.g);
   }

   @Override
   public void c_(boolean $$0) {
      if (this.w || $$0) {
         super.c_($$0);
         if ($$0) {
            this.I = ac.b();
         }
      }
   }

   private boolean x() {
      return this.x;
   }

   public void e(boolean $$0) {
      this.x = $$0;
   }

   public int g() {
      return this.w() ? this.f - 8 : this.f;
   }

   public void n(int $$0) {
      this.A = aro.a($$0, 0, this.t.length());
      this.r(this.A);
   }

   private void r(int $$0) {
      if (this.s != null) {
         this.y = Math.min(this.y, this.t.length());
         int $$1 = this.g();
         String $$2 = this.s.a(this.t.substring(this.y), $$1);
         int $$3 = $$2.length() + this.y;
         if ($$0 == this.y) {
            this.y = this.y - this.s.a(this.t, $$1, true).length();
         }

         if ($$0 > $$3) {
            this.y += $$0 - $$3;
         } else if ($$0 <= this.y) {
            this.y = this.y - (this.y - $$0);
         }

         this.y = aro.a(this.y, 0, this.t.length());
      }
   }

   public void f(boolean $$0) {
      this.w = $$0;
   }

   public boolean u() {
      return this.j;
   }

   public void g(boolean $$0) {
      this.j = $$0;
   }

   public void c(@Nullable String $$0) {
      this.D = $$0;
   }

   public int o(int $$0) {
      return $$0 > this.t.length() ? this.p() : this.p() + this.s.b(this.t.substring(0, $$0));
   }

   @Override
   public void a(evt $$0) {
      $$0.a(evs.a, this.aB_());
   }

   public void c(te $$0) {
      this.H = $$0;
   }
}
