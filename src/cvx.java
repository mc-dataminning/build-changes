import com.google.common.collect.ImmutableList;
import java.util.List;

public class cvx extends cuq {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final cvd r;
   final cvk s = cvk.a();
   private List<je<dwm>> t = List.of();
   Runnable u = () -> {
   };
   private final jf<dwm> v;
   final cwn w;
   final cwn x;
   private final cwn y;
   private final cwn z;
   long A;
   private final btu B = new bui(3) {
      @Override
      public void e() {
         super.e();
         cvx.this.a(this);
         cvx.this.u.run();
      }
   };
   private final btu C = new bui(1) {
      @Override
      public void e() {
         super.e();
         cvx.this.u.run();
      }
   };

   public cvx(int $$0, cqx $$1) {
      this($$0, $$1, cvd.a);
   }

   public cvx(int $$0, cqx $$1, final cvd $$2) {
      super(cvz.s, $$0);
      this.r = $$2;
      this.w = this.a(new cwn(this.B, 0, 13, 26) {
         @Override
         public boolean a(cyy $$0) {
            return $$0.h() instanceof cxe;
         }
      });
      this.x = this.a(new cwn(this.B, 1, 33, 26) {
         @Override
         public boolean a(cyy $$0) {
            return $$0.h() instanceof cxx;
         }
      });
      this.y = this.a(new cwn(this.B, 2, 23, 45) {
         @Override
         public boolean a(cyy $$0) {
            return $$0.c(kj.af);
         }
      });
      this.z = this.a(new cwn(this.C, 0, 143, 57) {
         @Override
         public boolean a(cyy $$0) {
            return false;
         }

         @Override
         public void a(cqy $$0, cyy $$1) {
            cvx.this.w.a(1);
            cvx.this.x.a(1);
            if (!cvx.this.w.h() || !cvx.this.x.h()) {
               cvx.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cvx.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awn.Bu, awo.e, 1.0F, 1.0F);
                  cvx.this.A = $$2xx;
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
   public boolean b(cqy $$0) {
      return a(this.r, $$0, dmc.ow);
   }

   @Override
   public boolean a(cqy $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<je<dwm>> c(cyy $$0) {
      if ($$0.f()) {
         return this.v.a(axa.a).<List<je<dwm>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         axr<dwm> $$1 = $$0.a(kj.af);
         return $$1 != null ? this.v.a($$1).<List<je<dwm>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(btu $$0) {
      cyy $$1 = this.w.g();
      cyy $$2 = this.x.g();
      cyy $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<je<dwm>> $$6 = this.t;
         this.t = this.c($$3);
         je<dwm> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            je<dwm> $$9 = $$6.get($$4);
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
            dwn $$13 = $$1.a(kj.am, dwn.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cyy.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cyy.k);
         }

         this.d();
      } else {
         this.z.f(cyy.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<je<dwm>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cyy b(cqy $$0, int $$1) {
      cyy $$2 = cyy.k;
      cwn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cyy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cyy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cxe) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cyy.k;
               }
            } else if ($$4.h() instanceof cxx) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cyy.k;
               }
            } else if ($$4.c(kj.af)) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cyy.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cyy.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cyy.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cyy.k;
         }

         if ($$4.f()) {
            $$3.e(cyy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cyy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cqy $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(je<dwm> $$0) {
      cyy $$1 = this.w.g();
      cyy $$2 = this.x.g();
      cyy $$3 = cyy.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cxw $$4 = ((cxx)$$2.h()).a();
         $$3.a(kj.am, dwn.a, $$2x -> new dwn.a().a($$2x).a($$0, $$4).a());
      }

      if (!cyy.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cwn n() {
      return this.w;
   }

   public cwn o() {
      return this.x;
   }

   public cwn p() {
      return this.y;
   }

   public cwn q() {
      return this.z;
   }
}
