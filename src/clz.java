import com.google.common.collect.ImmutableList;
import java.util.List;

public class clz extends cku {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final clf p;
   final clm q = clm.a();
   private List<il<djc>> r = List.of();
   Runnable s = () -> {
   };
   final cmp t;
   final cmp u;
   private final cmp v;
   private final cmp w;
   long x;
   private final bme y = new bmu(3) {
      @Override
      public void e() {
         super.e();
         clz.this.a(this);
         clz.this.s.run();
      }
   };
   private final bme z = new bmu(1) {
      @Override
      public void e() {
         super.e();
         clz.this.s.run();
      }
   };

   public clz(int $$0, chz $$1) {
      this($$0, $$1, clf.a);
   }

   public clz(int $$0, chz $$1, final clf $$2) {
      super(cmb.s, $$0);
      this.p = $$2;
      this.t = this.a(new cmp(this.y, 0, 13, 26) {
         @Override
         public boolean a(cpq $$0) {
            return $$0.d() instanceof cni;
         }
      });
      this.u = this.a(new cmp(this.y, 1, 33, 26) {
         @Override
         public boolean a(cpq $$0) {
            return $$0.d() instanceof coh;
         }
      });
      this.v = this.a(new cmp(this.y, 2, 23, 45) {
         @Override
         public boolean a(cpq $$0) {
            return $$0.d() instanceof cnj;
         }
      });
      this.w = this.a(new cmp(this.z, 0, 143, 57) {
         @Override
         public boolean a(cpq $$0) {
            return false;
         }

         @Override
         public void a(cia $$0, cpq $$1) {
            clz.this.t.a(1);
            clz.this.u.a(1);
            if (!clz.this.t.h() || !clz.this.u.h()) {
               clz.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (clz.this.x != $$2xx) {
                  $$0x.a(null, $$1x, atp.zM, atq.e, 1.0F, 1.0F);
                  clz.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cmp($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cmp($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cia $$0) {
      return a(this.p, $$0, czh.nT);
   }

   @Override
   public boolean b(cia $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<il<djc>> c(cpq $$0) {
      if ($$0.b()) {
         return kh.am.b(auc.a).<List<il<djc>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cnj $$1 ? kh.am.b($$1.b()).<List<il<djc>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bme $$0) {
      cpq $$1 = this.t.g();
      cpq $$2 = this.u.g();
      cpq $$3 = this.v.g();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<il<djc>> $$6 = this.r;
         this.r = this.c($$3);
         il<djc> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            il<djc> $$9 = $$6.get($$4);
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
            sy $$13 = cnl.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.f(cpq.h);
            } else {
               this.a($$7);
            }
         } else {
            this.w.f(cpq.h);
         }

         this.d();
      } else {
         this.w.f(cpq.h);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<il<djc>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cpq a(cia $$0, int $$1) {
      cpq $$2 = cpq.h;
      cmp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpq $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cpq.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof cni) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cpq.h;
               }
            } else if ($$4.d() instanceof coh) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cpq.h;
               }
            } else if ($$4.d() instanceof cnj) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cpq.h;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cpq.h;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cpq.h;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cpq.h;
         }

         if ($$4.b()) {
            $$3.e(cpq.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cpq.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cia $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(il<djc> $$0) {
      cpq $$1 = this.t.g();
      cpq $$2 = this.u.g();
      cpq $$3 = cpq.h;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         cog $$4 = ((coh)$$2.d()).c();
         sy $$5 = cnl.a($$3);
         te $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new te();
            if ($$5 == null) {
               $$5 = new sy();
            }

            $$5.a("Patterns", $$6);
         }

         sy $$8 = new sy();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         cnl.a($$3, djn.t, $$5);
      }

      if (!cpq.a($$3, this.w.g())) {
         this.w.f($$3);
      }
   }

   public cmp n() {
      return this.t;
   }

   public cmp o() {
      return this.u;
   }

   public cmp p() {
      return this.v;
   }

   public cmp q() {
      return this.w;
   }
}
