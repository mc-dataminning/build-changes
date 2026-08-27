import com.google.common.collect.ImmutableList;
import java.util.List;

public class ciz extends chu {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cif p;
   final cim q = cim.a();
   private List<ih<dgf>> r = List.of();
   Runnable s = () -> {
   };
   final cjp t;
   final cjp u;
   private final cjp v;
   private final cjp w;
   long x;
   private final bjo y = new bkd(3) {
      @Override
      public void e() {
         super.e();
         ciz.this.a(this);
         ciz.this.s.run();
      }
   };
   private final bjo z = new bkd(1) {
      @Override
      public void e() {
         super.e();
         ciz.this.s.run();
      }
   };

   public ciz(int $$0, cfa $$1) {
      this($$0, $$1, cif.a);
   }

   public ciz(int $$0, cfa $$1, final cif $$2) {
      super(cjb.s, $$0);
      this.p = $$2;
      this.t = this.a(new cjp(this.y, 0, 13, 26) {
         @Override
         public boolean a(cmr $$0) {
            return $$0.d() instanceof ckh;
         }
      });
      this.u = this.a(new cjp(this.y, 1, 33, 26) {
         @Override
         public boolean a(cmr $$0) {
            return $$0.d() instanceof clg;
         }
      });
      this.v = this.a(new cjp(this.y, 2, 23, 45) {
         @Override
         public boolean a(cmr $$0) {
            return $$0.d() instanceof cki;
         }
      });
      this.w = this.a(new cjp(this.z, 0, 143, 57) {
         @Override
         public boolean a(cmr $$0) {
            return false;
         }

         @Override
         public void a(cfb $$0, cmr $$1) {
            ciz.this.t.a(1);
            ciz.this.u.a(1);
            if (!ciz.this.t.h() || !ciz.this.u.h()) {
               ciz.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (ciz.this.x != $$2xx) {
                  $$0x.a(null, $$1x, arm.zw, arn.e, 1.0F, 1.0F);
                  ciz.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjp($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjp($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cfb $$0) {
      return a(this.p, $$0, cwl.nT);
   }

   @Override
   public boolean b(cfb $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ih<dgf>> c(cmr $$0) {
      if ($$0.b()) {
         return kd.am.b(arz.a).<List<ih<dgf>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cki $$1 ? kd.am.b($$1.b()).<List<ih<dgf>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bjo $$0) {
      cmr $$1 = this.t.g();
      cmr $$2 = this.u.g();
      cmr $$3 = this.v.g();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ih<dgf>> $$6 = this.r;
         this.r = this.c($$3);
         ih<dgf> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ih<dgf> $$9 = $$6.get($$4);
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
            sl $$13 = ckk.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.f(cmr.f);
            } else {
               this.a($$7);
            }
         } else {
            this.w.f(cmr.f);
         }

         this.d();
      } else {
         this.w.f(cmr.f);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ih<dgf>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cmr a(cfb $$0, int $$1) {
      cmr $$2 = cmr.f;
      cjp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmr $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cmr.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof ckh) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cmr.f;
               }
            } else if ($$4.d() instanceof clg) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cmr.f;
               }
            } else if ($$4.d() instanceof cki) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cmr.f;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cmr.f;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cmr.f;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cmr.f;
         }

         if ($$4.b()) {
            $$3.e(cmr.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmr.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cfb $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(ih<dgf> $$0) {
      cmr $$1 = this.t.g();
      cmr $$2 = this.u.g();
      cmr $$3 = cmr.f;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         clf $$4 = ((clg)$$2.d()).d();
         sl $$5 = ckk.a($$3);
         sr $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new sr();
            if ($$5 == null) {
               $$5 = new sl();
            }

            $$5.a("Patterns", $$6);
         }

         sl $$8 = new sl();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         ckk.a($$3, dgq.t, $$5);
      }

      if (!cmr.a($$3, this.w.g())) {
         this.w.f($$3);
      }
   }

   public cjp n() {
      return this.t;
   }

   public cjp o() {
      return this.u;
   }

   public cjp p() {
      return this.v;
   }

   public cjp q() {
      return this.w;
   }
}
