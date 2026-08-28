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

public class fss extends frw {
   private static final int a = 114;
   private static final int b = 128;
   private static final int c = 192;
   private static final int d = 192;
   private static final int s = 256;
   private static final int u = 256;
   private static final xj v = xj.c("book.editTitle");
   private static final xj w = xj.c("book.finalizeWarning");
   private static final ayy x = ayy.forward("_", yg.a.a(n.a));
   private static final ayy y = ayy.forward("_", yg.a.a(n.h));
   private final cou z;
   private final cwm A;
   private boolean B;
   private boolean C;
   private int D;
   private int E;
   private final List<String> F = Lists.newArrayList();
   private String G = "";
   private final foz H = new foz(this::S, this::b, this::m, this::a, $$0x -> $$0x.length() < 1024 && this.p.b($$0x, 114) <= 128);
   private final foz I = new foz(() -> this.G, $$0x -> this.G = $$0x, this::m, this::a, $$0x -> $$0x.length() < 16);
   private long J;
   private int K = -1;
   private ftu L;
   private ftu M;
   private fmd N;
   private fmd O;
   private fmd P;
   private fmd Q;
   private final bsj R;
   @Nullable
   private fss.a S = fss.a.a;
   private xj T = xi.a;
   private final xj U;

   public fss(cou $$0, cwm $$1, bsj $$2, czt $$3) {
      super(fjv.a);
      this.z = $$0;
      this.A = $$1;
      this.R = $$2;
      $$3.a(fke.Q().aU()).forEach(this.F::add);
      if (this.F.isEmpty()) {
         this.F.add("");
      }

      this.U = xj.a("book.byAuthor", $$0.al()).a(n.i);
   }

   private void a(String $$0) {
      if (this.m != null) {
         foz.a(this.m, $$0);
      }
   }

   private String m() {
      return this.m != null ? foz.b(this.m) : "";
   }

   private int F() {
      return this.F.size();
   }

   @Override
   public void e() {
      super.e();
      this.D++;
   }

   @Override
   protected void aR_() {
      this.U();
      this.O = this.c((fmd)fmd.a(xj.c("book.signButton"), $$0x -> {
         this.C = true;
         this.K();
      }).a(this.n / 2 - 100, 196, 98, 20).a());
      this.N = this.c((fmd)fmd.a(xi.d, $$0x -> {
         this.m.a(null);
         this.c(false);
      }).a(this.n / 2 + 2, 196, 98, 20).a());
      this.P = this.c((fmd)fmd.a(xj.c("book.finalizeButton"), $$0x -> {
         if (this.C) {
            this.c(true);
            this.m.a(null);
         }
      }).a(this.n / 2 - 100, 196, 98, 20).a());
      this.Q = this.c((fmd)fmd.a(xi.e, $$0x -> {
         if (this.C) {
            this.C = false;
         }

         this.K();
      }).a(this.n / 2 + 2, 196, 98, 20).a());
      int $$0 = (this.n - 192) / 2;
      int $$1 = 2;
      this.L = this.c(new ftu($$0 + 116, 159, true, $$0x -> this.J(), true));
      this.M = this.c(new ftu($$0 + 43, 159, false, $$0x -> this.G(), true));
      this.K();
   }

   private void G() {
      if (this.E > 0) {
         this.E--;
      }

      this.K();
      this.V();
   }

   private void J() {
      if (this.E < this.F() - 1) {
         this.E++;
      } else {
         this.N();
         if (this.E < this.F() - 1) {
            this.E++;
         }
      }

      this.K();
      this.V();
   }

   private void K() {
      this.M.k = !this.C && this.E > 0;
      this.L.k = !this.C;
      this.N.k = !this.C;
      this.O.k = !this.C;
      this.Q.k = this.C;
      this.P.k = this.C;
      this.P.j = !baj.h(this.G);
   }

   private void L() {
      ListIterator<String> $$0 = this.F.listIterator(this.F.size());

      while ($$0.hasPrevious() && $$0.previous().isEmpty()) {
         $$0.remove();
      }
   }

   private void c(boolean $$0) {
      if (this.B) {
         this.L();
         this.M();
         int $$1 = this.R == bsj.a ? this.z.gg().j : 40;
         this.m.L().b(new ahq($$1, this.F, $$0 ? Optional.of(this.G.trim()) : Optional.empty()));
      }
   }

   private void M() {
      this.A.b(ku.S, new czt(this.F.stream().map(ash::a).toList()));
   }

   private void N() {
      if (this.F() < 100) {
         this.F.add("");
         this.B = true;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.C) {
         return this.d($$0, $$1, $$2);
      } else {
         boolean $$3 = this.b($$0, $$1, $$2);
         if ($$3) {
            this.U();
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
      } else if (this.C) {
         boolean $$2 = this.I.a($$0);
         if ($$2) {
            this.K();
            this.B = true;
            return true;
         } else {
            return false;
         }
      } else if (baj.a($$0)) {
         this.H.a(Character.toString($$0));
         this.U();
         return true;
      } else {
         return false;
      }
   }

   private boolean b(int $$0, int $$1, int $$2) {
      if (frw.f($$0)) {
         this.H.d();
         return true;
      } else if (frw.e($$0)) {
         this.H.c();
         return true;
      } else if (frw.d($$0)) {
         this.H.b();
         return true;
      } else if (frw.c($$0)) {
         this.H.a();
         return true;
      } else {
         foz.a $$3 = frw.s() ? foz.a.b : foz.a.a;
         switch ($$0) {
            case 257:
            case 335:
               this.H.a("\n");
               return true;
            case 259:
               this.H.a(-1, $$3);
               return true;
            case 261:
               this.H.a(1, $$3);
               return true;
            case 262:
               this.H.a(1, frw.t(), $$3);
               return true;
            case 263:
               this.H.a(-1, frw.t(), $$3);
               return true;
            case 264:
               this.P();
               return true;
            case 265:
               this.O();
               return true;
            case 266:
               this.M.b();
               return true;
            case 267:
               this.L.b();
               return true;
            case 268:
               this.Q();
               return true;
            case 269:
               this.R();
               return true;
            default:
               return false;
         }
      }
   }

   private void O() {
      this.a(-1);
   }

   private void P() {
      this.a(1);
   }

   private void a(int $$0) {
      int $$1 = this.H.g();
      int $$2 = this.T().a($$1, $$0);
      this.H.c($$2, frw.t());
   }

   private void Q() {
      if (frw.s()) {
         this.H.a(frw.t());
      } else {
         int $$0 = this.H.g();
         int $$1 = this.T().a($$0);
         this.H.c($$1, frw.t());
      }
   }

   private void R() {
      if (frw.s()) {
         this.H.b(frw.t());
      } else {
         fss.a $$0 = this.T();
         int $$1 = this.H.g();
         int $$2 = $$0.b($$1);
         this.H.c($$2, frw.t());
      }
   }

   private boolean d(int $$0, int $$1, int $$2) {
      switch ($$0) {
         case 257:
         case 335:
            if (!this.G.isEmpty()) {
               this.c(true);
               this.m.a(null);
            }

            return true;
         case 259:
            this.I.e(-1);
            this.K();
            this.B = true;
            return true;
         default:
            return false;
      }
   }

   private String S() {
      return this.E >= 0 && this.E < this.F.size() ? this.F.get(this.E) : "";
   }

   private void b(String $$0) {
      if (this.E >= 0 && this.E < this.F.size()) {
         this.F.set(this.E, $$0);
         this.B = true;
         this.U();
      }
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(null);
      int $$4 = (this.n - 192) / 2;
      int $$5 = 2;
      if (this.C) {
         boolean $$6 = this.D / 6 % 2 == 0;
         ayy $$7 = ayy.composite(ayy.forward(this.G, yg.a), $$6 ? x : y);
         int $$8 = this.p.a(v);
         $$0.a(this.p, v, $$4 + 36 + (114 - $$8) / 2, 34, 0, false);
         int $$9 = this.p.a($$7);
         $$0.a(this.p, $$7, $$4 + 36 + (114 - $$9) / 2, 50, 0, false);
         int $$10 = this.p.a(this.U);
         $$0.a(this.p, this.U, $$4 + 36 + (114 - $$10) / 2, 60, 0, false);
         $$0.a(this.p, w, $$4 + 36, 82, 114, 0);
      } else {
         int $$11 = this.p.a(this.T);
         $$0.a(this.p, this.T, $$4 - $$11 + 192 - 44, 18, 0, false);
         fss.a $$12 = this.T();

         for (fss.b $$13 : $$12.f) {
            $$0.a(this.p, $$13.c, $$13.d, $$13.e, -16777216, false);
         }

         this.a($$0, $$12.g);
         this.a($$0, $$12.c, $$12.d);
      }
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(gjq::B, fst.s, (this.n - 192) / 2, 2, 0.0F, 0.0F, 192, 192, 256, 256);
   }

   private void a(flq $$0, fss.c $$1, boolean $$2) {
      if (this.D / 6 % 2 == 0) {
         $$1 = this.b($$1);
         if (!$$2) {
            $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + 9, -16777216);
         } else {
            $$0.a(this.p, "_", $$1.a, $$1.b, 0, false);
         }
      }
   }

   private void a(flq $$0, gjn[] $$1) {
      for (gjn $$2 : $$1) {
         int $$3 = $$2.a();
         int $$4 = $$2.b();
         int $$5 = $$3 + $$2.c();
         int $$6 = $$4 + $$2.d();
         $$0.a(gjq.I(), $$3, $$4, $$5, $$6, -16776961);
      }
   }

   private fss.c a(fss.c $$0) {
      return new fss.c($$0.a - (this.n - 192) / 2 - 36, $$0.b - 32);
   }

   private fss.c b(fss.c $$0) {
      return new fss.c($$0.a + (this.n - 192) / 2 + 36, $$0.b + 32);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            long $$3 = ae.c();
            fss.a $$4 = this.T();
            int $$5 = $$4.a(this.p, this.a(new fss.c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
               if ($$5 != this.K || $$3 - this.J >= 250L) {
                  this.H.c($$5, frw.t());
               } else if (!this.H.i()) {
                  this.b($$5);
               } else {
                  this.H.d();
               }

               this.U();
            }

            this.K = $$5;
            this.J = $$3;
         }

         return true;
      }
   }

   private void b(int $$0) {
      String $$1 = this.S();
      this.H.a(fkp.a($$1, -1, $$0, false), fkp.a($$1, 1, $$0, false));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$2 == 0) {
            fss.a $$5 = this.T();
            int $$6 = $$5.a(this.p, this.a(new fss.c((int)$$0, (int)$$1)));
            this.H.c($$6, true);
            this.U();
         }

         return true;
      }
   }

   private fss.a T() {
      if (this.S == null) {
         this.S = this.W();
         this.T = xj.a("book.pageIndicator", this.E + 1, this.F());
      }

      return this.S;
   }

   private void U() {
      this.S = null;
   }

   private void V() {
      this.H.f();
      this.U();
   }

   private fss.a W() {
      String $$0 = this.S();
      if ($$0.isEmpty()) {
         return fss.a.a;
      } else {
         int $$1 = this.H.g();
         int $$2 = this.H.h();
         IntList $$3 = new IntArrayList();
         List<fss.b> $$4 = Lists.newArrayList();
         MutableInt $$5 = new MutableInt();
         MutableBoolean $$6 = new MutableBoolean();
         fkp $$7 = this.p.b();
         $$7.a($$0, 114, yg.a, true, ($$5x, $$6x, $$7x) -> {
            int $$8x = $$5.getAndIncrement();
            String $$9x = $$0.substring($$6x, $$7x);
            $$6.setValue($$9x.endsWith("\n"));
            String $$10 = StringUtils.stripEnd($$9x, " \n");
            int $$11 = $$8x * 9;
            fss.c $$12 = this.b(new fss.c(0, $$11));
            $$3.add($$6x);
            $$4.add(new fss.b($$5x, $$10, $$12.a, $$12.b));
         });
         int[] $$8 = $$3.toIntArray();
         boolean $$9 = $$1 == $$0.length();
         fss.c $$10;
         if ($$9 && $$6.isTrue()) {
            $$10 = new fss.c(0, $$4.size() * 9);
         } else {
            int $$11 = a($$8, $$1);
            int $$12 = this.p.b($$0.substring($$8[$$11], $$1));
            $$10 = new fss.c($$12, $$11 * 9);
         }

         List<gjn> $$14 = Lists.newArrayList();
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
                  $$14.add(this.a(new fss.c(0, $$23), new fss.c($$25, $$23 + 9)));
               }

               $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * 9, $$8[$$18]));
            }
         }

         return new fss.a($$0, $$10, $$9, $$8, $$4.toArray(new fss.b[0]), $$14.toArray(new gjn[0]));
      }
   }

   static int a(int[] $$0, int $$1) {
      int $$2 = Arrays.binarySearch($$0, $$1);
      return $$2 < 0 ? -($$2 + 2) : $$2;
   }

   private gjn a(String $$0, fkp $$1, int $$2, int $$3, int $$4, int $$5) {
      String $$6 = $$0.substring($$5, $$2);
      String $$7 = $$0.substring($$5, $$3);
      fss.c $$8 = new fss.c((int)$$1.a($$6), $$4);
      fss.c $$9 = new fss.c((int)$$1.a($$7), $$4 + 9);
      return this.a($$8, $$9);
   }

   private gjn a(fss.c $$0, fss.c $$1) {
      fss.c $$2 = this.b($$0);
      fss.c $$3 = this.b($$1);
      int $$4 = Math.min($$2.a, $$3.a);
      int $$5 = Math.max($$2.a, $$3.a);
      int $$6 = Math.min($$2.b, $$3.b);
      int $$7 = Math.max($$2.b, $$3.b);
      return new gjn($$4, $$6, $$5 - $$4, $$7 - $$6);
   }

   static class a {
      static final fss.a a = new fss.a("", new fss.c(0, 0), true, new int[]{0}, new fss.b[]{new fss.b(yg.a, "", 0, 0)}, new gjn[0]);
      private final String b;
      final fss.c c;
      final boolean d;
      private final int[] e;
      final fss.b[] f;
      final gjn[] g;

      public a(String $$0, fss.c $$1, boolean $$2, int[] $$3, fss.b[] $$4, gjn[] $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }

      public int a(flo $$0, fss.c $$1) {
         int $$2 = $$1.b / 9;
         if ($$2 < 0) {
            return 0;
         } else if ($$2 >= this.f.length) {
            return this.b.length();
         } else {
            fss.b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
         }
      }

      public int a(int $$0, int $$1) {
         int $$2 = fss.a(this.e, $$0);
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
         int $$1 = fss.a(this.e, $$0);
         return this.e[$$1];
      }

      public int b(int $$0) {
         int $$1 = fss.a(this.e, $$0);
         return this.e[$$1] + this.f[$$1].b.length();
      }
   }

   static class b {
      final yg a;
      final String b;
      final xj c;
      final int d;
      final int e;

      public b(yg $$0, String $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
         this.c = xj.b($$1).b($$0);
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
