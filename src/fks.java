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

public class fks extends fjo {
   private static final int a = 114;
   private static final int b = 128;
   private static final int c = 192;
   private static final int d = 192;
   private static final wg o = wg.c("book.editTitle");
   private static final wg p = wg.c("book.finalizeWarning");
   private static final aww q = aww.forward("_", xd.a.a(n.a));
   private static final aww r = aww.forward("_", xd.a.a(n.h));
   private final cjt s;
   private final crj u;
   private boolean v;
   private boolean w;
   private int x;
   private int y;
   private final List<String> z = Lists.newArrayList();
   private String A = "";
   private final fgj B = new fgj(this::P, this::b, this::m, this::a, $$0x -> $$0x.length() < 1024 && this.m.b($$0x, 114) <= 128);
   private final fgj C = new fgj(() -> this.A, $$0x -> this.A = $$0x, this::m, this::a, $$0x -> $$0x.length() < 16);
   private long D;
   private int E = -1;
   private flu F;
   private flu G;
   private fdp H;
   private fdp I;
   private fdp J;
   private fdp K;
   private final bnz L;
   @Nullable
   private fks.a M = fks.a.a;
   private wg N = wf.a;
   private final wg O;

   public fks(cjt $$0, crj $$1, bnz $$2) {
      super(fbh.a);
      this.s = $$0;
      this.u = $$1;
      this.L = $$2;
      cul $$3 = $$1.a(jp.z);
      if ($$3 != null) {
         $$3.a(fbp.Q().aS()).forEach(this.z::add);
      }

      if (this.z.isEmpty()) {
         this.z.add("");
      }

      this.O = wg.a("book.byAuthor", $$0.ad()).a(n.i);
   }

   private void a(String $$0) {
      if (this.j != null) {
         fgj.a(this.j, $$0);
      }
   }

   private String m() {
      return this.j != null ? fgj.b(this.j) : "";
   }

   private int C() {
      return this.z.size();
   }

   @Override
   public void e() {
      super.e();
      this.x++;
   }

   @Override
   protected void aN_() {
      this.R();
      this.I = this.c((fdp)fdp.a(wg.c("book.signButton"), $$0x -> {
         this.w = true;
         this.F();
      }).a(this.k / 2 - 100, 196, 98, 20).a());
      this.H = this.c((fdp)fdp.a(wf.d, $$0x -> {
         this.j.a(null);
         this.c(false);
      }).a(this.k / 2 + 2, 196, 98, 20).a());
      this.J = this.c((fdp)fdp.a(wg.c("book.finalizeButton"), $$0x -> {
         if (this.w) {
            this.c(true);
            this.j.a(null);
         }
      }).a(this.k / 2 - 100, 196, 98, 20).a());
      this.K = this.c((fdp)fdp.a(wf.e, $$0x -> {
         if (this.w) {
            this.w = false;
         }

         this.F();
      }).a(this.k / 2 + 2, 196, 98, 20).a());
      int $$0 = (this.k - 192) / 2;
      int $$1 = 2;
      this.F = this.c(new flu($$0 + 116, 159, true, $$0x -> this.E(), true));
      this.G = this.c(new flu($$0 + 43, 159, false, $$0x -> this.D(), true));
      this.F();
   }

   private void D() {
      if (this.y > 0) {
         this.y--;
      }

      this.F();
      this.S();
   }

   private void E() {
      if (this.y < this.C() - 1) {
         this.y++;
      } else {
         this.K();
         if (this.y < this.C() - 1) {
            this.y++;
         }
      }

      this.F();
      this.S();
   }

   private void F() {
      this.G.k = !this.w && this.y > 0;
      this.F.k = !this.w;
      this.H.k = !this.w;
      this.I.k = !this.w;
      this.K.k = this.w;
      this.J.k = this.w;
      this.J.j = !ayf.h(this.A);
   }

   private void I() {
      ListIterator<String> $$0 = this.z.listIterator(this.z.size());

      while ($$0.hasPrevious() && $$0.previous().isEmpty()) {
         $$0.remove();
      }
   }

   private void c(boolean $$0) {
      if (this.v) {
         this.I();
         this.J();
         int $$1 = this.L == bnz.a ? this.s.fZ().l : 40;
         this.j.L().b(new agd($$1, this.z, $$0 ? Optional.of(this.A.trim()) : Optional.empty()));
      }
   }

   private void J() {
      this.u.b(jp.z, new cul(this.z.stream().map(aqj::a).toList()));
   }

   private void K() {
      if (this.C() < 100) {
         this.z.add("");
         this.v = true;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else if (this.w) {
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
      } else if (this.w) {
         boolean $$2 = this.C.a($$0);
         if ($$2) {
            this.F();
            this.v = true;
            return true;
         } else {
            return false;
         }
      } else if (ayf.a($$0)) {
         this.B.a(Character.toString($$0));
         this.R();
         return true;
      } else {
         return false;
      }
   }

   private boolean b(int $$0, int $$1, int $$2) {
      if (fjo.f($$0)) {
         this.B.d();
         return true;
      } else if (fjo.e($$0)) {
         this.B.c();
         return true;
      } else if (fjo.d($$0)) {
         this.B.b();
         return true;
      } else if (fjo.c($$0)) {
         this.B.a();
         return true;
      } else {
         fgj.a $$3 = fjo.r() ? fgj.a.b : fgj.a.a;
         switch ($$0) {
            case 257:
            case 335:
               this.B.a("\n");
               return true;
            case 259:
               this.B.a(-1, $$3);
               return true;
            case 261:
               this.B.a(1, $$3);
               return true;
            case 262:
               this.B.a(1, fjo.s(), $$3);
               return true;
            case 263:
               this.B.a(-1, fjo.s(), $$3);
               return true;
            case 264:
               this.M();
               return true;
            case 265:
               this.L();
               return true;
            case 266:
               this.G.b();
               return true;
            case 267:
               this.F.b();
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
      int $$1 = this.B.g();
      int $$2 = this.Q().a($$1, $$0);
      this.B.c($$2, fjo.s());
   }

   private void N() {
      if (fjo.r()) {
         this.B.a(fjo.s());
      } else {
         int $$0 = this.B.g();
         int $$1 = this.Q().a($$0);
         this.B.c($$1, fjo.s());
      }
   }

   private void O() {
      if (fjo.r()) {
         this.B.b(fjo.s());
      } else {
         fks.a $$0 = this.Q();
         int $$1 = this.B.g();
         int $$2 = $$0.b($$1);
         this.B.c($$2, fjo.s());
      }
   }

   private boolean d(int $$0, int $$1, int $$2) {
      switch ($$0) {
         case 257:
         case 335:
            if (!this.A.isEmpty()) {
               this.c(true);
               this.j.a(null);
            }

            return true;
         case 259:
            this.C.e(-1);
            this.F();
            this.v = true;
            return true;
         default:
            return false;
      }
   }

   private String P() {
      return this.y >= 0 && this.y < this.z.size() ? this.z.get(this.y) : "";
   }

   private void b(String $$0) {
      if (this.y >= 0 && this.y < this.z.size()) {
         this.z.set(this.y, $$0);
         this.v = true;
         this.R();
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(null);
      int $$4 = (this.k - 192) / 2;
      int $$5 = 2;
      if (this.w) {
         boolean $$6 = this.x / 6 % 2 == 0;
         aww $$7 = aww.composite(aww.forward(this.A, xd.a), $$6 ? q : r);
         int $$8 = this.m.a(o);
         $$0.a(this.m, o, $$4 + 36 + (114 - $$8) / 2, 34, 0, false);
         int $$9 = this.m.a($$7);
         $$0.a(this.m, $$7, $$4 + 36 + (114 - $$9) / 2, 50, 0, false);
         int $$10 = this.m.a(this.O);
         $$0.a(this.m, this.O, $$4 + 36 + (114 - $$10) / 2, 60, 0, false);
         $$0.a(this.m, p, $$4 + 36, 82, 114, 0);
      } else {
         int $$11 = this.m.a(this.N);
         $$0.a(this.m, this.N, $$4 - $$11 + 192 - 44, 18, 0, false);
         fks.a $$12 = this.Q();

         for (fks.b $$13 : $$12.f) {
            $$0.a(this.m, $$13.c, $$13.d, $$13.e, -16777216, false);
         }

         this.a($$0, $$12.g);
         this.a($$0, $$12.c, $$12.d);
      }
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(fkt.o, (this.k - 192) / 2, 2, 0, 0, 192, 192);
   }

   private void a(fdc $$0, fks.c $$1, boolean $$2) {
      if (this.x / 6 % 2 == 0) {
         $$1 = this.b($$1);
         if (!$$2) {
            $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + 9, -16777216);
         } else {
            $$0.a(this.m, "_", $$1.a, $$1.b, 0, false);
         }
      }
   }

   private void a(fdc $$0, gae[] $$1) {
      for (gae $$2 : $$1) {
         int $$3 = $$2.a();
         int $$4 = $$2.b();
         int $$5 = $$3 + $$2.c();
         int $$6 = $$4 + $$2.d();
         $$0.a(gah.F(), $$3, $$4, $$5, $$6, -16776961);
      }
   }

   private fks.c a(fks.c $$0) {
      return new fks.c($$0.a - (this.k - 192) / 2 - 36, $$0.b - 32);
   }

   private fks.c b(fks.c $$0) {
      return new fks.c($$0.a + (this.k - 192) / 2 + 36, $$0.b + 32);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            long $$3 = ac.b();
            fks.a $$4 = this.Q();
            int $$5 = $$4.a(this.m, this.a(new fks.c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
               if ($$5 != this.E || $$3 - this.D >= 250L) {
                  this.B.c($$5, fjo.s());
               } else if (!this.B.i()) {
                  this.b($$5);
               } else {
                  this.B.d();
               }

               this.R();
            }

            this.E = $$5;
            this.D = $$3;
         }

         return true;
      }
   }

   private void b(int $$0) {
      String $$1 = this.P();
      this.B.a(fcb.a($$1, -1, $$0, false), fcb.a($$1, 1, $$0, false));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$2 == 0) {
            fks.a $$5 = this.Q();
            int $$6 = $$5.a(this.m, this.a(new fks.c((int)$$0, (int)$$1)));
            this.B.c($$6, true);
            this.R();
         }

         return true;
      }
   }

   private fks.a Q() {
      if (this.M == null) {
         this.M = this.T();
         this.N = wg.a("book.pageIndicator", this.y + 1, this.C());
      }

      return this.M;
   }

   private void R() {
      this.M = null;
   }

   private void S() {
      this.B.f();
      this.R();
   }

   private fks.a T() {
      String $$0 = this.P();
      if ($$0.isEmpty()) {
         return fks.a.a;
      } else {
         int $$1 = this.B.g();
         int $$2 = this.B.h();
         IntList $$3 = new IntArrayList();
         List<fks.b> $$4 = Lists.newArrayList();
         MutableInt $$5 = new MutableInt();
         MutableBoolean $$6 = new MutableBoolean();
         fcb $$7 = this.m.b();
         $$7.a($$0, 114, xd.a, true, ($$5x, $$6x, $$7x) -> {
            int $$8x = $$5.getAndIncrement();
            String $$9x = $$0.substring($$6x, $$7x);
            $$6.setValue($$9x.endsWith("\n"));
            String $$10 = StringUtils.stripEnd($$9x, " \n");
            int $$11 = $$8x * 9;
            fks.c $$12 = this.b(new fks.c(0, $$11));
            $$3.add($$6x);
            $$4.add(new fks.b($$5x, $$10, $$12.a, $$12.b));
         });
         int[] $$8 = $$3.toIntArray();
         boolean $$9 = $$1 == $$0.length();
         fks.c $$10;
         if ($$9 && $$6.isTrue()) {
            $$10 = new fks.c(0, $$4.size() * 9);
         } else {
            int $$11 = a($$8, $$1);
            int $$12 = this.m.b($$0.substring($$8[$$11], $$1));
            $$10 = new fks.c($$12, $$11 * 9);
         }

         List<gae> $$14 = Lists.newArrayList();
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
                  $$14.add(this.a(new fks.c(0, $$23), new fks.c($$25, $$23 + 9)));
               }

               $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * 9, $$8[$$18]));
            }
         }

         return new fks.a($$0, $$10, $$9, $$8, $$4.toArray(new fks.b[0]), $$14.toArray(new gae[0]));
      }
   }

   static int a(int[] $$0, int $$1) {
      int $$2 = Arrays.binarySearch($$0, $$1);
      return $$2 < 0 ? -($$2 + 2) : $$2;
   }

   private gae a(String $$0, fcb $$1, int $$2, int $$3, int $$4, int $$5) {
      String $$6 = $$0.substring($$5, $$2);
      String $$7 = $$0.substring($$5, $$3);
      fks.c $$8 = new fks.c((int)$$1.a($$6), $$4);
      fks.c $$9 = new fks.c((int)$$1.a($$7), $$4 + 9);
      return this.a($$8, $$9);
   }

   private gae a(fks.c $$0, fks.c $$1) {
      fks.c $$2 = this.b($$0);
      fks.c $$3 = this.b($$1);
      int $$4 = Math.min($$2.a, $$3.a);
      int $$5 = Math.max($$2.a, $$3.a);
      int $$6 = Math.min($$2.b, $$3.b);
      int $$7 = Math.max($$2.b, $$3.b);
      return new gae($$4, $$6, $$5 - $$4, $$7 - $$6);
   }

   static class a {
      static final fks.a a = new fks.a("", new fks.c(0, 0), true, new int[]{0}, new fks.b[]{new fks.b(xd.a, "", 0, 0)}, new gae[0]);
      private final String b;
      final fks.c c;
      final boolean d;
      private final int[] e;
      final fks.b[] f;
      final gae[] g;

      public a(String $$0, fks.c $$1, boolean $$2, int[] $$3, fks.b[] $$4, gae[] $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }

      public int a(fda $$0, fks.c $$1) {
         int $$2 = $$1.b / 9;
         if ($$2 < 0) {
            return 0;
         } else if ($$2 >= this.f.length) {
            return this.b.length();
         } else {
            fks.b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
         }
      }

      public int a(int $$0, int $$1) {
         int $$2 = fks.a(this.e, $$0);
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
         int $$1 = fks.a(this.e, $$0);
         return this.e[$$1];
      }

      public int b(int $$0) {
         int $$1 = fks.a(this.e, $$0);
         return this.e[$$1] + this.f[$$1].b.length();
      }
   }

   static class b {
      final xd a;
      final String b;
      final wg c;
      final int d;
      final int e;

      public b(xd $$0, String $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
         this.c = wg.b($$1).b($$0);
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
