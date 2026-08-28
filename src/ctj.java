import com.google.common.collect.ImmutableList;
import java.util.List;

public class ctj extends csc {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final csp r;
   final csw s = csw.a();
   private List<jr<dtp>> t = List.of();
   Runnable u = () -> {
   };
   private final js<dtp> v;
   final ctz w;
   final ctz x;
   private final ctz y;
   private final ctz z;
   long A;
   private final bsd B = new bsr(3) {
      @Override
      public void e() {
         super.e();
         ctj.this.a(this);
         ctj.this.u.run();
      }
   };
   private final bsd C = new bsr(1) {
      @Override
      public void e() {
         super.e();
         ctj.this.u.run();
      }
   };

   public ctj(int $$0, cow $$1) {
      this($$0, $$1, csp.a);
   }

   public ctj(int $$0, cow $$1, final csp $$2) {
      super(ctl.s, $$0);
      this.r = $$2;
      this.w = this.a(new ctz(this.B, 0, 13, 26) {
         @Override
         public boolean a(cwp $$0) {
            return $$0.h() instanceof cus;
         }
      });
      this.x = this.a(new ctz(this.B, 1, 33, 26) {
         @Override
         public boolean a(cwp $$0) {
            return $$0.h() instanceof cvn;
         }
      });
      this.y = this.a(new ctz(this.B, 2, 23, 45) {
         @Override
         public boolean a(cwp $$0) {
            return $$0.h() instanceof cut;
         }
      });
      this.z = this.a(new ctz(this.C, 0, 143, 57) {
         @Override
         public boolean a(cwp $$0) {
            return false;
         }

         @Override
         public void a(cox $$0, cwp $$1) {
            ctj.this.w.a(1);
            ctj.this.x.a(1);
            if (!ctj.this.w.h() || !ctj.this.x.h()) {
               ctj.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ad();
               if (ctj.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awa.Bh, awb.e, 1.0F, 1.0F);
                  ctj.this.A = $$2xx;
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
   public boolean b(cox $$0) {
      return a(this.r, $$0, djo.ov);
   }

   @Override
   public boolean a(cox $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jr<dtp>> c(cwp $$0) {
      if ($$0.f()) {
         return this.v.a(awn.a).<List<jr<dtp>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cut $$1 ? this.v.a($$1.b()).<List<jr<dtp>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(bsd $$0) {
      cwp $$1 = this.w.g();
      cwp $$2 = this.x.g();
      cwp $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jr<dtp>> $$6 = this.t;
         this.t = this.c($$3);
         jr<dtp> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jr<dtp> $$9 = $$6.get($$4);
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
            dtq $$13 = $$1.a(kv.ai, dtq.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cwp.j);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cwp.j);
         }

         this.d();
      } else {
         this.z.f(cwp.j);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jr<dtp>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cwp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cus) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cwp.j;
               }
            } else if ($$4.h() instanceof cvn) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cwp.j;
               }
            } else if ($$4.h() instanceof cut) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cwp.j;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cwp.j;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cwp.j;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cwp.j;
         }

         if ($$4.f()) {
            $$3.e(cwp.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwp.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cox $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jr<dtp> $$0) {
      cwp $$1 = this.w.g();
      cwp $$2 = this.x.g();
      cwp $$3 = cwp.j;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cvm $$4 = ((cvn)$$2.h()).b();
         $$3.a(kv.ai, dtq.a, $$2x -> new dtq.a().a($$2x).a($$0, $$4).a());
      }

      if (!cwp.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public ctz n() {
      return this.w;
   }

   public ctz o() {
      return this.x;
   }

   public ctz p() {
      return this.y;
   }

   public ctz q() {
      return this.z;
   }
}
