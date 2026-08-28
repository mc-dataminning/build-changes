import java.util.List;
import java.util.Optional;

public class csy extends csc {
   static final aku p = aku.b("container/slot/lapis_lazuli");
   private final bsc q = new bsq(2) {
      @Override
      public void e() {
         super.e();
         csy.this.a(this);
      }
   };
   private final csp r;
   private final azh s = azh.a();
   private final csw t = csw.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public csy(int $$0, cow $$1) {
      this($$0, $$1, csp.a);
   }

   public csy(int $$0, cow $$1, csp $$2) {
      super(ctl.n, $$0);
      this.r = $$2;
      this.a(new ctz(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new ctz(this.q, 1, 35, 47) {
         @Override
         public boolean a(cwp $$0) {
            return $$0.a(cwt.pg);
         }

         @Override
         public aku b() {
            return csy.p;
         }
      });
      this.c($$1, 8, 84);
      this.a(csw.a(this.m, 0));
      this.a(csw.a(this.m, 1));
      this.a(csw.a(this.m, 2));
      this.a(this.t).a($$1.k.gr());
      this.a(csw.a(this.n, 0));
      this.a(csw.a(this.n, 1));
      this.a(csw.a(this.n, 2));
      this.a(csw.a(this.o, 0));
      this.a(csw.a(this.o, 1));
      this.a(csw.a(this.o, 2));
   }

   @Override
   public void a(bsc $$0) {
      if ($$0 == this.q) {
         cwp $$1 = $$0.a(0);
         if (!$$1.f() && $$1.E()) {
            this.r.a(($$1x, $$2x) -> {
               jw<jr<dcz>> $$3 = $$1x.K_().e(mc.aO).t();
               int $$4 = 0;

               for (ji $$5 : dlz.c) {
                  if (dlz.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = ddb.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<ddc> $$8 = this.a($$1x.K_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        ddc $$9 = $$8.get(this.s.a($$8.size()));
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
   public boolean a(cox $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cwp $$2 = this.q.a(0);
         cwp $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.M() < $$4) && !$$0.fV()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cr < $$4 || $$0.cr < this.m[$$1]) && !$$0.gj().d) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cwp $$7 = $$2;
               List<ddc> $$8 = this.a($$5.K_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cwt.rw)) {
                     $$7 = $$2.a((dgh)cwt.vv);
                     this.q.a(0, $$7);
                  }

                  for (ddc $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, (bvg)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cwp.j);
                  }

                  $$0.a(awk.ak);
                  if ($$0 instanceof ard) {
                     ap.j.a((ard)$$0, $$7, $$4);
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

   private List<ddc> a(kf $$0, cwp $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<jv.c<dcz>> $$4 = $$0.e(mc.aO).a(aws.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<ddc> $$5 = ddb.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cwt.rw) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cwp $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.M();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(cox $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cox $$0) {
      return a(this.r, $$0, djo.fM);
   }

   @Override
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cwp.j;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cwp.j;
            }
         } else if ($$4.a(cwt.pg)) {
            if (!this.a($$4, 1, 2, true)) {
               return cwp.j;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cwp.j;
            }

            cwp $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cwp.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwp.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
