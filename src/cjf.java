import com.google.common.collect.ImmutableList;
import java.util.List;

public class cjf extends cia {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cil p;
   final cis q = cis.a();
   private List<ih<dgl>> r = List.of();
   Runnable s = () -> {
   };
   final cjv t;
   final cjv u;
   private final cjv v;
   private final cjv w;
   long x;
   private final bjt y = new bki(3) {
      @Override
      public void e() {
         super.e();
         cjf.this.a(this);
         cjf.this.s.run();
      }
   };
   private final bjt z = new bki(1) {
      @Override
      public void e() {
         super.e();
         cjf.this.s.run();
      }
   };

   public cjf(int $$0, cfg $$1) {
      this($$0, $$1, cil.a);
   }

   public cjf(int $$0, cfg $$1, final cil $$2) {
      super(cjh.s, $$0);
      this.p = $$2;
      this.t = this.a(new cjv(this.y, 0, 13, 26) {
         @Override
         public boolean a(cmx $$0) {
            return $$0.d() instanceof ckn;
         }
      });
      this.u = this.a(new cjv(this.y, 1, 33, 26) {
         @Override
         public boolean a(cmx $$0) {
            return $$0.d() instanceof clm;
         }
      });
      this.v = this.a(new cjv(this.y, 2, 23, 45) {
         @Override
         public boolean a(cmx $$0) {
            return $$0.d() instanceof cko;
         }
      });
      this.w = this.a(new cjv(this.z, 0, 143, 57) {
         @Override
         public boolean a(cmx $$0) {
            return false;
         }

         @Override
         public void a(cfh $$0, cmx $$1) {
            cjf.this.t.a(1);
            cjf.this.u.a(1);
            if (!cjf.this.t.h() || !cjf.this.u.h()) {
               cjf.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (cjf.this.x != $$2xx) {
                  $$0x.a(null, $$1x, arr.zw, ars.e, 1.0F, 1.0F);
                  cjf.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjv($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjv($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cfh $$0) {
      return a(this.p, $$0, cwr.nT);
   }

   @Override
   public boolean b(cfh $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ih<dgl>> c(cmx $$0) {
      if ($$0.b()) {
         return kd.am.b(ase.a).<List<ih<dgl>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cko $$1 ? kd.am.b($$1.b()).<List<ih<dgl>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bjt $$0) {
      cmx $$1 = this.t.g();
      cmx $$2 = this.u.g();
      cmx $$3 = this.v.g();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ih<dgl>> $$6 = this.r;
         this.r = this.c($$3);
         ih<dgl> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ih<dgl> $$9 = $$6.get($$4);
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
            sn $$13 = ckq.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.f(cmx.f);
            } else {
               this.a($$7);
            }
         } else {
            this.w.f(cmx.f);
         }

         this.d();
      } else {
         this.w.f(cmx.f);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ih<dgl>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cmx a(cfh $$0, int $$1) {
      cmx $$2 = cmx.f;
      cjv $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmx $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cmx.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof ckn) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cmx.f;
               }
            } else if ($$4.d() instanceof clm) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cmx.f;
               }
            } else if ($$4.d() instanceof cko) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cmx.f;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cmx.f;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cmx.f;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cmx.f;
         }

         if ($$4.b()) {
            $$3.e(cmx.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmx.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cfh $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(ih<dgl> $$0) {
      cmx $$1 = this.t.g();
      cmx $$2 = this.u.g();
      cmx $$3 = cmx.f;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         cll $$4 = ((clm)$$2.d()).d();
         sn $$5 = ckq.a($$3);
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
         ckq.a($$3, dgw.t, $$5);
      }

      if (!cmx.a($$3, this.w.g())) {
         this.w.f($$3);
      }
   }

   public cjv n() {
      return this.t;
   }

   public cjv o() {
      return this.u;
   }

   public cjv p() {
      return this.v;
   }

   public cjv q() {
      return this.w;
   }
}
