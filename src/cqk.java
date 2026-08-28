import com.google.common.collect.ImmutableList;
import java.util.List;

public class cqk extends cpe {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cpq p;
   final cpx q = cpx.a();
   private List<jj<dpd>> r = List.of();
   Runnable s = () -> {
   };
   private final jk<dpd> t;
   final cra u;
   final cra v;
   private final cra w;
   private final cra x;
   long y;
   private final bpw z = new bqm(3) {
      @Override
      public void e() {
         super.e();
         cqk.this.a(this);
         cqk.this.s.run();
      }
   };
   private final bpw A = new bqm(1) {
      @Override
      public void e() {
         super.e();
         cqk.this.s.run();
      }
   };

   public cqk(int $$0, cmg $$1) {
      this($$0, $$1, cpq.a);
   }

   public cqk(int $$0, cmg $$1, final cpq $$2) {
      super(cqm.s, $$0);
      this.p = $$2;
      this.u = this.a(new cra(this.z, 0, 13, 26) {
         @Override
         public boolean a(cua $$0) {
            return $$0.g() instanceof crv;
         }
      });
      this.v = this.a(new cra(this.z, 1, 33, 26) {
         @Override
         public boolean a(cua $$0) {
            return $$0.g() instanceof csu;
         }
      });
      this.w = this.a(new cra(this.z, 2, 23, 45) {
         @Override
         public boolean a(cua $$0) {
            return $$0.g() instanceof crw;
         }
      });
      this.x = this.a(new cra(this.A, 0, 143, 57) {
         @Override
         public boolean a(cua $$0) {
            return false;
         }

         @Override
         public void a(cmh $$0, cua $$1) {
            cqk.this.u.a(1);
            cqk.this.v.a(1);
            if (!cqk.this.u.h() || !cqk.this.v.h()) {
               cqk.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cqk.this.y != $$2xx) {
                  $$0x.a(null, $$1x, avf.At, avg.e, 1.0F, 1.0F);
                  cqk.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cra($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cra($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.l.dR().b(lr.d);
   }

   @Override
   public boolean b(cmh $$0) {
      return a(this.p, $$0, dfh.nT);
   }

   @Override
   public boolean a(cmh $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jj<dpd>> c(cua $$0) {
      if ($$0.e()) {
         return this.t.a(avs.a).<List<jj<dpd>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.g() instanceof crw $$1 ? this.t.a($$1.b()).<List<jj<dpd>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bpw $$0) {
      cua $$1 = this.u.g();
      cua $$2 = this.v.g();
      cua $$3 = this.w.g();
      if (!$$1.e() && !$$2.e()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<jj<dpd>> $$6 = this.r;
         this.r = this.c($$3);
         jj<dpd> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            jj<dpd> $$9 = $$6.get($$4);
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
            dpe $$13 = $$1.a(kn.X, dpe.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(cua.l);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(cua.l);
         }

         this.d();
      } else {
         this.x.f(cua.l);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<jj<dpd>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cua b(cmh $$0, int $$1) {
      cua $$2 = cua.l;
      cra $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cua $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == this.x.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cua.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.d && $$1 != this.u.d && $$1 != this.w.d) {
            if ($$4.g() instanceof crv) {
               if (!this.a($$4, this.u.d, this.u.d + 1, false)) {
                  return cua.l;
               }
            } else if ($$4.g() instanceof csu) {
               if (!this.a($$4, this.v.d, this.v.d + 1, false)) {
                  return cua.l;
               }
            } else if ($$4.g() instanceof crw) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cua.l;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cua.l;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cua.l;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cua.l;
         }

         if ($$4.e()) {
            $$3.e(cua.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cua.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cmh $$0) {
      super.a($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.z));
   }

   private void a(jj<dpd> $$0) {
      cua $$1 = this.u.g();
      cua $$2 = this.v.g();
      cua $$3 = cua.l;
      if (!$$1.e() && !$$2.e()) {
         $$3 = $$1.c(1);
         cst $$4 = ((csu)$$2.g()).c();
         $$3.a(kn.X, dpe.a, $$2x -> new dpe.a().a($$2x).a($$0, $$4).a());
      }

      if (!cua.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public cra n() {
      return this.u;
   }

   public cra o() {
      return this.v;
   }

   public cra p() {
      return this.w;
   }

   public cra q() {
      return this.x;
   }
}
