import com.google.common.collect.ImmutableList;
import java.util.List;

public class cqm extends cpg {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cpr p;
   final cpy q = cpy.a();
   private List<ja<dpr>> r = List.of();
   Runnable s = () -> {
   };
   private final jb<dpr> t;
   final cre u;
   final cre v;
   private final cre w;
   private final cre x;
   long y;
   private final bpt z = new bqj(3) {
      @Override
      public void e() {
         super.e();
         cqm.this.a(this);
         cqm.this.s.run();
      }
   };
   private final bpt A = new bqj(1) {
      @Override
      public void e() {
         super.e();
         cqm.this.s.run();
      }
   };

   public cqm(int $$0, clx $$1) {
      this($$0, $$1, cpr.a);
   }

   public cqm(int $$0, clx $$1, final cpr $$2) {
      super(cqo.t, $$0);
      this.p = $$2;
      this.u = this.a(new cre(this.z, 0, 13, 26) {
         @Override
         public boolean a(cuh $$0) {
            return $$0.f() instanceof crz;
         }
      });
      this.v = this.a(new cre(this.z, 1, 33, 26) {
         @Override
         public boolean a(cuh $$0) {
            return $$0.f() instanceof csz;
         }
      });
      this.w = this.a(new cre(this.z, 2, 23, 45) {
         @Override
         public boolean a(cuh $$0) {
            return $$0.f() instanceof csa;
         }
      });
      this.x = this.a(new cre(this.A, 0, 143, 57) {
         @Override
         public boolean a(cuh $$0) {
            return false;
         }

         @Override
         public void a(cly $$0, cuh $$1) {
            cqm.this.u.a(1);
            cqm.this.v.a(1);
            if (!cqm.this.u.h() || !cqm.this.v.h()) {
               cqm.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cqm.this.y != $$2xx) {
                  $$0x.a(null, $$1x, avo.AO, avq.e, 1.0F, 1.0F);
                  cqm.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cre($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cre($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.l.dY().b(li.d);
   }

   @Override
   public boolean a(cly $$0) {
      return a(this.p, $$0, dfe.oR);
   }

   @Override
   public boolean b(cly $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ja<dpr>> c(cuh $$0) {
      if ($$0.d()) {
         return this.t.a(awc.a).<List<ja<dpr>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.f() instanceof csa $$1 ? this.t.a($$1.b()).<List<ja<dpr>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bpt $$0) {
      cuh $$1 = this.u.g();
      cuh $$2 = this.v.g();
      cuh $$3 = this.w.g();
      if (!$$1.d() && !$$2.d()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ja<dpr>> $$6 = this.r;
         this.r = this.c($$3);
         ja<dpr> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ja<dpr> $$9 = $$6.get($$4);
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
            dps $$13 = $$1.a(ke.W, dps.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(cuh.i);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(cuh.i);
         }

         this.d();
      } else {
         this.x.f(cuh.i);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ja<dpr>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      cuh $$2 = cuh.i;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuh $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == this.x.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cuh.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.e && $$1 != this.u.e && $$1 != this.w.e) {
            if ($$4.f() instanceof crz) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cuh.i;
               }
            } else if ($$4.f() instanceof csz) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cuh.i;
               }
            } else if ($$4.f() instanceof csa) {
               if (!this.a($$4, this.w.e, this.w.e + 1, false)) {
                  return cuh.i;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cuh.i;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cuh.i;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cuh.i;
         }

         if ($$4.d()) {
            $$3.e(cuh.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return cuh.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.z));
   }

   private void a(ja<dpr> $$0) {
      cuh $$1 = this.u.g();
      cuh $$2 = this.v.g();
      cuh $$3 = cuh.i;
      if (!$$1.d() && !$$2.d()) {
         $$3 = $$1.c(1);
         csy $$4 = ((csz)$$2.f()).c();
         $$3.a(ke.W, dps.a, $$2x -> new dps.a().a($$2x).a($$0, $$4).a());
      }

      if (!cuh.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public cre n() {
      return this.u;
   }

   public cre o() {
      return this.v;
   }

   public cre p() {
      return this.w;
   }

   public cre q() {
      return this.x;
   }
}
