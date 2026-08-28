import com.google.common.collect.ImmutableList;
import java.util.List;

public class cqu extends cpp {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cqa p;
   final cqh q = cqh.a();
   private List<ji<dos>> r = List.of();
   Runnable s = () -> {
   };
   private final jj<dos> t;
   final crk u;
   final crk v;
   private final crk w;
   private final crk x;
   long y;
   private final bqi z = new bqy(3) {
      @Override
      public void e() {
         super.e();
         cqu.this.a(this);
         cqu.this.s.run();
      }
   };
   private final bqi A = new bqy(1) {
      @Override
      public void e() {
         super.e();
         cqu.this.s.run();
      }
   };

   public cqu(int $$0, cmr $$1) {
      this($$0, $$1, cqa.a);
   }

   public cqu(int $$0, cmr $$1, final cqa $$2) {
      super(cqw.s, $$0);
      this.p = $$2;
      this.u = this.a(new crk(this.z, 0, 13, 26) {
         @Override
         public boolean a(cuk $$0) {
            return $$0.g() instanceof csf;
         }
      });
      this.v = this.a(new crk(this.z, 1, 33, 26) {
         @Override
         public boolean a(cuk $$0) {
            return $$0.g() instanceof cte;
         }
      });
      this.w = this.a(new crk(this.z, 2, 23, 45) {
         @Override
         public boolean a(cuk $$0) {
            return $$0.g() instanceof csg;
         }
      });
      this.x = this.a(new crk(this.A, 0, 143, 57) {
         @Override
         public boolean a(cuk $$0) {
            return false;
         }

         @Override
         public void a(cms $$0, cuk $$1) {
            cqu.this.u.a(1);
            cqu.this.v.a(1);
            if (!cqu.this.u.h() || !cqu.this.v.h()) {
               cqu.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cqu.this.y != $$2xx) {
                  $$0x.a(null, $$1x, avw.Aq, avx.e, 1.0F, 1.0F);
                  cqu.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crk($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crk($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.l.dR().b(lq.d);
   }

   @Override
   public boolean a(cms $$0) {
      return a(this.p, $$0, dew.nT);
   }

   @Override
   public boolean b(cms $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ji<dos>> c(cuk $$0) {
      if ($$0.e()) {
         return this.t.a(awj.a).<List<ji<dos>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.g() instanceof csg $$1 ? this.t.a($$1.b()).<List<ji<dos>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bqi $$0) {
      cuk $$1 = this.u.g();
      cuk $$2 = this.v.g();
      cuk $$3 = this.w.g();
      if (!$$1.e() && !$$2.e()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ji<dos>> $$6 = this.r;
         this.r = this.c($$3);
         ji<dos> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ji<dos> $$9 = $$6.get($$4);
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
            dot $$13 = $$1.a(km.W, dot.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(cuk.l);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(cuk.l);
         }

         this.d();
      } else {
         this.x.f(cuk.l);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ji<dos>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cuk a(cms $$0, int $$1) {
      cuk $$2 = cuk.l;
      crk $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuk $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == this.x.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cuk.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.d && $$1 != this.u.d && $$1 != this.w.d) {
            if ($$4.g() instanceof csf) {
               if (!this.a($$4, this.u.d, this.u.d + 1, false)) {
                  return cuk.l;
               }
            } else if ($$4.g() instanceof cte) {
               if (!this.a($$4, this.v.d, this.v.d + 1, false)) {
                  return cuk.l;
               }
            } else if ($$4.g() instanceof csg) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cuk.l;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cuk.l;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cuk.l;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cuk.l;
         }

         if ($$4.e()) {
            $$3.e(cuk.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cuk.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cms $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.z));
   }

   private void a(ji<dos> $$0) {
      cuk $$1 = this.u.g();
      cuk $$2 = this.v.g();
      cuk $$3 = cuk.l;
      if (!$$1.e() && !$$2.e()) {
         $$3 = $$1.c(1);
         ctd $$4 = ((cte)$$2.g()).c();
         $$3.a(km.W, dot.a, $$2x -> new dot.a().a($$2x).a($$0, $$4).a());
      }

      if (!cuk.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public crk n() {
      return this.u;
   }

   public crk o() {
      return this.v;
   }

   public crk p() {
      return this.w;
   }

   public crk q() {
      return this.x;
   }
}
