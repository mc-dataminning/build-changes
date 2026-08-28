import com.google.common.collect.ImmutableList;
import java.util.List;

public class csd extends cqw {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final crj r;
   final crq s = crq.a();
   private List<jn<dri>> t = List.of();
   Runnable u = () -> {
   };
   private final jo<dri> v;
   final cst w;
   final cst x;
   private final cst y;
   private final cst z;
   long A;
   private final bri B = new brw(3) {
      @Override
      public void e() {
         super.e();
         csd.this.a(this);
         csd.this.u.run();
      }
   };
   private final bri C = new brw(1) {
      @Override
      public void e() {
         super.e();
         csd.this.u.run();
      }
   };

   public csd(int $$0, cnt $$1) {
      this($$0, $$1, crj.a);
   }

   public csd(int $$0, cnt $$1, final crj $$2) {
      super(csf.s, $$0);
      this.r = $$2;
      this.w = this.a(new cst(this.B, 0, 13, 26) {
         @Override
         public boolean a(cvp $$0) {
            return $$0.h() instanceof cto;
         }
      });
      this.x = this.a(new cst(this.B, 1, 33, 26) {
         @Override
         public boolean a(cvp $$0) {
            return $$0.h() instanceof cuk;
         }
      });
      this.y = this.a(new cst(this.B, 2, 23, 45) {
         @Override
         public boolean a(cvp $$0) {
            return $$0.h() instanceof ctp;
         }
      });
      this.z = this.a(new cst(this.C, 0, 143, 57) {
         @Override
         public boolean a(cvp $$0) {
            return false;
         }

         @Override
         public void a(cnu $$0, cvp $$1) {
            csd.this.w.a(1);
            csd.this.x.a(1);
            if (!csd.this.w.h() || !csd.this.x.h()) {
               csd.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.aa();
               if (csd.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awe.Az, awf.e, 1.0F, 1.0F);
                  csd.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dU().b(lv.d);
   }

   @Override
   public boolean b(cnu $$0) {
      return a(this.r, $$0, dhl.nT);
   }

   @Override
   public boolean a(cnu $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jn<dri>> c(cvp $$0) {
      if ($$0.f()) {
         return this.v.a(awr.a).<List<jn<dri>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof ctp $$1 ? this.v.a($$1.b()).<List<jn<dri>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(bri $$0) {
      cvp $$1 = this.w.g();
      cvp $$2 = this.x.g();
      cvp $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jn<dri>> $$6 = this.t;
         this.t = this.c($$3);
         jn<dri> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jn<dri> $$9 = $$6.get($$4);
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
            drj $$13 = $$1.a(kr.ad, drj.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cvp.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cvp.k);
         }

         this.d();
      } else {
         this.z.f(cvp.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jn<dri>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cvp b(cnu $$0, int $$1) {
      cvp $$2 = cvp.k;
      cst $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvp $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cvp.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cto) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cvp.k;
               }
            } else if ($$4.h() instanceof cuk) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cvp.k;
               }
            } else if ($$4.h() instanceof ctp) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cvp.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cvp.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cvp.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cvp.k;
         }

         if ($$4.f()) {
            $$3.e(cvp.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvp.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cnu $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jn<dri> $$0) {
      cvp $$1 = this.w.g();
      cvp $$2 = this.x.g();
      cvp $$3 = cvp.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cuj $$4 = ((cuk)$$2.h()).c();
         $$3.a(kr.ad, drj.a, $$2x -> new drj.a().a($$2x).a($$0, $$4).a());
      }

      if (!cvp.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cst n() {
      return this.w;
   }

   public cst o() {
      return this.x;
   }

   public cst p() {
      return this.y;
   }

   public cst q() {
      return this.z;
   }
}
