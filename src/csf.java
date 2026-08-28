import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class csf extends crj {
   static final alh p = alh.b("item/empty_slot_lapis_lazuli");
   private final brr q = new bsf(2) {
      @Override
      public void e() {
         super.e();
         csf.this.a(this);
      }
   };
   private final crw r;
   private final azr s = azr.a();
   private final csd t = csd.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public csf(int $$0, cog $$1) {
      this($$0, $$1, crw.a);
   }

   public csf(int $$0, cog $$1, crw $$2) {
      super(css.n, $$0);
      this.r = $$2;
      this.a(new ctg(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new ctg(this.q, 1, 35, 47) {
         @Override
         public boolean a(cvx $$0) {
            return $$0.a(cwb.oC);
         }

         @Override
         public Pair<alh, alh> b() {
            return Pair.of(csm.B, csf.p);
         }
      });
      this.c($$1, 8, 84);
      this.a(csd.a(this.m, 0));
      this.a(csd.a(this.m, 1));
      this.a(csd.a(this.m, 2));
      this.a(this.t).a($$1.k.gs());
      this.a(csd.a(this.n, 0));
      this.a(csd.a(this.n, 1));
      this.a(csd.a(this.n, 2));
      this.a(csd.a(this.o, 0));
      this.a(csd.a(this.o, 1));
      this.a(csd.a(this.o, 2));
   }

   @Override
   public void a(brr $$0) {
      if ($$0 == this.q) {
         cvx $$1 = $$0.a(0);
         if (!$$1.f() && $$1.D()) {
            this.r.a(($$1x, $$2x) -> {
               ju<jp<dbm>> $$3 = $$1x.H_().e(ly.aM).t();
               int $$4 = 0;

               for (jg $$5 : dkk.c) {
                  if (dkk.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = dbo.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<dbp> $$8 = this.a($$1x.H_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        dbp $$9 = $$8.get(this.s.a($$8.size()));
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
   public boolean a(coh $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cvx $$2 = this.q.a(0);
         cvx $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.L() < $$4) && !$$0.fX()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cn < $$4 || $$0.cn < this.m[$$1]) && !$$0.gl().d) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cvx $$7 = $$2;
               List<dbp> $$8 = this.a($$5.H_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cwb.qQ)) {
                     $$7 = $$2.a((deu)cwb.uy);
                     this.q.a(0, $$7);
                  }

                  for (dbp $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, (buv)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cvx.k);
                  }

                  $$0.a(awu.ak);
                  if ($$0 instanceof arn) {
                     an.j.a((arn)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gs());
                  this.a(this.q);
                  $$5.a(null, $$6, awk.hY, awl.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ad.b($$0.al() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<dbp> a(kd $$0, cvx $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<jt.c<dbm>> $$4 = $$0.e(ly.aM).a(axc.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<dbp> $$5 = dbo.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cwb.qQ) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cvx $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.L();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(coh $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(coh $$0) {
      return a(this.r, $$0, dia.fr);
   }

   @Override
   public cvx b(coh $$0, int $$1) {
      cvx $$2 = cvx.k;
      ctg $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvx $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cvx.k;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cvx.k;
            }
         } else if ($$4.a(cwb.oC)) {
            if (!this.a($$4, 1, 2, true)) {
               return cvx.k;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cvx.k;
            }

            cvx $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cvx.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cvx.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
