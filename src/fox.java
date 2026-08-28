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

public class fox extends fob {
   private static final int a = 114;
   private static final int b = 128;
   private static final int c = 192;
   private static final int r = 192;
   private static final wz s = wz.c("book.editTitle");
   private static final wz u = wz.c("book.finalizeWarning");
   private static final aya v = aya.forward("_", xw.a.a(n.a));
   private static final aya w = aya.forward("_", xw.a.a(n.h));
   private final cmx x;
   private final cuq y;
   private boolean z;
   private boolean A;
   private int B;
   private int C;
   private final List<String> D = Lists.newArrayList();
   private String E = "";
   private final fle F = new fle(this::P, this::b, this::m, this::a, $$0x -> $$0x.length() < 1024 && this.o.b($$0x, 114) <= 128);
   private final fle G = new fle(() -> this.E, $$0x -> this.E = $$0x, this::m, this::a, $$0x -> $$0x.length() < 16);
   private long H;
   private int I = -1;
   private fpz J;
   private fpz K;
   private fik L;
   private fik M;
   private fik N;
   private fik O;
   private final bqq P;
   @Nullable
   private fox.a Q = fox.a.a;
   private wz R = wy.a;
   private final wz S;

   public fox(cmx $$0, cuq $$1, bqq $$2) {
      super(fge.a);
      this.x = $$0;
      this.y = $$1;
      this.P = $$2;
      cya $$3 = $$1.a(kq.I);
      if ($$3 != null) {
         $$3.a(fgm.Q().aQ()).forEach(this.D::add);
      }

      if (this.D.isEmpty()) {
         this.D.add("");
      }

      this.S = wz.a("book.byAuthor", $$0.ah()).a(n.i);
   }

   private void a(String $$0) {
      if (this.l != null) {
         fle.a(this.l, $$0);
      }
   }

   private String m() {
      return this.l != null ? fle.b(this.l) : "";
   }

   private int C() {
      return this.D.size();
   }

   @Override
   public void e() {
      super.e();
      this.B++;
   }

   @Override
   protected void aT_() {
      this.R();
      this.M = this.c((fik)fik.a(wz.c("book.signButton"), $$0x -> {
         this.A = true;
         this.F();
      }).a(this.m / 2 - 100, 196, 98, 20).a());
      this.L = this.c((fik)fik.a(wy.d, $$0x -> {
         this.l.a(null);
         this.c(false);
      }).a(this.m / 2 + 2, 196, 98, 20).a());
      this.N = this.c((fik)fik.a(wz.c("book.finalizeButton"), $$0x -> {
         if (this.A) {
            this.c(true);
            this.l.a(null);
         }
      }).a(this.m / 2 - 100, 196, 98, 20).a());
      this.O = this.c((fik)fik.a(wy.e, $$0x -> {
         if (this.A) {
            this.A = false;
         }

         this.F();
      }).a(this.m / 2 + 2, 196, 98, 20).a());
      int $$0 = (this.m - 192) / 2;
      int $$1 = 2;
      this.J = this.c(new fpz($$0 + 116, 159, true, $$0x -> this.E(), true));
      this.K = this.c(new fpz($$0 + 43, 159, false, $$0x -> this.D(), true));
      this.F();
   }

   private void D() {
      if (this.C > 0) {
         this.C--;
      }

      this.F();
      this.S();
   }

   private void E() {
      if (this.C < this.C() - 1) {
         this.C++;
      } else {
         this.K();
         if (this.C < this.C() - 1) {
            this.C++;
         }
      }

      this.F();
      this.S();
   }

   private void F() {
      this.K.k = !this.A && this.C > 0;
      this.J.k = !this.A;
      this.L.k = !this.A;
      this.M.k = !this.A;
      this.O.k = this.A;
      this.N.k = this.A;
      this.N.j = !azl.h(this.E);
   }

   private void G() {
      ListIterator<String> $$0 = this.D.listIterator(this.D.size());

      while ($$0.hasPrevious() && $$0.previous().isEmpty()) {
         $$0.remove();
      }
   }

   private void c(boolean $$0) {
      if (this.z) {
         this.G();
         this.J();
         int $$1 = this.P == bqq.a ? this.x.fZ().k : 40;
         this.l.L().b(new ahb($$1, this.D, $$0 ? Optional.of(this.E.trim()) : Optional.empty()));
      }
   }

   private void J() {
      this.y.b(kq.I, new cya(this.D.stream().map(arl::a).toList()));
   }

   private void K() {
      if (this.C() < 100) {
         this.D.add("");
         this.z = true;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.A) {
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
      } else if (this.A) {
         boolean $$2 = this.G.a($$0);
         if ($$2) {
            this.F();
            this.z = true;
            return true;
         } else {
            return false;
         }
      } else if (azl.a($$0)) {
         this.F.a(Character.toString($$0));
         this.R();
         return true;
      } else {
         return false;
      }
   }

   private boolean b(int $$0, int $$1, int $$2) {
      if (fob.f($$0)) {
         this.F.d();
         return true;
      } else if (fob.e($$0)) {
         this.F.c();
         return true;
      } else if (fob.d($$0)) {
         this.F.b();
         return true;
      } else if (fob.c($$0)) {
         this.F.a();
         return true;
      } else {
         fle.a $$3 = fob.r() ? fle.a.b : fle.a.a;
         switch ($$0) {
            case 257:
            case 335:
               this.F.a("\n");
               return true;
            case 259:
               this.F.a(-1, $$3);
               return true;
            case 261:
               this.F.a(1, $$3);
               return true;
            case 262:
               this.F.a(1, fob.s(), $$3);
               return true;
            case 263:
               this.F.a(-1, fob.s(), $$3);
               return true;
            case 264:
               this.M();
               return true;
            case 265:
               this.L();
               return true;
            case 266:
               this.K.b();
               return true;
            case 267:
               this.J.b();
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
      int $$1 = this.F.g();
      int $$2 = this.Q().a($$1, $$0);
      this.F.c($$2, fob.s());
   }

   private void N() {
      if (fob.r()) {
         this.F.a(fob.s());
      } else {
         int $$0 = this.F.g();
         int $$1 = this.Q().a($$0);
         this.F.c($$1, fob.s());
      }
   }

   private void O() {
      if (fob.r()) {
         this.F.b(fob.s());
      } else {
         fox.a $$0 = this.Q();
         int $$1 = this.F.g();
         int $$2 = $$0.b($$1);
         this.F.c($$2, fob.s());
      }
   }

   private boolean d(int $$0, int $$1, int $$2) {
      switch ($$0) {
         case 257:
         case 335:
            if (!this.E.isEmpty()) {
               this.c(true);
               this.l.a(null);
            }

            return true;
         case 259:
            this.G.e(-1);
            this.F();
            this.z = true;
            return true;
         default:
            return false;
      }
   }

   private String P() {
      return this.C >= 0 && this.C < this.D.size() ? this.D.get(this.C) : "";
   }

   private void b(String $$0) {
      if (this.C >= 0 && this.C < this.D.size()) {
         this.D.set(this.C, $$0);
         this.z = true;
         this.R();
      }
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(null);
      int $$4 = (this.m - 192) / 2;
      int $$5 = 2;
      if (this.A) {
         boolean $$6 = this.B / 6 % 2 == 0;
         aya $$7 = aya.composite(aya.forward(this.E, xw.a), $$6 ? v : w);
         int $$8 = this.o.a(s);
         $$0.a(this.o, s, $$4 + 36 + (114 - $$8) / 2, 34, 0, false);
         int $$9 = this.o.a($$7);
         $$0.a(this.o, $$7, $$4 + 36 + (114 - $$9) / 2, 50, 0, false);
         int $$10 = this.o.a(this.S);
         $$0.a(this.o, this.S, $$4 + 36 + (114 - $$10) / 2, 60, 0, false);
         $$0.a(this.o, u, $$4 + 36, 82, 114, 0);
      } else {
         int $$11 = this.o.a(this.R);
         $$0.a(this.o, this.R, $$4 - $$11 + 192 - 44, 18, 0, false);
         fox.a $$12 = this.Q();

         for (fox.b $$13 : $$12.f) {
            $$0.a(this.o, $$13.c, $$13.d, $$13.e, -16777216, false);
         }

         this.a($$0, $$12.g);
         this.a($$0, $$12.c, $$12.d);
      }
   }

   @Override
   public void b(fhx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(foy.s, (this.m - 192) / 2, 2, 0, 0, 192, 192);
   }

   private void a(fhx $$0, fox.c $$1, boolean $$2) {
      if (this.B / 6 % 2 == 0) {
         $$1 = this.b($$1);
         if (!$$2) {
            $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + 9, -16777216);
         } else {
            $$0.a(this.o, "_", $$1.a, $$1.b, 0, false);
         }
      }
   }

   private void a(fhx $$0, gfc[] $$1) {
      for (gfc $$2 : $$1) {
         int $$3 = $$2.a();
         int $$4 = $$2.b();
         int $$5 = $$3 + $$2.c();
         int $$6 = $$4 + $$2.d();
         $$0.a(gff.F(), $$3, $$4, $$5, $$6, -16776961);
      }
   }

   private fox.c a(fox.c $$0) {
      return new fox.c($$0.a - (this.m - 192) / 2 - 36, $$0.b - 32);
   }

   private fox.c b(fox.c $$0) {
      return new fox.c($$0.a + (this.m - 192) / 2 + 36, $$0.b + 32);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            long $$3 = ad.c();
            fox.a $$4 = this.Q();
            int $$5 = $$4.a(this.o, this.a(new fox.c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
               if ($$5 != this.I || $$3 - this.H >= 250L) {
                  this.F.c($$5, fob.s());
               } else if (!this.F.i()) {
                  this.b($$5);
               } else {
                  this.F.d();
               }

               this.R();
            }

            this.I = $$5;
            this.H = $$3;
         }

         return true;
      }
   }

   private void b(int $$0) {
      String $$1 = this.P();
      this.F.a(fgx.a($$1, -1, $$0, false), fgx.a($$1, 1, $$0, false));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$2 == 0) {
            fox.a $$5 = this.Q();
            int $$6 = $$5.a(this.o, this.a(new fox.c((int)$$0, (int)$$1)));
            this.F.c($$6, true);
            this.R();
         }

         return true;
      }
   }

   private fox.a Q() {
      if (this.Q == null) {
         this.Q = this.T();
         this.R = wz.a("book.pageIndicator", this.C + 1, this.C());
      }

      return this.Q;
   }

   private void R() {
      this.Q = null;
   }

   private void S() {
      this.F.f();
      this.R();
   }

   private fox.a T() {
      String $$0 = this.P();
      if ($$0.isEmpty()) {
         return fox.a.a;
      } else {
         int $$1 = this.F.g();
         int $$2 = this.F.h();
         IntList $$3 = new IntArrayList();
         List<fox.b> $$4 = Lists.newArrayList();
         MutableInt $$5 = new MutableInt();
         MutableBoolean $$6 = new MutableBoolean();
         fgx $$7 = this.o.b();
         $$7.a($$0, 114, xw.a, true, ($$5x, $$6x, $$7x) -> {
            int $$8x = $$5.getAndIncrement();
            String $$9x = $$0.substring($$6x, $$7x);
            $$6.setValue($$9x.endsWith("\n"));
            String $$10 = StringUtils.stripEnd($$9x, " \n");
            int $$11 = $$8x * 9;
            fox.c $$12 = this.b(new fox.c(0, $$11));
            $$3.add($$6x);
            $$4.add(new fox.b($$5x, $$10, $$12.a, $$12.b));
         });
         int[] $$8 = $$3.toIntArray();
         boolean $$9 = $$1 == $$0.length();
         fox.c $$10;
         if ($$9 && $$6.isTrue()) {
            $$10 = new fox.c(0, $$4.size() * 9);
         } else {
            int $$11 = a($$8, $$1);
            int $$12 = this.o.b($$0.substring($$8[$$11], $$1));
            $$10 = new fox.c($$12, $$11 * 9);
         }

         List<gfc> $$14 = Lists.newArrayList();
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
                  $$14.add(this.a(new fox.c(0, $$23), new fox.c($$25, $$23 + 9)));
               }

               $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * 9, $$8[$$18]));
            }
         }

         return new fox.a($$0, $$10, $$9, $$8, $$4.toArray(new fox.b[0]), $$14.toArray(new gfc[0]));
      }
   }

   static int a(int[] $$0, int $$1) {
      int $$2 = Arrays.binarySearch($$0, $$1);
      return $$2 < 0 ? -($$2 + 2) : $$2;
   }

   private gfc a(String $$0, fgx $$1, int $$2, int $$3, int $$4, int $$5) {
      String $$6 = $$0.substring($$5, $$2);
      String $$7 = $$0.substring($$5, $$3);
      fox.c $$8 = new fox.c((int)$$1.a($$6), $$4);
      fox.c $$9 = new fox.c((int)$$1.a($$7), $$4 + 9);
      return this.a($$8, $$9);
   }

   private gfc a(fox.c $$0, fox.c $$1) {
      fox.c $$2 = this.b($$0);
      fox.c $$3 = this.b($$1);
      int $$4 = Math.min($$2.a, $$3.a);
      int $$5 = Math.max($$2.a, $$3.a);
      int $$6 = Math.min($$2.b, $$3.b);
      int $$7 = Math.max($$2.b, $$3.b);
      return new gfc($$4, $$6, $$5 - $$4, $$7 - $$6);
   }

   static class a {
      static final fox.a a = new fox.a("", new fox.c(0, 0), true, new int[]{0}, new fox.b[]{new fox.b(xw.a, "", 0, 0)}, new gfc[0]);
      private final String b;
      final fox.c c;
      final boolean d;
      private final int[] e;
      final fox.b[] f;
      final gfc[] g;

      public a(String $$0, fox.c $$1, boolean $$2, int[] $$3, fox.b[] $$4, gfc[] $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }

      public int a(fhv $$0, fox.c $$1) {
         int $$2 = $$1.b / 9;
         if ($$2 < 0) {
            return 0;
         } else if ($$2 >= this.f.length) {
            return this.b.length();
         } else {
            fox.b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
         }
      }

      public int a(int $$0, int $$1) {
         int $$2 = fox.a(this.e, $$0);
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
         int $$1 = fox.a(this.e, $$0);
         return this.e[$$1];
      }

      public int b(int $$0) {
         int $$1 = fox.a(this.e, $$0);
         return this.e[$$1] + this.f[$$1].b.length();
      }
   }

   static class b {
      final xw a;
      final String b;
      final wz c;
      final int d;
      final int e;

      public b(xw $$0, String $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
         this.c = wz.b($$1).b($$0);
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
