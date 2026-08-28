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

public class fog extends fnl {
   private static final int a = 114;
   private static final int b = 128;
   private static final int c = 192;
   private static final int q = 192;
   private static final wu r = wu.c("book.editTitle");
   private static final wu s = wu.c("book.finalizeWarning");
   private static final axs u = axs.forward("_", xr.a.a(n.a));
   private static final axs v = axs.forward("_", xr.a.a(n.h));
   private final cml w;
   private final cud x;
   private boolean y;
   private boolean z;
   private int A;
   private int B;
   private final List<String> C = Lists.newArrayList();
   private String D = "";
   private final fko E = new fko(this::Q, this::b, this::m, this::a, $$0x -> $$0x.length() < 1024 && this.o.b($$0x, 114) <= 128);
   private final fko F = new fko(() -> this.D, $$0x -> this.D = $$0x, this::m, this::a, $$0x -> $$0x.length() < 16);
   private long G;
   private int H = -1;
   private fpj I;
   private fpj J;
   private fhu K;
   private fhu L;
   private fhu M;
   private fhu N;
   private final bqg O;
   @Nullable
   private fog.a P = fog.a.a;
   private wu Q = wt.a;
   private final wu R;

   public fog(cml $$0, cud $$1, bqg $$2) {
      super(ffo.a);
      this.w = $$0;
      this.x = $$1;
      this.O = $$2;
      cxk $$3 = $$1.a(kn.I);
      if ($$3 != null) {
         $$3.a(ffw.Q().aQ()).forEach(this.C::add);
      }

      if (this.C.isEmpty()) {
         this.C.add("");
      }

      this.R = wu.a("book.byAuthor", $$0.ah()).a(n.i);
   }

   private void a(String $$0) {
      if (this.l != null) {
         fko.a(this.l, $$0);
      }
   }

   private String m() {
      return this.l != null ? fko.b(this.l) : "";
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
   protected void aP_() {
      this.S();
      this.L = this.c((fhu)fhu.a(wu.c("book.signButton"), $$0x -> {
         this.z = true;
         this.G();
      }).a(this.m / 2 - 100, 196, 98, 20).a());
      this.K = this.c((fhu)fhu.a(wt.d, $$0x -> {
         this.l.a(null);
         this.c(false);
      }).a(this.m / 2 + 2, 196, 98, 20).a());
      this.M = this.c((fhu)fhu.a(wu.c("book.finalizeButton"), $$0x -> {
         if (this.z) {
            this.c(true);
            this.l.a(null);
         }
      }).a(this.m / 2 - 100, 196, 98, 20).a());
      this.N = this.c((fhu)fhu.a(wt.e, $$0x -> {
         if (this.z) {
            this.z = false;
         }

         this.G();
      }).a(this.m / 2 + 2, 196, 98, 20).a());
      int $$0 = (this.m - 192) / 2;
      int $$1 = 2;
      this.I = this.c(new fpj($$0 + 116, 159, true, $$0x -> this.F(), true));
      this.J = this.c(new fpj($$0 + 43, 159, false, $$0x -> this.E(), true));
      this.G();
   }

   private void E() {
      if (this.B > 0) {
         this.B--;
      }

      this.G();
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

      this.G();
      this.T();
   }

   private void G() {
      this.J.k = !this.z && this.B > 0;
      this.I.k = !this.z;
      this.K.k = !this.z;
      this.L.k = !this.z;
      this.N.k = this.z;
      this.M.k = this.z;
      this.M.j = !azd.h(this.D);
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
         int $$1 = this.O == bqg.a ? this.w.ga().k : 40;
         this.l.L().b(new agu($$1, this.C, $$0 ? Optional.of(this.D.trim()) : Optional.empty()));
      }
   }

   private void K() {
      this.x.b(kn.I, new cxk(this.C.stream().map(ard::a).toList()));
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
            this.G();
            this.y = true;
            return true;
         } else {
            return false;
         }
      } else if (azd.a($$0)) {
         this.E.a(Character.toString($$0));
         this.S();
         return true;
      } else {
         return false;
      }
   }

   private boolean b(int $$0, int $$1, int $$2) {
      if (fnl.f($$0)) {
         this.E.d();
         return true;
      } else if (fnl.e($$0)) {
         this.E.c();
         return true;
      } else if (fnl.d($$0)) {
         this.E.b();
         return true;
      } else if (fnl.c($$0)) {
         this.E.a();
         return true;
      } else {
         fko.a $$3 = fnl.r() ? fko.a.b : fko.a.a;
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
               this.E.a(1, fnl.s(), $$3);
               return true;
            case 263:
               this.E.a(-1, fnl.s(), $$3);
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
      this.E.c($$2, fnl.s());
   }

   private void O() {
      if (fnl.r()) {
         this.E.a(fnl.s());
      } else {
         int $$0 = this.E.g();
         int $$1 = this.R().a($$0);
         this.E.c($$1, fnl.s());
      }
   }

   private void P() {
      if (fnl.r()) {
         this.E.b(fnl.s());
      } else {
         fog.a $$0 = this.R();
         int $$1 = this.E.g();
         int $$2 = $$0.b($$1);
         this.E.c($$2, fnl.s());
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
            this.G();
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
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
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
         fog.a $$12 = this.R();

         for (fog.b $$13 : $$12.f) {
            $$0.a(this.o, $$13.c, $$13.d, $$13.e, -16777216, false);
         }

         this.a($$0, $$12.g);
         this.a($$0, $$12.c, $$12.d);
      }
   }

   @Override
   public void b(fhh $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
      $$0.a(foh.r, (this.m - 192) / 2, 2, 0, 0, 192, 192);
   }

   private void a(fhh $$0, fog.c $$1, boolean $$2) {
      if (this.A / 6 % 2 == 0) {
         $$1 = this.b($$1);
         if (!$$2) {
            $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + 9, -16777216);
         } else {
            $$0.a(this.o, "_", $$1.a, $$1.b, 0, false);
         }
      }
   }

   private void a(fhh $$0, gek[] $$1) {
      for (gek $$2 : $$1) {
         int $$3 = $$2.a();
         int $$4 = $$2.b();
         int $$5 = $$3 + $$2.c();
         int $$6 = $$4 + $$2.d();
         $$0.a(gen.F(), $$3, $$4, $$5, $$6, -16776961);
      }
   }

   private fog.c a(fog.c $$0) {
      return new fog.c($$0.a - (this.m - 192) / 2 - 36, $$0.b - 32);
   }

   private fog.c b(fog.c $$0) {
      return new fog.c($$0.a + (this.m - 192) / 2 + 36, $$0.b + 32);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            long $$3 = ac.c();
            fog.a $$4 = this.R();
            int $$5 = $$4.a(this.o, this.a(new fog.c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
               if ($$5 != this.H || $$3 - this.G >= 250L) {
                  this.E.c($$5, fnl.s());
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
      this.E.a(fgh.a($$1, -1, $$0, false), fgh.a($$1, 1, $$0, false));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$2 == 0) {
            fog.a $$5 = this.R();
            int $$6 = $$5.a(this.o, this.a(new fog.c((int)$$0, (int)$$1)));
            this.E.c($$6, true);
            this.S();
         }

         return true;
      }
   }

   private fog.a R() {
      if (this.P == null) {
         this.P = this.U();
         this.Q = wu.a("book.pageIndicator", this.B + 1, this.D());
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

   private fog.a U() {
      String $$0 = this.Q();
      if ($$0.isEmpty()) {
         return fog.a.a;
      } else {
         int $$1 = this.E.g();
         int $$2 = this.E.h();
         IntList $$3 = new IntArrayList();
         List<fog.b> $$4 = Lists.newArrayList();
         MutableInt $$5 = new MutableInt();
         MutableBoolean $$6 = new MutableBoolean();
         fgh $$7 = this.o.b();
         $$7.a($$0, 114, xr.a, true, ($$5x, $$6x, $$7x) -> {
            int $$8x = $$5.getAndIncrement();
            String $$9x = $$0.substring($$6x, $$7x);
            $$6.setValue($$9x.endsWith("\n"));
            String $$10 = StringUtils.stripEnd($$9x, " \n");
            int $$11 = $$8x * 9;
            fog.c $$12 = this.b(new fog.c(0, $$11));
            $$3.add($$6x);
            $$4.add(new fog.b($$5x, $$10, $$12.a, $$12.b));
         });
         int[] $$8 = $$3.toIntArray();
         boolean $$9 = $$1 == $$0.length();
         fog.c $$10;
         if ($$9 && $$6.isTrue()) {
            $$10 = new fog.c(0, $$4.size() * 9);
         } else {
            int $$11 = a($$8, $$1);
            int $$12 = this.o.b($$0.substring($$8[$$11], $$1));
            $$10 = new fog.c($$12, $$11 * 9);
         }

         List<gek> $$14 = Lists.newArrayList();
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
                  $$14.add(this.a(new fog.c(0, $$23), new fog.c($$25, $$23 + 9)));
               }

               $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * 9, $$8[$$18]));
            }
         }

         return new fog.a($$0, $$10, $$9, $$8, $$4.toArray(new fog.b[0]), $$14.toArray(new gek[0]));
      }
   }

   static int a(int[] $$0, int $$1) {
      int $$2 = Arrays.binarySearch($$0, $$1);
      return $$2 < 0 ? -($$2 + 2) : $$2;
   }

   private gek a(String $$0, fgh $$1, int $$2, int $$3, int $$4, int $$5) {
      String $$6 = $$0.substring($$5, $$2);
      String $$7 = $$0.substring($$5, $$3);
      fog.c $$8 = new fog.c((int)$$1.a($$6), $$4);
      fog.c $$9 = new fog.c((int)$$1.a($$7), $$4 + 9);
      return this.a($$8, $$9);
   }

   private gek a(fog.c $$0, fog.c $$1) {
      fog.c $$2 = this.b($$0);
      fog.c $$3 = this.b($$1);
      int $$4 = Math.min($$2.a, $$3.a);
      int $$5 = Math.max($$2.a, $$3.a);
      int $$6 = Math.min($$2.b, $$3.b);
      int $$7 = Math.max($$2.b, $$3.b);
      return new gek($$4, $$6, $$5 - $$4, $$7 - $$6);
   }

   static class a {
      static final fog.a a = new fog.a("", new fog.c(0, 0), true, new int[]{0}, new fog.b[]{new fog.b(xr.a, "", 0, 0)}, new gek[0]);
      private final String b;
      final fog.c c;
      final boolean d;
      private final int[] e;
      final fog.b[] f;
      final gek[] g;

      public a(String $$0, fog.c $$1, boolean $$2, int[] $$3, fog.b[] $$4, gek[] $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }

      public int a(fhf $$0, fog.c $$1) {
         int $$2 = $$1.b / 9;
         if ($$2 < 0) {
            return 0;
         } else if ($$2 >= this.f.length) {
            return this.b.length();
         } else {
            fog.b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
         }
      }

      public int a(int $$0, int $$1) {
         int $$2 = fog.a(this.e, $$0);
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
         int $$1 = fog.a(this.e, $$0);
         return this.e[$$1];
      }

      public int b(int $$0) {
         int $$1 = fog.a(this.e, $$0);
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
