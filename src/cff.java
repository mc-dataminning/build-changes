import com.google.common.collect.ImmutableList;
import java.util.List;

public class cff extends cec {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cen p;
   final ces q = ces.a();
   private List<hf<dcb>> r = List.of();
   Runnable s = () -> {
   };
   final cfu t;
   final cfu u;
   private final cfu v;
   private final cfu w;
   long x;
   private final bgh y = new bgv(3) {
      @Override
      public void e() {
         super.e();
         cff.this.a(this);
         cff.this.s.run();
      }
   };
   private final bgh z = new bgv(1) {
      @Override
      public void e() {
         super.e();
         cff.this.s.run();
      }
   };

   public cff(int $$0, cbk $$1) {
      this($$0, $$1, cen.a);
   }

   public cff(int $$0, cbk $$1, final cen $$2) {
      super(cfh.r, $$0);
      this.p = $$2;
      this.t = this.a(new cfu(this.y, 0, 13, 26) {
         @Override
         public boolean a(ciw $$0) {
            return $$0.d() instanceof cgm;
         }
      });
      this.u = this.a(new cfu(this.y, 1, 33, 26) {
         @Override
         public boolean a(ciw $$0) {
            return $$0.d() instanceof chl;
         }
      });
      this.v = this.a(new cfu(this.y, 2, 23, 45) {
         @Override
         public boolean a(ciw $$0) {
            return $$0.d() instanceof cgn;
         }
      });
      this.w = this.a(new cfu(this.z, 0, 143, 58) {
         @Override
         public boolean a(ciw $$0) {
            return false;
         }

         @Override
         public void a(cbl $$0, ciw $$1) {
            cff.this.t.a(1);
            cff.this.u.a(1);
            if (!cff.this.t.f() || !cff.this.u.f()) {
               cff.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (cff.this.x != $$2xx) {
                  $$0x.a(null, $$1x, aou.yr, aov.e, 1.0F, 1.0F);
                  cff.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cfu($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cfu($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cbl $$0) {
      return a(this.p, $$0, csl.nT);
   }

   @Override
   public boolean b(cbl $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<hf<dcb>> c(ciw $$0) {
      if ($$0.b()) {
         return jc.al.b(aph.a).<List<hf<dcb>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cgn $$1 ? jc.al.b($$1.b()).<List<hf<dcb>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bgh $$0) {
      ciw $$1 = this.t.e();
      ciw $$2 = this.u.e();
      ciw $$3 = this.v.e();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<hf<dcb>> $$6 = this.r;
         this.r = this.c($$3);
         hf<dcb> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            hf<dcb> $$9 = $$6.get($$4);
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
            qs $$13 = cgp.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.e(ciw.b);
            } else {
               this.a($$7);
            }
         } else {
            this.w.e(ciw.b);
         }

         this.d();
      } else {
         this.w.e(ciw.b);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<hf<dcb>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public ciw a(cbl $$0, int $$1) {
      ciw $$2 = ciw.b;
      cfu $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciw $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return ciw.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof cgm) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return ciw.b;
               }
            } else if ($$4.d() instanceof chl) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return ciw.b;
               }
            } else if ($$4.d() instanceof cgn) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return ciw.b;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return ciw.b;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return ciw.b;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return ciw.b;
         }

         if ($$4.b()) {
            $$3.d(ciw.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return ciw.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cbl $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(hf<dcb> $$0) {
      ciw $$1 = this.t.e();
      ciw $$2 = this.u.e();
      ciw $$3 = ciw.b;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         chk $$4 = ((chl)$$2.d()).d();
         qs $$5 = cgp.a($$3);
         qy $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new qy();
            if ($$5 == null) {
               $$5 = new qs();
            }

            $$5.a("Patterns", $$6);
         }

         qs $$8 = new qs();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         cgp.a($$3, dcm.t, $$5);
      }

      if (!ciw.a($$3, this.w.e())) {
         this.w.e($$3);
      }
   }

   public cfu n() {
      return this.t;
   }

   public cfu o() {
      return this.u;
   }

   public cfu p() {
      return this.v;
   }

   public cfu q() {
      return this.w;
   }
}
