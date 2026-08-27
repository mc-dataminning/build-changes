import com.google.common.collect.Lists;
import java.util.List;

public class cfy extends cec {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cen t;
   private final ces u = ces.a();
   private final cpk v;
   private List<cmq> w = Lists.newArrayList();
   private ciw x = ciw.b;
   long y;
   final cfu m;
   final cfu n;
   Runnable z = () -> {
   };
   public final bgh o = new bgv(1) {
      @Override
      public void e() {
         super.e();
         cfy.this.a(this);
         cfy.this.z.run();
      }
   };
   final cfp A = new cfp();

   public cfy(int $$0, cbk $$1) {
      this($$0, $$1, cen.a);
   }

   public cfy(int $$0, cbk $$1, final cen $$2) {
      super(cfh.x, $$0);
      this.t = $$2;
      this.v = $$1.m.dK();
      this.m = this.a(new cfu(this.o, 0, 20, 33));
      this.n = this.a(new cfu(this.A, 1, 143, 33) {
         @Override
         public boolean a(ciw $$0) {
            return false;
         }

         @Override
         public void a(cbl $$0, ciw $$1) {
            $$1.a($$0.dK(), $$0, $$1.L());
            cfy.this.A.a($$0, this.i());
            ciw $$2 = cfy.this.m.a(1);
            if (!$$2.b()) {
               cfy.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.V();
               if (cfy.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, aou.yt, aov.e, 1.0F, 1.0F);
                  cfy.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<ciw> i() {
            return List.of(cfy.this.m.e());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cfu($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cfu($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cmq> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.f() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cbl $$0) {
      return a(this.t, $$0, csl.oc);
   }

   @Override
   public boolean b(cbl $$0, int $$1) {
      if (this.e($$1)) {
         this.u.a($$1);
         this.p();
      }

      return true;
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.w.size();
   }

   @Override
   public void a(bgh $$0) {
      ciw $$1 = this.m.e();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bgh $$0, ciw $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.e(ciw.b);
      if (!$$1.b()) {
         this.w = this.v.q().b(cmc.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cmq $$0 = this.w.get(this.u.b());
         ciw $$1 = $$0.a(this.o, this.v.B_());
         if ($$1.a(this.v.G())) {
            this.A.a($$0);
            this.n.e($$1);
         } else {
            this.n.e(ciw.b);
         }
      } else {
         this.n.e(ciw.b);
      }

      this.d();
   }

   @Override
   public cfh<?> a() {
      return cfh.x;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(ciw $$0, cfu $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public ciw a(cbl $$0, int $$1) {
      ciw $$2 = ciw.b;
      cfu $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciw $$4 = $$3.e();
         cir $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dK(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return ciw.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return ciw.b;
            }
         } else if (this.v.q().a(cmc.f, new bgv($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return ciw.b;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return ciw.b;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return ciw.b;
         }

         if ($$4.b()) {
            $$3.d(ciw.b);
         }

         $$3.d();
         if ($$4.L() == $$2.L()) {
            return ciw.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cbl $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
