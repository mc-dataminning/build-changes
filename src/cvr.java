import com.google.common.collect.ImmutableList;
import java.util.List;

public class cvr extends cuk {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final cux r;
   final cve s = cve.a();
   private List<je<dwc>> t = List.of();
   Runnable u = () -> {
   };
   private final jf<dwc> v;
   final cwh w;
   final cwh x;
   private final cwh y;
   private final cwh z;
   long A;
   private final btr B = new buf(3) {
      @Override
      public void e() {
         super.e();
         cvr.this.a(this);
         cvr.this.u.run();
      }
   };
   private final btr C = new buf(1) {
      @Override
      public void e() {
         super.e();
         cvr.this.u.run();
      }
   };

   public cvr(int $$0, cqr $$1) {
      this($$0, $$1, cux.a);
   }

   public cvr(int $$0, cqr $$1, final cux $$2) {
      super(cvt.s, $$0);
      this.r = $$2;
      this.w = this.a(new cwh(this.B, 0, 13, 26) {
         @Override
         public boolean a(cys $$0) {
            return $$0.h() instanceof cwy;
         }
      });
      this.x = this.a(new cwh(this.B, 1, 33, 26) {
         @Override
         public boolean a(cys $$0) {
            return $$0.h() instanceof cxr;
         }
      });
      this.y = this.a(new cwh(this.B, 2, 23, 45) {
         @Override
         public boolean a(cys $$0) {
            return $$0.c(kj.af);
         }
      });
      this.z = this.a(new cwh(this.C, 0, 143, 57) {
         @Override
         public boolean a(cys $$0) {
            return false;
         }

         @Override
         public void a(cqs $$0, cys $$1) {
            cvr.this.w.a(1);
            cvr.this.x.a(1);
            if (!cvr.this.w.h() || !cvr.this.x.h()) {
               cvr.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cvr.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awl.Br, awm.e, 1.0F, 1.0F);
                  cvr.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dX().f(mg.aF);
   }

   @Override
   public boolean b(cqs $$0) {
      return a(this.r, $$0, dlw.ov);
   }

   @Override
   public boolean a(cqs $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<je<dwc>> c(cys $$0) {
      if ($$0.f()) {
         return this.v.a(awy.a).<List<je<dwc>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         axp<dwc> $$1 = $$0.a(kj.af);
         return $$1 != null ? this.v.a($$1).<List<je<dwc>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(btr $$0) {
      cys $$1 = this.w.g();
      cys $$2 = this.x.g();
      cys $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<je<dwc>> $$6 = this.t;
         this.t = this.c($$3);
         je<dwc> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            je<dwc> $$9 = $$6.get($$4);
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
            dwd $$13 = $$1.a(kj.am, dwd.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cys.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cys.k);
         }

         this.d();
      } else {
         this.z.f(cys.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<je<dwc>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cys.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cwy) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cys.k;
               }
            } else if ($$4.h() instanceof cxr) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cys.k;
               }
            } else if ($$4.c(kj.af)) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cys.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cys.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cys.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cys.k;
         }

         if ($$4.f()) {
            $$3.e(cys.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cys.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cqs $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(je<dwc> $$0) {
      cys $$1 = this.w.g();
      cys $$2 = this.x.g();
      cys $$3 = cys.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cxq $$4 = ((cxr)$$2.h()).a();
         $$3.a(kj.am, dwd.a, $$2x -> new dwd.a().a($$2x).a($$0, $$4).a());
      }

      if (!cys.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cwh n() {
      return this.w;
   }

   public cwh o() {
      return this.x;
   }

   public cwh p() {
      return this.y;
   }

   public cwh q() {
      return this.z;
   }
}
