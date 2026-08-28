import com.google.common.collect.ImmutableList;
import java.util.List;

public class cwm extends cvf {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final cvs r;
   final cvz s = cvz.a();
   private List<jf<dxg>> t = List.of();
   Runnable u = () -> {
   };
   private final jg<dxg> v;
   final cxc w;
   final cxc x;
   private final cxc y;
   private final cxc z;
   long A;
   private final btz B = new bun(3) {
      @Override
      public void e() {
         super.e();
         cwm.this.a(this);
         cwm.this.u.run();
      }
   };
   private final btz C = new bun(1) {
      @Override
      public void e() {
         super.e();
         cwm.this.u.run();
      }
   };

   public cwm(int $$0, crl $$1) {
      this($$0, $$1, cvs.a);
   }

   public cwm(int $$0, crl $$1, final cvs $$2) {
      super(cwo.s, $$0);
      this.r = $$2;
      this.w = this.a(new cxc(this.B, 0, 13, 26) {
         @Override
         public boolean a(czn $$0) {
            return $$0.h() instanceof cxt;
         }
      });
      this.x = this.a(new cxc(this.B, 1, 33, 26) {
         @Override
         public boolean a(czn $$0) {
            return $$0.h() instanceof cym;
         }
      });
      this.y = this.a(new cxc(this.B, 2, 23, 45) {
         @Override
         public boolean a(czn $$0) {
            return $$0.c(kk.af);
         }
      });
      this.z = this.a(new cxc(this.C, 0, 143, 57) {
         @Override
         public boolean a(czn $$0) {
            return false;
         }

         @Override
         public void a(crm $$0, czn $$1) {
            cwm.this.w.a(1);
            cwm.this.x.a(1);
            if (!cwm.this.w.h() || !cwm.this.x.h()) {
               cwm.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cwm.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awn.Bx, awo.e, 1.0F, 1.0F);
                  cwm.this.A = $$2xx;
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
   public boolean b(crm $$0) {
      return a(this.r, $$0, dmt.oz);
   }

   @Override
   public boolean a(crm $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jf<dxg>> c(czn $$0) {
      if ($$0.f()) {
         return this.v.a(axa.a).<List<jf<dxg>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         axr<dxg> $$1 = $$0.a(kk.af);
         return $$1 != null ? this.v.a($$1).<List<jf<dxg>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(btz $$0) {
      czn $$1 = this.w.g();
      czn $$2 = this.x.g();
      czn $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jf<dxg>> $$6 = this.t;
         this.t = this.c($$3);
         jf<dxg> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jf<dxg> $$9 = $$6.get($$4);
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
            dxh $$13 = $$1.a(kk.am, dxh.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(czn.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(czn.k);
         }

         this.d();
      } else {
         this.z.f(czn.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jf<dxg>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public czn b(crm $$0, int $$1) {
      czn $$2 = czn.k;
      cxc $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czn $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return czn.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cxt) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return czn.k;
               }
            } else if ($$4.h() instanceof cym) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return czn.k;
               }
            } else if ($$4.c(kk.af)) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return czn.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return czn.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return czn.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return czn.k;
         }

         if ($$4.f()) {
            $$3.e(czn.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czn.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(crm $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jf<dxg> $$0) {
      czn $$1 = this.w.g();
      czn $$2 = this.x.g();
      czn $$3 = czn.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cyl $$4 = ((cym)$$2.h()).a();
         $$3.a(kk.am, dxh.a, $$2x -> new dxh.a().a($$2x).a($$0, $$4).a());
      }

      if (!czn.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cxc n() {
      return this.w;
   }

   public cxc o() {
      return this.x;
   }

   public cxc p() {
      return this.y;
   }

   public cxc q() {
      return this.z;
   }
}
