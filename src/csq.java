import com.google.common.collect.ImmutableList;
import java.util.List;

public class csq extends crj {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final crw r;
   final csd s = csd.a();
   private List<jp<drw>> t = List.of();
   Runnable u = () -> {
   };
   private final jq<drw> v;
   final ctg w;
   final ctg x;
   private final ctg y;
   private final ctg z;
   long A;
   private final brr B = new bsf(3) {
      @Override
      public void e() {
         super.e();
         csq.this.a(this);
         csq.this.u.run();
      }
   };
   private final brr C = new bsf(1) {
      @Override
      public void e() {
         super.e();
         csq.this.u.run();
      }
   };

   public csq(int $$0, cog $$1) {
      this($$0, $$1, crw.a);
   }

   public csq(int $$0, cog $$1, final crw $$2) {
      super(css.s, $$0);
      this.r = $$2;
      this.w = this.a(new ctg(this.B, 0, 13, 26) {
         @Override
         public boolean a(cvx $$0) {
            return $$0.h() instanceof ctz;
         }
      });
      this.x = this.a(new ctg(this.B, 1, 33, 26) {
         @Override
         public boolean a(cvx $$0) {
            return $$0.h() instanceof cuv;
         }
      });
      this.y = this.a(new ctg(this.B, 2, 23, 45) {
         @Override
         public boolean a(cvx $$0) {
            return $$0.h() instanceof cua;
         }
      });
      this.z = this.a(new ctg(this.C, 0, 143, 57) {
         @Override
         public boolean a(cvx $$0) {
            return false;
         }

         @Override
         public void a(coh $$0, cvx $$1) {
            csq.this.w.a(1);
            csq.this.x.a(1);
            if (!csq.this.w.h() || !csq.this.x.h()) {
               csq.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.aa();
               if (csq.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awk.Ax, awl.e, 1.0F, 1.0F);
                  csq.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dZ().e(ly.d);
   }

   @Override
   public boolean b(coh $$0) {
      return a(this.r, $$0, dia.nT);
   }

   @Override
   public boolean a(coh $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jp<drw>> c(cvx $$0) {
      if ($$0.f()) {
         return this.v.a(awx.a).<List<jp<drw>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cua $$1 ? this.v.a($$1.b()).<List<jp<drw>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(brr $$0) {
      cvx $$1 = this.w.g();
      cvx $$2 = this.x.g();
      cvx $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jp<drw>> $$6 = this.t;
         this.t = this.c($$3);
         jp<drw> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jp<drw> $$9 = $$6.get($$4);
            int $$10 = this.t.indexOf($$9);
            if ($$10 != -1) {
               $$7 = $$9;
               this.s.a($$10);
            } else {
               $$7 = null;
               this.s.a(-1);
            }
         }

         if ($$7 != null) {
            drx $$13 = $$1.a(kt.ah, drx.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cvx.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cvx.k);
         }

         this.d();
      } else {
         this.z.f(cvx.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jp<drw>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cvx b(coh $$0, int $$1) {
      cvx $$2 = cvx.k;
      ctg $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvx $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cvx.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof ctz) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cvx.k;
               }
            } else if ($$4.h() instanceof cuv) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cvx.k;
               }
            } else if ($$4.h() instanceof cua) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cvx.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cvx.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cvx.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cvx.k;
         }

         if ($$4.f()) {
            $$3.e(cvx.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cvx.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(coh $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jp<drw> $$0) {
      cvx $$1 = this.w.g();
      cvx $$2 = this.x.g();
      cvx $$3 = cvx.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cuu $$4 = ((cuv)$$2.h()).c();
         $$3.a(kt.ah, drx.a, $$2x -> new drx.a().a($$2x).a($$0, $$4).a());
      }

      if (!cvx.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public ctg n() {
      return this.w;
   }

   public ctg o() {
      return this.x;
   }

   public ctg p() {
      return this.y;
   }

   public ctg q() {
      return this.z;
   }
}
