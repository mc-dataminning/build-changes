import com.google.common.collect.ImmutableList;
import java.util.List;

public class chw extends cgr {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final chc p;
   final chj q = chj.a();
   private List<ig<dez>> r = List.of();
   Runnable s = () -> {
   };
   final cim t;
   final cim u;
   private final cim v;
   private final cim w;
   long x;
   private final biu y = new bjj(3) {
      @Override
      public void e() {
         super.e();
         chw.this.a(this);
         chw.this.s.run();
      }
   };
   private final biu z = new bjj(1) {
      @Override
      public void e() {
         super.e();
         chw.this.s.run();
      }
   };

   public chw(int $$0, cdy $$1) {
      this($$0, $$1, chc.a);
   }

   public chw(int $$0, cdy $$1, final chc $$2) {
      super(chy.s, $$0);
      this.p = $$2;
      this.t = this.a(new cim(this.y, 0, 13, 26) {
         @Override
         public boolean a(clo $$0) {
            return $$0.d() instanceof cje;
         }
      });
      this.u = this.a(new cim(this.y, 1, 33, 26) {
         @Override
         public boolean a(clo $$0) {
            return $$0.d() instanceof ckd;
         }
      });
      this.v = this.a(new cim(this.y, 2, 23, 45) {
         @Override
         public boolean a(clo $$0) {
            return $$0.d() instanceof cjf;
         }
      });
      this.w = this.a(new cim(this.z, 0, 143, 57) {
         @Override
         public boolean a(clo $$0) {
            return false;
         }

         @Override
         public void a(cdz $$0, clo $$1) {
            chw.this.t.a(1);
            chw.this.u.a(1);
            if (!chw.this.t.g() || !chw.this.u.g()) {
               chw.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.W();
               if (chw.this.x != $$2xx) {
                  $$0x.a(null, $$1x, aqv.zb, aqw.e, 1.0F, 1.0F);
                  chw.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cim($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cim($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cdz $$0) {
      return a(this.p, $$0, cvh.nT);
   }

   @Override
   public boolean b(cdz $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ig<dez>> c(clo $$0) {
      if ($$0.b()) {
         return kc.an.b(ari.a).<List<ig<dez>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cjf $$1 ? kc.an.b($$1.b()).<List<ig<dez>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(biu $$0) {
      clo $$1 = this.t.f();
      clo $$2 = this.u.f();
      clo $$3 = this.v.f();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ig<dez>> $$6 = this.r;
         this.r = this.c($$3);
         ig<dez> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ig<dez> $$9 = $$6.get($$4);
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
            sd $$13 = cjh.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.f(clo.b);
            } else {
               this.a($$7);
            }
         } else {
            this.w.f(clo.b);
         }

         this.d();
      } else {
         this.w.f(clo.b);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ig<dez>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public clo a(cdz $$0, int $$1) {
      clo $$2 = clo.b;
      cim $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clo $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return clo.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof cje) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return clo.b;
               }
            } else if ($$4.d() instanceof ckd) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return clo.b;
               }
            } else if ($$4.d() instanceof cjf) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return clo.b;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return clo.b;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return clo.b;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return clo.b;
         }

         if ($$4.b()) {
            $$3.e(clo.b);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clo.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cdz $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(ig<dez> $$0) {
      clo $$1 = this.t.f();
      clo $$2 = this.u.f();
      clo $$3 = clo.b;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         ckc $$4 = ((ckd)$$2.d()).d();
         sd $$5 = cjh.a($$3);
         sj $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new sj();
            if ($$5 == null) {
               $$5 = new sd();
            }

            $$5.a("Patterns", $$6);
         }

         sd $$8 = new sd();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         cjh.a($$3, dfk.t, $$5);
      }

      if (!clo.a($$3, this.w.f())) {
         this.w.f($$3);
      }
   }

   public cim n() {
      return this.t;
   }

   public cim o() {
      return this.u;
   }

   public cim p() {
      return this.v;
   }

   public cim q() {
      return this.w;
   }
}
