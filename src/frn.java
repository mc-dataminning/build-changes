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

public class frn extends fqs {
   private static final int a = 114;
   private static final int b = 128;
   private static final int c = 192;
   private static final int d = 192;
   private static final int s = 256;
   private static final int u = 256;
   private static final xh v = xh.c("book.editTitle");
   private static final xh w = xh.c("book.finalizeWarning");
   private static final ayv x = ayv.forward("_", ye.a.a(n.a));
   private static final ayv y = ayv.forward("_", ye.a.a(n.h));
   private final coh z;
   private final cvx A;
   private boolean B;
   private boolean C;
   private int D;
   private int E;
   private final List<String> F = Lists.newArrayList();
   private String G = "";
   private final fnu H = new fnu(this::Q, this::b, this::m, this::a, $$0x -> $$0x.length() < 1024 && this.p.b($$0x, 114) <= 128);
   private final fnu I = new fnu(() -> this.G, $$0x -> this.G = $$0x, this::m, this::a, $$0x -> $$0x.length() < 16);
   private long J;
   private int K = -1;
   private fsp L;
   private fsp M;
   private fkz N;
   private fkz O;
   private fkz P;
   private fkz Q;
   private final brx R;
   @Nullable
   private frn.a S = frn.a.a;
   private xh T = xg.a;
   private final xh U;

   public frn(coh $$0, cvx $$1, brx $$2) {
      super(fir.a);
      this.z = $$0;
      this.A = $$1;
      this.R = $$2;
      czc $$3 = $$1.a(kt.R);
      if ($$3 != null) {
         $$3.a(fja.Q().aV()).forEach(this.F::add);
      }

      if (this.F.isEmpty()) {
         this.F.add("");
      }

      this.U = xh.a("book.byAuthor", $$0.al()).a(n.i);
   }

   private void a(String $$0) {
      if (this.m != null) {
         fnu.a(this.m, $$0);
      }
   }

   private String m() {
      return this.m != null ? fnu.b(this.m) : "";
   }

   private int D() {
      return this.F.size();
   }

   @Override
   public void e() {
      super.e();
      this.D++;
   }

   @Override
   protected void aS_() {
      this.S();
      this.O = this.c((fkz)fkz.a(xh.c("book.signButton"), $$0x -> {
         this.C = true;
         this.G();
      }).a(this.n / 2 - 100, 196, 98, 20).a());
      this.N = this.c((fkz)fkz.a(xg.d, $$0x -> {
         this.m.a(null);
         this.c(false);
      }).a(this.n / 2 + 2, 196, 98, 20).a());
      this.P = this.c((fkz)fkz.a(xh.c("book.finalizeButton"), $$0x -> {
         if (this.C) {
            this.c(true);
            this.m.a(null);
         }
      }).a(this.n / 2 - 100, 196, 98, 20).a());
      this.Q = this.c((fkz)fkz.a(xg.e, $$0x -> {
         if (this.C) {
            this.C = false;
         }

         this.G();
      }).a(this.n / 2 + 2, 196, 98, 20).a());
      int $$0 = (this.n - 192) / 2;
      int $$1 = 2;
      this.L = this.c(new fsp($$0 + 116, 159, true, $$0x -> this.F(), true));
      this.M = this.c(new fsp($$0 + 43, 159, false, $$0x -> this.E(), true));
      this.G();
   }

   private void E() {
      if (this.E > 0) {
         this.E--;
      }

      this.G();
      this.T();
   }

   private void F() {
      if (this.E < this.D() - 1) {
         this.E++;
      } else {
         this.L();
         if (this.E < this.D() - 1) {
            this.E++;
         }
      }

      this.G();
      this.T();
   }

   private void G() {
      this.M.k = !this.C && this.E > 0;
      this.L.k = !this.C;
      this.N.k = !this.C;
      this.O.k = !this.C;
      this.Q.k = this.C;
      this.P.k = this.C;
      this.P.j = !bag.h(this.G);
   }

   private void J() {
      ListIterator<String> $$0 = this.F.listIterator(this.F.size());

      while ($$0.hasPrevious() && $$0.previous().isEmpty()) {
         $$0.remove();
      }
   }

   private void c(boolean $$0) {
      if (this.B) {
         this.J();
         this.K();
         int $$1 = this.R == brx.a ? this.z.gk().j : 40;
         this.m.L().b(new aho($$1, this.F, $$0 ? Optional.of(this.G.trim()) : Optional.empty()));
      }
   }

   private void K() {
      this.A.b(kt.R, new czc(this.F.stream().map(ase::a).toList()));
   }

   private void L() {
      if (this.D() < 100) {
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
            this.S();
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
            this.G();
            this.B = true;
            return true;
         } else {
            return false;
         }
      } else if (bag.a($$0)) {
         this.H.a(Character.toString($$0));
         this.S();
         return true;
      } else {
         return false;
      }
   }

   private boolean b(int $$0, int $$1, int $$2) {
      if (fqs.f($$0)) {
         this.H.d();
         return true;
      } else if (fqs.e($$0)) {
         this.H.c();
         return true;
      } else if (fqs.d($$0)) {
         this.H.b();
         return true;
      } else if (fqs.c($$0)) {
         this.H.a();
         return true;
      } else {
         fnu.a $$3 = fqs.s() ? fnu.a.b : fnu.a.a;
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
               this.H.a(1, fqs.t(), $$3);
               return true;
            case 263:
               this.H.a(-1, fqs.t(), $$3);
               return true;
            case 264:
               this.N();
               return true;
            case 265:
               this.M();
               return true;
            case 266:
               this.M.b();
               return true;
            case 267:
               this.L.b();
               return true;
            case 268:
               this.O();
               return true;
            case 269:
               this.P();
               return true;
            default:
               return false;
         }
      }
   }

   private void M() {
      this.a(-1);
   }

   private void N() {
      this.a(1);
   }

   private void a(int $$0) {
      int $$1 = this.H.g();
      int $$2 = this.R().a($$1, $$0);
      this.H.c($$2, fqs.t());
   }

   private void O() {
      if (fqs.s()) {
         this.H.a(fqs.t());
      } else {
         int $$0 = this.H.g();
         int $$1 = this.R().a($$0);
         this.H.c($$1, fqs.t());
      }
   }

   private void P() {
      if (fqs.s()) {
         this.H.b(fqs.t());
      } else {
         frn.a $$0 = this.R();
         int $$1 = this.H.g();
         int $$2 = $$0.b($$1);
         this.H.c($$2, fqs.t());
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
            this.G();
            this.B = true;
            return true;
         default:
            return false;
      }
   }

   private String Q() {
      return this.E >= 0 && this.E < this.F.size() ? this.F.get(this.E) : "";
   }

   private void b(String $$0) {
      if (this.E >= 0 && this.E < this.F.size()) {
         this.F.set(this.E, $$0);
         this.B = true;
         this.S();
      }
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(null);
      int $$4 = (this.n - 192) / 2;
      int $$5 = 2;
      if (this.C) {
         boolean $$6 = this.D / 6 % 2 == 0;
         ayv $$7 = ayv.composite(ayv.forward(this.G, ye.a), $$6 ? x : y);
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
         frn.a $$12 = this.R();

         for (frn.b $$13 : $$12.f) {
            $$0.a(this.p, $$13.c, $$13.d, $$13.e, -16777216, false);
         }

         this.a($$0, $$12.g);
         this.a($$0, $$12.c, $$12.d);
      }
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(gig::B, fro.s, (this.n - 192) / 2, 2, 0.0F, 0.0F, 192, 192, 256, 256);
   }

   private void a(fkm $$0, frn.c $$1, boolean $$2) {
      if (this.D / 6 % 2 == 0) {
         $$1 = this.b($$1);
         if (!$$2) {
            $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + 9, -16777216);
         } else {
            $$0.a(this.p, "_", $$1.a, $$1.b, 0, false);
         }
      }
   }

   private void a(fkm $$0, gid[] $$1) {
      for (gid $$2 : $$1) {
         int $$3 = $$2.a();
         int $$4 = $$2.b();
         int $$5 = $$3 + $$2.c();
         int $$6 = $$4 + $$2.d();
         $$0.a(gig.I(), $$3, $$4, $$5, $$6, -16776961);
      }
   }

   private frn.c a(frn.c $$0) {
      return new frn.c($$0.a - (this.n - 192) / 2 - 36, $$0.b - 32);
   }

   private frn.c b(frn.c $$0) {
      return new frn.c($$0.a + (this.n - 192) / 2 + 36, $$0.b + 32);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            long $$3 = ad.c();
            frn.a $$4 = this.R();
            int $$5 = $$4.a(this.p, this.a(new frn.c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
               if ($$5 != this.K || $$3 - this.J >= 250L) {
                  this.H.c($$5, fqs.t());
               } else if (!this.H.i()) {
                  this.b($$5);
               } else {
                  this.H.d();
               }

               this.S();
            }

            this.K = $$5;
            this.J = $$3;
         }

         return true;
      }
   }

   private void b(int $$0) {
      String $$1 = this.Q();
      this.H.a(fjl.a($$1, -1, $$0, false), fjl.a($$1, 1, $$0, false));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$2 == 0) {
            frn.a $$5 = this.R();
            int $$6 = $$5.a(this.p, this.a(new frn.c((int)$$0, (int)$$1)));
            this.H.c($$6, true);
            this.S();
         }

         return true;
      }
   }

   private frn.a R() {
      if (this.S == null) {
         this.S = this.U();
         this.T = xh.a("book.pageIndicator", this.E + 1, this.D());
      }

      return this.S;
   }

   private void S() {
      this.S = null;
   }

   private void T() {
      this.H.f();
      this.S();
   }

   private frn.a U() {
      String $$0 = this.Q();
      if ($$0.isEmpty()) {
         return frn.a.a;
      } else {
         int $$1 = this.H.g();
         int $$2 = this.H.h();
         IntList $$3 = new IntArrayList();
         List<frn.b> $$4 = Lists.newArrayList();
         MutableInt $$5 = new MutableInt();
         MutableBoolean $$6 = new MutableBoolean();
         fjl $$7 = this.p.b();
         $$7.a($$0, 114, ye.a, true, ($$5x, $$6x, $$7x) -> {
            int $$8x = $$5.getAndIncrement();
            String $$9x = $$0.substring($$6x, $$7x);
            $$6.setValue($$9x.endsWith("\n"));
            String $$10 = StringUtils.stripEnd($$9x, " \n");
            int $$11 = $$8x * 9;
            frn.c $$12 = this.b(new frn.c(0, $$11));
            $$3.add($$6x);
            $$4.add(new frn.b($$5x, $$10, $$12.a, $$12.b));
         });
         int[] $$8 = $$3.toIntArray();
         boolean $$9 = $$1 == $$0.length();
         frn.c $$10;
         if ($$9 && $$6.isTrue()) {
            $$10 = new frn.c(0, $$4.size() * 9);
         } else {
            int $$11 = a($$8, $$1);
            int $$12 = this.p.b($$0.substring($$8[$$11], $$1));
            $$10 = new frn.c($$12, $$11 * 9);
         }

         List<gid> $$14 = Lists.newArrayList();
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
                  $$14.add(this.a(new frn.c(0, $$23), new frn.c($$25, $$23 + 9)));
               }

               $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * 9, $$8[$$18]));
            }
         }

         return new frn.a($$0, $$10, $$9, $$8, $$4.toArray(new frn.b[0]), $$14.toArray(new gid[0]));
      }
   }

   static int a(int[] $$0, int $$1) {
      int $$2 = Arrays.binarySearch($$0, $$1);
      return $$2 < 0 ? -($$2 + 2) : $$2;
   }

   private gid a(String $$0, fjl $$1, int $$2, int $$3, int $$4, int $$5) {
      String $$6 = $$0.substring($$5, $$2);
      String $$7 = $$0.substring($$5, $$3);
      frn.c $$8 = new frn.c((int)$$1.a($$6), $$4);
      frn.c $$9 = new frn.c((int)$$1.a($$7), $$4 + 9);
      return this.a($$8, $$9);
   }

   private gid a(frn.c $$0, frn.c $$1) {
      frn.c $$2 = this.b($$0);
      frn.c $$3 = this.b($$1);
      int $$4 = Math.min($$2.a, $$3.a);
      int $$5 = Math.max($$2.a, $$3.a);
      int $$6 = Math.min($$2.b, $$3.b);
      int $$7 = Math.max($$2.b, $$3.b);
      return new gid($$4, $$6, $$5 - $$4, $$7 - $$6);
   }

   static class a {
      static final frn.a a = new frn.a("", new frn.c(0, 0), true, new int[]{0}, new frn.b[]{new frn.b(ye.a, "", 0, 0)}, new gid[0]);
      private final String b;
      final frn.c c;
      final boolean d;
      private final int[] e;
      final frn.b[] f;
      final gid[] g;

      public a(String $$0, frn.c $$1, boolean $$2, int[] $$3, frn.b[] $$4, gid[] $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }

      public int a(fkk $$0, frn.c $$1) {
         int $$2 = $$1.b / 9;
         if ($$2 < 0) {
            return 0;
         } else if ($$2 >= this.f.length) {
            return this.b.length();
         } else {
            frn.b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
         }
      }

      public int a(int $$0, int $$1) {
         int $$2 = frn.a(this.e, $$0);
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
         int $$1 = frn.a(this.e, $$0);
         return this.e[$$1];
      }

      public int b(int $$0) {
         int $$1 = frn.a(this.e, $$0);
         return this.e[$$1] + this.f[$$1].b.length();
      }
   }

   static class b {
      final ye a;
      final String b;
      final xh c;
      final int d;
      final int e;

      public b(ye $$0, String $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
         this.c = xh.b($$1).b($$0);
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
