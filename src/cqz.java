import com.google.common.collect.ImmutableList;
import java.util.List;

public class cqz extends cpu {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cqf p;
   final cqm q = cqm.a();
   private List<ji<dox>> r = List.of();
   Runnable s = () -> {
   };
   private final jj<dox> t;
   final crp u;
   final crp v;
   private final crp w;
   private final crp x;
   long y;
   private final bqn z = new brd(3) {
      @Override
      public void e() {
         super.e();
         cqz.this.a(this);
         cqz.this.s.run();
      }
   };
   private final bqn A = new brd(1) {
      @Override
      public void e() {
         super.e();
         cqz.this.s.run();
      }
   };

   public cqz(int $$0, cmw $$1) {
      this($$0, $$1, cqf.a);
   }

   public cqz(int $$0, cmw $$1, final cqf $$2) {
      super(crb.s, $$0);
      this.p = $$2;
      this.u = this.a(new crp(this.z, 0, 13, 26) {
         @Override
         public boolean a(cup $$0) {
            return $$0.g() instanceof csk;
         }
      });
      this.v = this.a(new crp(this.z, 1, 33, 26) {
         @Override
         public boolean a(cup $$0) {
            return $$0.g() instanceof ctj;
         }
      });
      this.w = this.a(new crp(this.z, 2, 23, 45) {
         @Override
         public boolean a(cup $$0) {
            return $$0.g() instanceof csl;
         }
      });
      this.x = this.a(new crp(this.A, 0, 143, 57) {
         @Override
         public boolean a(cup $$0) {
            return false;
         }

         @Override
         public void a(cmx $$0, cup $$1) {
            cqz.this.u.a(1);
            cqz.this.v.a(1);
            if (!cqz.this.u.h() || !cqz.this.v.h()) {
               cqz.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cqz.this.y != $$2xx) {
                  $$0x.a(null, $$1x, awa.Aq, awb.e, 1.0F, 1.0F);
                  cqz.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crp($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crp($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.l.dR().b(lq.d);
   }

   @Override
   public boolean a(cmx $$0) {
      return a(this.p, $$0, dfb.nT);
   }

   @Override
   public boolean b(cmx $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ji<dox>> c(cup $$0) {
      if ($$0.e()) {
         return this.t.a(awn.a).<List<ji<dox>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.g() instanceof csl $$1 ? this.t.a($$1.b()).<List<ji<dox>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bqn $$0) {
      cup $$1 = this.u.g();
      cup $$2 = this.v.g();
      cup $$3 = this.w.g();
      if (!$$1.e() && !$$2.e()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ji<dox>> $$6 = this.r;
         this.r = this.c($$3);
         ji<dox> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ji<dox> $$9 = $$6.get($$4);
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
            doy $$13 = $$1.a(km.X, doy.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(cup.l);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(cup.l);
         }

         this.d();
      } else {
         this.x.f(cup.l);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ji<dox>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cup a(cmx $$0, int $$1) {
      cup $$2 = cup.l;
      crp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cup $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == this.x.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cup.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.d && $$1 != this.u.d && $$1 != this.w.d) {
            if ($$4.g() instanceof csk) {
               if (!this.a($$4, this.u.d, this.u.d + 1, false)) {
                  return cup.l;
               }
            } else if ($$4.g() instanceof ctj) {
               if (!this.a($$4, this.v.d, this.v.d + 1, false)) {
                  return cup.l;
               }
            } else if ($$4.g() instanceof csl) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cup.l;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cup.l;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cup.l;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cup.l;
         }

         if ($$4.e()) {
            $$3.e(cup.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cup.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cmx $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.z));
   }

   private void a(ji<dox> $$0) {
      cup $$1 = this.u.g();
      cup $$2 = this.v.g();
      cup $$3 = cup.l;
      if (!$$1.e() && !$$2.e()) {
         $$3 = $$1.c(1);
         cti $$4 = ((ctj)$$2.g()).c();
         $$3.a(km.X, doy.a, $$2x -> new doy.a().a($$2x).a($$0, $$4).a());
      }

      if (!cup.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public crp n() {
      return this.u;
   }

   public crp o() {
      return this.v;
   }

   public crp p() {
      return this.w;
   }

   public crp q() {
      return this.x;
   }
}
