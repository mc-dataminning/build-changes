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

public class fof extends fnb {
   private static final int a = 114;
   private static final int b = 128;
   private static final int c = 192;
   private static final int d = 192;
   private static final xo r = xo.c("book.editTitle");
   private static final xo s = xo.c("book.finalizeWarning");
   private static final ayj u = ayj.forward("_", yl.a.a(n.a));
   private static final ayj v = ayj.forward("_", yl.a.a(n.h));
   private final cmv w;
   private final cun x;
   private boolean y;
   private boolean z;
   private int A;
   private int B;
   private final List<String> C = Lists.newArrayList();
   private String D = "";
   private final fjw E = new fjw(this::Q, this::b, this::m, this::a, $$0x -> $$0x.length() < 1024 && this.p.b($$0x, 114) <= 128);
   private final fjw F = new fjw(() -> this.D, $$0x -> this.D = $$0x, this::m, this::a, $$0x -> $$0x.length() < 16);
   private long G;
   private int H = -1;
   private fpi I;
   private fpi J;
   private fhc K;
   private fhc L;
   private fhc M;
   private fhc N;
   private final bqr O;
   @Nullable
   private fof.a P = fof.a.a;
   private xo Q = xn.a;
   private final xo R;

   public fof(cmv $$0, cun $$1, bqr $$2) {
      super(fev.a);
      this.w = $$0;
      this.x = $$1;
      this.O = $$2;
      cxv $$3 = $$1.a(km.H);
      if ($$3 != null) {
         $$3.a(ffd.Q().aS()).forEach(this.C::add);
      }

      if (this.C.isEmpty()) {
         this.C.add("");
      }

      this.R = xo.a("book.byAuthor", $$0.af()).a(n.i);
   }

   private void a(String $$0) {
      if (this.m != null) {
         fjw.a(this.m, $$0);
      }
   }

   private String m() {
      return this.m != null ? fjw.b(this.m) : "";
   }

   private int D() {
      return this.C.size();
   }

   @Override
   public void e() {
      super.e();
      this.A++;
   }

   @Override
   protected void aM_() {
      this.S();
      this.L = this.c((fhc)fhc.a(xo.c("book.signButton"), $$0x -> {
         this.z = true;
         this.I();
      }).a(this.n / 2 - 100, 196, 98, 20).a());
      this.K = this.c((fhc)fhc.a(xn.d, $$0x -> {
         this.m.a(null);
         this.c(false);
      }).a(this.n / 2 + 2, 196, 98, 20).a());
      this.M = this.c((fhc)fhc.a(xo.c("book.finalizeButton"), $$0x -> {
         if (this.z) {
            this.c(true);
            this.m.a(null);
         }
      }).a(this.n / 2 - 100, 196, 98, 20).a());
      this.N = this.c((fhc)fhc.a(xn.e, $$0x -> {
         if (this.z) {
            this.z = false;
         }

         this.I();
      }).a(this.n / 2 + 2, 196, 98, 20).a());
      int $$0 = (this.n - 192) / 2;
      int $$1 = 2;
      this.I = this.c(new fpi($$0 + 116, 159, true, $$0x -> this.F(), true));
      this.J = this.c(new fpi($$0 + 43, 159, false, $$0x -> this.E(), true));
      this.I();
   }

   private void E() {
      if (this.B > 0) {
         this.B--;
      }

      this.I();
      this.T();
   }

   private void F() {
      if (this.B < this.D() - 1) {
         this.B++;
      } else {
         this.L();
         if (this.B < this.D() - 1) {
            this.B++;
         }
      }

      this.I();
      this.T();
   }

   private void I() {
      this.J.k = !this.z && this.B > 0;
      this.I.k = !this.z;
      this.K.k = !this.z;
      this.L.k = !this.z;
      this.N.k = this.z;
      this.M.k = this.z;
      this.M.j = !azt.h(this.D);
   }

   private void J() {
      ListIterator<String> $$0 = this.C.listIterator(this.C.size());

      while ($$0.hasPrevious() && $$0.previous().isEmpty()) {
         $$0.remove();
      }
   }

   private void c(boolean $$0) {
      if (this.y) {
         this.J();
         this.K();
         int $$1 = this.O == bqr.a ? this.w.gc().k : 40;
         this.m.L().b(new aho($$1, this.C, $$0 ? Optional.of(this.D.trim()) : Optional.empty()));
      }
   }

   private void K() {
      this.x.b(km.H, new cxv(this.C.stream().map(arv::a).toList()));
   }

   private void L() {
      if (this.D() < 100) {
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
      } else if (this.z) {
         boolean $$2 = this.F.a($$0);
         if ($$2) {
            this.I();
            this.y = true;
            return true;
         } else {
            return false;
         }
      } else if (azt.a($$0)) {
         this.E.a(Character.toString($$0));
         this.S();
         return true;
      } else {
         return false;
      }
   }

   private boolean b(int $$0, int $$1, int $$2) {
      if (fnb.f($$0)) {
         this.E.d();
         return true;
      } else if (fnb.e($$0)) {
         this.E.c();
         return true;
      } else if (fnb.d($$0)) {
         this.E.b();
         return true;
      } else if (fnb.c($$0)) {
         this.E.a();
         return true;
      } else {
         fjw.a $$3 = fnb.r() ? fjw.a.b : fjw.a.a;
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
               this.E.a(1, fnb.s(), $$3);
               return true;
            case 263:
               this.E.a(-1, fnb.s(), $$3);
               return true;
            case 264:
               this.N();
               return true;
            case 265:
               this.M();
               return true;
            case 266:
               this.J.b();
               return true;
            case 267:
               this.I.b();
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
      int $$1 = this.E.g();
      int $$2 = this.R().a($$1, $$0);
      this.E.c($$2, fnb.s());
   }

   private void O() {
      if (fnb.r()) {
         this.E.a(fnb.s());
      } else {
         int $$0 = this.E.g();
         int $$1 = this.R().a($$0);
         this.E.c($$1, fnb.s());
      }
   }

   private void P() {
      if (fnb.r()) {
         this.E.b(fnb.s());
      } else {
         fof.a $$0 = this.R();
         int $$1 = this.E.g();
         int $$2 = $$0.b($$1);
         this.E.c($$2, fnb.s());
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
            this.I();
            this.y = true;
            return true;
         default:
            return false;
      }
   }

   private String Q() {
      return this.B >= 0 && this.B < this.C.size() ? this.C.get(this.B) : "";
   }

   private void b(String $$0) {
      if (this.B >= 0 && this.B < this.C.size()) {
         this.C.set(this.B, $$0);
         this.y = true;
         this.S();
      }
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(null);
      int $$4 = (this.n - 192) / 2;
      int $$5 = 2;
      if (this.z) {
         boolean $$6 = this.A / 6 % 2 == 0;
         ayj $$7 = ayj.composite(ayj.forward(this.D, yl.a), $$6 ? u : v);
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
         fof.a $$12 = this.R();

         for (fof.b $$13 : $$12.f) {
            $$0.a(this.p, $$13.c, $$13.d, $$13.e, -16777216, false);
         }

         this.a($$0, $$12.g);
         this.a($$0, $$12.c, $$12.d);
      }
   }

   @Override
   public void b(fgp $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(fog.r, (this.n - 192) / 2, 2, 0, 0, 192, 192);
   }

   private void a(fgp $$0, fof.c $$1, boolean $$2) {
      if (this.A / 6 % 2 == 0) {
         $$1 = this.b($$1);
         if (!$$2) {
            $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + 9, -16777216);
         } else {
            $$0.a(this.p, "_", $$1.a, $$1.b, 0, false);
         }
      }
   }

   private void a(fgp $$0, gdr[] $$1) {
      for (gdr $$2 : $$1) {
         int $$3 = $$2.a();
         int $$4 = $$2.b();
         int $$5 = $$3 + $$2.c();
         int $$6 = $$4 + $$2.d();
         $$0.a(gdu.F(), $$3, $$4, $$5, $$6, -16776961);
      }
   }

   private fof.c a(fof.c $$0) {
      return new fof.c($$0.a - (this.n - 192) / 2 - 36, $$0.b - 32);
   }

   private fof.c b(fof.c $$0) {
      return new fof.c($$0.a + (this.n - 192) / 2 + 36, $$0.b + 32);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            long $$3 = ac.c();
            fof.a $$4 = this.R();
            int $$5 = $$4.a(this.p, this.a(new fof.c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
               if ($$5 != this.H || $$3 - this.G >= 250L) {
                  this.E.c($$5, fnb.s());
               } else if (!this.E.i()) {
                  this.b($$5);
               } else {
                  this.E.d();
               }

               this.S();
            }

            this.H = $$5;
            this.G = $$3;
         }

         return true;
      }
   }

   private void b(int $$0) {
      String $$1 = this.Q();
      this.E.a(ffo.a($$1, -1, $$0, false), ffo.a($$1, 1, $$0, false));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$2 == 0) {
            fof.a $$5 = this.R();
            int $$6 = $$5.a(this.p, this.a(new fof.c((int)$$0, (int)$$1)));
            this.E.c($$6, true);
            this.S();
         }

         return true;
      }
   }

   private fof.a R() {
      if (this.P == null) {
         this.P = this.U();
         this.Q = xo.a("book.pageIndicator", this.B + 1, this.D());
      }

      return this.P;
   }

   private void S() {
      this.P = null;
   }

   private void T() {
      this.E.f();
      this.S();
   }

   private fof.a U() {
      String $$0 = this.Q();
      if ($$0.isEmpty()) {
         return fof.a.a;
      } else {
         int $$1 = this.E.g();
         int $$2 = this.E.h();
         IntList $$3 = new IntArrayList();
         List<fof.b> $$4 = Lists.newArrayList();
         MutableInt $$5 = new MutableInt();
         MutableBoolean $$6 = new MutableBoolean();
         ffo $$7 = this.p.b();
         $$7.a($$0, 114, yl.a, true, ($$5x, $$6x, $$7x) -> {
            int $$8x = $$5.getAndIncrement();
            String $$9x = $$0.substring($$6x, $$7x);
            $$6.setValue($$9x.endsWith("\n"));
            String $$10 = StringUtils.stripEnd($$9x, " \n");
            int $$11 = $$8x * 9;
            fof.c $$12 = this.b(new fof.c(0, $$11));
            $$3.add($$6x);
            $$4.add(new fof.b($$5x, $$10, $$12.a, $$12.b));
         });
         int[] $$8 = $$3.toIntArray();
         boolean $$9 = $$1 == $$0.length();
         fof.c $$10;
         if ($$9 && $$6.isTrue()) {
            $$10 = new fof.c(0, $$4.size() * 9);
         } else {
            int $$11 = a($$8, $$1);
            int $$12 = this.p.b($$0.substring($$8[$$11], $$1));
            $$10 = new fof.c($$12, $$11 * 9);
         }

         List<gdr> $$14 = Lists.newArrayList();
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
                  $$14.add(this.a(new fof.c(0, $$23), new fof.c($$25, $$23 + 9)));
               }

               $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * 9, $$8[$$18]));
            }
         }

         return new fof.a($$0, $$10, $$9, $$8, $$4.toArray(new fof.b[0]), $$14.toArray(new gdr[0]));
      }
   }

   static int a(int[] $$0, int $$1) {
      int $$2 = Arrays.binarySearch($$0, $$1);
      return $$2 < 0 ? -($$2 + 2) : $$2;
   }

   private gdr a(String $$0, ffo $$1, int $$2, int $$3, int $$4, int $$5) {
      String $$6 = $$0.substring($$5, $$2);
      String $$7 = $$0.substring($$5, $$3);
      fof.c $$8 = new fof.c((int)$$1.a($$6), $$4);
      fof.c $$9 = new fof.c((int)$$1.a($$7), $$4 + 9);
      return this.a($$8, $$9);
   }

   private gdr a(fof.c $$0, fof.c $$1) {
      fof.c $$2 = this.b($$0);
      fof.c $$3 = this.b($$1);
      int $$4 = Math.min($$2.a, $$3.a);
      int $$5 = Math.max($$2.a, $$3.a);
      int $$6 = Math.min($$2.b, $$3.b);
      int $$7 = Math.max($$2.b, $$3.b);
      return new gdr($$4, $$6, $$5 - $$4, $$7 - $$6);
   }

   static class a {
      static final fof.a a = new fof.a("", new fof.c(0, 0), true, new int[]{0}, new fof.b[]{new fof.b(yl.a, "", 0, 0)}, new gdr[0]);
      private final String b;
      final fof.c c;
      final boolean d;
      private final int[] e;
      final fof.b[] f;
      final gdr[] g;

      public a(String $$0, fof.c $$1, boolean $$2, int[] $$3, fof.b[] $$4, gdr[] $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }

      public int a(fgn $$0, fof.c $$1) {
         int $$2 = $$1.b / 9;
         if ($$2 < 0) {
            return 0;
         } else if ($$2 >= this.f.length) {
            return this.b.length();
         } else {
            fof.b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
         }
      }

      public int a(int $$0, int $$1) {
         int $$2 = fof.a(this.e, $$0);
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
         int $$1 = fof.a(this.e, $$0);
         return this.e[$$1];
      }

      public int b(int $$0) {
         int $$1 = fof.a(this.e, $$0);
         return this.e[$$1] + this.f[$$1].b.length();
      }
   }

   static class b {
      final yl a;
      final String b;
      final xo c;
      final int d;
      final int e;

      public b(yl $$0, String $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
         this.c = xo.b($$1).b($$0);
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
