import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableInt;

public class foc extends fmy {
   private static final int a = 114;
   private static final int b = 128;
   private static final int c = 192;
   private static final int d = 192;
   private static final xl r = xl.c("book.editTitle");
   private static final xl s = xl.c("book.finalizeWarning");
   private static final ayg u = ayg.forward("_", yi.a.a(n.a));
   private static final ayg v = ayg.forward("_", yi.a.a(n.h));
   private final cms w;
   private final cuk x;
   private boolean y;
   private boolean z;
   private int A;
   private int B;
   private final List<String> C = Lists.newArrayList();
   private String D = "";
   private final fjt E = new fjt(this::P, this::b, this::m, this::a, $$0x -> $$0x.length() < 1024 && this.p.b($$0x, 114) <= 128);
   private final fjt F = new fjt(() -> this.D, $$0x -> this.D = $$0x, this::m, this::a, $$0x -> $$0x.length() < 16);
   private long G;
   private int H = -1;
   private fpf I;
   private fpf J;
   private fgz K;
   private fgz L;
   private fgz M;
   private fgz N;
   private final bqo O;
   @Nullable
   private foc.a P = foc.a.a;
   private xl Q = xk.a;
   private final xl R;

   public foc(cms $$0, cuk $$1, bqo $$2) {
      super(fes.a);
      this.w = $$0;
      this.x = $$1;
      this.O = $$2;
      cxs $$3 = $$1.a(km.H);
      if ($$3 != null) {
         $$3.a(ffa.Q().aS()).forEach(this.C::add);
      }

      if (this.C.isEmpty()) {
         this.C.add("");
      }

      this.R = xl.a("book.byAuthor", $$0.af()).a(n.i);
   }

   private void a(String $$0) {
      if (this.m != null) {
         fjt.a(this.m, $$0);
      }
   }

   private String m() {
      return this.m != null ? fjt.b(this.m) : "";
   }

   private int C() {
      return this.C.size();
   }

   @Override
   public void e() {
      super.e();
      this.A++;
   }

   @Override
   protected void aN_() {
      this.R();
      this.L = this.c((fgz)fgz.a(xl.c("book.signButton"), $$0x -> {
         this.z = true;
         this.F();
      }).a(this.n / 2 - 100, 196, 98, 20).a());
      this.K = this.c((fgz)fgz.a(xk.d, $$0x -> {
         this.m.a(null);
         this.c(false);
      }).a(this.n / 2 + 2, 196, 98, 20).a());
      this.M = this.c((fgz)fgz.a(xl.c("book.finalizeButton"), $$0x -> {
         if (this.z) {
            this.c(true);
            this.m.a(null);
         }
      }).a(this.n / 2 - 100, 196, 98, 20).a());
      this.N = this.c((fgz)fgz.a(xk.e, $$0x -> {
         if (this.z) {
            this.z = false;
         }

         this.F();
      }).a(this.n / 2 + 2, 196, 98, 20).a());
      int $$0 = (this.n - 192) / 2;
      int $$1 = 2;
      this.I = this.c(new fpf($$0 + 116, 159, true, $$0x -> this.E(), true));
      this.J = this.c(new fpf($$0 + 43, 159, false, $$0x -> this.D(), true));
      this.F();
   }

   private void D() {
      if (this.B > 0) {
         this.B--;
      }

      this.F();
      this.S();
   }

   private void E() {
      if (this.B < this.C() - 1) {
         this.B++;
      } else {
         this.K();
         if (this.B < this.C() - 1) {
            this.B++;
         }
      }

      this.F();
      this.S();
   }

   private void F() {
      this.J.k = !this.z && this.B > 0;
      this.I.k = !this.z;
      this.K.k = !this.z;
      this.L.k = !this.z;
      this.N.k = this.z;
      this.M.k = this.z;
      this.M.j = !azq.h(this.D);
   }

   private void I() {
      ListIterator<String> $$0 = this.C.listIterator(this.C.size());

      while ($$0.hasPrevious() && $$0.previous().isEmpty()) {
         $$0.remove();
      }
   }

   private void c(boolean $$0) {
      if (this.y) {
         this.I();
         this.J();
         int $$1 = this.O == bqo.a ? this.w.gc().k : 40;
         this.m.L().b(new ahl($$1, this.C, $$0 ? Optional.of(this.D.trim()) : Optional.empty()));
      }
   }

   private void J() {
      this.x.b(km.H, new cxs(this.C.stream().map(ars::a).toList()));
   }

   private void K() {
      if (this.C() < 100) {
         this.C.add("");
         this.y = true;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.z) {
         return this.d($$0, $$1, $$2);
      } else {
         boolean $$3 = this.b($$0, $$1, $$2);
         if ($$3) {
            this.R();
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      if (super.a($$0, $$1)) {
         return true;
      } else if (this.z) {
         boolean $$2 = this.F.a($$0);
         if ($$2) {
            this.F();
            this.y = true;
            return true;
         } else {
            return false;
         }
      } else if (azq.a($$0)) {
         this.E.a(Character.toString($$0));
         this.R();
         return true;
      } else {
         return false;
      }
   }

   private boolean b(int $$0, int $$1, int $$2) {
      if (fmy.f($$0)) {
         this.E.d();
         return true;
      } else if (fmy.e($$0)) {
         this.E.c();
         return true;
      } else if (fmy.d($$0)) {
         this.E.b();
         return true;
      } else if (fmy.c($$0)) {
         this.E.a();
         return true;
      } else {
         fjt.a $$3 = fmy.r() ? fjt.a.b : fjt.a.a;
         switch ($$0) {
            case 257:
            case 335:
               this.E.a("\n");
               return true;
            case 259:
               this.E.a(-1, $$3);
               return true;
            case 261:
               this.E.a(1, $$3);
               return true;
            case 262:
               this.E.a(1, fmy.s(), $$3);
               return true;
            case 263:
               this.E.a(-1, fmy.s(), $$3);
               return true;
            case 264:
               this.M();
               return true;
            case 265:
               this.L();
               return true;
            case 266:
               this.J.b();
               return true;
            case 267:
               this.I.b();
               return true;
            case 268:
               this.N();
               return true;
            case 269:
               this.O();
               return true;
            default:
               return false;
         }
      }
   }

   private void L() {
      this.a(-1);
   }

   private void M() {
      this.a(1);
   }

   private void a(int $$0) {
      int $$1 = this.E.g();
      int $$2 = this.Q().a($$1, $$0);
      this.E.c($$2, fmy.s());
   }

   private void N() {
      if (fmy.r()) {
         this.E.a(fmy.s());
      } else {
         int $$0 = this.E.g();
         int $$1 = this.Q().a($$0);
         this.E.c($$1, fmy.s());
      }
   }

   private void O() {
      if (fmy.r()) {
         this.E.b(fmy.s());
      } else {
         foc.a $$0 = this.Q();
         int $$1 = this.E.g();
         int $$2 = $$0.b($$1);
         this.E.c($$2, fmy.s());
      }
   }

   private boolean d(int $$0, int $$1, int $$2) {
      switch ($$0) {
         case 257:
         case 335:
            if (!this.D.isEmpty()) {
               this.c(true);
               this.m.a(null);
            }

            return true;
         case 259:
            this.F.e(-1);
            this.F();
            this.y = true;
            return true;
         default:
            return false;
      }
   }

   private String P() {
      return this.B >= 0 && this.B < this.C.size() ? this.C.get(this.B) : "";
   }

   private void b(String $$0) {
      if (this.B >= 0 && this.B < this.C.size()) {
         this.C.set(this.B, $$0);
         this.y = true;
         this.R();
      }
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(null);
      int $$4 = (this.n - 192) / 2;
      int $$5 = 2;
      if (this.z) {
         boolean $$6 = this.A / 6 % 2 == 0;
         ayg $$7 = ayg.composite(ayg.forward(this.D, yi.a), $$6 ? u : v);
         int $$8 = this.p.a(r);
         $$0.a(this.p, r, $$4 + 36 + (114 - $$8) / 2, 34, 0, false);
         int $$9 = this.p.a($$7);
         $$0.a(this.p, $$7, $$4 + 36 + (114 - $$9) / 2, 50, 0, false);
         int $$10 = this.p.a(this.R);
         $$0.a(this.p, this.R, $$4 + 36 + (114 - $$10) / 2, 60, 0, false);
         $$0.a(this.p, s, $$4 + 36, 82, 114, 0);
      } else {
         int $$11 = this.p.a(this.Q);
         $$0.a(this.p, this.Q, $$4 - $$11 + 192 - 44, 18, 0, false);
         foc.a $$12 = this.Q();

         for (foc.b $$13 : $$12.f) {
            $$0.a(this.p, $$13.c, $$13.d, $$13.e, -16777216, false);
         }

         this.a($$0, $$12.g);
         this.a($$0, $$12.c, $$12.d);
      }
   }

   @Override
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(fod.r, (this.n - 192) / 2, 2, 0, 0, 192, 192);
   }

   private void a(fgm $$0, foc.c $$1, boolean $$2) {
      if (this.A / 6 % 2 == 0) {
         $$1 = this.b($$1);
         if (!$$2) {
            $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + 9, -16777216);
         } else {
            $$0.a(this.p, "_", $$1.a, $$1.b, 0, false);
         }
      }
   }

   private void a(fgm $$0, gdo[] $$1) {
      for (gdo $$2 : $$1) {
         int $$3 = $$2.a();
         int $$4 = $$2.b();
         int $$5 = $$3 + $$2.c();
         int $$6 = $$4 + $$2.d();
         $$0.a(gdr.F(), $$3, $$4, $$5, $$6, -16776961);
      }
   }

   private foc.c a(foc.c $$0) {
      return new foc.c($$0.a - (this.n - 192) / 2 - 36, $$0.b - 32);
   }

   private foc.c b(foc.c $$0) {
      return new foc.c($$0.a + (this.n - 192) / 2 + 36, $$0.b + 32);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            long $$3 = ac.c();
            foc.a $$4 = this.Q();
            int $$5 = $$4.a(this.p, this.a(new foc.c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
               if ($$5 != this.H || $$3 - this.G >= 250L) {
                  this.E.c($$5, fmy.s());
               } else if (!this.E.i()) {
                  this.b($$5);
               } else {
                  this.E.d();
               }

               this.R();
            }

            this.H = $$5;
            this.G = $$3;
         }

         return true;
      }
   }

   private void b(int $$0) {
      String $$1 = this.P();
      this.E.a(ffl.a($$1, -1, $$0, false), ffl.a($$1, 1, $$0, false));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$2 == 0) {
            foc.a $$5 = this.Q();
            int $$6 = $$5.a(this.p, this.a(new foc.c((int)$$0, (int)$$1)));
            this.E.c($$6, true);
            this.R();
         }

         return true;
      }
   }

   private foc.a Q() {
      if (this.P == null) {
         this.P = this.T();
         this.Q = xl.a("book.pageIndicator", this.B + 1, this.C());
      }

      return this.P;
   }

   private void R() {
      this.P = null;
   }

   private void S() {
      this.E.f();
      this.R();
   }

   private foc.a T() {
      String $$0 = this.P();
      if ($$0.isEmpty()) {
         return foc.a.a;
      } else {
         int $$1 = this.E.g();
         int $$2 = this.E.h();
         IntList $$3 = new IntArrayList();
         List<foc.b> $$4 = Lists.newArrayList();
         MutableInt $$5 = new MutableInt();
         MutableBoolean $$6 = new MutableBoolean();
         ffl $$7 = this.p.b();
         $$7.a($$0, 114, yi.a, true, ($$5x, $$6x, $$7x) -> {
            int $$8x = $$5.getAndIncrement();
            String $$9x = $$0.substring($$6x, $$7x);
            $$6.setValue($$9x.endsWith("\n"));
            String $$10 = StringUtils.stripEnd($$9x, " \n");
            int $$11 = $$8x * 9;
            foc.c $$12 = this.b(new foc.c(0, $$11));
            $$3.add($$6x);
            $$4.add(new foc.b($$5x, $$10, $$12.a, $$12.b));
         });
         int[] $$8 = $$3.toIntArray();
         boolean $$9 = $$1 == $$0.length();
         foc.c $$10;
         if ($$9 && $$6.isTrue()) {
            $$10 = new foc.c(0, $$4.size() * 9);
         } else {
            int $$11 = a($$8, $$1);
            int $$12 = this.p.b($$0.substring($$8[$$11], $$1));
            $$10 = new foc.c($$12, $$11 * 9);
         }

         List<gdo> $$14 = Lists.newArrayList();
         if ($$1 != $$2) {
            int $$15 = Math.min($$1, $$2);
            int $$16 = Math.max($$1, $$2);
            int $$17 = a($$8, $$15);
            int $$18 = a($$8, $$16);
            if ($$17 == $$18) {
               int $$19 = $$17 * 9;
               int $$20 = $$8[$$17];
               $$14.add(this.a($$0, $$7, $$15, $$16, $$19, $$20));
            } else {
               int $$21 = $$17 + 1 > $$8.length ? $$0.length() : $$8[$$17 + 1];
               $$14.add(this.a($$0, $$7, $$15, $$21, $$17 * 9, $$8[$$17]));

               for (int $$22 = $$17 + 1; $$22 < $$18; $$22++) {
                  int $$23 = $$22 * 9;
                  String $$24 = $$0.substring($$8[$$22], $$8[$$22 + 1]);
                  int $$25 = (int)$$7.a($$24);
                  $$14.add(this.a(new foc.c(0, $$23), new foc.c($$25, $$23 + 9)));
               }

               $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * 9, $$8[$$18]));
            }
         }

         return new foc.a($$0, $$10, $$9, $$8, $$4.toArray(new foc.b[0]), $$14.toArray(new gdo[0]));
      }
   }

   static int a(int[] $$0, int $$1) {
      int $$2 = Arrays.binarySearch($$0, $$1);
      return $$2 < 0 ? -($$2 + 2) : $$2;
   }

   private gdo a(String $$0, ffl $$1, int $$2, int $$3, int $$4, int $$5) {
      String $$6 = $$0.substring($$5, $$2);
      String $$7 = $$0.substring($$5, $$3);
      foc.c $$8 = new foc.c((int)$$1.a($$6), $$4);
      foc.c $$9 = new foc.c((int)$$1.a($$7), $$4 + 9);
      return this.a($$8, $$9);
   }

   private gdo a(foc.c $$0, foc.c $$1) {
      foc.c $$2 = this.b($$0);
      foc.c $$3 = this.b($$1);
      int $$4 = Math.min($$2.a, $$3.a);
      int $$5 = Math.max($$2.a, $$3.a);
      int $$6 = Math.min($$2.b, $$3.b);
      int $$7 = Math.max($$2.b, $$3.b);
      return new gdo($$4, $$6, $$5 - $$4, $$7 - $$6);
   }

   static class a {
      static final foc.a a = new foc.a("", new foc.c(0, 0), true, new int[]{0}, new foc.b[]{new foc.b(yi.a, "", 0, 0)}, new gdo[0]);
      private final String b;
      final foc.c c;
      final boolean d;
      private final int[] e;
      final foc.b[] f;
      final gdo[] g;

      public a(String $$0, foc.c $$1, boolean $$2, int[] $$3, foc.b[] $$4, gdo[] $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }

      public int a(fgk $$0, foc.c $$1) {
         int $$2 = $$1.b / 9;
         if ($$2 < 0) {
            return 0;
         } else if ($$2 >= this.f.length) {
            return this.b.length();
         } else {
            foc.b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
         }
      }

      public int a(int $$0, int $$1) {
         int $$2 = foc.a(this.e, $$0);
         int $$3 = $$2 + $$1;
         int $$6;
         if (0 <= $$3 && $$3 < this.e.length) {
            int $$4 = $$0 - this.e[$$2];
            int $$5 = this.f[$$3].b.length();
            $$6 = this.e[$$3] + Math.min($$4, $$5);
         } else {
            $$6 = $$0;
         }

         return $$6;
      }

      public int a(int $$0) {
         int $$1 = foc.a(this.e, $$0);
         return this.e[$$1];
      }

      public int b(int $$0) {
         int $$1 = foc.a(this.e, $$0);
         return this.e[$$1] + this.f[$$1].b.length();
      }
   }

   static class b {
      final yi a;
      final String b;
      final xl c;
      final int d;
      final int e;

      public b(yi $$0, String $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
         this.c = xl.b($$1).b($$0);
      }
   }

   static class c {
      public final int a;
      public final int b;

      c(int $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
