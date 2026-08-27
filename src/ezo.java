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

public class ezo extends eyk {
   private static final int a = 114;
   private static final int b = 128;
   private static final int c = 192;
   private static final int k = 192;
   private static final tl l = tl.c("book.editTitle");
   private static final tl m = tl.c("book.finalizeWarning");
   private static final ark n = ark.forward("_", uh.a.a(n.a));
   private static final ark o = ark.forward("_", uh.a.a(n.h));
   private final cbu p;
   private final cjf q;
   private boolean s;
   private boolean t;
   private int u;
   private int v;
   private final List<String> w = Lists.newArrayList();
   private String x = "";
   private final evh y = new evh(this::M, this::b, this::l, this::a, $$0x -> $$0x.length() < 1024 && this.i.b($$0x, 114) <= 128);
   private final evh z = new evh(() -> this.x, $$0x -> this.x = $$0x, this::l, this::a, $$0x -> $$0x.length() < 16);
   private long A;
   private int B = -1;
   private fap C;
   private fap D;
   private esq E;
   private esq F;
   private esq G;
   private esq H;
   private final bgx I;
   @Nullable
   private ezo.a J = ezo.a.a;
   private tl K = tk.a;
   private final tl L;

   public ezo(cbu $$0, cjf $$1, bgx $$2) {
      super(eqn.a);
      this.p = $$0;
      this.q = $$1;
      this.I = $$2;
      qx $$3 = $$1.v();
      if ($$3 != null) {
         ezp.a($$3, this.w::add);
      }

      if (this.w.isEmpty()) {
         this.w.add("");
      }

      this.L = tl.a("book.byAuthor", $$0.ac()).a(n.i);
   }

   private void a(String $$0) {
      if (this.f != null) {
         evh.a(this.f, $$0);
      }
   }

   private String l() {
      return this.f != null ? evh.b(this.f) : "";
   }

   private int C() {
      return this.w.size();
   }

   @Override
   public void c() {
      super.c();
      this.u++;
   }

   @Override
   protected void aI_() {
      this.O();
      this.F = this.d((esq)esq.a(tl.c("book.signButton"), $$0x -> {
         this.t = true;
         this.F();
      }).a(this.g / 2 - 100, 196, 98, 20).a());
      this.E = this.d((esq)esq.a(tk.d, $$0x -> {
         this.f.a(null);
         this.c(false);
      }).a(this.g / 2 + 2, 196, 98, 20).a());
      this.G = this.d((esq)esq.a(tl.c("book.finalizeButton"), $$0x -> {
         if (this.t) {
            this.c(true);
            this.f.a(null);
         }
      }).a(this.g / 2 - 100, 196, 98, 20).a());
      this.H = this.d((esq)esq.a(tk.e, $$0x -> {
         if (this.t) {
            this.t = false;
         }

         this.F();
      }).a(this.g / 2 + 2, 196, 98, 20).a());
      int $$0 = (this.g - 192) / 2;
      int $$1 = 2;
      this.C = this.d(new fap($$0 + 116, 159, true, $$0x -> this.E(), true));
      this.D = this.d(new fap($$0 + 43, 159, false, $$0x -> this.D(), true));
      this.F();
   }

   private void D() {
      if (this.v > 0) {
         this.v--;
      }

      this.F();
      this.P();
   }

   private void E() {
      if (this.v < this.C() - 1) {
         this.v++;
      } else {
         this.H();
         if (this.v < this.C() - 1) {
            this.v++;
         }
      }

      this.F();
      this.P();
   }

   private void F() {
      this.D.j = !this.t && this.v > 0;
      this.C.j = !this.t;
      this.E.j = !this.t;
      this.F.j = !this.t;
      this.H.j = this.t;
      this.G.j = this.t;
      this.G.i = !ac.b(this.x);
   }

   private void G() {
      ListIterator<String> $$0 = this.w.listIterator(this.w.size());

      while ($$0.hasPrevious() && $$0.previous().isEmpty()) {
         $$0.remove();
      }
   }

   private void c(boolean $$0) {
      if (this.s) {
         this.G();
         this.e($$0);
         int $$1 = this.I == bgx.a ? this.p.fR().l : 40;
         this.f.J().b(new abu($$1, this.w, $$0 ? Optional.of(this.x.trim()) : Optional.empty()));
      }
   }

   private void e(boolean $$0) {
      rd $$1 = new rd();
      this.w.stream().map(ro::a).forEach($$1::add);
      if (!this.w.isEmpty()) {
         this.q.a("pages", $$1);
      }

      if ($$0) {
         this.q.a("author", ro.a(this.p.fQ().getName()));
         this.q.a("title", ro.a(this.x.trim()));
      }
   }

   private void H() {
      if (this.C() < 100) {
         this.w.add("");
         this.s = true;
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
            this.O();
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
            this.F();
            this.s = true;
            return true;
         } else {
            return false;
         }
      } else if (aa.a($$0)) {
         this.y.a(Character.toString($$0));
         this.O();
         return true;
      } else {
         return false;
      }
   }

   private boolean c(int $$0, int $$1, int $$2) {
      if (eyk.g($$0)) {
         this.y.d();
         return true;
      } else if (eyk.f($$0)) {
         this.y.c();
         return true;
      } else if (eyk.e($$0)) {
         this.y.b();
         return true;
      } else if (eyk.d($$0)) {
         this.y.a();
         return true;
      } else {
         evh.a $$3 = eyk.p() ? evh.a.b : evh.a.a;
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
               this.y.a(1, eyk.q(), $$3);
               return true;
            case 263:
               this.y.a(-1, eyk.q(), $$3);
               return true;
            case 264:
               this.J();
               return true;
            case 265:
               this.I();
               return true;
            case 266:
               this.D.c();
               return true;
            case 267:
               this.C.c();
               return true;
            case 268:
               this.K();
               return true;
            case 269:
               this.L();
               return true;
            default:
               return false;
         }
      }
   }

   private void I() {
      this.a(-1);
   }

   private void J() {
      this.a(1);
   }

   private void a(int $$0) {
      int $$1 = this.y.g();
      int $$2 = this.N().a($$1, $$0);
      this.y.c($$2, eyk.q());
   }

   private void K() {
      if (eyk.p()) {
         this.y.a(eyk.q());
      } else {
         int $$0 = this.y.g();
         int $$1 = this.N().a($$0);
         this.y.c($$1, eyk.q());
      }
   }

   private void L() {
      if (eyk.p()) {
         this.y.b(eyk.q());
      } else {
         ezo.a $$0 = this.N();
         int $$1 = this.y.g();
         int $$2 = $$0.b($$1);
         this.y.c($$2, eyk.q());
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
            this.F();
            this.s = true;
            return true;
         default:
            return false;
      }
   }

   private String M() {
      return this.v >= 0 && this.v < this.w.size() ? this.w.get(this.v) : "";
   }

   private void b(String $$0) {
      if (this.v >= 0 && this.v < this.w.size()) {
         this.w.set(this.v, $$0);
         this.s = true;
         this.O();
      }
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(null);
      int $$4 = (this.g - 192) / 2;
      int $$5 = 2;
      if (this.t) {
         boolean $$6 = this.u / 6 % 2 == 0;
         ark $$7 = ark.composite(ark.forward(this.x, uh.a), $$6 ? n : o);
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
         ezo.a $$12 = this.N();

         for (ezo.b $$13 : $$12.f) {
            $$0.a(this.i, $$13.c, $$13.d, $$13.e, -16777216, false);
         }

         this.a($$0, $$12.g);
         this.a($$0, $$12.c, $$12.d);
      }
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      $$0.a(ezp.l, (this.g - 192) / 2, 2, 0, 0, 192, 192);
   }

   private void a(esf $$0, ezo.c $$1, boolean $$2) {
      if (this.u / 6 % 2 == 0) {
         $$1 = this.b($$1);
         if (!$$2) {
            $$0.a($$1.a, $$1.b - 1, $$1.a + 1, $$1.b + 9, -16777216);
         } else {
            $$0.a(this.i, "_", $$1.a, $$1.b, 0, false);
         }
      }
   }

   private void a(esf $$0, foj[] $$1) {
      for (foj $$2 : $$1) {
         int $$3 = $$2.a();
         int $$4 = $$2.b();
         int $$5 = $$3 + $$2.c();
         int $$6 = $$4 + $$2.d();
         $$0.a(fom.E(), $$3, $$4, $$5, $$6, -16776961);
      }
   }

   private ezo.c a(ezo.c $$0) {
      return new ezo.c($$0.a - (this.g - 192) / 2 - 36, $$0.b - 32);
   }

   private ezo.c b(ezo.c $$0) {
      return new ezo.c($$0.a + (this.g - 192) / 2 + 36, $$0.b + 32);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         return true;
      } else {
         if ($$2 == 0) {
            long $$3 = ac.b();
            ezo.a $$4 = this.N();
            int $$5 = $$4.a(this.i, this.a(new ezo.c((int)$$0, (int)$$1)));
            if ($$5 >= 0) {
               if ($$5 != this.B || $$3 - this.A >= 250L) {
                  this.y.c($$5, eyk.q());
               } else if (!this.y.i()) {
                  this.b($$5);
               } else {
                  this.y.d();
               }

               this.O();
            }

            this.B = $$5;
            this.A = $$3;
         }

         return true;
      }
   }

   private void b(int $$0) {
      String $$1 = this.M();
      this.y.a(erh.a($$1, -1, $$0, false), erh.a($$1, 1, $$0, false));
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      if (super.a($$0, $$1, $$2, $$3, $$4)) {
         return true;
      } else {
         if ($$2 == 0) {
            ezo.a $$5 = this.N();
            int $$6 = $$5.a(this.i, this.a(new ezo.c((int)$$0, (int)$$1)));
            this.y.c($$6, true);
            this.O();
         }

         return true;
      }
   }

   private ezo.a N() {
      if (this.J == null) {
         this.J = this.Q();
         this.K = tl.a("book.pageIndicator", this.v + 1, this.C());
      }

      return this.J;
   }

   private void O() {
      this.J = null;
   }

   private void P() {
      this.y.f();
      this.O();
   }

   private ezo.a Q() {
      String $$0 = this.M();
      if ($$0.isEmpty()) {
         return ezo.a.a;
      } else {
         int $$1 = this.y.g();
         int $$2 = this.y.h();
         IntList $$3 = new IntArrayList();
         List<ezo.b> $$4 = Lists.newArrayList();
         MutableInt $$5 = new MutableInt();
         MutableBoolean $$6 = new MutableBoolean();
         erh $$7 = this.i.b();
         $$7.a($$0, 114, uh.a, true, ($$5x, $$6x, $$7x) -> {
            int $$8x = $$5.getAndIncrement();
            String $$9x = $$0.substring($$6x, $$7x);
            $$6.setValue($$9x.endsWith("\n"));
            String $$10 = StringUtils.stripEnd($$9x, " \n");
            int $$11 = $$8x * 9;
            ezo.c $$12 = this.b(new ezo.c(0, $$11));
            $$3.add($$6x);
            $$4.add(new ezo.b($$5x, $$10, $$12.a, $$12.b));
         });
         int[] $$8 = $$3.toIntArray();
         boolean $$9 = $$1 == $$0.length();
         ezo.c $$10;
         if ($$9 && $$6.isTrue()) {
            $$10 = new ezo.c(0, $$4.size() * 9);
         } else {
            int $$11 = a($$8, $$1);
            int $$12 = this.i.b($$0.substring($$8[$$11], $$1));
            $$10 = new ezo.c($$12, $$11 * 9);
         }

         List<foj> $$14 = Lists.newArrayList();
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
                  $$14.add(this.a(new ezo.c(0, $$23), new ezo.c($$25, $$23 + 9)));
               }

               $$14.add(this.a($$0, $$7, $$8[$$18], $$16, $$18 * 9, $$8[$$18]));
            }
         }

         return new ezo.a($$0, $$10, $$9, $$8, $$4.toArray(new ezo.b[0]), $$14.toArray(new foj[0]));
      }
   }

   static int a(int[] $$0, int $$1) {
      int $$2 = Arrays.binarySearch($$0, $$1);
      return $$2 < 0 ? -($$2 + 2) : $$2;
   }

   private foj a(String $$0, erh $$1, int $$2, int $$3, int $$4, int $$5) {
      String $$6 = $$0.substring($$5, $$2);
      String $$7 = $$0.substring($$5, $$3);
      ezo.c $$8 = new ezo.c((int)$$1.a($$6), $$4);
      ezo.c $$9 = new ezo.c((int)$$1.a($$7), $$4 + 9);
      return this.a($$8, $$9);
   }

   private foj a(ezo.c $$0, ezo.c $$1) {
      ezo.c $$2 = this.b($$0);
      ezo.c $$3 = this.b($$1);
      int $$4 = Math.min($$2.a, $$3.a);
      int $$5 = Math.max($$2.a, $$3.a);
      int $$6 = Math.min($$2.b, $$3.b);
      int $$7 = Math.max($$2.b, $$3.b);
      return new foj($$4, $$6, $$5 - $$4, $$7 - $$6);
   }

   static class a {
      static final ezo.a a = new ezo.a("", new ezo.c(0, 0), true, new int[]{0}, new ezo.b[]{new ezo.b(uh.a, "", 0, 0)}, new foj[0]);
      private final String b;
      final ezo.c c;
      final boolean d;
      private final int[] e;
      final ezo.b[] f;
      final foj[] g;

      public a(String $$0, ezo.c $$1, boolean $$2, int[] $$3, ezo.b[] $$4, foj[] $$5) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
      }

      public int a(esd $$0, ezo.c $$1) {
         int $$2 = $$1.b / 9;
         if ($$2 < 0) {
            return 0;
         } else if ($$2 >= this.f.length) {
            return this.b.length();
         } else {
            ezo.b $$3 = this.f[$$2];
            return this.e[$$2] + $$0.b().a($$3.b, $$1.a, $$3.a);
         }
      }

      public int a(int $$0, int $$1) {
         int $$2 = ezo.a(this.e, $$0);
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
         int $$1 = ezo.a(this.e, $$0);
         return this.e[$$1];
      }

      public int b(int $$0) {
         int $$1 = ezo.a(this.e, $$0);
         return this.e[$$1] + this.f[$$1].b.length();
      }
   }

   static class b {
      final uh a;
      final String b;
      final tl c;
      final int d;
      final int e;

      public b(uh $$0, String $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.d = $$2;
         this.e = $$3;
         this.c = tl.b($$1).b($$0);
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
