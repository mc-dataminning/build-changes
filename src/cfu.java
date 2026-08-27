import com.google.common.collect.ImmutableList;
import java.util.List;

public class cfu extends cer {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cfc p;
   final cfh q = cfh.a();
   private List<he<dcq>> r = List.of();
   Runnable s = () -> {
   };
   final cgj t;
   final cgj u;
   private final cgj v;
   private final cgj w;
   long x;
   private final bgx y = new bhl(3) {
      @Override
      public void e() {
         super.e();
         cfu.this.a(this);
         cfu.this.s.run();
      }
   };
   private final bgx z = new bhl(1) {
      @Override
      public void e() {
         super.e();
         cfu.this.s.run();
      }
   };

   public cfu(int $$0, cbz $$1) {
      this($$0, $$1, cfc.a);
   }

   public cfu(int $$0, cbz $$1, final cfc $$2) {
      super(cfw.r, $$0);
      this.p = $$2;
      this.t = this.a(new cgj(this.y, 0, 13, 26) {
         @Override
         public boolean a(cjl $$0) {
            return $$0.d() instanceof chb;
         }
      });
      this.u = this.a(new cgj(this.y, 1, 33, 26) {
         @Override
         public boolean a(cjl $$0) {
            return $$0.d() instanceof cia;
         }
      });
      this.v = this.a(new cgj(this.y, 2, 23, 45) {
         @Override
         public boolean a(cjl $$0) {
            return $$0.d() instanceof chc;
         }
      });
      this.w = this.a(new cgj(this.z, 0, 143, 57) {
         @Override
         public boolean a(cjl $$0) {
            return false;
         }

         @Override
         public void a(cca $$0, cjl $$1) {
            cfu.this.t.a(1);
            cfu.this.u.a(1);
            if (!cfu.this.t.f() || !cfu.this.u.f()) {
               cfu.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (cfu.this.x != $$2xx) {
                  $$0x.a(null, $$1x, apg.yw, aph.e, 1.0F, 1.0F);
                  cfu.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cgj($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cgj($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cca $$0) {
      return a(this.p, $$0, cte.nT);
   }

   @Override
   public boolean b(cca $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<he<dcq>> c(cjl $$0) {
      if ($$0.b()) {
         return jb.am.b(apt.a).<List<he<dcq>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof chc $$1 ? jb.am.b($$1.b()).<List<he<dcq>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bgx $$0) {
      cjl $$1 = this.t.e();
      cjl $$2 = this.u.e();
      cjl $$3 = this.v.e();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<he<dcq>> $$6 = this.r;
         this.r = this.c($$3);
         he<dcq> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            he<dcq> $$9 = $$6.get($$4);
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
            qw $$13 = che.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.e(cjl.b);
            } else {
               this.a($$7);
            }
         } else {
            this.w.e(cjl.b);
         }

         this.d();
      } else {
         this.w.e(cjl.b);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<he<dcq>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cjl a(cca $$0, int $$1) {
      cjl $$2 = cjl.b;
      cgj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjl $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cjl.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof chb) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cjl.b;
               }
            } else if ($$4.d() instanceof cia) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cjl.b;
               }
            } else if ($$4.d() instanceof chc) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cjl.b;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cjl.b;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cjl.b;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cjl.b;
         }

         if ($$4.b()) {
            $$3.d(cjl.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cjl.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cca $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(he<dcq> $$0) {
      cjl $$1 = this.t.e();
      cjl $$2 = this.u.e();
      cjl $$3 = cjl.b;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         chz $$4 = ((cia)$$2.d()).d();
         qw $$5 = che.a($$3);
         rc $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new rc();
            if ($$5 == null) {
               $$5 = new qw();
            }

            $$5.a("Patterns", $$6);
         }

         qw $$8 = new qw();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         che.a($$3, ddb.t, $$5);
      }

      if (!cjl.a($$3, this.w.e())) {
         this.w.e($$3);
      }
   }

   public cgj n() {
      return this.t;
   }

   public cgj o() {
      return this.u;
   }

   public cgj p() {
      return this.v;
   }

   public cgj q() {
      return this.w;
   }
}
