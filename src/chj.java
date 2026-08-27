import com.google.common.collect.ImmutableList;
import java.util.List;

public class chj extends cge {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cgp p;
   final cgw q = cgw.a();
   private List<ib<dei>> r = List.of();
   Runnable s = () -> {
   };
   final chz t;
   final chz u;
   private final chz v;
   private final chz w;
   long x;
   private final bij y = new bix(3) {
      @Override
      public void e() {
         super.e();
         chj.this.a(this);
         chj.this.s.run();
      }
   };
   private final bij z = new bix(1) {
      @Override
      public void e() {
         super.e();
         chj.this.s.run();
      }
   };

   public chj(int $$0, cdl $$1) {
      this($$0, $$1, cgp.a);
   }

   public chj(int $$0, cdl $$1, final cgp $$2) {
      super(chl.s, $$0);
      this.p = $$2;
      this.t = this.a(new chz(this.y, 0, 13, 26) {
         @Override
         public boolean a(clb $$0) {
            return $$0.d() instanceof cir;
         }
      });
      this.u = this.a(new chz(this.y, 1, 33, 26) {
         @Override
         public boolean a(clb $$0) {
            return $$0.d() instanceof cjq;
         }
      });
      this.v = this.a(new chz(this.y, 2, 23, 45) {
         @Override
         public boolean a(clb $$0) {
            return $$0.d() instanceof cis;
         }
      });
      this.w = this.a(new chz(this.z, 0, 143, 57) {
         @Override
         public boolean a(clb $$0) {
            return false;
         }

         @Override
         public void a(cdm $$0, clb $$1) {
            chj.this.t.a(1);
            chj.this.u.a(1);
            if (!chj.this.t.g() || !chj.this.u.g()) {
               chj.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (chj.this.x != $$2xx) {
                  $$0x.a(null, $$1x, aqn.yA, aqo.e, 1.0F, 1.0F);
                  chj.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new chz($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new chz($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cdm $$0) {
      return a(this.p, $$0, cuv.nT);
   }

   @Override
   public boolean b(cdm $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ib<dei>> c(clb $$0) {
      if ($$0.b()) {
         return jy.an.b(ara.a).<List<ib<dei>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cis $$1 ? jy.an.b($$1.b()).<List<ib<dei>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bij $$0) {
      clb $$1 = this.t.f();
      clb $$2 = this.u.f();
      clb $$3 = this.v.f();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ib<dei>> $$6 = this.r;
         this.r = this.c($$3);
         ib<dei> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ib<dei> $$9 = $$6.get($$4);
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
            rz $$13 = ciu.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.f(clb.b);
            } else {
               this.a($$7);
            }
         } else {
            this.w.f(clb.b);
         }

         this.d();
      } else {
         this.w.f(clb.b);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ib<dei>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public clb a(cdm $$0, int $$1) {
      clb $$2 = clb.b;
      chz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clb $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return clb.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof cir) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return clb.b;
               }
            } else if ($$4.d() instanceof cjq) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return clb.b;
               }
            } else if ($$4.d() instanceof cis) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return clb.b;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return clb.b;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return clb.b;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return clb.b;
         }

         if ($$4.b()) {
            $$3.e(clb.b);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clb.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cdm $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(ib<dei> $$0) {
      clb $$1 = this.t.f();
      clb $$2 = this.u.f();
      clb $$3 = clb.b;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         cjp $$4 = ((cjq)$$2.d()).d();
         rz $$5 = ciu.a($$3);
         sf $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new sf();
            if ($$5 == null) {
               $$5 = new rz();
            }

            $$5.a("Patterns", $$6);
         }

         rz $$8 = new rz();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         ciu.a($$3, det.t, $$5);
      }

      if (!clb.a($$3, this.w.f())) {
         this.w.f($$3);
      }
   }

   public chz n() {
      return this.t;
   }

   public chz o() {
      return this.u;
   }

   public chz p() {
      return this.v;
   }

   public chz q() {
      return this.w;
   }
}
