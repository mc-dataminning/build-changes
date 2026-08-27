import com.google.common.collect.Lists;
import java.util.List;

public class chl extends cfp {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cga t;
   private final cgf u = cgf.a();
   private final cqz v;
   private List<cno<cof>> w = Lists.newArrayList();
   private ckj x = ckj.b;
   long y;
   final chh m;
   final chh n;
   Runnable z = () -> {
   };
   public final bhu o = new bii(1) {
      @Override
      public void e() {
         super.e();
         chl.this.a(this);
         chl.this.z.run();
      }
   };
   final chc A = new chc();

   public chl(int $$0, ccw $$1) {
      this($$0, $$1, cga.a);
   }

   public chl(int $$0, ccw $$1, final cga $$2) {
      super(cgu.x, $$0);
      this.t = $$2;
      this.v = $$1.m.dL();
      this.m = this.a(new chh(this.o, 0, 20, 33));
      this.n = this.a(new chh(this.A, 1, 143, 33) {
         @Override
         public boolean a(ckj $$0) {
            return false;
         }

         @Override
         public void a(ccx $$0, ckj $$1) {
            $$1.a($$0.dL(), $$0, $$1.L());
            chl.this.A.a($$0, this.i());
            ckj $$2 = chl.this.m.a(1);
            if (!$$2.b()) {
               chl.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.V();
               if (chl.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, aqd.yA, aqe.e, 1.0F, 1.0F);
                  chl.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<ckj> i() {
            return List.of(chl.this.m.e());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new chh($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new chh($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cno<cof>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.f() && !this.w.isEmpty();
   }

   @Override
   public boolean a(ccx $$0) {
      return a(this.t, $$0, cuc.oc);
   }

   @Override
   public boolean b(ccx $$0, int $$1) {
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
   public void a(bhu $$0) {
      ckj $$1 = this.m.e();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(bhu $$0, ckj $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.e(ckj.b);
      if (!$$1.b()) {
         this.w = this.v.q().b(cnr.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cno<cof> $$0 = this.w.get(this.u.b());
         ckj $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.G())) {
            this.A.a($$0);
            this.n.e($$1);
         } else {
            this.n.e(ckj.b);
         }
      } else {
         this.n.e(ckj.b);
      }

      this.d();
   }

   @Override
   public cgu<?> a() {
      return cgu.x;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(ckj $$0, chh $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public ckj a(ccx $$0, int $$1) {
      ckj $$2 = ckj.b;
      chh $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ckj $$4 = $$3.e();
         cke $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dL(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return ckj.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return ckj.b;
            }
         } else if (this.v.q().a(cnr.f, new bii($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return ckj.b;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return ckj.b;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return ckj.b;
         }

         if ($$4.b()) {
            $$3.d(ckj.b);
         }

         $$3.d();
         if ($$4.L() == $$2.L()) {
            return ckj.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(ccx $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
