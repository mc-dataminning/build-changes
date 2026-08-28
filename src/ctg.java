import com.google.common.collect.ImmutableList;
import java.util.List;

public class ctg extends crz {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final csm r;
   final cst s = cst.a();
   private List<jq<dso>> t = List.of();
   Runnable u = () -> {
   };
   private final jr<dso> v;
   final ctw w;
   final ctw x;
   private final ctw y;
   private final ctw z;
   long A;
   private final bsd B = new bsr(3) {
      @Override
      public void e() {
         super.e();
         ctg.this.a(this);
         ctg.this.u.run();
      }
   };
   private final bsd C = new bsr(1) {
      @Override
      public void e() {
         super.e();
         ctg.this.u.run();
      }
   };

   public ctg(int $$0, cot $$1) {
      this($$0, $$1, csm.a);
   }

   public ctg(int $$0, cot $$1, final csm $$2) {
      super(cti.s, $$0);
      this.r = $$2;
      this.w = this.a(new ctw(this.B, 0, 13, 26) {
         @Override
         public boolean a(cwm $$0) {
            return $$0.h() instanceof cup;
         }
      });
      this.x = this.a(new ctw(this.B, 1, 33, 26) {
         @Override
         public boolean a(cwm $$0) {
            return $$0.h() instanceof cvk;
         }
      });
      this.y = this.a(new ctw(this.B, 2, 23, 45) {
         @Override
         public boolean a(cwm $$0) {
            return $$0.h() instanceof cuq;
         }
      });
      this.z = this.a(new ctw(this.C, 0, 143, 57) {
         @Override
         public boolean a(cwm $$0) {
            return false;
         }

         @Override
         public void a(cou $$0, cwm $$1) {
            ctg.this.w.a(1);
            ctg.this.x.a(1);
            if (!ctg.this.w.h() || !ctg.this.x.h()) {
               ctg.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ab();
               if (ctg.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awn.Ax, awo.e, 1.0F, 1.0F);
                  ctg.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dX().e(ma.d);
   }

   @Override
   public boolean b(cou $$0) {
      return a(this.r, $$0, dis.nT);
   }

   @Override
   public boolean a(cou $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jq<dso>> c(cwm $$0) {
      if ($$0.f()) {
         return this.v.a(axa.a).<List<jq<dso>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cuq $$1 ? this.v.a($$1.b()).<List<jq<dso>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(bsd $$0) {
      cwm $$1 = this.w.g();
      cwm $$2 = this.x.g();
      cwm $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jq<dso>> $$6 = this.t;
         this.t = this.c($$3);
         jq<dso> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jq<dso> $$9 = $$6.get($$4);
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
            dsp $$13 = $$1.a(ku.ai, dsp.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cwm.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cwm.k);
         }

         this.d();
      } else {
         this.z.f(cwm.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jq<dso>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cwm.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cup) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cwm.k;
               }
            } else if ($$4.h() instanceof cvk) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cwm.k;
               }
            } else if ($$4.h() instanceof cuq) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cwm.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cwm.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cwm.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cwm.k;
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwm.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cou $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jq<dso> $$0) {
      cwm $$1 = this.w.g();
      cwm $$2 = this.x.g();
      cwm $$3 = cwm.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cvj $$4 = ((cvk)$$2.h()).b();
         $$3.a(ku.ai, dsp.a, $$2x -> new dsp.a().a($$2x).a($$0, $$4).a());
      }

      if (!cwm.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public ctw n() {
      return this.w;
   }

   public ctw o() {
      return this.x;
   }

   public ctw p() {
      return this.y;
   }

   public ctw q() {
      return this.z;
   }
}
