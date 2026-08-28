import com.google.common.collect.ImmutableList;
import java.util.List;

public class csz extends crs {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final csf r;
   final csm s = csm.a();
   private List<jq<dsh>> t = List.of();
   Runnable u = () -> {
   };
   private final jr<dsh> v;
   final ctp w;
   final ctp x;
   private final ctp y;
   private final ctp z;
   long A;
   private final bsa B = new bso(3) {
      @Override
      public void e() {
         super.e();
         csz.this.a(this);
         csz.this.u.run();
      }
   };
   private final bsa C = new bso(1) {
      @Override
      public void e() {
         super.e();
         csz.this.u.run();
      }
   };

   public csz(int $$0, coq $$1) {
      this($$0, $$1, csf.a);
   }

   public csz(int $$0, coq $$1, final csf $$2) {
      super(ctb.s, $$0);
      this.r = $$2;
      this.w = this.a(new ctp(this.B, 0, 13, 26) {
         @Override
         public boolean a(cwf $$0) {
            return $$0.h() instanceof cui;
         }
      });
      this.x = this.a(new ctp(this.B, 1, 33, 26) {
         @Override
         public boolean a(cwf $$0) {
            return $$0.h() instanceof cvd;
         }
      });
      this.y = this.a(new ctp(this.B, 2, 23, 45) {
         @Override
         public boolean a(cwf $$0) {
            return $$0.h() instanceof cuj;
         }
      });
      this.z = this.a(new ctp(this.C, 0, 143, 57) {
         @Override
         public boolean a(cwf $$0) {
            return false;
         }

         @Override
         public void a(cor $$0, cwf $$1) {
            csz.this.w.a(1);
            csz.this.x.a(1);
            if (!csz.this.w.h() || !csz.this.x.h()) {
               csz.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.aa();
               if (csz.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awo.Ax, awp.e, 1.0F, 1.0F);
                  csz.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.ea().e(ma.d);
   }

   @Override
   public boolean b(cor $$0) {
      return a(this.r, $$0, dil.nT);
   }

   @Override
   public boolean a(cor $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jq<dsh>> c(cwf $$0) {
      if ($$0.f()) {
         return this.v.a(axb.a).<List<jq<dsh>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cuj $$1 ? this.v.a($$1.b()).<List<jq<dsh>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(bsa $$0) {
      cwf $$1 = this.w.g();
      cwf $$2 = this.x.g();
      cwf $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jq<dsh>> $$6 = this.t;
         this.t = this.c($$3);
         jq<dsh> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jq<dsh> $$9 = $$6.get($$4);
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
            dsi $$13 = $$1.a(ku.ai, dsi.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cwf.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cwf.k);
         }

         this.d();
      } else {
         this.z.f(cwf.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jq<dsh>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwf $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cwf.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cui) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cwf.k;
               }
            } else if ($$4.h() instanceof cvd) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cwf.k;
               }
            } else if ($$4.h() instanceof cuj) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cwf.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cwf.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cwf.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cwf.k;
         }

         if ($$4.f()) {
            $$3.e(cwf.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwf.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cor $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jq<dsh> $$0) {
      cwf $$1 = this.w.g();
      cwf $$2 = this.x.g();
      cwf $$3 = cwf.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cvc $$4 = ((cvd)$$2.h()).b();
         $$3.a(ku.ai, dsi.a, $$2x -> new dsi.a().a($$2x).a($$0, $$4).a());
      }

      if (!cwf.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public ctp n() {
      return this.w;
   }

   public ctp o() {
      return this.x;
   }

   public ctp p() {
      return this.y;
   }

   public ctp q() {
      return this.z;
   }
}
