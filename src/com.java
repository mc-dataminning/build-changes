import com.google.common.collect.ImmutableList;
import java.util.List;

public class com extends cnh {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cns p;
   final cnz q = cnz.a();
   private List<iv<dmt>> r = List.of();
   Runnable s = () -> {
   };
   private final iw<dmt> t;
   final cpd u;
   final cpd v;
   private final cpd w;
   private final cpd x;
   long y;
   private final boj z = new boz(3) {
      @Override
      public void e() {
         super.e();
         com.this.a(this);
         com.this.s.run();
      }
   };
   private final boj A = new boz(1) {
      @Override
      public void e() {
         super.e();
         com.this.s.run();
      }
   };

   public com(int $$0, ckk $$1) {
      this($$0, $$1, cns.a);
   }

   public com(int $$0, ckk $$1, final cns $$2) {
      super(cop.s, $$0);
      this.p = $$2;
      this.u = this.a(new cpd(this.z, 0, 13, 26) {
         @Override
         public boolean a(csd $$0) {
            return $$0.f() instanceof cpy;
         }
      });
      this.v = this.a(new cpd(this.z, 1, 33, 26) {
         @Override
         public boolean a(csd $$0) {
            return $$0.f() instanceof cqx;
         }
      });
      this.w = this.a(new cpd(this.z, 2, 23, 45) {
         @Override
         public boolean a(csd $$0) {
            return $$0.f() instanceof cpz;
         }
      });
      this.x = this.a(new cpd(this.A, 0, 143, 57) {
         @Override
         public boolean a(csd $$0) {
            return false;
         }

         @Override
         public void a(ckl $$0, csd $$1) {
            com.this.u.a(1);
            com.this.v.a(1);
            if (!com.this.u.h() || !com.this.v.h()) {
               com.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Y();
               if (com.this.y != $$2xx) {
                  $$0x.a(null, $$1x, auz.Ae, ava.e, 1.0F, 1.0F);
                  com.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cpd($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cpd($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.m.dP().b(ld.d);
   }

   @Override
   public boolean a(ckl $$0) {
      return a(this.p, $$0, dcx.nT);
   }

   @Override
   public boolean b(ckl $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<iv<dmt>> c(csd $$0) {
      if ($$0.d()) {
         return this.t.a(avm.a).<List<iv<dmt>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.f() instanceof cpz $$1 ? this.t.a($$1.b()).<List<iv<dmt>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(boj $$0) {
      csd $$1 = this.u.g();
      csd $$2 = this.v.g();
      csd $$3 = this.w.g();
      if (!$$1.d() && !$$2.d()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<iv<dmt>> $$6 = this.r;
         this.r = this.c($$3);
         iv<dmt> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            iv<dmt> $$9 = $$6.get($$4);
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
            dmu $$13 = $$1.a(jz.N, dmu.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(csd.i);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(csd.i);
         }

         this.d();
      } else {
         this.x.f(csd.i);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<iv<dmt>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public csd a(ckl $$0, int $$1) {
      csd $$2 = csd.i;
      cpd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csd $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == this.x.e) {
            if (!this.a($$4, 4, 40, true)) {
               return csd.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.e && $$1 != this.u.e && $$1 != this.w.e) {
            if ($$4.f() instanceof cpy) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return csd.i;
               }
            } else if ($$4.f() instanceof cqx) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return csd.i;
               }
            } else if ($$4.f() instanceof cpz) {
               if (!this.a($$4, this.w.e, this.w.e + 1, false)) {
                  return csd.i;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return csd.i;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return csd.i;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return csd.i;
         }

         if ($$4.d()) {
            $$3.e(csd.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return csd.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(ckl $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.z));
   }

   private void a(iv<dmt> $$0) {
      csd $$1 = this.u.g();
      csd $$2 = this.v.g();
      csd $$3 = csd.i;
      if (!$$1.d() && !$$2.d()) {
         $$3 = $$1.c(1);
         cqw $$4 = ((cqx)$$2.f()).c();
         $$3.a(jz.N, dmu.a, $$2x -> new dmu.a().a($$2x).a($$0, $$4).a());
      }

      if (!csd.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public cpd n() {
      return this.u;
   }

   public cpd o() {
      return this.v;
   }

   public cpd p() {
      return this.w;
   }

   public cpd q() {
      return this.x;
   }
}
