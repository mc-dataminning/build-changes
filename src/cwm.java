import java.util.List;
import java.util.Optional;

public class cwm extends cvq {
   static final ali p = ali.b("container/slot/lapis_lazuli");
   private final buk q = new buy(2) {
      @Override
      public void e() {
         super.e();
         cwm.this.a(this);
      }
   };
   private final cwd r;
   private final azx s = azx.a();
   private final cwk t = cwk.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public cwm(int $$0, crw $$1) {
      this($$0, $$1, cwd.a);
   }

   public cwm(int $$0, crw $$1, cwd $$2) {
      super(cwz.n, $$0);
      this.r = $$2;
      this.a(new cxn(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cxn(this.q, 1, 35, 47) {
         @Override
         public boolean a(czy $$0) {
            return $$0.a(dac.pp);
         }

         @Override
         public ali c() {
            return cwm.p;
         }
      });
      this.c($$1, 8, 84);
      this.a(cwk.a(this.m, 0));
      this.a(cwk.a(this.m, 1));
      this.a(cwk.a(this.m, 2));
      this.a(this.t).a($$1.h.gs());
      this.a(cwk.a(this.n, 0));
      this.a(cwk.a(this.n, 1));
      this.a(cwk.a(this.n, 2));
      this.a(cwk.a(this.o, 0));
      this.a(cwk.a(this.o, 1));
      this.a(cwk.a(this.o, 2));
   }

   @Override
   public void a(buk $$0) {
      if ($$0 == this.q) {
         czy $$1 = $$0.a(0);
         if (!$$1.f() && $$1.E()) {
            this.r.a(($$1x, $$2x) -> {
               jk<jf<dgl>> $$3 = $$1x.J_().f(mh.aR).t();
               int $$4 = 0;

               for (iv $$5 : dpq.b) {
                  if (dpq.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = dgn.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<dgo> $$8 = this.a($$1x.J_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        dgo $$9 = $$8.get(this.s.a($$8.size()));
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
   public boolean a(crx $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         czy $$2 = this.q.a(0);
         czy $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.M() < $$4) && !$$0.fV()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cf < $$4 || $$0.cf < this.m[$$1]) && !$$0.fV()) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               czy $$7 = $$2;
               List<dgo> $$8 = this.a($$5.J_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(dac.rF)) {
                     $$7 = $$2.a((djw)dac.vG);
                     this.q.a(0, $$7);
                  }

                  for (dgo $$9 : $$8) {
                     $$7.a($$9.b(), $$9.c());
                  }

                  $$3.a($$4, (bxu)$$0);
                  if ($$3.f()) {
                     this.q.a(1, czy.k);
                  }

                  $$0.a(awz.ak);
                  if ($$0 instanceof art) {
                     aq.j.a((art)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gs());
                  this.a(this.q);
                  $$5.a(null, $$6, awp.iv, awq.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ag.b($$0.ai() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<dgo> a(jt $$0, czy $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<jj.c<dgl>> $$4 = $$0.f(mh.aR).a(axg.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<dgo> $$5 = dgn.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(dac.rF) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      czy $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.M();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(crx $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(crx $$0) {
      return a(this.r, $$0, dne.fQ);
   }

   @Override
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return czy.k;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return czy.k;
            }
         } else if ($$4.a(dac.pp)) {
            if (!this.a($$4, 1, 2, true)) {
               return czy.k;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return czy.k;
            }

            czy $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(czy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
