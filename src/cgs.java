import com.google.common.collect.ImmutableList;
import java.util.List;

public class cgs extends cfp {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cga p;
   final cgf q = cgf.a();
   private List<ib<ddo>> r = List.of();
   Runnable s = () -> {
   };
   final chh t;
   final chh u;
   private final chh v;
   private final chh w;
   long x;
   private final bhu y = new bii(3) {
      @Override
      public void e() {
         super.e();
         cgs.this.a(this);
         cgs.this.s.run();
      }
   };
   private final bhu z = new bii(1) {
      @Override
      public void e() {
         super.e();
         cgs.this.s.run();
      }
   };

   public cgs(int $$0, ccw $$1) {
      this($$0, $$1, cga.a);
   }

   public cgs(int $$0, ccw $$1, final cga $$2) {
      super(cgu.r, $$0);
      this.p = $$2;
      this.t = this.a(new chh(this.y, 0, 13, 26) {
         @Override
         public boolean a(ckj $$0) {
            return $$0.d() instanceof chz;
         }
      });
      this.u = this.a(new chh(this.y, 1, 33, 26) {
         @Override
         public boolean a(ckj $$0) {
            return $$0.d() instanceof ciy;
         }
      });
      this.v = this.a(new chh(this.y, 2, 23, 45) {
         @Override
         public boolean a(ckj $$0) {
            return $$0.d() instanceof cia;
         }
      });
      this.w = this.a(new chh(this.z, 0, 143, 57) {
         @Override
         public boolean a(ckj $$0) {
            return false;
         }

         @Override
         public void a(ccx $$0, ckj $$1) {
            cgs.this.t.a(1);
            cgs.this.u.a(1);
            if (!cgs.this.t.f() || !cgs.this.u.f()) {
               cgs.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (cgs.this.x != $$2xx) {
                  $$0x.a(null, $$1x, aqd.yy, aqe.e, 1.0F, 1.0F);
                  cgs.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new chh($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new chh($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(ccx $$0) {
      return a(this.p, $$0, cuc.nT);
   }

   @Override
   public boolean b(ccx $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<ib<ddo>> c(ckj $$0) {
      if ($$0.b()) {
         return jy.am.b(aqq.a).<List<ib<ddo>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cia $$1 ? jy.am.b($$1.b()).<List<ib<ddo>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bhu $$0) {
      ckj $$1 = this.t.e();
      ckj $$2 = this.u.e();
      ckj $$3 = this.v.e();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<ib<ddo>> $$6 = this.r;
         this.r = this.c($$3);
         ib<ddo> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            ib<ddo> $$9 = $$6.get($$4);
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
            rt $$13 = cic.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.e(ckj.b);
            } else {
               this.a($$7);
            }
         } else {
            this.w.e(ckj.b);
         }

         this.d();
      } else {
         this.w.e(ckj.b);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<ib<ddo>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public ckj a(ccx $$0, int $$1) {
      ckj $$2 = ckj.b;
      chh $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ckj $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return ckj.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof chz) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return ckj.b;
               }
            } else if ($$4.d() instanceof ciy) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return ckj.b;
               }
            } else if ($$4.d() instanceof cia) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return ckj.b;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return ckj.b;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return ckj.b;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return ckj.b;
         }

         if ($$4.b()) {
            $$3.d(ckj.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return ckj.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(ccx $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(ib<ddo> $$0) {
      ckj $$1 = this.t.e();
      ckj $$2 = this.u.e();
      ckj $$3 = ckj.b;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         cix $$4 = ((ciy)$$2.d()).d();
         rt $$5 = cic.a($$3);
         rz $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new rz();
            if ($$5 == null) {
               $$5 = new rt();
            }

            $$5.a("Patterns", $$6);
         }

         rt $$8 = new rt();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         cic.a($$3, ddz.t, $$5);
      }

      if (!ckj.a($$3, this.w.e())) {
         this.w.e($$3);
      }
   }

   public chh n() {
      return this.t;
   }

   public chh o() {
      return this.u;
   }

   public chh p() {
      return this.v;
   }

   public chh q() {
      return this.w;
   }
}
