import java.util.List;
import java.util.Optional;

public class csz extends csd {
   static final akv p = akv.b("container/slot/lapis_lazuli");
   private final bse q = new bss(2) {
      @Override
      public void e() {
         super.e();
         csz.this.a(this);
      }
   };
   private final csq r;
   private final azh s = azh.a();
   private final csx t = csx.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public csz(int $$0, cox $$1) {
      this($$0, $$1, csq.a);
   }

   public csz(int $$0, cox $$1, csq $$2) {
      super(ctm.n, $$0);
      this.r = $$2;
      this.a(new cua(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cua(this.q, 1, 35, 47) {
         @Override
         public boolean a(cwq $$0) {
            return $$0.a(cwu.pg);
         }

         @Override
         public akv b() {
            return csz.p;
         }
      });
      this.c($$1, 8, 84);
      this.a(csx.a(this.m, 0));
      this.a(csx.a(this.m, 1));
      this.a(csx.a(this.m, 2));
      this.a(this.t).a($$1.k.gr());
      this.a(csx.a(this.n, 0));
      this.a(csx.a(this.n, 1));
      this.a(csx.a(this.n, 2));
      this.a(csx.a(this.o, 0));
      this.a(csx.a(this.o, 1));
      this.a(csx.a(this.o, 2));
   }

   @Override
   public void a(bse $$0) {
      if ($$0 == this.q) {
         cwq $$1 = $$0.a(0);
         if (!$$1.f() && $$1.E()) {
            this.r.a(($$1x, $$2x) -> {
               jw<jr<dda>> $$3 = $$1x.K_().e(mc.aO).t();
               int $$4 = 0;

               for (ji $$5 : dma.c) {
                  if (dma.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = ddc.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<ddd> $$8 = this.a($$1x.K_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        ddd $$9 = $$8.get(this.s.a($$8.size()));
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
   public boolean a(coy $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cwq $$2 = this.q.a(0);
         cwq $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.M() < $$4) && !$$0.fV()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cr < $$4 || $$0.cr < this.m[$$1]) && !$$0.gj().d) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cwq $$7 = $$2;
               List<ddd> $$8 = this.a($$5.K_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cwu.rw)) {
                     $$7 = $$2.a((dgi)cwu.vv);
                     this.q.a(0, $$7);
                  }

                  for (ddd $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, (bvi)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cwq.j);
                  }

                  $$0.a(awk.ak);
                  if ($$0 instanceof are) {
                     ap.j.a((are)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gr());
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

   private List<ddd> a(kf $$0, cwq $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<jv.c<dda>> $$4 = $$0.e(mc.aO).a(aws.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<ddd> $$5 = ddc.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cwu.rw) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cwq $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.M();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(coy $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(coy $$0) {
      return a(this.r, $$0, djp.fM);
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cwq.j;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cwq.j;
            }
         } else if ($$4.a(cwu.pg)) {
            if (!this.a($$4, 1, 2, true)) {
               return cwq.j;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cwq.j;
            }

            cwq $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cwq.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwq.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
