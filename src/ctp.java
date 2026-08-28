import java.util.List;
import java.util.Optional;

public class ctp extends cst {
   static final alp p = alp.b("container/slot/lapis_lazuli");
   private final bst q = new bth(2) {
      @Override
      public void e() {
         super.e();
         ctp.this.a(this);
      }
   };
   private final ctg r;
   private final bac s = bac.a();
   private final ctn t = ctn.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public ctp(int $$0, cpn $$1) {
      this($$0, $$1, ctg.a);
   }

   public ctp(int $$0, cpn $$1, ctg $$2) {
      super(cuc.n, $$0);
      this.r = $$2;
      this.a(new cuq(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cuq(this.q, 1, 35, 47) {
         @Override
         public boolean a(cxg $$0) {
            return $$0.a(cxk.pg);
         }

         @Override
         public alp b() {
            return ctp.p;
         }
      });
      this.c($$1, 8, 84);
      this.a(ctn.a(this.m, 0));
      this.a(ctn.a(this.m, 1));
      this.a(ctn.a(this.m, 2));
      this.a(this.t).a($$1.k.gr());
      this.a(ctn.a(this.n, 0));
      this.a(ctn.a(this.n, 1));
      this.a(ctn.a(this.n, 2));
      this.a(ctn.a(this.o, 0));
      this.a(ctn.a(this.o, 1));
      this.a(ctn.a(this.o, 2));
   }

   @Override
   public void a(bst $$0) {
      if ($$0 == this.q) {
         cxg $$1 = $$0.a(0);
         if (!$$1.f() && $$1.E()) {
            this.r.a(($$1x, $$2x) -> {
               jv<jq<ddq>> $$3 = $$1x.K_().e(mb.aO).t();
               int $$4 = 0;

               for (jh $$5 : dmq.c) {
                  if (dmq.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = dds.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<ddt> $$8 = this.a($$1x.K_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        ddt $$9 = $$8.get(this.s.a($$8.size()));
                        this.n[$$7] = $$3.a($$9.a);
                        this.o[$$7] = $$9.b;
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
   public boolean a(cpo $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cxg $$2 = this.q.a(0);
         cxg $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.M() < $$4) && !$$0.fV()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cq < $$4 || $$0.cq < this.m[$$1]) && !$$0.gj().d) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cxg $$7 = $$2;
               List<ddt> $$8 = this.a($$5.K_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cxk.rw)) {
                     $$7 = $$2.a((dgy)cxk.vv);
                     this.q.a(0, $$7);
                  }

                  for (ddt $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, (bvx)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cxg.j);
                  }

                  $$0.a(axf.ak);
                  if ($$0 instanceof ary) {
                     ao.j.a((ary)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gr());
                  this.a(this.q);
                  $$5.a(null, $$6, awv.is, aww.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ae.b($$0.al() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<ddt> a(ke $$0, cxg $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<ju.c<ddq>> $$4 = $$0.e(mb.aO).a(axn.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<ddt> $$5 = dds.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cxk.rw) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cxg $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.M();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(cpo $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cpo $$0) {
      return a(this.r, $$0, dkf.fM);
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxg $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cxg.j;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cxg.j;
            }
         } else if ($$4.a(cxk.pg)) {
            if (!this.a($$4, 1, 2, true)) {
               return cxg.j;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cxg.j;
            }

            cxg $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cxg.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxg.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
