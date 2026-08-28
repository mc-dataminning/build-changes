import com.google.common.collect.ImmutableList;
import java.util.List;

public class cuj extends ctc {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final ctp r;
   final ctw s = ctw.a();
   private List<jq<dun>> t = List.of();
   Runnable u = () -> {
   };
   private final jr<dun> v;
   final cuz w;
   final cuz x;
   private final cuz y;
   private final cuz z;
   long A;
   private final btc B = new btq(3) {
      @Override
      public void e() {
         super.e();
         cuj.this.a(this);
         cuj.this.u.run();
      }
   };
   private final btc C = new btq(1) {
      @Override
      public void e() {
         super.e();
         cuj.this.u.run();
      }
   };

   public cuj(int $$0, cpw $$1) {
      this($$0, $$1, ctp.a);
   }

   public cuj(int $$0, cpw $$1, final ctp $$2) {
      super(cul.s, $$0);
      this.r = $$2;
      this.w = this.a(new cuz(this.B, 0, 13, 26) {
         @Override
         public boolean a(cxp $$0) {
            return $$0.h() instanceof cvs;
         }
      });
      this.x = this.a(new cuz(this.B, 1, 33, 26) {
         @Override
         public boolean a(cxp $$0) {
            return $$0.h() instanceof cwn;
         }
      });
      this.y = this.a(new cuz(this.B, 2, 23, 45) {
         @Override
         public boolean a(cxp $$0) {
            return $$0.h() instanceof cvt;
         }
      });
      this.z = this.a(new cuz(this.C, 0, 143, 57) {
         @Override
         public boolean a(cxp $$0) {
            return false;
         }

         @Override
         public void a(cpx $$0, cxp $$1) {
            cuj.this.w.a(1);
            cuj.this.x.a(1);
            if (!cuj.this.w.h() || !cuj.this.x.h()) {
               cuj.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ac();
               if (cuj.this.A != $$2xx) {
                  $$0x.a(null, $$1x, axf.AS, axg.e, 1.0F, 1.0F);
                  cuj.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dY().e(mb.d);
   }

   @Override
   public boolean b(cpx $$0) {
      return a(this.r, $$0, dko.oo);
   }

   @Override
   public boolean a(cpx $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jq<dun>> c(cxp $$0) {
      if ($$0.f()) {
         return this.v.a(axs.a).<List<jq<dun>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cvt $$1 ? this.v.a($$1.b()).<List<jq<dun>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(btc $$0) {
      cxp $$1 = this.w.g();
      cxp $$2 = this.x.g();
      cxp $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jq<dun>> $$6 = this.t;
         this.t = this.c($$3);
         jq<dun> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jq<dun> $$9 = $$6.get($$4);
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
            duo $$13 = $$1.a(ku.ai, duo.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cxp.j);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cxp.j);
         }

         this.d();
      } else {
         this.z.f(cxp.j);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jq<dun>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cxp b(cpx $$0, int $$1) {
      cxp $$2 = cxp.j;
      cuz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cxp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cvs) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cxp.j;
               }
            } else if ($$4.h() instanceof cwn) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cxp.j;
               }
            } else if ($$4.h() instanceof cvt) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cxp.j;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cxp.j;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cxp.j;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cxp.j;
         }

         if ($$4.f()) {
            $$3.e(cxp.j);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxp.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cpx $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jq<dun> $$0) {
      cxp $$1 = this.w.g();
      cxp $$2 = this.x.g();
      cxp $$3 = cxp.j;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cwm $$4 = ((cwn)$$2.h()).b();
         $$3.a(ku.ai, duo.a, $$2x -> new duo.a().a($$2x).a($$0, $$4).a());
      }

      if (!cxp.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cuz n() {
      return this.w;
   }

   public cuz o() {
      return this.x;
   }

   public cuz p() {
      return this.y;
   }

   public cuz q() {
      return this.z;
   }
}
