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

public class fdy extends fct {
   private static final int a = 114;
   private static final int b = 128;
   private static final int c = 192;
   private static final int k = 192;
   private static final vd l = vd.c("book.editTitle");
   private static final vd m = vd.c("book.finalizeWarning");
   private static final atu n = atu.forward("_", wa.a.a(n.a));
   private static final atu o = atu.forward("_", wa.a.a(n.h));
   private final cfb p;
   private final cmr q;
   private boolean r;
   private boolean t;
   private int u;
   private int v;
   private final List<String> w = Lists.newArrayList();
   private String x = "";
   private final ezq y = new ezq(this::O, this::b, this::n, this::a, $$0x -> $$0x.length() < 1024 && this.i.b($$0x, 114) <= 128);
   private final ezq z = new ezq(() -> this.x, $$0x -> this.x = $$0x, this::n, this::a, $$0x -> $$0x.length() < 16);
   private long A;
   private int B = -1;
   private ffa C;
   private ffa D;
   private ewy E;
   private ewy F;
   private ewy G;
   private ewy H;
   private final bju I;
   @Nullable
   private fdy.a J = fdy.a.a;
   private vd K = vc.a;
   private final vd L;

   public fdy(cfb $$0, cmr $$1, bju $$2) {
      super(eus.a);
      this.p = $$0;
      this.q = $$1;
      this.I = $$2;
      sl $$3 = $$1.v();
      if ($$3 != null) {
         fdz.a($$3, this.w::add);
      }

      if (this.w.isEmpty()) {
         this.w.add("");
      }

      this.L = vd.a("book.byAuthor", $$0.ad()).a(n.i);
   }

   private void a(String $$0) {
      if (this.f != null) {
         ezq.a(this.f, $$0);
      }
   }

   private String n() {
      return this.f != null ? ezq.b(this.f) : "";
   }

   private int C() {
      return this.w.size();
   }

   @Override
   public void d() {
      super.d();
      this.u++;
   }

   @Override
   protected void aN_() {
      this.Q();
      this.F = this.d((ewy)ewy.a(vd.c("book.signButton"), $$0x -> {
         this.t = true;
         this.H();
      }).a(this.g / 2 - 100, 196, 98, 20).a());
      this.E = this.d((ewy)ewy.a(vc.d, $$0x -> {
         this.f.a(null);
         this.c(false);
      }).a(this.g / 2 + 2, 196, 98, 20).a());
      this.G = this.d((ewy)ewy.a(vd.c("book.finalizeButton"), $$0x -> {
         if (this.t) {
            this.c(true);
            this.f.a(null);
         }
      }).a(this.g / 2 - 100, 196, 98, 20).a());
      this.H = this.d((ewy)ewy.a(vc.e, $$0x -> {
         if (this.t) {
            this.t = false;
         }

         this.H();
      }).a(this.g / 2 + 2, 196, 98, 20).a());
      int $$0 = (this.g - 192) / 2;
      int $$1 = 2;
      this.C = this.d(new ffa($$0 + 116, 159, true, $$0x -> this.E(), true));
      this.D = this.d(new ffa($$0 + 43, 159, false, $$0x -> this.D(), true));
      this.H();
   }

   private void D() {
      if (this.v > 0) {
         this.v--;
      }

      this.H();
      this.R();
   }

   private void E() {
      if (this.v < this.C() - 1) {
         this.v++;
      } else {
         this.J();
         if (this.v < this.C() - 1) {
            this.v++;
         }
      }

      this.H();
      this.R();
   }

   private void H() {
      this.D.k = !this.t && this.v > 0;
      this.C.k = !this.t;
      this.E.k = !this.t;
      this.F.k = !this.t;
      this.H.k = this.t;
      this.G.k = this.t;
      this.G.j = !ac.b(this.x);
   }

   private void I() {
      ListIterator<String> $$0 = this.w.listIterator(this.w.size());

      while ($$0.hasPrevious() && $$0.previous().isEmpty()) {
         $$0.remove();
      }
   }

   private void c(boolean $$0) {
      if (this.r) {
         this.I();
         this.e($$0);
         int $$1 = this.I == bju.a ? this.p.fS().l : 40;
         this.f.I().b(new ady($$1, this.w, $$0 ? Optional.of(this.x.trim()) : Optional.empty()));
      }
   }

   private void e(boolean $$0) {
      sr $$1 = new sr();
      this.w.stream().map(tg::a).forEach($$1::add);
      if (!this.w.isEmpty()) {
         this.q.a("pages", $$1);
      }

      if ($$0) {
         this.q.a("author", tg.a(this.p.fR().getName()));
         this.q.a("title", tg.a(this.x.trim()));
      }
   }

   private void J() {
      if (this.C() < 100) {
         this.w.add("");
         this.r = true;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.t) {
         return this.d($$0, $$1, $$2);
      } else {
         boolean $$3 = this.c($$0, $$1, $$2);
         if ($$3) {
            this.Q();
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
      } else if (this.t) {
         boolean $$2 = this.z.a($$0);
         if ($$2) {
            this.H();
            this.r = true;
            return true;
         } else {
            return false;
         }
      } else if (aa.a($$0)) {
         this.y.a(Character.toString($$0));
         this.Q();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(int $$0, int $$1, int $$2) {
      if (fct.f($$0)) {
         this.y.d();
         return true;
      } else if (fct.e($$0)) {
         this.y.c();
         return true;
      } else if (fct.d($$0)) {
         this.y.b();
         return true;
      } else if (fct.c($$0)) {
         this.y.a();
         return true;
      } else {
         ezq.a $$3 = fct.r() ? ezq.a.b : ezq.a.a;
         switch ($$0) {
            case 257:
            case 335:
               this.y.a("\n");
               return true;
            case 259:
               this.y.a(-1, $$3);
               return true;
            case 261:
               this.y.a(1, $$3);
               return true;
            case 262:
               this.y.a(1, fct.s(), $$3);
               return true;
            case 263:
               this.y.a(-1, fct.s(), $$3);
               return true;
            case 264:
               this.L();
               return true;
            case 265:
               this.K();
               return true;
            case 266:
               this.D.b();
               return true;
            case 267:
               this.C.b();
               return true;
            case 268:
               this.M();
               return true;
            case 269:
               this.N();
               return true;
            default:
               return false;
         }
      }
   }

   private void K() {
      this.a(-1);
   }

   private void L() {
      this.a(1);
   }

   private void a(int $$0) {
      int $$1 = this.y.g();
      int $$2 = this.P().a($$1, $$0);
      this.y.c($$2, fct.s());
   }

   private void M() {
      if (fct.r()) {
         this.y.a(fct.s());
      } else {
         int $$0 = this.y.g();
         int $$1 = this.P().a($$0);
         this.y.c($$1, fct.s());
      }
   }

   private void N() {
      if (fct.r()) {
         this.y.b(fct.s());
      } else {
         fdy.a $$0 = this.P();
         int $$1 = this.y.g();
         int $$2 = $$0.b($$1);
         this.y.c($$2, fct.s());
      }
   }

   private boolean d(int $$0, int $$1, int $$2) {
      switch ($$0) {
         case 257:
         case 335:
            if (!this.x.isEmpty()) {
               this.c(true);
               this.f.a(null);
            }

            return true;
         case 259:
            this.z.e(-1);
            this.H();
            this.r = true;
            return true;
         default:
            return false;
      }
   }

   private String O() {
      return this.v >= 0 && this.v < this.w.size() ? this.w.get(this.v) : "";
   }

   private void b(String $$0) {
      if (this.v >= 0 && this.v < this.w.size()) {
         this.w.set(this.v, $$0);
         this.r = true;
         this.Q();
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(null);
      int $$4 = (this.g - 192) / 2;
      int $$5 = 2;
      if (this.t) {
         boolean $$6 = this.u / 6 % 2 == 0;
         atu $$7 = atu.composite(atu.forward(this.x, wa.a), $$6 ? n : o);
         int $$8 = this.i.a(l);
         $$0.a(this.i, l, $$4 + 36 + (114 - $$8) / 2, 34, 0, false);
         int $$9 = this.i.a($$7);
         $$0.a(this.i, $$7, $$4 + 36 + (114 - $$9) / 2, 50, 0, false);
         int $$10 = this.i.a(this.L);
         $$0.a(this.i, this.L, $$4 + 36 + (114 - $$10) / 2, 60, 0, false);
         $$0.a(this.i, m, $$4 + 36, 82, 114, 0);
      } else {
         int $$11 = this.i.a(this.K);
         $$0.a(this.i, this.K, $$4 - $$11 + 192 - 44, 18, 0, false);
         fdy.a $$12 = this.P();

         for (fdy.b $$13 : $$12.f) {
            $$0.a(this.i, $$13.c, $$13.d, $$13.e, -16777216, false);
         }

         this.a($$0, $$12.g);
         this.a($$0, $$12.c, $$12.d);
      }
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(fdz.l, (this.g - 192) / 2, 2, 0, 0, 192, 192);
   }

   private void a(ewm $$0, fdy.c $$1, boolean $$2) {
      if (this.u / 6 % 2 == 0) {
         $$1 = this.b($$1);
         if (!$$2) {
            $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + 9, -16777216);
         } else {
            $$0.a(this.i, "_", $$1.a, $$1.b, 0, false);
         }
      }
   }

   private void a(ewm $$0, fte[] $$1) {
      for (fte $$2 : $$1) {
         int $$3 = $$2.a();
         int $$4 = $$2.b();
         int $$5 = $$3 + $$2.c();
         int $$6 = $$4 + $$2.d();
         $$0.a(fth.D(), $$3, $$4, $$5, $$6, -16776961);
      }
   }

   private fdy.c a(fdy.c $$0) {
      return new fdy.c($$0.a - (this.g - 192) / 2 - 36, $$0.b - 32);
   }

   private fdy.c b(fdy.c $$0) {
      return new fdy.c($$0.a + (this.g - 192) / 2 + 36, $$0.b + 32);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            long $$3 = ac.b();
            fdy.a $$4 = this.P();
            int $$5 = $$4.a(this.i, this.a(new fdy.c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
               if ($$5 != this.B || $$3 - this.A >= 250L) {
                  this.y.c($$5, fct.s());
               } else if (!this.y.i()) {
                  this.b($$5);
               } else {
                  this.y.d();
               }

               this.Q();
            }

            this.B = $$5;
            this.A = $$3;
         }

         return true;
      }
   }

   private void b(int $$0) {
      String $$1 = this.O();
      this.y.a(evm.a($$1, -1, $$0, false), evm.a($$1, 1, $$0, false));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$2 == 0) {
            fdy.a $$5 = this.P();
            int $$6 = $$5.a(this.i, this.a(new fdy.c((int)$$0, (int)$$1)));
            this.y.c($$6, true);
            this.Q();
         }

         return true;
      }
   }

   private fdy.a P() {
      if (this.J == null) {
         this.J = this.S();
         this.K = vd.a("book.pageIndicator", this.v + 1, this.C());
      }

      return this.J;
   }

   private void Q() {
      this.J = null;
   }

   private void R() {
      this.y.f();
      this.Q();
   }

   private fdy.a S() {
      String $$0 = this.O();
      if ($$0.isEmpty()) {
         return fdy.a.a;
      } else {
         int $$1 = this.y.g();
         int $$2 = this.y.h();
         IntList $$3 = new IntArrayList();
         List<fdy.b> $$4 = Lists.newArrayList();
         MutableInt $$5 = new MutableInt();
         MutableBoolean $$6 = new MutableBoolean();
         evm $$7 = this.i.b();
         $$7.a($$0, 114, wa.a, true, ($$5x, $$6x, $$7x) -> {
            int $$8x = $$5.getAndIncrement();
            String $$9x = $$0.substring($$6x, $$7x);
            $$6.setValue($$9x.endsWith("\n"));
            String $$10 = StringUtils.stripEnd($$9x, " \n");
            int $$11 = $$8x * 9;
            fdy.c $$12 = this.b(new fdy.c(0, $$11));
            $$3.add($$6x);
            $$4.add(new fdy.b($$5x, $$10, $$12.a, $$12.b));
         });
         int[] $$8 = $$3.toIntArray();
         boolean $$9 = $$1 == $$0.length();
         fdy.c $$10;
         if ($$9 && $$6.isTrue()) {
            $$10 = new fdy.c(0, $$4.size() * 9);
         } else {
            int $$11 = a($$8, $$1);
            int $$12 = this.i.b($$0.substring($$8[$$11], $$1));
            $$10 = new fdy.c($$12, $$11 * 9);
         }

         List<fte> $$14 = Lists.newArrayList();
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
                  $$14.add(this.a(new fdy.c(0, $$23), new fdy.c($$25, $$23 + 9)));
               }

               $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * 9, $$8[$$18]));
            }
         }

         return new fdy.a($$0, $$10, $$9, $$8, $$4.toArray(new fdy.b[0]), $$14.toArray(new fte[0]));
      }
   }

   static int a(int[] $$0, int $$1) {
      int $$2 = Arrays.binarySearch($$0, $$1);
      return $$2 < 0 ? -($$2 + 2) : $$2;
   }

   private fte a(String $$0, evm $$1, int $$2, int $$3, int $$4, int $$5) {
      String $$6 = $$0.substring($$5, $$2);
      String $$7 = $$0.substring($$5, $$3);
      fdy.c $$8 = new fdy.c((int)$$1.a($$6), $$4);
      fdy.c $$9 = new fdy.c((int)$$1.a($$7), $$4 + 9);
      return this.a($$8, $$9);
   }

   private fte a(fdy.c $$0, fdy.c $$1) {
      fdy.c $$2 = this.b($$0);
      fdy.c $$3 = this.b($$1);
      int $$4 = Math.min($$2.a, $$3.a);
      int $$5 = Math.max($$2.a, $$3.a);
      int $$6 = Math.min($$2.b, $$3.b);
      int $$7 = Math.max($$2.b, $$3.b);
      return new fte($$4, $$6, $$5 - $$4, $$7 - $$6);
   }

   static class a {
      static final fdy.a a = new fdy.a("", new fdy.c(0, 0), true, new int[]{0}, new fdy.b[]{new fdy.b(wa.a, "", 0, 0)}, new fte[0]);
      private final String b;
      final fdy.c c;
      final boolean d;
      private final int[] e;
      final fdy.b[] f;
      final fte[] g;

      public a(String $$0, fdy.c $$1, boolean $$2, int[] $$3, fdy.b[] $$4, fte[] $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }

      public int a(ewk $$0, fdy.c $$1) {
         int $$2 = $$1.b / 9;
         if ($$2 < 0) {
            return 0;
         } else if ($$2 >= this.f.length) {
            return this.b.length();
         } else {
            fdy.b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
         }
      }

      public int a(int $$0, int $$1) {
         int $$2 = fdy.a(this.e, $$0);
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
         int $$1 = fdy.a(this.e, $$0);
         return this.e[$$1];
      }

      public int b(int $$0) {
         int $$1 = fdy.a(this.e, $$0);
         return this.e[$$1] + this.f[$$1].b.length();
      }
   }

   static class b {
      final wa a;
      final String b;
      final vd c;
      final int d;
      final int e;

      public b(wa $$0, String $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
         this.c = vd.b($$1).b($$0);
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
