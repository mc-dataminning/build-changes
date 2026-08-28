import com.google.common.collect.ImmutableList;
import java.util.List;

public class cth extends csa {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final csn r;
   final csu s = csu.a();
   private List<jr<dtn>> t = List.of();
   Runnable u = () -> {
   };
   private final js<dtn> v;
   final ctx w;
   final ctx x;
   private final ctx y;
   private final ctx z;
   long A;
   private final bsb B = new bsp(3) {
      @Override
      public void e() {
         super.e();
         cth.this.a(this);
         cth.this.u.run();
      }
   };
   private final bsb C = new bsp(1) {
      @Override
      public void e() {
         super.e();
         cth.this.u.run();
      }
   };

   public cth(int $$0, cou $$1) {
      this($$0, $$1, csn.a);
   }

   public cth(int $$0, cou $$1, final csn $$2) {
      super(ctj.s, $$0);
      this.r = $$2;
      this.w = this.a(new ctx(this.B, 0, 13, 26) {
         @Override
         public boolean a(cwn $$0) {
            return $$0.h() instanceof cuq;
         }
      });
      this.x = this.a(new ctx(this.B, 1, 33, 26) {
         @Override
         public boolean a(cwn $$0) {
            return $$0.h() instanceof cvl;
         }
      });
      this.y = this.a(new ctx(this.B, 2, 23, 45) {
         @Override
         public boolean a(cwn $$0) {
            return $$0.h() instanceof cur;
         }
      });
      this.z = this.a(new ctx(this.C, 0, 143, 57) {
         @Override
         public boolean a(cwn $$0) {
            return false;
         }

         @Override
         public void a(cov $$0, cwn $$1) {
            cth.this.w.a(1);
            cth.this.x.a(1);
            if (!cth.this.w.h() || !cth.this.x.h()) {
               cth.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ad();
               if (cth.this.A != $$2xx) {
                  $$0x.a(null, $$1x, avz.Bh, awa.e, 1.0F, 1.0F);
                  cth.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dY().e(mc.d);
   }

   @Override
   public boolean b(cov $$0) {
      return a(this.r, $$0, djm.ov);
   }

   @Override
   public boolean a(cov $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jr<dtn>> c(cwn $$0) {
      if ($$0.f()) {
         return this.v.a(awm.a).<List<jr<dtn>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cur $$1 ? this.v.a($$1.b()).<List<jr<dtn>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(bsb $$0) {
      cwn $$1 = this.w.g();
      cwn $$2 = this.x.g();
      cwn $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jr<dtn>> $$6 = this.t;
         this.t = this.c($$3);
         jr<dtn> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jr<dtn> $$9 = $$6.get($$4);
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
            dto $$13 = $$1.a(kv.ai, dto.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cwn.j);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cwn.j);
         }

         this.d();
      } else {
         this.z.f(cwn.j);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jr<dtn>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cwn b(cov $$0, int $$1) {
      cwn $$2 = cwn.j;
      ctx $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwn $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cwn.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cuq) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cwn.j;
               }
            } else if ($$4.h() instanceof cvl) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cwn.j;
               }
            } else if ($$4.h() instanceof cur) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cwn.j;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cwn.j;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cwn.j;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cwn.j;
         }

         if ($$4.f()) {
            $$3.e(cwn.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwn.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cov $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jr<dtn> $$0) {
      cwn $$1 = this.w.g();
      cwn $$2 = this.x.g();
      cwn $$3 = cwn.j;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cvk $$4 = ((cvl)$$2.h()).b();
         $$3.a(kv.ai, dto.a, $$2x -> new dto.a().a($$2x).a($$0, $$4).a());
      }

      if (!cwn.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public ctx n() {
      return this.w;
   }

   public ctx o() {
      return this.x;
   }

   public ctx p() {
      return this.y;
   }

   public ctx q() {
      return this.z;
   }
}
