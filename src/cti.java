import com.google.common.collect.ImmutableList;
import java.util.List;

public class cti extends csb {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final cso r;
   final csv s = csv.a();
   private List<jr<dto>> t = List.of();
   Runnable u = () -> {
   };
   private final js<dto> v;
   final cty w;
   final cty x;
   private final cty y;
   private final cty z;
   long A;
   private final bsc B = new bsq(3) {
      @Override
      public void e() {
         super.e();
         cti.this.a(this);
         cti.this.u.run();
      }
   };
   private final bsc C = new bsq(1) {
      @Override
      public void e() {
         super.e();
         cti.this.u.run();
      }
   };

   public cti(int $$0, cov $$1) {
      this($$0, $$1, cso.a);
   }

   public cti(int $$0, cov $$1, final cso $$2) {
      super(ctk.s, $$0);
      this.r = $$2;
      this.w = this.a(new cty(this.B, 0, 13, 26) {
         @Override
         public boolean a(cwo $$0) {
            return $$0.h() instanceof cur;
         }
      });
      this.x = this.a(new cty(this.B, 1, 33, 26) {
         @Override
         public boolean a(cwo $$0) {
            return $$0.h() instanceof cvm;
         }
      });
      this.y = this.a(new cty(this.B, 2, 23, 45) {
         @Override
         public boolean a(cwo $$0) {
            return $$0.h() instanceof cus;
         }
      });
      this.z = this.a(new cty(this.C, 0, 143, 57) {
         @Override
         public boolean a(cwo $$0) {
            return false;
         }

         @Override
         public void a(cow $$0, cwo $$1) {
            cti.this.w.a(1);
            cti.this.x.a(1);
            if (!cti.this.w.h() || !cti.this.x.h()) {
               cti.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ad();
               if (cti.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awa.Bh, awb.e, 1.0F, 1.0F);
                  cti.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dX().e(mc.d);
   }

   @Override
   public boolean b(cow $$0) {
      return a(this.r, $$0, djn.ov);
   }

   @Override
   public boolean a(cow $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jr<dto>> c(cwo $$0) {
      if ($$0.f()) {
         return this.v.a(awn.a).<List<jr<dto>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cus $$1 ? this.v.a($$1.b()).<List<jr<dto>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(bsc $$0) {
      cwo $$1 = this.w.g();
      cwo $$2 = this.x.g();
      cwo $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jr<dto>> $$6 = this.t;
         this.t = this.c($$3);
         jr<dto> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jr<dto> $$9 = $$6.get($$4);
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
            dtp $$13 = $$1.a(kv.ai, dtp.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cwo.j);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cwo.j);
         }

         this.d();
      } else {
         this.z.f(cwo.j);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jr<dto>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cwo b(cow $$0, int $$1) {
      cwo $$2 = cwo.j;
      cty $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwo $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cwo.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cur) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cwo.j;
               }
            } else if ($$4.h() instanceof cvm) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cwo.j;
               }
            } else if ($$4.h() instanceof cus) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cwo.j;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cwo.j;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cwo.j;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cwo.j;
         }

         if ($$4.f()) {
            $$3.e(cwo.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwo.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cow $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jr<dto> $$0) {
      cwo $$1 = this.w.g();
      cwo $$2 = this.x.g();
      cwo $$3 = cwo.j;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cvl $$4 = ((cvm)$$2.h()).b();
         $$3.a(kv.ai, dtp.a, $$2x -> new dtp.a().a($$2x).a($$0, $$4).a());
      }

      if (!cwo.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cty n() {
      return this.w;
   }

   public cty o() {
      return this.x;
   }

   public cty p() {
      return this.y;
   }

   public cty q() {
      return this.z;
   }
}
