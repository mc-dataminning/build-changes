import com.google.common.collect.ImmutableList;
import java.util.List;

public class cjg extends cib {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cim p;
   final cit q = cit.a();
   private List<ih<dgm>> r = List.of();
   Runnable s = () -> {
   };
   final cjw t;
   final cjw u;
   private final cjw v;
   private final cjw w;
   long x;
   private final bju y = new bkj(3) {
      @Override
      public void e() {
         super.e();
         cjg.this.a(this);
         cjg.this.s.run();
      }
   };
   private final bju z = new bkj(1) {
      @Override
      public void e() {
         super.e();
         cjg.this.s.run();
      }
   };

   public cjg(int $$0, cfh $$1) {
      this($$0, $$1, cim.a);
   }

   public cjg(int $$0, cfh $$1, final cim $$2) {
      super(cji.s, $$0);
      this.p = $$2;
      this.t = this.a(new cjw(this.y, 0, 13, 26) {
         @Override
         public boolean a(cmy $$0) {
            return $$0.d() instanceof cko;
         }
      });
      this.u = this.a(new cjw(this.y, 1, 33, 26) {
         @Override
         public boolean a(cmy $$0) {
            return $$0.d() instanceof cln;
         }
      });
      this.v = this.a(new cjw(this.y, 2, 23, 45) {
         @Override
         public boolean a(cmy $$0) {
            return $$0.d() instanceof ckp;
         }
      });
      this.w = this.a(new cjw(this.z, 0, 143, 57) {
         @Override
         public boolean a(cmy $$0) {
            return false;
         }

         @Override
         public void a(cfi $$0, cmy $$1) {
            cjg.this.t.a(1);
            cjg.this.u.a(1);
            if (!cjg.this.t.h() || !cjg.this.u.h()) {
               cjg.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (cjg.this.x != $$2xx) {
                  $$0x.a(null, $$1x, ars.zw, art.e, 1.0F, 1.0F);
                  cjg.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjw($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjw($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cfi $$0) {
      return a(this.p, $$0, cws.nT);
   }

   @Override
   public boolean b(cfi $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ih<dgm>> c(cmy $$0) {
      if ($$0.b()) {
         return kd.am.b(asf.a).<List<ih<dgm>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof ckp $$1 ? kd.am.b($$1.b()).<List<ih<dgm>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bju $$0) {
      cmy $$1 = this.t.g();
      cmy $$2 = this.u.g();
      cmy $$3 = this.v.g();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ih<dgm>> $$6 = this.r;
         this.r = this.c($$3);
         ih<dgm> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ih<dgm> $$9 = $$6.get($$4);
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
            sn $$13 = ckr.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.f(cmy.f);
            } else {
               this.a($$7);
            }
         } else {
            this.w.f(cmy.f);
         }

         this.d();
      } else {
         this.w.f(cmy.f);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ih<dgm>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cmy a(cfi $$0, int $$1) {
      cmy $$2 = cmy.f;
      cjw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmy $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cmy.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof cko) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cmy.f;
               }
            } else if ($$4.d() instanceof cln) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cmy.f;
               }
            } else if ($$4.d() instanceof ckp) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cmy.f;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cmy.f;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cmy.f;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cmy.f;
         }

         if ($$4.b()) {
            $$3.e(cmy.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmy.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cfi $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(ih<dgm> $$0) {
      cmy $$1 = this.t.g();
      cmy $$2 = this.u.g();
      cmy $$3 = cmy.f;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         clm $$4 = ((cln)$$2.d()).d();
         sn $$5 = ckr.a($$3);
         st $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new st();
            if ($$5 == null) {
               $$5 = new sn();
            }

            $$5.a("Patterns", $$6);
         }

         sn $$8 = new sn();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         ckr.a($$3, dgx.t, $$5);
      }

      if (!cmy.a($$3, this.w.g())) {
         this.w.f($$3);
      }
   }

   public cjw n() {
      return this.t;
   }

   public cjw o() {
      return this.u;
   }

   public cjw p() {
      return this.v;
   }

   public cjw q() {
      return this.w;
   }
}
