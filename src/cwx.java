import com.google.common.collect.ImmutableList;
import java.util.List;

public class cwx extends cvq {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final cwd r;
   final cwk s = cwk.a();
   private List<jf<dxr>> t = List.of();
   Runnable u = () -> {
   };
   private final jg<dxr> v;
   final cxn w;
   final cxn x;
   private final cxn y;
   private final cxn z;
   long A;
   private final buk B = new buy(3) {
      @Override
      public void e() {
         super.e();
         cwx.this.a(this);
         cwx.this.u.run();
      }
   };
   private final buk C = new buy(1) {
      @Override
      public void e() {
         super.e();
         cwx.this.u.run();
      }
   };

   public cwx(int $$0, crw $$1) {
      this($$0, $$1, cwd.a);
   }

   public cwx(int $$0, crw $$1, final cwd $$2) {
      super(cwz.s, $$0);
      this.r = $$2;
      this.w = this.a(new cxn(this.B, 0, 13, 26) {
         @Override
         public boolean a(czy $$0) {
            return $$0.h() instanceof cye;
         }
      });
      this.x = this.a(new cxn(this.B, 1, 33, 26) {
         @Override
         public boolean a(czy $$0) {
            return $$0.h() instanceof cyx;
         }
      });
      this.y = this.a(new cxn(this.B, 2, 23, 45) {
         @Override
         public boolean a(czy $$0) {
            return $$0.c(kk.af);
         }
      });
      this.z = this.a(new cxn(this.C, 0, 143, 57) {
         @Override
         public boolean a(czy $$0) {
            return false;
         }

         @Override
         public void a(crx $$0, czy $$1) {
            cwx.this.w.a(1);
            cwx.this.x.a(1);
            if (!cwx.this.w.h() || !cwx.this.x.h()) {
               cwx.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cwx.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awp.Bx, awq.e, 1.0F, 1.0F);
                  cwx.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.h.dX().f(mh.aF);
   }

   @Override
   public boolean b(crx $$0) {
      return a(this.r, $$0, dne.oz);
   }

   @Override
   public boolean a(crx $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jf<dxr>> c(czy $$0) {
      if ($$0.f()) {
         return this.v.a(axc.a).<List<jf<dxr>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         axt<dxr> $$1 = $$0.a(kk.af);
         return $$1 != null ? this.v.a($$1).<List<jf<dxr>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(buk $$0) {
      czy $$1 = this.w.g();
      czy $$2 = this.x.g();
      czy $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jf<dxr>> $$6 = this.t;
         this.t = this.c($$3);
         jf<dxr> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jf<dxr> $$9 = $$6.get($$4);
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
            dxs $$13 = $$1.a(kk.am, dxs.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(czy.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(czy.k);
         }

         this.d();
      } else {
         this.z.f(czy.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jf<dxr>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return czy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cye) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return czy.k;
               }
            } else if ($$4.h() instanceof cyx) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return czy.k;
               }
            } else if ($$4.c(kk.af)) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return czy.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return czy.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return czy.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return czy.k;
         }

         if ($$4.f()) {
            $$3.e(czy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(crx $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jf<dxr> $$0) {
      czy $$1 = this.w.g();
      czy $$2 = this.x.g();
      czy $$3 = czy.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cyw $$4 = ((cyx)$$2.h()).a();
         $$3.a(kk.am, dxs.a, $$2x -> new dxs.a().a($$2x).a($$0, $$4).a());
      }

      if (!czy.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cxn n() {
      return this.w;
   }

   public cxn o() {
      return this.x;
   }

   public cxn p() {
      return this.y;
   }

   public cxn q() {
      return this.z;
   }
}
