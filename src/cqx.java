import com.google.common.collect.ImmutableList;
import java.util.List;

public class cqx extends cps {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cqd p;
   final cqk q = cqk.a();
   private List<ji<dov>> r = List.of();
   Runnable s = () -> {
   };
   private final jj<dov> t;
   final crn u;
   final crn v;
   private final crn w;
   private final crn x;
   long y;
   private final bql z = new brb(3) {
      @Override
      public void e() {
         super.e();
         cqx.this.a(this);
         cqx.this.s.run();
      }
   };
   private final bql A = new brb(1) {
      @Override
      public void e() {
         super.e();
         cqx.this.s.run();
      }
   };

   public cqx(int $$0, cmu $$1) {
      this($$0, $$1, cqd.a);
   }

   public cqx(int $$0, cmu $$1, final cqd $$2) {
      super(cqz.s, $$0);
      this.p = $$2;
      this.u = this.a(new crn(this.z, 0, 13, 26) {
         @Override
         public boolean a(cun $$0) {
            return $$0.g() instanceof csi;
         }
      });
      this.v = this.a(new crn(this.z, 1, 33, 26) {
         @Override
         public boolean a(cun $$0) {
            return $$0.g() instanceof cth;
         }
      });
      this.w = this.a(new crn(this.z, 2, 23, 45) {
         @Override
         public boolean a(cun $$0) {
            return $$0.g() instanceof csj;
         }
      });
      this.x = this.a(new crn(this.A, 0, 143, 57) {
         @Override
         public boolean a(cun $$0) {
            return false;
         }

         @Override
         public void a(cmv $$0, cun $$1) {
            cqx.this.u.a(1);
            cqx.this.v.a(1);
            if (!cqx.this.u.h() || !cqx.this.v.h()) {
               cqx.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cqx.this.y != $$2xx) {
                  $$0x.a(null, $$1x, avz.Aq, awa.e, 1.0F, 1.0F);
                  cqx.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crn($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crn($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.l.dR().b(lq.d);
   }

   @Override
   public boolean a(cmv $$0) {
      return a(this.p, $$0, dez.nT);
   }

   @Override
   public boolean b(cmv $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ji<dov>> c(cun $$0) {
      if ($$0.e()) {
         return this.t.a(awm.a).<List<ji<dov>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.g() instanceof csj $$1 ? this.t.a($$1.b()).<List<ji<dov>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bql $$0) {
      cun $$1 = this.u.g();
      cun $$2 = this.v.g();
      cun $$3 = this.w.g();
      if (!$$1.e() && !$$2.e()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ji<dov>> $$6 = this.r;
         this.r = this.c($$3);
         ji<dov> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ji<dov> $$9 = $$6.get($$4);
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
            dow $$13 = $$1.a(km.W, dow.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(cun.l);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(cun.l);
         }

         this.d();
      } else {
         this.x.f(cun.l);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ji<dov>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cun a(cmv $$0, int $$1) {
      cun $$2 = cun.l;
      crn $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cun $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == this.x.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cun.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.d && $$1 != this.u.d && $$1 != this.w.d) {
            if ($$4.g() instanceof csi) {
               if (!this.a($$4, this.u.d, this.u.d + 1, false)) {
                  return cun.l;
               }
            } else if ($$4.g() instanceof cth) {
               if (!this.a($$4, this.v.d, this.v.d + 1, false)) {
                  return cun.l;
               }
            } else if ($$4.g() instanceof csj) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cun.l;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cun.l;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cun.l;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cun.l;
         }

         if ($$4.e()) {
            $$3.e(cun.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cun.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cmv $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.z));
   }

   private void a(ji<dov> $$0) {
      cun $$1 = this.u.g();
      cun $$2 = this.v.g();
      cun $$3 = cun.l;
      if (!$$1.e() && !$$2.e()) {
         $$3 = $$1.c(1);
         ctg $$4 = ((cth)$$2.g()).c();
         $$3.a(km.W, dow.a, $$2x -> new dow.a().a($$2x).a($$0, $$4).a());
      }

      if (!cun.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public crn n() {
      return this.u;
   }

   public crn o() {
      return this.v;
   }

   public crn p() {
      return this.w;
   }

   public crn q() {
      return this.x;
   }
}
