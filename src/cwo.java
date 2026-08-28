import java.util.List;
import java.util.Optional;

public class cwo extends cvs {
   static final alk p = alk.b("container/slot/lapis_lazuli");
   private final bum q = new bva(2) {
      @Override
      public void e() {
         super.e();
         cwo.this.a(this);
      }
   };
   private final cwf r;
   private final azz s = azz.a();
   private final cwm t = cwm.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public cwo(int $$0, cry $$1) {
      this($$0, $$1, cwf.a);
   }

   public cwo(int $$0, cry $$1, cwf $$2) {
      super(cxb.n, $$0);
      this.r = $$2;
      this.a(new cxp(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cxp(this.q, 1, 35, 47) {
         @Override
         public boolean a(daa $$0) {
            return $$0.a(dae.pp);
         }

         @Override
         public alk c() {
            return cwo.p;
         }
      });
      this.c($$1, 8, 84);
      this.a(cwm.a(this.m, 0));
      this.a(cwm.a(this.m, 1));
      this.a(cwm.a(this.m, 2));
      this.a(this.t).a($$1.h.gs());
      this.a(cwm.a(this.n, 0));
      this.a(cwm.a(this.n, 1));
      this.a(cwm.a(this.n, 2));
      this.a(cwm.a(this.o, 0));
      this.a(cwm.a(this.o, 1));
      this.a(cwm.a(this.o, 2));
   }

   @Override
   public void a(bum $$0) {
      if ($$0 == this.q) {
         daa $$1 = $$0.a(0);
         if (!$$1.f() && $$1.E()) {
            this.r.a(($$1x, $$2x) -> {
               jl<jg<dgn>> $$3 = $$1x.J_().f(mi.aR).t();
               int $$4 = 0;

               for (iw $$5 : dps.b) {
                  if (dps.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = dgp.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<dgq> $$8 = this.a($$1x.J_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        dgq $$9 = $$8.get(this.s.a($$8.size()));
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
   public boolean a(crz $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         daa $$2 = this.q.a(0);
         daa $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.M() < $$4) && !$$0.fV()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cf < $$4 || $$0.cf < this.m[$$1]) && !$$0.fV()) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               daa $$7 = $$2;
               List<dgq> $$8 = this.a($$5.J_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(dae.rF)) {
                     $$7 = $$2.a((djy)dae.vG);
                     this.q.a(0, $$7);
                  }

                  for (dgq $$9 : $$8) {
                     $$7.a($$9.b(), $$9.c());
                  }

                  $$3.a($$4, (bxw)$$0);
                  if ($$3.f()) {
                     this.q.a(1, daa.k);
                  }

                  $$0.a(axb.ak);
                  if ($$0 instanceof arv) {
                     aq.j.a((arv)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gs());
                  this.a(this.q);
                  $$5.a(null, $$6, awr.iv, aws.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ag.b($$0.ai() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<dgq> a(ju $$0, daa $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<jk.c<dgn>> $$4 = $$0.f(mi.aR).a(axi.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<dgq> $$5 = dgp.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(dae.rF) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      daa $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.M();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(crz $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(crz $$0) {
      return a(this.r, $$0, dng.fQ);
   }

   @Override
   public daa b(crz $$0, int $$1) {
      daa $$2 = daa.k;
      cxp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         daa $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return daa.k;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return daa.k;
            }
         } else if ($$4.a(dae.pp)) {
            if (!this.a($$4, 1, 2, true)) {
               return daa.k;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return daa.k;
            }

            daa $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(daa.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return daa.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
