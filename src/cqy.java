import com.google.common.collect.ImmutableList;
import java.util.List;

public class cqy extends cpt {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cqe p;
   final cql q = cql.a();
   private List<ji<dow>> r = List.of();
   Runnable s = () -> {
   };
   private final jj<dow> t;
   final cro u;
   final cro v;
   private final cro w;
   private final cro x;
   long y;
   private final bqm z = new brc(3) {
      @Override
      public void e() {
         super.e();
         cqy.this.a(this);
         cqy.this.s.run();
      }
   };
   private final bqm A = new brc(1) {
      @Override
      public void e() {
         super.e();
         cqy.this.s.run();
      }
   };

   public cqy(int $$0, cmv $$1) {
      this($$0, $$1, cqe.a);
   }

   public cqy(int $$0, cmv $$1, final cqe $$2) {
      super(cra.s, $$0);
      this.p = $$2;
      this.u = this.a(new cro(this.z, 0, 13, 26) {
         @Override
         public boolean a(cuo $$0) {
            return $$0.g() instanceof csj;
         }
      });
      this.v = this.a(new cro(this.z, 1, 33, 26) {
         @Override
         public boolean a(cuo $$0) {
            return $$0.g() instanceof cti;
         }
      });
      this.w = this.a(new cro(this.z, 2, 23, 45) {
         @Override
         public boolean a(cuo $$0) {
            return $$0.g() instanceof csk;
         }
      });
      this.x = this.a(new cro(this.A, 0, 143, 57) {
         @Override
         public boolean a(cuo $$0) {
            return false;
         }

         @Override
         public void a(cmw $$0, cuo $$1) {
            cqy.this.u.a(1);
            cqy.this.v.a(1);
            if (!cqy.this.u.h() || !cqy.this.v.h()) {
               cqy.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cqy.this.y != $$2xx) {
                  $$0x.a(null, $$1x, avz.Aq, awa.e, 1.0F, 1.0F);
                  cqy.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cro($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cro($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.l.dR().b(lq.d);
   }

   @Override
   public boolean a(cmw $$0) {
      return a(this.p, $$0, dfa.nT);
   }

   @Override
   public boolean b(cmw $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ji<dow>> c(cuo $$0) {
      if ($$0.e()) {
         return this.t.a(awm.a).<List<ji<dow>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.g() instanceof csk $$1 ? this.t.a($$1.b()).<List<ji<dow>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bqm $$0) {
      cuo $$1 = this.u.g();
      cuo $$2 = this.v.g();
      cuo $$3 = this.w.g();
      if (!$$1.e() && !$$2.e()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ji<dow>> $$6 = this.r;
         this.r = this.c($$3);
         ji<dow> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ji<dow> $$9 = $$6.get($$4);
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
            dox $$13 = $$1.a(km.X, dox.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(cuo.l);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(cuo.l);
         }

         this.d();
      } else {
         this.x.f(cuo.l);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ji<dow>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cuo a(cmw $$0, int $$1) {
      cuo $$2 = cuo.l;
      cro $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuo $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == this.x.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cuo.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.d && $$1 != this.u.d && $$1 != this.w.d) {
            if ($$4.g() instanceof csj) {
               if (!this.a($$4, this.u.d, this.u.d + 1, false)) {
                  return cuo.l;
               }
            } else if ($$4.g() instanceof cti) {
               if (!this.a($$4, this.v.d, this.v.d + 1, false)) {
                  return cuo.l;
               }
            } else if ($$4.g() instanceof csk) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cuo.l;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cuo.l;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cuo.l;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cuo.l;
         }

         if ($$4.e()) {
            $$3.e(cuo.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cuo.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cmw $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.z));
   }

   private void a(ji<dow> $$0) {
      cuo $$1 = this.u.g();
      cuo $$2 = this.v.g();
      cuo $$3 = cuo.l;
      if (!$$1.e() && !$$2.e()) {
         $$3 = $$1.c(1);
         cth $$4 = ((cti)$$2.g()).c();
         $$3.a(km.X, dox.a, $$2x -> new dox.a().a($$2x).a($$0, $$4).a());
      }

      if (!cuo.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public cro n() {
      return this.u;
   }

   public cro o() {
      return this.v;
   }

   public cro p() {
      return this.w;
   }

   public cro q() {
      return this.x;
   }
}
