import com.google.common.collect.ImmutableList;
import java.util.List;

public class cfg extends ced {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final ceo p;
   final cet q = cet.a();
   private List<he<dcc>> r = List.of();
   Runnable s = () -> {
   };
   final cfv t;
   final cfv u;
   private final cfv v;
   private final cfv w;
   long x;
   private final bgj y = new bgx(3) {
      @Override
      public void e() {
         super.e();
         cfg.this.a(this);
         cfg.this.s.run();
      }
   };
   private final bgj z = new bgx(1) {
      @Override
      public void e() {
         super.e();
         cfg.this.s.run();
      }
   };

   public cfg(int $$0, cbl $$1) {
      this($$0, $$1, ceo.a);
   }

   public cfg(int $$0, cbl $$1, final ceo $$2) {
      super(cfi.r, $$0);
      this.p = $$2;
      this.t = this.a(new cfv(this.y, 0, 13, 26) {
         @Override
         public boolean a(cix $$0) {
            return $$0.d() instanceof cgn;
         }
      });
      this.u = this.a(new cfv(this.y, 1, 33, 26) {
         @Override
         public boolean a(cix $$0) {
            return $$0.d() instanceof chm;
         }
      });
      this.v = this.a(new cfv(this.y, 2, 23, 45) {
         @Override
         public boolean a(cix $$0) {
            return $$0.d() instanceof cgo;
         }
      });
      this.w = this.a(new cfv(this.z, 0, 143, 58) {
         @Override
         public boolean a(cix $$0) {
            return false;
         }

         @Override
         public void a(cbm $$0, cix $$1) {
            cfg.this.t.a(1);
            cfg.this.u.a(1);
            if (!cfg.this.t.f() || !cfg.this.u.f()) {
               cfg.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (cfg.this.x != $$2xx) {
                  $$0x.a(null, $$1x, aow.yw, aox.e, 1.0F, 1.0F);
                  cfg.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cfv($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cfv($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cbm $$0) {
      return a(this.p, $$0, csm.nT);
   }

   @Override
   public boolean b(cbm $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<he<dcc>> c(cix $$0) {
      if ($$0.b()) {
         return jb.al.b(apj.a).<List<he<dcc>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cgo $$1 ? jb.al.b($$1.b()).<List<he<dcc>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bgj $$0) {
      cix $$1 = this.t.e();
      cix $$2 = this.u.e();
      cix $$3 = this.v.e();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<he<dcc>> $$6 = this.r;
         this.r = this.c($$3);
         he<dcc> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            he<dcc> $$9 = $$6.get($$4);
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
            qr $$13 = cgq.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.e(cix.b);
            } else {
               this.a($$7);
            }
         } else {
            this.w.e(cix.b);
         }

         this.d();
      } else {
         this.w.e(cix.b);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<he<dcc>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cix a(cbm $$0, int $$1) {
      cix $$2 = cix.b;
      cfv $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cix $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cix.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof cgn) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cix.b;
               }
            } else if ($$4.d() instanceof chm) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cix.b;
               }
            } else if ($$4.d() instanceof cgo) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cix.b;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cix.b;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cix.b;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cix.b;
         }

         if ($$4.b()) {
            $$3.d(cix.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cix.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cbm $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(he<dcc> $$0) {
      cix $$1 = this.t.e();
      cix $$2 = this.u.e();
      cix $$3 = cix.b;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         chl $$4 = ((chm)$$2.d()).d();
         qr $$5 = cgq.a($$3);
         qx $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new qx();
            if ($$5 == null) {
               $$5 = new qr();
            }

            $$5.a("Patterns", $$6);
         }

         qr $$8 = new qr();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         cgq.a($$3, dcn.t, $$5);
      }

      if (!cix.a($$3, this.w.e())) {
         this.w.e($$3);
      }
   }

   public cfv n() {
      return this.t;
   }

   public cfv o() {
      return this.u;
   }

   public cfv p() {
      return this.v;
   }

   public cfv q() {
      return this.w;
   }
}
