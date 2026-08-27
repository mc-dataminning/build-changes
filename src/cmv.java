import com.google.common.collect.ImmutableList;
import java.util.List;

public class cmv extends clq {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cmb p;
   final cmi q = cmi.a();
   private List<il<djz>> r = List.of();
   Runnable s = () -> {
   };
   final cnl t;
   final cnl u;
   private final cnl v;
   private final cnl w;
   long x;
   private final bmw y = new bnm(3) {
      @Override
      public void e() {
         super.e();
         cmv.this.a(this);
         cmv.this.s.run();
      }
   };
   private final bmw z = new bnm(1) {
      @Override
      public void e() {
         super.e();
         cmv.this.s.run();
      }
   };

   public cmv(int $$0, cit $$1) {
      this($$0, $$1, cmb.a);
   }

   public cmv(int $$0, cit $$1, final cmb $$2) {
      super(cmx.s, $$0);
      this.p = $$2;
      this.t = this.a(new cnl(this.y, 0, 13, 26) {
         @Override
         public boolean a(cqm $$0) {
            return $$0.d() instanceof coe;
         }
      });
      this.u = this.a(new cnl(this.y, 1, 33, 26) {
         @Override
         public boolean a(cqm $$0) {
            return $$0.d() instanceof cpe;
         }
      });
      this.v = this.a(new cnl(this.y, 2, 23, 45) {
         @Override
         public boolean a(cqm $$0) {
            return $$0.d() instanceof cof;
         }
      });
      this.w = this.a(new cnl(this.z, 0, 143, 57) {
         @Override
         public boolean a(cqm $$0) {
            return false;
         }

         @Override
         public void a(ciu $$0, cqm $$1) {
            cmv.this.t.a(1);
            cmv.this.u.a(1);
            if (!cmv.this.t.h() || !cmv.this.u.h()) {
               cmv.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (cmv.this.x != $$2xx) {
                  $$0x.a(null, $$1x, aty.zU, atz.e, 1.0F, 1.0F);
                  cmv.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cnl($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cnl($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(ciu $$0) {
      return a(this.p, $$0, dae.nT);
   }

   @Override
   public boolean b(ciu $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<il<djz>> c(cqm $$0) {
      if ($$0.b()) {
         return ki.am.b(aul.a).<List<il<djz>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cof $$1 ? ki.am.b($$1.b()).<List<il<djz>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bmw $$0) {
      cqm $$1 = this.t.g();
      cqm $$2 = this.u.g();
      cqm $$3 = this.v.g();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<il<djz>> $$6 = this.r;
         this.r = this.c($$3);
         il<djz> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            il<djz> $$9 = $$6.get($$4);
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
            ta $$13 = coh.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.f(cqm.h);
            } else {
               this.a($$7);
            }
         } else {
            this.w.f(cqm.h);
         }

         this.d();
      } else {
         this.w.f(cqm.h);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<il<djz>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cqm a(ciu $$0, int $$1) {
      cqm $$2 = cqm.h;
      cnl $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqm $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cqm.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof coe) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cqm.h;
               }
            } else if ($$4.d() instanceof cpe) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cqm.h;
               }
            } else if ($$4.d() instanceof cof) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cqm.h;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cqm.h;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cqm.h;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cqm.h;
         }

         if ($$4.b()) {
            $$3.e(cqm.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqm.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(ciu $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(il<djz> $$0) {
      cqm $$1 = this.t.g();
      cqm $$2 = this.u.g();
      cqm $$3 = cqm.h;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         cpd $$4 = ((cpe)$$2.d()).c();
         ta $$5 = coh.a($$3);
         tg $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new tg();
            if ($$5 == null) {
               $$5 = new ta();
            }

            $$5.a("Patterns", $$6);
         }

         ta $$8 = new ta();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         coh.a($$3, dkk.t, $$5);
      }

      if (!cqm.a($$3, this.w.g())) {
         this.w.f($$3);
      }
   }

   public cnl n() {
      return this.t;
   }

   public cnl o() {
      return this.u;
   }

   public cnl p() {
      return this.v;
   }

   public cnl q() {
      return this.w;
   }
}
