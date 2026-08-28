import com.google.common.collect.ImmutableList;
import java.util.List;

public class cxi extends cwb {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final cwo r;
   final cwv s = cwv.a();
   private List<jg<dyd>> t = List.of();
   Runnable u = () -> {
   };
   private final jh<dyd> v;
   final cxz w;
   final cxz x;
   private final cxz y;
   private final cxz z;
   long A;
   private final buv B = new bvj(3) {
      @Override
      public void e() {
         super.e();
         cxi.this.a(this);
         cxi.this.u.run();
      }
   };
   private final buv C = new bvj(1) {
      @Override
      public void e() {
         super.e();
         cxi.this.u.run();
      }
   };

   public cxi(int $$0, csh $$1) {
      this($$0, $$1, cwo.a);
   }

   public cxi(int $$0, csh $$1, final cwo $$2) {
      super(cxk.s, $$0);
      this.r = $$2;
      this.w = this.a(new cxz(this.B, 0, 13, 26) {
         @Override
         public boolean a(dak $$0) {
            return $$0.h() instanceof cyq;
         }
      });
      this.x = this.a(new cxz(this.B, 1, 33, 26) {
         @Override
         public boolean a(dak $$0) {
            return $$0.h() instanceof czj;
         }
      });
      this.y = this.a(new cxz(this.B, 2, 23, 45) {
         @Override
         public boolean a(dak $$0) {
            return $$0.c(kl.af);
         }
      });
      this.z = this.a(new cxz(this.C, 0, 143, 57) {
         @Override
         public boolean a(dak $$0) {
            return false;
         }

         @Override
         public void a(csi $$0, dak $$1) {
            cxi.this.w.a(1);
            cxi.this.x.a(1);
            if (!cxi.this.w.h() || !cxi.this.x.h()) {
               cxi.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cxi.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awy.Bx, awz.e, 1.0F, 1.0F);
                  cxi.this.A = $$2xx;
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
   public boolean b(csi $$0) {
      return a(this.r, $$0, dnq.oz);
   }

   @Override
   public boolean a(csi $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jg<dyd>> b(dak $$0) {
      if ($$0.f()) {
         return this.v.a(axl.a).<List<jg<dyd>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         ayc<dyd> $$1 = $$0.a(kl.af);
         return $$1 != null ? this.v.a($$1).<List<jg<dyd>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(buv $$0) {
      dak $$1 = this.w.g();
      dak $$2 = this.x.g();
      dak $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jg<dyd>> $$6 = this.t;
         this.t = this.b($$3);
         jg<dyd> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jg<dyd> $$9 = $$6.get($$4);
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
            dye $$13 = $$1.a(kl.am, dye.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(dak.l);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(dak.l);
         }

         this.d();
      } else {
         this.z.f(dak.l);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jg<dyd>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public dak b(csi $$0, int $$1) {
      dak $$2 = dak.l;
      cxz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dak $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return dak.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cyq) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return dak.l;
               }
            } else if ($$4.h() instanceof czj) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return dak.l;
               }
            } else if ($$4.c(kl.af)) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return dak.l;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return dak.l;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return dak.l;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return dak.l;
         }

         if ($$4.f()) {
            $$3.e(dak.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dak.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(csi $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jg<dyd> $$0) {
      dak $$1 = this.w.g();
      dak $$2 = this.x.g();
      dak $$3 = dak.l;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         czi $$4 = ((czj)$$2.h()).a();
         $$3.a(kl.am, dye.a, $$2x -> new dye.a().a($$2x).a($$0, $$4).a());
      }

      if (!dak.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cxz n() {
      return this.w;
   }

   public cxz o() {
      return this.x;
   }

   public cxz p() {
      return this.y;
   }

   public cxz q() {
      return this.z;
   }
}
