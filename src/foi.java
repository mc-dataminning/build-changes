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

public class foi extends fne {
   private static final int a = 114;
   private static final int b = 128;
   private static final int c = 192;
   private static final int d = 192;
   private static final xp r = xp.c("book.editTitle");
   private static final xp s = xp.c("book.finalizeWarning");
   private static final ayl u = ayl.forward("_", ym.a.a(n.a));
   private static final ayl v = ayl.forward("_", ym.a.a(n.h));
   private final cmy w;
   private final cuq x;
   private boolean y;
   private boolean z;
   private int A;
   private int B;
   private final List<String> C = Lists.newArrayList();
   private String D = "";
   private final fjz E = new fjz(this::R, this::b, this::m, this::a, $$0x -> $$0x.length() < 1024 && this.p.b($$0x, 114) <= 128);
   private final fjz F = new fjz(() -> this.D, $$0x -> this.D = $$0x, this::m, this::a, $$0x -> $$0x.length() < 16);
   private long G;
   private int H = -1;
   private fpl I;
   private fpl J;
   private fhf K;
   private fhf L;
   private fhf M;
   private fhf N;
   private final bqu O;
   @Nullable
   private foi.a P = foi.a.a;
   private xp Q = xo.a;
   private final xp R;

   public foi(cmy $$0, cuq $$1, bqu $$2) {
      super(fey.a);
      this.w = $$0;
      this.x = $$1;
      this.O = $$2;
      cxy $$3 = $$1.a(km.I);
      if ($$3 != null) {
         $$3.a(ffg.Q().aS()).forEach(this.C::add);
      }

      if (this.C.isEmpty()) {
         this.C.add("");
      }

      this.R = xp.a("book.byAuthor", $$0.af()).a(n.i);
   }

   private void a(String $$0) {
      if (this.m != null) {
         fjz.a(this.m, $$0);
      }
   }

   private String m() {
      return this.m != null ? fjz.b(this.m) : "";
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
   protected void aM_() {
      this.T();
      this.L = this.c((fhf)fhf.a(xp.c("book.signButton"), $$0x -> {
         this.z = true;
         this.J();
      }).a(this.n / 2 - 100, 196, 98, 20).a());
      this.K = this.c((fhf)fhf.a(xo.d, $$0x -> {
         this.m.a(null);
         this.c(false);
      }).a(this.n / 2 + 2, 196, 98, 20).a());
      this.M = this.c((fhf)fhf.a(xp.c("book.finalizeButton"), $$0x -> {
         if (this.z) {
            this.c(true);
            this.m.a(null);
         }
      }).a(this.n / 2 - 100, 196, 98, 20).a());
      this.N = this.c((fhf)fhf.a(xo.e, $$0x -> {
         if (this.z) {
            this.z = false;
         }

         this.J();
      }).a(this.n / 2 + 2, 196, 98, 20).a());
      int $$0 = (this.n - 192) / 2;
      int $$1 = 2;
      this.I = this.c(new fpl($$0 + 116, 159, true, $$0x -> this.I(), true));
      this.J = this.c(new fpl($$0 + 43, 159, false, $$0x -> this.F(), true));
      this.J();
   }

   private void F() {
      if (this.B > 0) {
         this.B--;
      }

      this.J();
      this.U();
   }

   private void I() {
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
      this.M.j = !azv.h(this.D);
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
         int $$1 = this.O == bqu.a ? this.w.gc().k : 40;
         this.m.L().b(new ahp($$1, this.C, $$0 ? Optional.of(this.D.trim()) : Optional.empty()));
      }
   }

   private void L() {
      this.x.b(km.I, new cxy(this.C.stream().map(arw::a).toList()));
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
      } else if (azv.a($$0)) {
         this.E.a(Character.toString($$0));
         this.T();
         return true;
      } else {
         return false;
      }
   }

   private boolean b(int $$0, int $$1, int $$2) {
      if (fne.f($$0)) {
         this.E.d();
         return true;
      } else if (fne.e($$0)) {
         this.E.c();
         return true;
      } else if (fne.d($$0)) {
         this.E.b();
         return true;
      } else if (fne.c($$0)) {
         this.E.a();
         return true;
      } else {
         fjz.a $$3 = fne.s() ? fjz.a.b : fjz.a.a;
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
               this.E.a(1, fne.t(), $$3);
               return true;
            case 263:
               this.E.a(-1, fne.t(), $$3);
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
      this.E.c($$2, fne.t());
   }

   private void P() {
      if (fne.s()) {
         this.E.a(fne.t());
      } else {
         int $$0 = this.E.g();
         int $$1 = this.S().a($$0);
         this.E.c($$1, fne.t());
      }
   }

   private void Q() {
      if (fne.s()) {
         this.E.b(fne.t());
      } else {
         foi.a $$0 = this.S();
         int $$1 = this.E.g();
         int $$2 = $$0.b($$1);
         this.E.c($$2, fne.t());
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
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(null);
      int $$4 = (this.n - 192) / 2;
      int $$5 = 2;
      if (this.z) {
         boolean $$6 = this.A / 6 % 2 == 0;
         ayl $$7 = ayl.composite(ayl.forward(this.D, ym.a), $$6 ? u : v);
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
         foi.a $$12 = this.S();

         for (foi.b $$13 : $$12.f) {
            $$0.a(this.p, $$13.c, $$13.d, $$13.e, -16777216, false);
         }

         this.a($$0, $$12.g);
         this.a($$0, $$12.c, $$12.d);
      }
   }

   @Override
   public void b(fgs $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(foj.r, (this.n - 192) / 2, 2, 0, 0, 192, 192);
   }

   private void a(fgs $$0, foi.c $$1, boolean $$2) {
      if (this.A / 6 % 2 == 0) {
         $$1 = this.b($$1);
         if (!$$2) {
            $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + 9, -16777216);
         } else {
            $$0.a(this.p, "_", $$1.a, $$1.b, 0, false);
         }
      }
   }

   private void a(fgs $$0, gdu[] $$1) {
      for (gdu $$2 : $$1) {
         int $$3 = $$2.a();
         int $$4 = $$2.b();
         int $$5 = $$3 + $$2.c();
         int $$6 = $$4 + $$2.d();
         $$0.a(gdx.F(), $$3, $$4, $$5, $$6, -16776961);
      }
   }

   private foi.c a(foi.c $$0) {
      return new foi.c($$0.a - (this.n - 192) / 2 - 36, $$0.b - 32);
   }

   private foi.c b(foi.c $$0) {
      return new foi.c($$0.a + (this.n - 192) / 2 + 36, $$0.b + 32);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            long $$3 = ac.c();
            foi.a $$4 = this.S();
            int $$5 = $$4.a(this.p, this.a(new foi.c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
               if ($$5 != this.H || $$3 - this.G >= 250L) {
                  this.E.c($$5, fne.t());
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
      this.E.a(ffr.a($$1, -1, $$0, false), ffr.a($$1, 1, $$0, false));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$2 == 0) {
            foi.a $$5 = this.S();
            int $$6 = $$5.a(this.p, this.a(new foi.c((int)$$0, (int)$$1)));
            this.E.c($$6, true);
            this.T();
         }

         return true;
      }
   }

   private foi.a S() {
      if (this.P == null) {
         this.P = this.V();
         this.Q = xp.a("book.pageIndicator", this.B + 1, this.E());
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

   private foi.a V() {
      String $$0 = this.R();
      if ($$0.isEmpty()) {
         return foi.a.a;
      } else {
         int $$1 = this.E.g();
         int $$2 = this.E.h();
         IntList $$3 = new IntArrayList();
         List<foi.b> $$4 = Lists.newArrayList();
         MutableInt $$5 = new MutableInt();
         MutableBoolean $$6 = new MutableBoolean();
         ffr $$7 = this.p.b();
         $$7.a($$0, 114, ym.a, true, ($$5x, $$6x, $$7x) -> {
            int $$8x = $$5.getAndIncrement();
            String $$9x = $$0.substring($$6x, $$7x);
            $$6.setValue($$9x.endsWith("\n"));
            String $$10 = StringUtils.stripEnd($$9x, " \n");
            int $$11 = $$8x * 9;
            foi.c $$12 = this.b(new foi.c(0, $$11));
            $$3.add($$6x);
            $$4.add(new foi.b($$5x, $$10, $$12.a, $$12.b));
         });
         int[] $$8 = $$3.toIntArray();
         boolean $$9 = $$1 == $$0.length();
         foi.c $$10;
         if ($$9 && $$6.isTrue()) {
            $$10 = new foi.c(0, $$4.size() * 9);
         } else {
            int $$11 = a($$8, $$1);
            int $$12 = this.p.b($$0.substring($$8[$$11], $$1));
            $$10 = new foi.c($$12, $$11 * 9);
         }

         List<gdu> $$14 = Lists.newArrayList();
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
                  $$14.add(this.a(new foi.c(0, $$23), new foi.c($$25, $$23 + 9)));
               }

               $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * 9, $$8[$$18]));
            }
         }

         return new foi.a($$0, $$10, $$9, $$8, $$4.toArray(new foi.b[0]), $$14.toArray(new gdu[0]));
      }
   }

   static int a(int[] $$0, int $$1) {
      int $$2 = Arrays.binarySearch($$0, $$1);
      return $$2 < 0 ? -($$2 + 2) : $$2;
   }

   private gdu a(String $$0, ffr $$1, int $$2, int $$3, int $$4, int $$5) {
      String $$6 = $$0.substring($$5, $$2);
      String $$7 = $$0.substring($$5, $$3);
      foi.c $$8 = new foi.c((int)$$1.a($$6), $$4);
      foi.c $$9 = new foi.c((int)$$1.a($$7), $$4 + 9);
      return this.a($$8, $$9);
   }

   private gdu a(foi.c $$0, foi.c $$1) {
      foi.c $$2 = this.b($$0);
      foi.c $$3 = this.b($$1);
      int $$4 = Math.min($$2.a, $$3.a);
      int $$5 = Math.max($$2.a, $$3.a);
      int $$6 = Math.min($$2.b, $$3.b);
      int $$7 = Math.max($$2.b, $$3.b);
      return new gdu($$4, $$6, $$5 - $$4, $$7 - $$6);
   }

   static class a {
      static final foi.a a = new foi.a("", new foi.c(0, 0), true, new int[]{0}, new foi.b[]{new foi.b(ym.a, "", 0, 0)}, new gdu[0]);
      private final String b;
      final foi.c c;
      final boolean d;
      private final int[] e;
      final foi.b[] f;
      final gdu[] g;

      public a(String $$0, foi.c $$1, boolean $$2, int[] $$3, foi.b[] $$4, gdu[] $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }

      public int a(fgq $$0, foi.c $$1) {
         int $$2 = $$1.b / 9;
         if ($$2 < 0) {
            return 0;
         } else if ($$2 >= this.f.length) {
            return this.b.length();
         } else {
            foi.b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
         }
      }

      public int a(int $$0, int $$1) {
         int $$2 = foi.a(this.e, $$0);
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
         int $$1 = foi.a(this.e, $$0);
         return this.e[$$1];
      }

      public int b(int $$0) {
         int $$1 = foi.a(this.e, $$0);
         return this.e[$$1] + this.f[$$1].b.length();
      }
   }

   static class b {
      final ym a;
      final String b;
      final xp c;
      final int d;
      final int e;

      public b(ym $$0, String $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
         this.c = xp.b($$1).b($$0);
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
