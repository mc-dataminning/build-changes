import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class epr extends epf implements eqh {
   public static final int a = -1;
   public static final int b = 1;
   private static final int d = 1;
   private static final int e = -3092272;
   private static final String f = "_";
   public static final int c = 14737632;
   private static final int g = -1;
   private static final int h = -6250336;
   private static final int i = -16777216;
   private final eov j;
   private String k = "";
   private int l = 32;
   private int u;
   private boolean v = true;
   private boolean w = true;
   private boolean x = true;
   private boolean y;
   private int z;
   private int A;
   private int C;
   private int D = 14737632;
   private int E = 7368816;
   @Nullable
   private String F;
   @Nullable
   private Consumer<String> G;
   private Predicate<String> H = Objects::nonNull;
   private BiFunction<String, Integer, aom> I = ($$0x, $$1x) -> aom.forward($$0x, ts.a);
   @Nullable
   private sw J;

   public epr(eov $$0, int $$1, int $$2, int $$3, int $$4, sw $$5) {
      this($$0, $$1, $$2, $$3, $$4, null, $$5);
   }

   public epr(eov $$0, int $$1, int $$2, int $$3, int $$4, @Nullable epr $$5, sw $$6) {
      super($$1, $$2, $$3, $$4, $$6);
      this.j = $$0;
      if ($$5 != null) {
         this.a($$5.b());
      }
   }

   public void b(Consumer<String> $$0) {
      this.G = $$0;
   }

   public void a(BiFunction<String, Integer, aom> $$0) {
      this.I = $$0;
   }

   @Override
   public void a() {
      this.u++;
   }

   @Override
   protected tj aE_() {
      sw $$0 = this.l();
      return sw.a("gui.narrate.editBox", $$0, this.k);
   }

   public void a(String $$0) {
      if (this.H.test($$0)) {
         if ($$0.length() > this.l) {
            this.k = $$0.substring(0, this.l);
         } else {
            this.k = $$0;
         }

         this.g();
         this.p(this.A);
         this.d($$0);
      }
   }

   public String b() {
      return this.k;
   }

   public String e() {
      int $$0 = Math.min(this.A, this.C);
      int $$1 = Math.max(this.A, this.C);
      return this.k.substring($$0, $$1);
   }

   public void a(Predicate<String> $$0) {
      this.H = $$0;
   }

   public void b(String $$0) {
      int $$1 = Math.min(this.A, this.C);
      int $$2 = Math.max(this.A, this.C);
      int $$3 = this.l - this.k.length() - ($$1 - $$2);
      String $$4 = aa.a($$0);
      int $$5 = $$4.length();
      if ($$3 < $$5) {
         $$4 = $$4.substring(0, $$3);
         $$5 = $$3;
      }

      String $$6 = new StringBuilder(this.k).replace($$1, $$2, $$4).toString();
      if (this.H.test($$6)) {
         this.k = $$6;
         this.l($$1 + $$5);
         this.p(this.A);
         this.d(this.k);
      }
   }

   private void d(String $$0) {
      if (this.G != null) {
         this.G.accept($$0);
      }
   }

   private void r(int $$0) {
      if (euq.p()) {
         this.a($$0);
      } else {
         this.h($$0);
      }
   }

   public void a(int $$0) {
      if (!this.k.isEmpty()) {
         if (this.C != this.A) {
            this.b("");
         } else {
            this.h(this.i($$0) - this.A);
         }
      }
   }

   public void h(int $$0) {
      if (!this.k.isEmpty()) {
         if (this.C != this.A) {
            this.b("");
         } else {
            int $$1 = this.s($$0);
            int $$2 = Math.min($$1, this.A);
            int $$3 = Math.max($$1, this.A);
            if ($$2 != $$3) {
               String $$4 = new StringBuilder(this.k).delete($$2, $$3).toString();
               if (this.H.test($$4)) {
                  this.k = $$4;
                  this.k($$2);
               }
            }
         }
      }
   }

   public int i(int $$0) {
      return this.a($$0, this.v());
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
            int $$7 = this.k.length();
            $$3 = this.k.indexOf(32, $$3);
            if ($$3 == -1) {
               $$3 = $$7;
            } else {
               while ($$2 && $$3 < $$7 && this.k.charAt($$3) == ' ') {
                  $$3++;
               }
            }
         } else {
            while ($$2 && $$3 > 0 && this.k.charAt($$3 - 1) == ' ') {
               $$3--;
            }

            while ($$3 > 0 && this.k.charAt($$3 - 1) != ' ') {
               $$3--;
            }
         }
      }

      return $$3;
   }

   public void j(int $$0) {
      this.k(this.s($$0));
   }

   private int s(int $$0) {
      return ac.a(this.k, this.A, $$0);
   }

   public void k(int $$0) {
      this.l($$0);
      if (!this.y) {
         this.p(this.A);
      }

      this.d(this.k);
   }

   public void l(int $$0) {
      this.A = apa.a($$0, 0, this.k.length());
   }

   public void f() {
      this.k(0);
   }

   public void g() {
      this.k(this.k.length());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.u()) {
         return false;
      } else {
         this.y = euq.q();
         if (euq.g($$0)) {
            this.g();
            this.p(0);
            return true;
         } else if (euq.f($$0)) {
            enn.N().o.a(this.e());
            return true;
         } else if (euq.e($$0)) {
            if (this.x) {
               this.b(enn.N().o.a());
            }

            return true;
         } else if (euq.d($$0)) {
            enn.N().o.a(this.e());
            if (this.x) {
               this.b("");
            }

            return true;
         } else {
            switch ($$0) {
               case 259:
                  if (this.x) {
                     this.y = false;
                     this.r(-1);
                     this.y = euq.q();
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
                     this.y = false;
                     this.r(1);
                     this.y = euq.q();
                  }

                  return true;
               case 262:
                  if (euq.p()) {
                     this.k(this.i(1));
                  } else {
                     this.j(1);
                  }

                  return true;
               case 263:
                  if (euq.p()) {
                     this.k(this.i(-1));
                  } else {
                     this.j(-1);
                  }

                  return true;
               case 268:
                  this.f();
                  return true;
               case 269:
                  this.g();
                  return true;
            }
         }
      }
   }

   public boolean u() {
      return this.x() && this.aB_() && this.A();
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (!this.u()) {
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
      int $$2 = apa.a($$0) - this.p();
      if (this.v) {
         $$2 -= 4;
      }

      String $$3 = this.j.a(this.k.substring(this.z), this.w());
      this.k(this.j.a($$3, $$2).length() + this.z);
   }

   @Override
   public void a(fzc $$0) {
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      if (this.x()) {
         if (this.z()) {
            int $$4 = this.aB_() ? -1 : -6250336;
            $$0.a(this.p() - 1, this.r() - 1, this.p() + this.o + 1, this.r() + this.p + 1, $$4);
            $$0.a(this.p(), this.r(), this.p() + this.o, this.r() + this.p, -16777216);
         }

         int $$5 = this.x ? this.D : this.E;
         int $$6 = this.A - this.z;
         int $$7 = this.C - this.z;
         String $$8 = this.j.a(this.k.substring(this.z), this.w());
         boolean $$9 = $$6 >= 0 && $$6 <= $$8.length();
         boolean $$10 = this.aB_() && this.u / 6 % 2 == 0 && $$9;
         int $$11 = this.v ? this.p() + 4 : this.p();
         int $$12 = this.v ? this.r() + (this.p - 8) / 2 : this.r();
         int $$13 = $$11;
         if ($$7 > $$8.length()) {
            $$7 = $$8.length();
         }

         if (!$$8.isEmpty()) {
            String $$14 = $$9 ? $$8.substring(0, $$6) : $$8;
            $$13 = $$0.b(this.j, this.I.apply($$14, this.z), $$11, $$12, $$5);
         }

         boolean $$15 = this.A < this.k.length() || this.k.length() >= this.y();
         int $$16 = $$13;
         if (!$$9) {
            $$16 = $$6 > 0 ? $$11 + this.o : $$11;
         } else if ($$15) {
            $$16 = $$13 - 1;
            $$13--;
         }

         if (!$$8.isEmpty() && $$9 && $$6 < $$8.length()) {
            $$0.b(this.j, this.I.apply($$8.substring($$6), this.A), $$13, $$12, $$5);
         }

         if (this.J != null && $$8.isEmpty() && !this.aB_()) {
            $$0.b(this.j, this.J, $$13, $$12, $$5);
         }

         if (!$$15 && this.F != null) {
            $$0.b(this.j, this.F, $$16 - 1, $$12, -8355712);
         }

         if ($$10) {
            if ($$15) {
               $$0.a(fkf.D(), $$16, $$12 - 1, $$16 + 1, $$12 + 1 + 9, -3092272);
            } else {
               $$0.b(this.j, "_", $$16, $$12, $$5);
            }
         }

         if ($$7 != $$6) {
            int $$17 = $$11 + this.j.b($$8.substring(0, $$7));
            this.a($$0, $$16, $$12 - 1, $$17 - 1, $$12 + 1 + 9);
         }
      }
   }

   private void a(eox $$0, int $$1, int $$2, int $$3, int $$4) {
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

      if ($$3 > this.p() + this.o) {
         $$3 = this.p() + this.o;
      }

      if ($$1 > this.p() + this.o) {
         $$1 = this.p() + this.o;
      }

      $$0.a(fkf.E(), $$1, $$2, $$3, $$4, -16776961);
   }

   public void m(int $$0) {
      this.l = $$0;
      if (this.k.length() > $$0) {
         this.k = this.k.substring(0, $$0);
         this.d(this.k);
      }
   }

   private int y() {
      return this.l;
   }

   public int v() {
      return this.A;
   }

   private boolean z() {
      return this.v;
   }

   public void b(boolean $$0) {
      this.v = $$0;
   }

   public void n(int $$0) {
      this.D = $$0;
   }

   public void o(int $$0) {
      this.E = $$0;
   }

   @Nullable
   @Override
   public eou a(esv $$0) {
      return this.s && this.x ? super.a($$0) : null;
   }

   @Override
   public boolean a_(double $$0, double $$1) {
      return this.s && $$0 >= (double)this.p() && $$0 < (double)(this.p() + this.o) && $$1 >= (double)this.r() && $$1 < (double)(this.r() + this.p);
   }

   @Override
   public void b_(boolean $$0) {
      if (this.w || $$0) {
         super.b_($$0);
         if ($$0) {
            this.u = 0;
         }
      }
   }

   private boolean A() {
      return this.x;
   }

   public void c(boolean $$0) {
      this.x = $$0;
   }

   public int w() {
      return this.z() ? this.o - 8 : this.o;
   }

   public void p(int $$0) {
      int $$1 = this.k.length();
      this.C = apa.a($$0, 0, $$1);
      if (this.j != null) {
         if (this.z > $$1) {
            this.z = $$1;
         }

         int $$2 = this.w();
         String $$3 = this.j.a(this.k.substring(this.z), $$2);
         int $$4 = $$3.length() + this.z;
         if (this.C == this.z) {
            this.z = this.z - this.j.a(this.k, $$2, true).length();
         }

         if (this.C > $$4) {
            this.z = this.z + (this.C - $$4);
         } else if (this.C <= this.z) {
            this.z = this.z - (this.z - this.C);
         }

         this.z = apa.a(this.z, 0, $$1);
      }
   }

   public void d(boolean $$0) {
      this.w = $$0;
   }

   public boolean x() {
      return this.s;
   }

   public void e(boolean $$0) {
      this.s = $$0;
   }

   public void c(@Nullable String $$0) {
      this.F = $$0;
   }

   public int q(int $$0) {
      return $$0 > this.k.length() ? this.p() : this.p() + this.j.b(this.k.substring(0, $$0));
   }

   @Override
   public void a(esp $$0) {
      $$0.a(eso.a, this.aE_());
   }

   public void c(sw $$0) {
      this.J = $$0;
   }
}
