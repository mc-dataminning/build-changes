import com.google.common.collect.ImmutableList;
import java.util.List;

public class cqa extends cov {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cpg p;
   final cpn q = cpn.a();
   private List<ix<dny>> r = List.of();
   Runnable s = () -> {
   };
   private final iy<dny> t;
   final cqq u;
   final cqq v;
   private final cqq w;
   private final cqq x;
   long y;
   private final bpp z = new bqf(3) {
      @Override
      public void e() {
         super.e();
         cqa.this.a(this);
         cqa.this.s.run();
      }
   };
   private final bpp A = new bqf(1) {
      @Override
      public void e() {
         super.e();
         cqa.this.s.run();
      }
   };

   public cqa(int $$0, clx $$1) {
      this($$0, $$1, cpg.a);
   }

   public cqa(int $$0, clx $$1, final cpg $$2) {
      super(cqc.s, $$0);
      this.p = $$2;
      this.u = this.a(new cqq(this.z, 0, 13, 26) {
         @Override
         public boolean a(ctq $$0) {
            return $$0.g() instanceof crl;
         }
      });
      this.v = this.a(new cqq(this.z, 1, 33, 26) {
         @Override
         public boolean a(ctq $$0) {
            return $$0.g() instanceof csk;
         }
      });
      this.w = this.a(new cqq(this.z, 2, 23, 45) {
         @Override
         public boolean a(ctq $$0) {
            return $$0.g() instanceof crm;
         }
      });
      this.x = this.a(new cqq(this.A, 0, 143, 57) {
         @Override
         public boolean a(ctq $$0) {
            return false;
         }

         @Override
         public void a(cly $$0, ctq $$1) {
            cqa.this.u.a(1);
            cqa.this.v.a(1);
            if (!cqa.this.u.h() || !cqa.this.v.h()) {
               cqa.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Y();
               if (cqa.this.y != $$2xx) {
                  $$0x.a(null, $$1x, avi.Aq, avj.e, 1.0F, 1.0F);
                  cqa.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cqq($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cqq($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.l.dR().b(lf.d);
   }

   @Override
   public boolean a(cly $$0) {
      return a(this.p, $$0, dec.nT);
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

   private List<ix<dny>> c(ctq $$0) {
      if ($$0.e()) {
         return this.t.a(avv.a).<List<ix<dny>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.g() instanceof crm $$1 ? this.t.a($$1.b()).<List<ix<dny>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bpp $$0) {
      ctq $$1 = this.u.g();
      ctq $$2 = this.v.g();
      ctq $$3 = this.w.g();
      if (!$$1.e() && !$$2.e()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ix<dny>> $$6 = this.r;
         this.r = this.c($$3);
         ix<dny> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ix<dny> $$9 = $$6.get($$4);
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
            dnz $$13 = $$1.a(kb.W, dnz.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(ctq.i);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(ctq.i);
         }

         this.d();
      } else {
         this.x.f(ctq.i);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ix<dny>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public ctq a(cly $$0, int $$1) {
      ctq $$2 = ctq.i;
      cqq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         ctq $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == this.x.d) {
            if (!this.a($$4, 4, 40, true)) {
               return ctq.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.d && $$1 != this.u.d && $$1 != this.w.d) {
            if ($$4.g() instanceof crl) {
               if (!this.a($$4, this.u.d, this.u.d + 1, false)) {
                  return ctq.i;
               }
            } else if ($$4.g() instanceof csk) {
               if (!this.a($$4, this.v.d, this.v.d + 1, false)) {
                  return ctq.i;
               }
            } else if ($$4.g() instanceof crm) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return ctq.i;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return ctq.i;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return ctq.i;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return ctq.i;
         }

         if ($$4.e()) {
            $$3.e(ctq.i);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return ctq.i;
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

   private void a(ix<dny> $$0) {
      ctq $$1 = this.u.g();
      ctq $$2 = this.v.g();
      ctq $$3 = ctq.i;
      if (!$$1.e() && !$$2.e()) {
         $$3 = $$1.c(1);
         csj $$4 = ((csk)$$2.g()).c();
         $$3.a(kb.W, dnz.a, $$2x -> new dnz.a().a($$2x).a($$0, $$4).a());
      }

      if (!ctq.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public cqq n() {
      return this.u;
   }

   public cqq o() {
      return this.v;
   }

   public cqq p() {
      return this.w;
   }

   public cqq q() {
      return this.x;
   }
}
