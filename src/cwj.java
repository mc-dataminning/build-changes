import com.google.common.collect.ImmutableList;
import java.util.List;

public class cwj extends cvc {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final cvp r;
   final cvw s = cvw.a();
   private List<jf<dxb>> t = List.of();
   Runnable u = () -> {
   };
   private final jg<dxb> v;
   final cwz w;
   final cwz x;
   private final cwz y;
   private final cwz z;
   long A;
   private final btz B = new bun(3) {
      @Override
      public void e() {
         super.e();
         cwj.this.a(this);
         cwj.this.u.run();
      }
   };
   private final btz C = new bun(1) {
      @Override
      public void e() {
         super.e();
         cwj.this.u.run();
      }
   };

   public cwj(int $$0, cri $$1) {
      this($$0, $$1, cvp.a);
   }

   public cwj(int $$0, cri $$1, final cvp $$2) {
      super(cwl.s, $$0);
      this.r = $$2;
      this.w = this.a(new cwz(this.B, 0, 13, 26) {
         @Override
         public boolean a(czk $$0) {
            return $$0.h() instanceof cxq;
         }
      });
      this.x = this.a(new cwz(this.B, 1, 33, 26) {
         @Override
         public boolean a(czk $$0) {
            return $$0.h() instanceof cyj;
         }
      });
      this.y = this.a(new cwz(this.B, 2, 23, 45) {
         @Override
         public boolean a(czk $$0) {
            return $$0.c(kk.af);
         }
      });
      this.z = this.a(new cwz(this.C, 0, 143, 57) {
         @Override
         public boolean a(czk $$0) {
            return false;
         }

         @Override
         public void a(crj $$0, czk $$1) {
            cwj.this.w.a(1);
            cwj.this.x.a(1);
            if (!cwj.this.w.h() || !cwj.this.x.h()) {
               cwj.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cwj.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awn.Bx, awo.e, 1.0F, 1.0F);
                  cwj.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.h.dW().f(mh.aF);
   }

   @Override
   public boolean b(crj $$0) {
      return a(this.r, $$0, dmo.oz);
   }

   @Override
   public boolean a(crj $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jf<dxb>> c(czk $$0) {
      if ($$0.f()) {
         return this.v.a(axa.a).<List<jf<dxb>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         axr<dxb> $$1 = $$0.a(kk.af);
         return $$1 != null ? this.v.a($$1).<List<jf<dxb>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(btz $$0) {
      czk $$1 = this.w.g();
      czk $$2 = this.x.g();
      czk $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jf<dxb>> $$6 = this.t;
         this.t = this.c($$3);
         jf<dxb> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jf<dxb> $$9 = $$6.get($$4);
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
            dxc $$13 = $$1.a(kk.am, dxc.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(czk.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(czk.k);
         }

         this.d();
      } else {
         this.z.f(czk.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jf<dxb>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public czk b(crj $$0, int $$1) {
      czk $$2 = czk.k;
      cwz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return czk.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cxq) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return czk.k;
               }
            } else if ($$4.h() instanceof cyj) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return czk.k;
               }
            } else if ($$4.c(kk.af)) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return czk.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return czk.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return czk.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return czk.k;
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

   @Override
   public void a(crj $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jf<dxb> $$0) {
      czk $$1 = this.w.g();
      czk $$2 = this.x.g();
      czk $$3 = czk.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cyi $$4 = ((cyj)$$2.h()).a();
         $$3.a(kk.am, dxc.a, $$2x -> new dxc.a().a($$2x).a($$0, $$4).a());
      }

      if (!czk.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cwz n() {
      return this.w;
   }

   public cwz o() {
      return this.x;
   }

   public cwz p() {
      return this.y;
   }

   public cwz q() {
      return this.z;
   }
}
