import com.google.common.collect.ImmutableList;
import java.util.List;

public class ctk extends csd {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final csq r;
   final csx s = csx.a();
   private List<jr<dtq>> t = List.of();
   Runnable u = () -> {
   };
   private final js<dtq> v;
   final cua w;
   final cua x;
   private final cua y;
   private final cua z;
   long A;
   private final bse B = new bss(3) {
      @Override
      public void e() {
         super.e();
         ctk.this.a(this);
         ctk.this.u.run();
      }
   };
   private final bse C = new bss(1) {
      @Override
      public void e() {
         super.e();
         ctk.this.u.run();
      }
   };

   public ctk(int $$0, cox $$1) {
      this($$0, $$1, csq.a);
   }

   public ctk(int $$0, cox $$1, final csq $$2) {
      super(ctm.s, $$0);
      this.r = $$2;
      this.w = this.a(new cua(this.B, 0, 13, 26) {
         @Override
         public boolean a(cwq $$0) {
            return $$0.h() instanceof cut;
         }
      });
      this.x = this.a(new cua(this.B, 1, 33, 26) {
         @Override
         public boolean a(cwq $$0) {
            return $$0.h() instanceof cvo;
         }
      });
      this.y = this.a(new cua(this.B, 2, 23, 45) {
         @Override
         public boolean a(cwq $$0) {
            return $$0.h() instanceof cuu;
         }
      });
      this.z = this.a(new cua(this.C, 0, 143, 57) {
         @Override
         public boolean a(cwq $$0) {
            return false;
         }

         @Override
         public void a(coy $$0, cwq $$1) {
            ctk.this.w.a(1);
            ctk.this.x.a(1);
            if (!ctk.this.w.h() || !ctk.this.x.h()) {
               ctk.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ad();
               if (ctk.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awa.Bh, awb.e, 1.0F, 1.0F);
                  ctk.this.A = $$2xx;
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
   public boolean b(coy $$0) {
      return a(this.r, $$0, djp.ov);
   }

   @Override
   public boolean a(coy $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jr<dtq>> c(cwq $$0) {
      if ($$0.f()) {
         return this.v.a(awn.a).<List<jr<dtq>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cuu $$1 ? this.v.a($$1.b()).<List<jr<dtq>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(bse $$0) {
      cwq $$1 = this.w.g();
      cwq $$2 = this.x.g();
      cwq $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jr<dtq>> $$6 = this.t;
         this.t = this.c($$3);
         jr<dtq> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jr<dtq> $$9 = $$6.get($$4);
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
            dtr $$13 = $$1.a(kv.ai, dtr.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cwq.j);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cwq.j);
         }

         this.d();
      } else {
         this.z.f(cwq.j);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jr<dtq>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cwq.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cut) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cwq.j;
               }
            } else if ($$4.h() instanceof cvo) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cwq.j;
               }
            } else if ($$4.h() instanceof cuu) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cwq.j;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cwq.j;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cwq.j;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cwq.j;
         }

         if ($$4.f()) {
            $$3.e(cwq.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwq.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(coy $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jr<dtq> $$0) {
      cwq $$1 = this.w.g();
      cwq $$2 = this.x.g();
      cwq $$3 = cwq.j;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cvn $$4 = ((cvo)$$2.h()).b();
         $$3.a(kv.ai, dtr.a, $$2x -> new dtr.a().a($$2x).a($$0, $$4).a());
      }

      if (!cwq.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cua n() {
      return this.w;
   }

   public cua o() {
      return this.x;
   }

   public cua p() {
      return this.y;
   }

   public cua q() {
      return this.z;
   }
}
