import com.google.common.collect.ImmutableList;
import java.util.List;

public class clg extends ckb {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final ckm p;
   final ckt q = ckt.a();
   private List<ij<dik>> r = List.of();
   Runnable s = () -> {
   };
   final clw t;
   final clw u;
   private final clw v;
   private final clw w;
   long x;
   private final bln y = new bmd(3) {
      @Override
      public void e() {
         super.e();
         clg.this.a(this);
         clg.this.s.run();
      }
   };
   private final bln z = new bmd(1) {
      @Override
      public void e() {
         super.e();
         clg.this.s.run();
      }
   };

   public clg(int $$0, chg $$1) {
      this($$0, $$1, ckm.a);
   }

   public clg(int $$0, chg $$1, final ckm $$2) {
      super(cli.s, $$0);
      this.p = $$2;
      this.t = this.a(new clw(this.y, 0, 13, 26) {
         @Override
         public boolean a(coz $$0) {
            return $$0.d() instanceof cmp;
         }
      });
      this.u = this.a(new clw(this.y, 1, 33, 26) {
         @Override
         public boolean a(coz $$0) {
            return $$0.d() instanceof cno;
         }
      });
      this.v = this.a(new clw(this.y, 2, 23, 45) {
         @Override
         public boolean a(coz $$0) {
            return $$0.d() instanceof cmq;
         }
      });
      this.w = this.a(new clw(this.z, 0, 143, 57) {
         @Override
         public boolean a(coz $$0) {
            return false;
         }

         @Override
         public void a(chh $$0, coz $$1) {
            clg.this.t.a(1);
            clg.this.u.a(1);
            if (!clg.this.t.h() || !clg.this.u.h()) {
               clg.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (clg.this.x != $$2xx) {
                  $$0x.a(null, $$1x, atk.zL, atl.e, 1.0F, 1.0F);
                  clg.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new clw($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new clw($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(chh $$0) {
      return a(this.p, $$0, cyq.nT);
   }

   @Override
   public boolean b(chh $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ij<dik>> c(coz $$0) {
      if ($$0.b()) {
         return kf.am.b(atx.a).<List<ij<dik>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cmq $$1 ? kf.am.b($$1.b()).<List<ij<dik>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bln $$0) {
      coz $$1 = this.t.g();
      coz $$2 = this.u.g();
      coz $$3 = this.v.g();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ij<dik>> $$6 = this.r;
         this.r = this.c($$3);
         ij<dik> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ij<dik> $$9 = $$6.get($$4);
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
            sw $$13 = cms.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.f(coz.h);
            } else {
               this.a($$7);
            }
         } else {
            this.w.f(coz.h);
         }

         this.d();
      } else {
         this.w.f(coz.h);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ij<dik>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public coz a(chh $$0, int $$1) {
      coz $$2 = coz.h;
      clw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         coz $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return coz.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof cmp) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return coz.h;
               }
            } else if ($$4.d() instanceof cno) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return coz.h;
               }
            } else if ($$4.d() instanceof cmq) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return coz.h;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return coz.h;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return coz.h;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return coz.h;
         }

         if ($$4.b()) {
            $$3.e(coz.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return coz.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(chh $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(ij<dik> $$0) {
      coz $$1 = this.t.g();
      coz $$2 = this.u.g();
      coz $$3 = coz.h;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         cnn $$4 = ((cno)$$2.d()).d();
         sw $$5 = cms.a($$3);
         tc $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new tc();
            if ($$5 == null) {
               $$5 = new sw();
            }

            $$5.a("Patterns", $$6);
         }

         sw $$8 = new sw();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         cms.a($$3, div.t, $$5);
      }

      if (!coz.a($$3, this.w.g())) {
         this.w.f($$3);
      }
   }

   public clw n() {
      return this.t;
   }

   public clw o() {
      return this.u;
   }

   public clw p() {
      return this.v;
   }

   public clw q() {
      return this.w;
   }
}
