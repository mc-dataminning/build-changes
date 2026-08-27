import com.google.common.collect.ImmutableList;
import java.util.List;

public class clk extends ckf {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final ckq p;
   final ckx q = ckx.a();
   private List<ij<dio>> r = List.of();
   Runnable s = () -> {
   };
   final cma t;
   final cma u;
   private final cma v;
   private final cma w;
   long x;
   private final blp y = new bmf(3) {
      @Override
      public void e() {
         super.e();
         clk.this.a(this);
         clk.this.s.run();
      }
   };
   private final blp z = new bmf(1) {
      @Override
      public void e() {
         super.e();
         clk.this.s.run();
      }
   };

   public clk(int $$0, chk $$1) {
      this($$0, $$1, ckq.a);
   }

   public clk(int $$0, chk $$1, final ckq $$2) {
      super(clm.s, $$0);
      this.p = $$2;
      this.t = this.a(new cma(this.y, 0, 13, 26) {
         @Override
         public boolean a(cpd $$0) {
            return $$0.d() instanceof cmt;
         }
      });
      this.u = this.a(new cma(this.y, 1, 33, 26) {
         @Override
         public boolean a(cpd $$0) {
            return $$0.d() instanceof cns;
         }
      });
      this.v = this.a(new cma(this.y, 2, 23, 45) {
         @Override
         public boolean a(cpd $$0) {
            return $$0.d() instanceof cmu;
         }
      });
      this.w = this.a(new cma(this.z, 0, 143, 57) {
         @Override
         public boolean a(cpd $$0) {
            return false;
         }

         @Override
         public void a(chl $$0, cpd $$1) {
            clk.this.t.a(1);
            clk.this.u.a(1);
            if (!clk.this.t.h() || !clk.this.u.h()) {
               clk.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (clk.this.x != $$2xx) {
                  $$0x.a(null, $$1x, atl.zM, atm.e, 1.0F, 1.0F);
                  clk.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cma($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cma($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(chl $$0) {
      return a(this.p, $$0, cyu.nT);
   }

   @Override
   public boolean b(chl $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ij<dio>> c(cpd $$0) {
      if ($$0.b()) {
         return kf.am.b(aty.a).<List<ij<dio>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cmu $$1 ? kf.am.b($$1.b()).<List<ij<dio>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(blp $$0) {
      cpd $$1 = this.t.g();
      cpd $$2 = this.u.g();
      cpd $$3 = this.v.g();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ij<dio>> $$6 = this.r;
         this.r = this.c($$3);
         ij<dio> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ij<dio> $$9 = $$6.get($$4);
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
            sw $$13 = cmw.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.f(cpd.h);
            } else {
               this.a($$7);
            }
         } else {
            this.w.f(cpd.h);
         }

         this.d();
      } else {
         this.w.f(cpd.h);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ij<dio>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cpd a(chl $$0, int $$1) {
      cpd $$2 = cpd.h;
      cma $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpd $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cpd.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof cmt) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cpd.h;
               }
            } else if ($$4.d() instanceof cns) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cpd.h;
               }
            } else if ($$4.d() instanceof cmu) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cpd.h;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cpd.h;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cpd.h;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cpd.h;
         }

         if ($$4.b()) {
            $$3.e(cpd.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cpd.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(chl $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(ij<dio> $$0) {
      cpd $$1 = this.t.g();
      cpd $$2 = this.u.g();
      cpd $$3 = cpd.h;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         cnr $$4 = ((cns)$$2.d()).d();
         sw $$5 = cmw.a($$3);
         tc $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new tc();
            if ($$5 == null) {
               $$5 = new sw();
            }

            $$5.a("Patterns", $$6);
         }

         sw $$8 = new sw();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         cmw.a($$3, diz.t, $$5);
      }

      if (!cpd.a($$3, this.w.g())) {
         this.w.f($$3);
      }
   }

   public cma n() {
      return this.t;
   }

   public cma o() {
      return this.u;
   }

   public cma p() {
      return this.v;
   }

   public cma q() {
      return this.w;
   }
}
