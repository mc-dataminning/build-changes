import com.google.common.collect.Lists;
import java.util.List;

public class cdb extends cbf {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cbq t;
   private final cbv u = cbv.a();
   private final cmm v;
   private List<cjt> w = Lists.newArrayList();
   private cfz x = cfz.b;
   long y;
   final ccx m;
   final ccx n;
   Runnable z = () -> {
   };
   public final bdq o = new bee(1) {
      @Override
      public void e() {
         super.e();
         cdb.this.a(this);
         cdb.this.z.run();
      }
   };
   final ccs A = new ccs();

   public cdb(int $$0, byn $$1) {
      this($$0, $$1, cbq.a);
   }

   public cdb(int $$0, byn $$1, final cbq $$2) {
      super(cck.x, $$0);
      this.t = $$2;
      this.v = $$1.m.dI();
      this.m = this.a(new ccx(this.o, 0, 20, 33));
      this.n = this.a(new ccx(this.A, 1, 143, 33) {
         @Override
         public boolean a(cfz $$0) {
            return false;
         }

         @Override
         public void a(byo $$0, cfz $$1) {
            $$1.a($$0.dI(), $$0, $$1.L());
            cdb.this.A.a($$0, this.i());
            cfz $$2 = cdb.this.m.a(1);
            if (!$$2.b()) {
               cdb.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.V();
               if (cdb.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, amh.ys, ami.e, 1.0F, 1.0F);
                  cdb.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cfz> i() {
            return List.of(cdb.this.m.e());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new ccx($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new ccx($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cjt> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.f() && !this.w.isEmpty();
   }

   @Override
   public boolean a(byo $$0) {
      return a(this.t, $$0, cpo.oc);
   }

   @Override
   public boolean b(byo $$0, int $$1) {
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
   public void a(bdq $$0) {
      cfz $$1 = this.m.e();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bdq $$0, cfz $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.e(cfz.b);
      if (!$$1.b()) {
         this.w = this.v.q().b(cjf.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cjt $$0 = this.w.get(this.u.b());
         cfz $$1 = $$0.a(this.o, this.v.B_());
         if ($$1.a(this.v.G())) {
            this.A.a($$0);
            this.n.e($$1);
         } else {
            this.n.e(cfz.b);
         }
      } else {
         this.n.e(cfz.b);
      }

      this.d();
   }

   @Override
   public cck<?> a() {
      return cck.x;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cfz $$0, ccx $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cfz a(byo $$0, int $$1) {
      cfz $$2 = cfz.b;
      ccx $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cfz $$4 = $$3.e();
         cfu $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dI(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cfz.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cfz.b;
            }
         } else if (this.v.q().a(cjf.f, new bee($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cfz.b;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cfz.b;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cfz.b;
         }

         if ($$4.b()) {
            $$3.d(cfz.b);
         }

         $$3.d();
         if ($$4.L() == $$2.L()) {
            return cfz.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(byo $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
