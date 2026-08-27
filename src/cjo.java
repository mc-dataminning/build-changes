import com.google.common.collect.ImmutableList;
import java.util.List;

public class cjo extends cij {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final ciu p;
   final cjb q = cjb.a();
   private List<ih<dgu>> r = List.of();
   Runnable s = () -> {
   };
   final cke t;
   final cke u;
   private final cke v;
   private final cke w;
   long x;
   private final bjv y = new bkl(3) {
      @Override
      public void e() {
         super.e();
         cjo.this.a(this);
         cjo.this.s.run();
      }
   };
   private final bjv z = new bkl(1) {
      @Override
      public void e() {
         super.e();
         cjo.this.s.run();
      }
   };

   public cjo(int $$0, cfp $$1) {
      this($$0, $$1, ciu.a);
   }

   public cjo(int $$0, cfp $$1, final ciu $$2) {
      super(cjq.s, $$0);
      this.p = $$2;
      this.t = this.a(new cke(this.y, 0, 13, 26) {
         @Override
         public boolean a(cng $$0) {
            return $$0.d() instanceof ckx;
         }
      });
      this.u = this.a(new cke(this.y, 1, 33, 26) {
         @Override
         public boolean a(cng $$0) {
            return $$0.d() instanceof clw;
         }
      });
      this.v = this.a(new cke(this.y, 2, 23, 45) {
         @Override
         public boolean a(cng $$0) {
            return $$0.d() instanceof cky;
         }
      });
      this.w = this.a(new cke(this.z, 0, 143, 57) {
         @Override
         public boolean a(cng $$0) {
            return false;
         }

         @Override
         public void a(cfq $$0, cng $$1) {
            cjo.this.t.a(1);
            cjo.this.u.a(1);
            if (!cjo.this.t.h() || !cjo.this.u.h()) {
               cjo.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (cjo.this.x != $$2xx) {
                  $$0x.a(null, $$1x, art.zL, aru.e, 1.0F, 1.0F);
                  cjo.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cke($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cke($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cfq $$0) {
      return a(this.p, $$0, cxa.nT);
   }

   @Override
   public boolean b(cfq $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ih<dgu>> c(cng $$0) {
      if ($$0.b()) {
         return kd.am.b(asg.a).<List<ih<dgu>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cky $$1 ? kd.am.b($$1.b()).<List<ih<dgu>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bjv $$0) {
      cng $$1 = this.t.g();
      cng $$2 = this.u.g();
      cng $$3 = this.v.g();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ih<dgu>> $$6 = this.r;
         this.r = this.c($$3);
         ih<dgu> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ih<dgu> $$9 = $$6.get($$4);
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
            so $$13 = cla.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.f(cng.f);
            } else {
               this.a($$7);
            }
         } else {
            this.w.f(cng.f);
         }

         this.d();
      } else {
         this.w.f(cng.f);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ih<dgu>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cng a(cfq $$0, int $$1) {
      cng $$2 = cng.f;
      cke $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cng $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cng.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof ckx) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cng.f;
               }
            } else if ($$4.d() instanceof clw) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cng.f;
               }
            } else if ($$4.d() instanceof cky) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cng.f;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cng.f;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cng.f;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cng.f;
         }

         if ($$4.b()) {
            $$3.e(cng.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cng.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cfq $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(ih<dgu> $$0) {
      cng $$1 = this.t.g();
      cng $$2 = this.u.g();
      cng $$3 = cng.f;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         clv $$4 = ((clw)$$2.d()).d();
         so $$5 = cla.a($$3);
         su $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new su();
            if ($$5 == null) {
               $$5 = new so();
            }

            $$5.a("Patterns", $$6);
         }

         so $$8 = new so();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         cla.a($$3, dhf.t, $$5);
      }

      if (!cng.a($$3, this.w.g())) {
         this.w.f($$3);
      }
   }

   public cke n() {
      return this.t;
   }

   public cke o() {
      return this.u;
   }

   public cke p() {
      return this.v;
   }

   public cke q() {
      return this.w;
   }
}
