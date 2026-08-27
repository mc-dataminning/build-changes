import com.google.common.collect.ImmutableList;
import java.util.List;

public class cip extends chk {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final chv p;
   final cic q = cic.a();
   private List<ie<dfu>> r = List.of();
   Runnable s = () -> {
   };
   final cjf t;
   final cjf u;
   private final cjf v;
   private final cjf w;
   long x;
   private final bje y = new bjt(3) {
      @Override
      public void e() {
         super.e();
         cip.this.a(this);
         cip.this.s.run();
      }
   };
   private final bje z = new bjt(1) {
      @Override
      public void e() {
         super.e();
         cip.this.s.run();
      }
   };

   public cip(int $$0, ceq $$1) {
      this($$0, $$1, chv.a);
   }

   public cip(int $$0, ceq $$1, final chv $$2) {
      super(cir.s, $$0);
      this.p = $$2;
      this.t = this.a(new cjf(this.y, 0, 13, 26) {
         @Override
         public boolean a(cmh $$0) {
            return $$0.d() instanceof cjx;
         }
      });
      this.u = this.a(new cjf(this.y, 1, 33, 26) {
         @Override
         public boolean a(cmh $$0) {
            return $$0.d() instanceof ckw;
         }
      });
      this.v = this.a(new cjf(this.y, 2, 23, 45) {
         @Override
         public boolean a(cmh $$0) {
            return $$0.d() instanceof cjy;
         }
      });
      this.w = this.a(new cjf(this.z, 0, 143, 57) {
         @Override
         public boolean a(cmh $$0) {
            return false;
         }

         @Override
         public void a(cer $$0, cmh $$1) {
            cip.this.t.a(1);
            cip.this.u.a(1);
            if (!cip.this.t.h() || !cip.this.u.h()) {
               cip.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.W();
               if (cip.this.x != $$2xx) {
                  $$0x.a(null, $$1x, arc.zw, ard.e, 1.0F, 1.0F);
                  cip.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjf($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjf($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cer $$0) {
      return a(this.p, $$0, cwb.nT);
   }

   @Override
   public boolean b(cer $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ie<dfu>> c(cmh $$0) {
      if ($$0.b()) {
         return kb.am.b(arp.a).<List<ie<dfu>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cjy $$1 ? kb.am.b($$1.b()).<List<ie<dfu>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bje $$0) {
      cmh $$1 = this.t.g();
      cmh $$2 = this.u.g();
      cmh $$3 = this.v.g();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ie<dfu>> $$6 = this.r;
         this.r = this.c($$3);
         ie<dfu> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ie<dfu> $$9 = $$6.get($$4);
            int $$10 = this.r.indexOf($$9);
            if ($$10 != -1) {
               $$7 = $$9;
               this.q.a($$10);
            } else {
               $$7 = null;
               this.q.a(-1);
            }
         }

         if ($$7 != null) {
            sj $$13 = cka.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.f(cmh.f);
            } else {
               this.a($$7);
            }
         } else {
            this.w.f(cmh.f);
         }

         this.d();
      } else {
         this.w.f(cmh.f);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ie<dfu>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cmh a(cer $$0, int $$1) {
      cmh $$2 = cmh.f;
      cjf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmh $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cmh.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof cjx) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cmh.f;
               }
            } else if ($$4.d() instanceof ckw) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cmh.f;
               }
            } else if ($$4.d() instanceof cjy) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cmh.f;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cmh.f;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cmh.f;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cmh.f;
         }

         if ($$4.b()) {
            $$3.e(cmh.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmh.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cer $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(ie<dfu> $$0) {
      cmh $$1 = this.t.g();
      cmh $$2 = this.u.g();
      cmh $$3 = cmh.f;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         ckv $$4 = ((ckw)$$2.d()).d();
         sj $$5 = cka.a($$3);
         sp $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new sp();
            if ($$5 == null) {
               $$5 = new sj();
            }

            $$5.a("Patterns", $$6);
         }

         sj $$8 = new sj();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         cka.a($$3, dgf.t, $$5);
      }

      if (!cmh.a($$3, this.w.g())) {
         this.w.f($$3);
      }
   }

   public cjf n() {
      return this.t;
   }

   public cjf o() {
      return this.u;
   }

   public cjf p() {
      return this.v;
   }

   public cjf q() {
      return this.w;
   }
}
