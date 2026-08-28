import java.util.List;
import java.util.Optional;

public class cts extends csw {
   static final aku p = aku.b("container/slot/lapis_lazuli");
   private final bsr q = new btf(2) {
      @Override
      public void e() {
         super.e();
         cts.this.a(this);
      }
   };
   private final ctj r;
   private final azh s = azh.a();
   private final ctq t = ctq.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public cts(int $$0, cpq $$1) {
      this($$0, $$1, ctj.a);
   }

   public cts(int $$0, cpq $$1, ctj $$2) {
      super(cuf.n, $$0);
      this.r = $$2;
      this.a(new cut(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cut(this.q, 1, 35, 47) {
         @Override
         public boolean a(cxh $$0) {
            return $$0.a(cxl.pi);
         }

         @Override
         public aku b() {
            return cts.p;
         }
      });
      this.c($$1, 8, 84);
      this.a(ctq.a(this.m, 0));
      this.a(ctq.a(this.m, 1));
      this.a(ctq.a(this.m, 2));
      this.a(this.t).a($$1.k.gu());
      this.a(ctq.a(this.n, 0));
      this.a(ctq.a(this.n, 1));
      this.a(ctq.a(this.n, 2));
      this.a(ctq.a(this.o, 0));
      this.a(ctq.a(this.o, 1));
      this.a(ctq.a(this.o, 2));
   }

   @Override
   public void a(bsr $$0) {
      if ($$0 == this.q) {
         cxh $$1 = $$0.a(0);
         if (!$$1.f() && $$1.E()) {
            this.r.a(($$1x, $$2x) -> {
               jw<jr<ddr>> $$3 = $$1x.F_().e(mc.aP).t();
               int $$4 = 0;

               for (ji $$5 : dmr.b) {
                  if (dmr.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = ddt.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<ddu> $$8 = this.a($$1x.F_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        ddu $$9 = $$8.get(this.s.a($$8.size()));
                        this.n[$$7] = $$3.a($$9.b());
                        this.o[$$7] = $$9.c();
                     }
                  }
               }

               this.d();
            });
         } else {
            for (int $$2 = 0; $$2 < 3; $$2++) {
               this.m[$$2] = 0;
               this.n[$$2] = -1;
               this.o[$$2] = -1;
            }
         }
      }
   }

   @Override
   public boolean a(cpr $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cxh $$2 = this.q.a(0);
         cxh $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.M() < $$4) && !$$0.fX()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.ce < $$4 || $$0.ce < this.m[$$1]) && !$$0.fX()) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cxh $$7 = $$2;
               List<ddu> $$8 = this.a($$5.F_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cxl.ry)) {
                     $$7 = $$2.a((dgy)cxl.vx);
                     this.q.a(0, $$7);
                  }

                  for (ddu $$9 : $$8) {
                     $$7.a($$9.b(), $$9.c());
                  }

                  $$3.a($$4, (bvy)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cxh.k);
                  }

                  $$0.a(awk.ak);
                  if ($$0 instanceof are) {
                     ap.j.a((are)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gu());
                  this.a(this.q);
                  $$5.a(null, $$6, awa.is, awb.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         af.b($$0.al() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<ddu> a(kf $$0, cxh $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<jv.c<ddr>> $$4 = $$0.e(mc.aP).a(aws.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<ddu> $$5 = ddt.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cxl.ry) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cxh $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.M();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(cpr $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cpr $$0) {
      return a(this.r, $$0, dkg.fM);
   }

   @Override
   public cxh b(cpr $$0, int $$1) {
      cxh $$2 = cxh.k;
      cut $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxh $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cxh.k;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cxh.k;
            }
         } else if ($$4.a(cxl.pi)) {
            if (!this.a($$4, 1, 2, true)) {
               return cxh.k;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cxh.k;
            }

            cxh $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cxh.k);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxh.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
