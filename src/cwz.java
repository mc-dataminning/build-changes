import com.google.common.collect.ImmutableList;
import java.util.List;

public class cwz extends cvs {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final cwf r;
   final cwm s = cwm.a();
   private List<jg<dxt>> t = List.of();
   Runnable u = () -> {
   };
   private final jh<dxt> v;
   final cxp w;
   final cxp x;
   private final cxp y;
   private final cxp z;
   long A;
   private final bum B = new bva(3) {
      @Override
      public void e() {
         super.e();
         cwz.this.a(this);
         cwz.this.u.run();
      }
   };
   private final bum C = new bva(1) {
      @Override
      public void e() {
         super.e();
         cwz.this.u.run();
      }
   };

   public cwz(int $$0, cry $$1) {
      this($$0, $$1, cwf.a);
   }

   public cwz(int $$0, cry $$1, final cwf $$2) {
      super(cxb.s, $$0);
      this.r = $$2;
      this.w = this.a(new cxp(this.B, 0, 13, 26) {
         @Override
         public boolean a(daa $$0) {
            return $$0.h() instanceof cyg;
         }
      });
      this.x = this.a(new cxp(this.B, 1, 33, 26) {
         @Override
         public boolean a(daa $$0) {
            return $$0.h() instanceof cyz;
         }
      });
      this.y = this.a(new cxp(this.B, 2, 23, 45) {
         @Override
         public boolean a(daa $$0) {
            return $$0.c(kl.af);
         }
      });
      this.z = this.a(new cxp(this.C, 0, 143, 57) {
         @Override
         public boolean a(daa $$0) {
            return false;
         }

         @Override
         public void a(crz $$0, daa $$1) {
            cwz.this.w.a(1);
            cwz.this.x.a(1);
            if (!cwz.this.w.h() || !cwz.this.x.h()) {
               cwz.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cwz.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awr.Bx, aws.e, 1.0F, 1.0F);
                  cwz.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.h.dX().f(mi.aF);
   }

   @Override
   public boolean b(crz $$0) {
      return a(this.r, $$0, dng.oz);
   }

   @Override
   public boolean a(crz $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jg<dxt>> c(daa $$0) {
      if ($$0.f()) {
         return this.v.a(axe.a).<List<jg<dxt>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         axv<dxt> $$1 = $$0.a(kl.af);
         return $$1 != null ? this.v.a($$1).<List<jg<dxt>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(bum $$0) {
      daa $$1 = this.w.g();
      daa $$2 = this.x.g();
      daa $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jg<dxt>> $$6 = this.t;
         this.t = this.c($$3);
         jg<dxt> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jg<dxt> $$9 = $$6.get($$4);
            int $$10 = this.t.indexOf($$9);
            if ($$10 != -1) {
               $$7 = $$9;
               this.s.a($$10);
            } else {
               $$7 = null;
               this.s.a(-1);
            }
         }

         if ($$7 != null) {
            dxu $$13 = $$1.a(kl.am, dxu.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(daa.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(daa.k);
         }

         this.d();
      } else {
         this.z.f(daa.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jg<dxt>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public daa b(crz $$0, int $$1) {
      daa $$2 = daa.k;
      cxp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         daa $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return daa.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cyg) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return daa.k;
               }
            } else if ($$4.h() instanceof cyz) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return daa.k;
               }
            } else if ($$4.c(kl.af)) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return daa.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return daa.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return daa.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return daa.k;
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

   @Override
   public void a(crz $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jg<dxt> $$0) {
      daa $$1 = this.w.g();
      daa $$2 = this.x.g();
      daa $$3 = daa.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cyy $$4 = ((cyz)$$2.h()).a();
         $$3.a(kl.am, dxu.a, $$2x -> new dxu.a().a($$2x).a($$0, $$4).a());
      }

      if (!daa.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cxp n() {
      return this.w;
   }

   public cxp o() {
      return this.x;
   }

   public cxp p() {
      return this.y;
   }

   public cxp q() {
      return this.z;
   }
}
