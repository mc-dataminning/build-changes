import java.util.List;
import java.util.Optional;

public class cvy extends cvc {
   static final alg p = alg.b("container/slot/lapis_lazuli");
   private final btz q = new bun(2) {
      @Override
      public void e() {
         super.e();
         cvy.this.a(this);
      }
   };
   private final cvp r;
   private final azv s = azv.a();
   private final cvw t = cvw.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public cvy(int $$0, cri $$1) {
      this($$0, $$1, cvp.a);
   }

   public cvy(int $$0, cri $$1, cvp $$2) {
      super(cwl.n, $$0);
      this.r = $$2;
      this.a(new cwz(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cwz(this.q, 1, 35, 47) {
         @Override
         public boolean a(czk $$0) {
            return $$0.a(czo.pp);
         }

         @Override
         public alg c() {
            return cvy.p;
         }
      });
      this.c($$1, 8, 84);
      this.a(cvw.a(this.m, 0));
      this.a(cvw.a(this.m, 1));
      this.a(cvw.a(this.m, 2));
      this.a(this.t).a($$1.h.gr());
      this.a(cvw.a(this.n, 0));
      this.a(cvw.a(this.n, 1));
      this.a(cvw.a(this.n, 2));
      this.a(cvw.a(this.o, 0));
      this.a(cvw.a(this.o, 1));
      this.a(cvw.a(this.o, 2));
   }

   @Override
   public void a(btz $$0) {
      if ($$0 == this.q) {
         czk $$1 = $$0.a(0);
         if (!$$1.f() && $$1.E()) {
            this.r.a(($$1x, $$2x) -> {
               jk<jf<dfx>> $$3 = $$1x.F_().f(mh.aR).t();
               int $$4 = 0;

               for (iv $$5 : dpa.b) {
                  if (dpa.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = dfz.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<dga> $$8 = this.a($$1x.F_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        dga $$9 = $$8.get(this.s.a($$8.size()));
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
   public boolean a(crj $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         czk $$2 = this.q.a(0);
         czk $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.M() < $$4) && !$$0.fU()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cf < $$4 || $$0.cf < this.m[$$1]) && !$$0.fU()) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               czk $$7 = $$2;
               List<dga> $$8 = this.a($$5.F_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(czo.rF)) {
                     $$7 = $$2.a((djg)czo.vG);
                     this.q.a(0, $$7);
                  }

                  for (dga $$9 : $$8) {
                     $$7.a($$9.b(), $$9.c());
                  }

                  $$3.a($$4, (bxj)$$0);
                  if ($$3.f()) {
                     this.q.a(1, czk.k);
                  }

                  $$0.a(awx.ak);
                  if ($$0 instanceof arr) {
                     aq.j.a((arr)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gr());
                  this.a(this.q);
                  $$5.a(null, $$6, awn.iv, awo.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ag.b($$0.ai() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<dga> a(jt $$0, czk $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<jj.c<dfx>> $$4 = $$0.f(mh.aR).a(axe.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<dga> $$5 = dfz.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(czo.rF) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      czk $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.M();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(crj $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(crj $$0) {
      return a(this.r, $$0, dmo.fQ);
   }

   @Override
   public czk b(crj $$0, int $$1) {
      czk $$2 = czk.k;
      cwz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return czk.k;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return czk.k;
            }
         } else if ($$4.a(czo.pp)) {
            if (!this.a($$4, 1, 2, true)) {
               return czk.k;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return czk.k;
            }

            czk $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(czk.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czk.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
