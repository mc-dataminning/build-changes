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

public class fee extends fcz {
   private static final int a = 114;
   private static final int b = 128;
   private static final int c = 192;
   private static final int k = 192;
   private static final vf l = vf.c("book.editTitle");
   private static final vf m = vf.c("book.finalizeWarning");
   private static final atz n = atz.forward("_", wc.a.a(n.a));
   private static final atz o = atz.forward("_", wc.a.a(n.h));
   private final cfh p;
   private final cmx q;
   private boolean r;
   private boolean t;
   private int u;
   private int v;
   private final List<String> w = Lists.newArrayList();
   private String x = "";
   private final ezw y = new ezw(this::O, this::b, this::n, this::a, $$0x -> $$0x.length() < 1024 && this.i.b($$0x, 114) <= 128);
   private final ezw z = new ezw(() -> this.x, $$0x -> this.x = $$0x, this::n, this::a, $$0x -> $$0x.length() < 16);
   private long A;
   private int B = -1;
   private ffg C;
   private ffg D;
   private exe E;
   private exe F;
   private exe G;
   private exe H;
   private final bjz I;
   @Nullable
   private fee.a J = fee.a.a;
   private vf K = ve.a;
   private final vf L;

   public fee(cfh $$0, cmx $$1, bjz $$2) {
      super(euy.a);
      this.p = $$0;
      this.q = $$1;
      this.I = $$2;
      sn $$3 = $$1.v();
      if ($$3 != null) {
         fef.a($$3, this.w::add);
      }

      if (this.w.isEmpty()) {
         this.w.add("");
      }

      this.L = vf.a("book.byAuthor", $$0.ad()).a(n.i);
   }

   private void a(String $$0) {
      if (this.f != null) {
         ezw.a(this.f, $$0);
      }
   }

   private String n() {
      return this.f != null ? ezw.b(this.f) : "";
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
      this.F = this.d((exe)exe.a(vf.c("book.signButton"), $$0x -> {
         this.t = true;
         this.H();
      }).a(this.g / 2 - 100, 196, 98, 20).a());
      this.E = this.d((exe)exe.a(ve.d, $$0x -> {
         this.f.a(null);
         this.c(false);
      }).a(this.g / 2 + 2, 196, 98, 20).a());
      this.G = this.d((exe)exe.a(vf.c("book.finalizeButton"), $$0x -> {
         if (this.t) {
            this.c(true);
            this.f.a(null);
         }
      }).a(this.g / 2 - 100, 196, 98, 20).a());
      this.H = this.d((exe)exe.a(ve.e, $$0x -> {
         if (this.t) {
            this.t = false;
         }

         this.H();
      }).a(this.g / 2 + 2, 196, 98, 20).a());
      int $$0 = (this.g - 192) / 2;
      int $$1 = 2;
      this.C = this.d(new ffg($$0 + 116, 159, true, $$0x -> this.E(), true));
      this.D = this.d(new ffg($$0 + 43, 159, false, $$0x -> this.D(), true));
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
         int $$1 = this.I == bjz.a ? this.p.fS().l : 40;
         this.f.J().b(new aeb($$1, this.w, $$0 ? Optional.of(this.x.trim()) : Optional.empty()));
      }
   }

   private void e(boolean $$0) {
      st $$1 = new st();
      this.w.stream().map(ti::a).forEach($$1::add);
      if (!this.w.isEmpty()) {
         this.q.a("pages", $$1);
      }

      if ($$0) {
         this.q.a("author", ti.a(this.p.fR().getName()));
         this.q.a("title", ti.a(this.x.trim()));
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
      if (fcz.f($$0)) {
         this.y.d();
         return true;
      } else if (fcz.e($$0)) {
         this.y.c();
         return true;
      } else if (fcz.d($$0)) {
         this.y.b();
         return true;
      } else if (fcz.c($$0)) {
         this.y.a();
         return true;
      } else {
         ezw.a $$3 = fcz.r() ? ezw.a.b : ezw.a.a;
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
               this.y.a(1, fcz.s(), $$3);
               return true;
            case 263:
               this.y.a(-1, fcz.s(), $$3);
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
      this.y.c($$2, fcz.s());
   }

   private void M() {
      if (fcz.r()) {
         this.y.a(fcz.s());
      } else {
         int $$0 = this.y.g();
         int $$1 = this.P().a($$0);
         this.y.c($$1, fcz.s());
      }
   }

   private void N() {
      if (fcz.r()) {
         this.y.b(fcz.s());
      } else {
         fee.a $$0 = this.P();
         int $$1 = this.y.g();
         int $$2 = $$0.b($$1);
         this.y.c($$2, fcz.s());
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
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(null);
      int $$4 = (this.g - 192) / 2;
      int $$5 = 2;
      if (this.t) {
         boolean $$6 = this.u / 6 % 2 == 0;
         atz $$7 = atz.composite(atz.forward(this.x, wc.a), $$6 ? n : o);
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
         fee.a $$12 = this.P();

         for (fee.b $$13 : $$12.f) {
            $$0.a(this.i, $$13.c, $$13.d, $$13.e, -16777216, false);
         }

         this.a($$0, $$12.g);
         this.a($$0, $$12.c, $$12.d);
      }
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(fef.l, (this.g - 192) / 2, 2, 0, 0, 192, 192);
   }

   private void a(ews $$0, fee.c $$1, boolean $$2) {
      if (this.u / 6 % 2 == 0) {
         $$1 = this.b($$1);
         if (!$$2) {
            $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + 9, -16777216);
         } else {
            $$0.a(this.i, "_", $$1.a, $$1.b, 0, false);
         }
      }
   }

   private void a(ews $$0, ftk[] $$1) {
      for (ftk $$2 : $$1) {
         int $$3 = $$2.a();
         int $$4 = $$2.b();
         int $$5 = $$3 + $$2.c();
         int $$6 = $$4 + $$2.d();
         $$0.a(ftn.D(), $$3, $$4, $$5, $$6, -16776961);
      }
   }

   private fee.c a(fee.c $$0) {
      return new fee.c($$0.a - (this.g - 192) / 2 - 36, $$0.b - 32);
   }

   private fee.c b(fee.c $$0) {
      return new fee.c($$0.a + (this.g - 192) / 2 + 36, $$0.b + 32);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            long $$3 = ac.b();
            fee.a $$4 = this.P();
            int $$5 = $$4.a(this.i, this.a(new fee.c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
               if ($$5 != this.B || $$3 - this.A >= 250L) {
                  this.y.c($$5, fcz.s());
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
      this.y.a(evs.a($$1, -1, $$0, false), evs.a($$1, 1, $$0, false));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$2 == 0) {
            fee.a $$5 = this.P();
            int $$6 = $$5.a(this.i, this.a(new fee.c((int)$$0, (int)$$1)));
            this.y.c($$6, true);
            this.Q();
         }

         return true;
      }
   }

   private fee.a P() {
      if (this.J == null) {
         this.J = this.S();
         this.K = vf.a("book.pageIndicator", this.v + 1, this.C());
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

   private fee.a S() {
      String $$0 = this.O();
      if ($$0.isEmpty()) {
         return fee.a.a;
      } else {
         int $$1 = this.y.g();
         int $$2 = this.y.h();
         IntList $$3 = new IntArrayList();
         List<fee.b> $$4 = Lists.newArrayList();
         MutableInt $$5 = new MutableInt();
         MutableBoolean $$6 = new MutableBoolean();
         evs $$7 = this.i.b();
         $$7.a($$0, 114, wc.a, true, ($$5x, $$6x, $$7x) -> {
            int $$8x = $$5.getAndIncrement();
            String $$9x = $$0.substring($$6x, $$7x);
            $$6.setValue($$9x.endsWith("\n"));
            String $$10 = StringUtils.stripEnd($$9x, " \n");
            int $$11 = $$8x * 9;
            fee.c $$12 = this.b(new fee.c(0, $$11));
            $$3.add($$6x);
            $$4.add(new fee.b($$5x, $$10, $$12.a, $$12.b));
         });
         int[] $$8 = $$3.toIntArray();
         boolean $$9 = $$1 == $$0.length();
         fee.c $$10;
         if ($$9 && $$6.isTrue()) {
            $$10 = new fee.c(0, $$4.size() * 9);
         } else {
            int $$11 = a($$8, $$1);
            int $$12 = this.i.b($$0.substring($$8[$$11], $$1));
            $$10 = new fee.c($$12, $$11 * 9);
         }

         List<ftk> $$14 = Lists.newArrayList();
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
                  $$14.add(this.a(new fee.c(0, $$23), new fee.c($$25, $$23 + 9)));
               }

               $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * 9, $$8[$$18]));
            }
         }

         return new fee.a($$0, $$10, $$9, $$8, $$4.toArray(new fee.b[0]), $$14.toArray(new ftk[0]));
      }
   }

   static int a(int[] $$0, int $$1) {
      int $$2 = Arrays.binarySearch($$0, $$1);
      return $$2 < 0 ? -($$2 + 2) : $$2;
   }

   private ftk a(String $$0, evs $$1, int $$2, int $$3, int $$4, int $$5) {
      String $$6 = $$0.substring($$5, $$2);
      String $$7 = $$0.substring($$5, $$3);
      fee.c $$8 = new fee.c((int)$$1.a($$6), $$4);
      fee.c $$9 = new fee.c((int)$$1.a($$7), $$4 + 9);
      return this.a($$8, $$9);
   }

   private ftk a(fee.c $$0, fee.c $$1) {
      fee.c $$2 = this.b($$0);
      fee.c $$3 = this.b($$1);
      int $$4 = Math.min($$2.a, $$3.a);
      int $$5 = Math.max($$2.a, $$3.a);
      int $$6 = Math.min($$2.b, $$3.b);
      int $$7 = Math.max($$2.b, $$3.b);
      return new ftk($$4, $$6, $$5 - $$4, $$7 - $$6);
   }

   static class a {
      static final fee.a a = new fee.a("", new fee.c(0, 0), true, new int[]{0}, new fee.b[]{new fee.b(wc.a, "", 0, 0)}, new ftk[0]);
      private final String b;
      final fee.c c;
      final boolean d;
      private final int[] e;
      final fee.b[] f;
      final ftk[] g;

      public a(String $$0, fee.c $$1, boolean $$2, int[] $$3, fee.b[] $$4, ftk[] $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }

      public int a(ewq $$0, fee.c $$1) {
         int $$2 = $$1.b / 9;
         if ($$2 < 0) {
            return 0;
         } else if ($$2 >= this.f.length) {
            return this.b.length();
         } else {
            fee.b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
         }
      }

      public int a(int $$0, int $$1) {
         int $$2 = fee.a(this.e, $$0);
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
         int $$1 = fee.a(this.e, $$0);
         return this.e[$$1];
      }

      public int b(int $$0) {
         int $$1 = fee.a(this.e, $$0);
         return this.e[$$1] + this.f[$$1].b.length();
      }
   }

   static class b {
      final wc a;
      final String b;
      final vf c;
      final int d;
      final int e;

      public b(wc $$0, String $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
         this.c = vf.b($$1).b($$0);
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
