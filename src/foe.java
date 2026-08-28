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

public class foe extends fnj {
   private static final int a = 114;
   private static final int b = 128;
   private static final int c = 192;
   private static final int q = 192;
   private static final wu r = wu.c("book.editTitle");
   private static final wu s = wu.c("book.finalizeWarning");
   private static final axs u = axs.forward("_", xr.a.a(n.a));
   private static final axs v = axs.forward("_", xr.a.a(n.h));
   private final cmk w;
   private final cuc x;
   private boolean y;
   private boolean z;
   private int A;
   private int B;
   private final List<String> C = Lists.newArrayList();
   private String D = "";
   private final fkm E = new fkm(this::R, this::b, this::m, this::a, $$0x -> $$0x.length() < 1024 && this.o.b($$0x, 114) <= 128);
   private final fkm F = new fkm(() -> this.D, $$0x -> this.D = $$0x, this::m, this::a, $$0x -> $$0x.length() < 16);
   private long G;
   private int H = -1;
   private fph I;
   private fph J;
   private fhs K;
   private fhs L;
   private fhs M;
   private fhs N;
   private final bqf O;
   @Nullable
   private foe.a P = foe.a.a;
   private wu Q = wt.a;
   private final wu R;

   public foe(cmk $$0, cuc $$1, bqf $$2) {
      super(ffl.a);
      this.w = $$0;
      this.x = $$1;
      this.O = $$2;
      cxj $$3 = $$1.a(kn.I);
      if ($$3 != null) {
         $$3.a(fft.Q().aS()).forEach(this.C::add);
      }

      if (this.C.isEmpty()) {
         this.C.add("");
      }

      this.R = wu.a("book.byAuthor", $$0.ag()).a(n.i);
   }

   private void a(String $$0) {
      if (this.l != null) {
         fkm.a(this.l, $$0);
      }
   }

   private String m() {
      return this.l != null ? fkm.b(this.l) : "";
   }

   private int E() {
      return this.C.size();
   }

   @Override
   public void e() {
      super.e();
      this.A++;
   }

   @Override
   protected void aP_() {
      this.T();
      this.L = this.c((fhs)fhs.a(wu.c("book.signButton"), $$0x -> {
         this.z = true;
         this.J();
      }).a(this.m / 2 - 100, 196, 98, 20).a());
      this.K = this.c((fhs)fhs.a(wt.d, $$0x -> {
         this.l.a(null);
         this.c(false);
      }).a(this.m / 2 + 2, 196, 98, 20).a());
      this.M = this.c((fhs)fhs.a(wu.c("book.finalizeButton"), $$0x -> {
         if (this.z) {
            this.c(true);
            this.l.a(null);
         }
      }).a(this.m / 2 - 100, 196, 98, 20).a());
      this.N = this.c((fhs)fhs.a(wt.e, $$0x -> {
         if (this.z) {
            this.z = false;
         }

         this.J();
      }).a(this.m / 2 + 2, 196, 98, 20).a());
      int $$0 = (this.m - 192) / 2;
      int $$1 = 2;
      this.I = this.c(new fph($$0 + 116, 159, true, $$0x -> this.G(), true));
      this.J = this.c(new fph($$0 + 43, 159, false, $$0x -> this.F(), true));
      this.J();
   }

   private void F() {
      if (this.B > 0) {
         this.B--;
      }

      this.J();
      this.U();
   }

   private void G() {
      if (this.B < this.E() - 1) {
         this.B++;
      } else {
         this.M();
         if (this.B < this.E() - 1) {
            this.B++;
         }
      }

      this.J();
      this.U();
   }

   private void J() {
      this.J.k = !this.z && this.B > 0;
      this.I.k = !this.z;
      this.K.k = !this.z;
      this.L.k = !this.z;
      this.N.k = this.z;
      this.M.k = this.z;
      this.M.j = !azd.h(this.D);
   }

   private void K() {
      ListIterator<String> $$0 = this.C.listIterator(this.C.size());

      while ($$0.hasPrevious() && $$0.previous().isEmpty()) {
         $$0.remove();
      }
   }

   private void c(boolean $$0) {
      if (this.y) {
         this.K();
         this.L();
         int $$1 = this.O == bqf.a ? this.w.fZ().k : 40;
         this.l.L().b(new agu($$1, this.C, $$0 ? Optional.of(this.D.trim()) : Optional.empty()));
      }
   }

   private void L() {
      this.x.b(kn.I, new cxj(this.C.stream().map(ard::a).toList()));
   }

   private void M() {
      if (this.E() < 100) {
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
            this.T();
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
            this.J();
            this.y = true;
            return true;
         } else {
            return false;
         }
      } else if (azd.a($$0)) {
         this.E.a(Character.toString($$0));
         this.T();
         return true;
      } else {
         return false;
      }
   }

   private boolean b(int $$0, int $$1, int $$2) {
      if (fnj.f($$0)) {
         this.E.d();
         return true;
      } else if (fnj.e($$0)) {
         this.E.c();
         return true;
      } else if (fnj.d($$0)) {
         this.E.b();
         return true;
      } else if (fnj.c($$0)) {
         this.E.a();
         return true;
      } else {
         fkm.a $$3 = fnj.s() ? fkm.a.b : fkm.a.a;
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
               this.E.a(1, fnj.t(), $$3);
               return true;
            case 263:
               this.E.a(-1, fnj.t(), $$3);
               return true;
            case 264:
               this.O();
               return true;
            case 265:
               this.N();
               return true;
            case 266:
               this.J.b();
               return true;
            case 267:
               this.I.b();
               return true;
            case 268:
               this.P();
               return true;
            case 269:
               this.Q();
               return true;
            default:
               return false;
         }
      }
   }

   private void N() {
      this.a(-1);
   }

   private void O() {
      this.a(1);
   }

   private void a(int $$0) {
      int $$1 = this.E.g();
      int $$2 = this.S().a($$1, $$0);
      this.E.c($$2, fnj.t());
   }

   private void P() {
      if (fnj.s()) {
         this.E.a(fnj.t());
      } else {
         int $$0 = this.E.g();
         int $$1 = this.S().a($$0);
         this.E.c($$1, fnj.t());
      }
   }

   private void Q() {
      if (fnj.s()) {
         this.E.b(fnj.t());
      } else {
         foe.a $$0 = this.S();
         int $$1 = this.E.g();
         int $$2 = $$0.b($$1);
         this.E.c($$2, fnj.t());
      }
   }

   private boolean d(int $$0, int $$1, int $$2) {
      switch ($$0) {
         case 257:
         case 335:
            if (!this.D.isEmpty()) {
               this.c(true);
               this.l.a(null);
            }

            return true;
         case 259:
            this.F.e(-1);
            this.J();
            this.y = true;
            return true;
         default:
            return false;
      }
   }

   private String R() {
      return this.B >= 0 && this.B < this.C.size() ? this.C.get(this.B) : "";
   }

   private void b(String $$0) {
      if (this.B >= 0 && this.B < this.C.size()) {
         this.C.set(this.B, $$0);
         this.y = true;
         this.T();
      }
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(null);
      int $$4 = (this.m - 192) / 2;
      int $$5 = 2;
      if (this.z) {
         boolean $$6 = this.A / 6 % 2 == 0;
         axs $$7 = axs.composite(axs.forward(this.D, xr.a), $$6 ? u : v);
         int $$8 = this.o.a(r);
         $$0.a(this.o, r, $$4 + 36 + (114 - $$8) / 2, 34, 0, false);
         int $$9 = this.o.a($$7);
         $$0.a(this.o, $$7, $$4 + 36 + (114 - $$9) / 2, 50, 0, false);
         int $$10 = this.o.a(this.R);
         $$0.a(this.o, this.R, $$4 + 36 + (114 - $$10) / 2, 60, 0, false);
         $$0.a(this.o, s, $$4 + 36, 82, 114, 0);
      } else {
         int $$11 = this.o.a(this.Q);
         $$0.a(this.o, this.Q, $$4 - $$11 + 192 - 44, 18, 0, false);
         foe.a $$12 = this.S();

         for (foe.b $$13 : $$12.f) {
            $$0.a(this.o, $$13.c, $$13.d, $$13.e, -16777216, false);
         }

         this.a($$0, $$12.g);
         this.a($$0, $$12.c, $$12.d);
      }
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(fof.r, (this.m - 192) / 2, 2, 0, 0, 192, 192);
   }

   private void a(fhf $$0, foe.c $$1, boolean $$2) {
      if (this.A / 6 % 2 == 0) {
         $$1 = this.b($$1);
         if (!$$2) {
            $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + 9, -16777216);
         } else {
            $$0.a(this.o, "_", $$1.a, $$1.b, 0, false);
         }
      }
   }

   private void a(fhf $$0, gei[] $$1) {
      for (gei $$2 : $$1) {
         int $$3 = $$2.a();
         int $$4 = $$2.b();
         int $$5 = $$3 + $$2.c();
         int $$6 = $$4 + $$2.d();
         $$0.a(gel.F(), $$3, $$4, $$5, $$6, -16776961);
      }
   }

   private foe.c a(foe.c $$0) {
      return new foe.c($$0.a - (this.m - 192) / 2 - 36, $$0.b - 32);
   }

   private foe.c b(foe.c $$0) {
      return new foe.c($$0.a + (this.m - 192) / 2 + 36, $$0.b + 32);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            long $$3 = ac.c();
            foe.a $$4 = this.S();
            int $$5 = $$4.a(this.o, this.a(new foe.c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
               if ($$5 != this.H || $$3 - this.G >= 250L) {
                  this.E.c($$5, fnj.t());
               } else if (!this.E.i()) {
                  this.b($$5);
               } else {
                  this.E.d();
               }

               this.T();
            }

            this.H = $$5;
            this.G = $$3;
         }

         return true;
      }
   }

   private void b(int $$0) {
      String $$1 = this.R();
      this.E.a(fge.a($$1, -1, $$0, false), fge.a($$1, 1, $$0, false));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$2 == 0) {
            foe.a $$5 = this.S();
            int $$6 = $$5.a(this.o, this.a(new foe.c((int)$$0, (int)$$1)));
            this.E.c($$6, true);
            this.T();
         }

         return true;
      }
   }

   private foe.a S() {
      if (this.P == null) {
         this.P = this.V();
         this.Q = wu.a("book.pageIndicator", this.B + 1, this.E());
      }

      return this.P;
   }

   private void T() {
      this.P = null;
   }

   private void U() {
      this.E.f();
      this.T();
   }

   private foe.a V() {
      String $$0 = this.R();
      if ($$0.isEmpty()) {
         return foe.a.a;
      } else {
         int $$1 = this.E.g();
         int $$2 = this.E.h();
         IntList $$3 = new IntArrayList();
         List<foe.b> $$4 = Lists.newArrayList();
         MutableInt $$5 = new MutableInt();
         MutableBoolean $$6 = new MutableBoolean();
         fge $$7 = this.o.b();
         $$7.a($$0, 114, xr.a, true, ($$5x, $$6x, $$7x) -> {
            int $$8x = $$5.getAndIncrement();
            String $$9x = $$0.substring($$6x, $$7x);
            $$6.setValue($$9x.endsWith("\n"));
            String $$10 = StringUtils.stripEnd($$9x, " \n");
            int $$11 = $$8x * 9;
            foe.c $$12 = this.b(new foe.c(0, $$11));
            $$3.add($$6x);
            $$4.add(new foe.b($$5x, $$10, $$12.a, $$12.b));
         });
         int[] $$8 = $$3.toIntArray();
         boolean $$9 = $$1 == $$0.length();
         foe.c $$10;
         if ($$9 && $$6.isTrue()) {
            $$10 = new foe.c(0, $$4.size() * 9);
         } else {
            int $$11 = a($$8, $$1);
            int $$12 = this.o.b($$0.substring($$8[$$11], $$1));
            $$10 = new foe.c($$12, $$11 * 9);
         }

         List<gei> $$14 = Lists.newArrayList();
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
                  $$14.add(this.a(new foe.c(0, $$23), new foe.c($$25, $$23 + 9)));
               }

               $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * 9, $$8[$$18]));
            }
         }

         return new foe.a($$0, $$10, $$9, $$8, $$4.toArray(new foe.b[0]), $$14.toArray(new gei[0]));
      }
   }

   static int a(int[] $$0, int $$1) {
      int $$2 = Arrays.binarySearch($$0, $$1);
      return $$2 < 0 ? -($$2 + 2) : $$2;
   }

   private gei a(String $$0, fge $$1, int $$2, int $$3, int $$4, int $$5) {
      String $$6 = $$0.substring($$5, $$2);
      String $$7 = $$0.substring($$5, $$3);
      foe.c $$8 = new foe.c((int)$$1.a($$6), $$4);
      foe.c $$9 = new foe.c((int)$$1.a($$7), $$4 + 9);
      return this.a($$8, $$9);
   }

   private gei a(foe.c $$0, foe.c $$1) {
      foe.c $$2 = this.b($$0);
      foe.c $$3 = this.b($$1);
      int $$4 = Math.min($$2.a, $$3.a);
      int $$5 = Math.max($$2.a, $$3.a);
      int $$6 = Math.min($$2.b, $$3.b);
      int $$7 = Math.max($$2.b, $$3.b);
      return new gei($$4, $$6, $$5 - $$4, $$7 - $$6);
   }

   static class a {
      static final foe.a a = new foe.a("", new foe.c(0, 0), true, new int[]{0}, new foe.b[]{new foe.b(xr.a, "", 0, 0)}, new gei[0]);
      private final String b;
      final foe.c c;
      final boolean d;
      private final int[] e;
      final foe.b[] f;
      final gei[] g;

      public a(String $$0, foe.c $$1, boolean $$2, int[] $$3, foe.b[] $$4, gei[] $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }

      public int a(fhd $$0, foe.c $$1) {
         int $$2 = $$1.b / 9;
         if ($$2 < 0) {
            return 0;
         } else if ($$2 >= this.f.length) {
            return this.b.length();
         } else {
            foe.b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
         }
      }

      public int a(int $$0, int $$1) {
         int $$2 = foe.a(this.e, $$0);
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
         int $$1 = foe.a(this.e, $$0);
         return this.e[$$1];
      }

      public int b(int $$0) {
         int $$1 = foe.a(this.e, $$0);
         return this.e[$$1] + this.f[$$1].b.length();
      }
   }

   static class b {
      final xr a;
      final String b;
      final wu c;
      final int d;
      final int e;

      public b(xr $$0, String $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
         this.c = wu.b($$1).b($$0);
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
