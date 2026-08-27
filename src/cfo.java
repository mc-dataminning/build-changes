import com.google.common.collect.ImmutableList;
import java.util.List;

public class cfo extends cel {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cew p;
   final cfb q = cfb.a();
   private List<hg<dcm>> r = List.of();
   Runnable s = () -> {
   };
   final cgd t;
   final cgd u;
   private final cgd v;
   private final cgd w;
   long x;
   private final bgr y = new bhf(3) {
      @Override
      public void e() {
         super.e();
         cfo.this.a(this);
         cfo.this.s.run();
      }
   };
   private final bgr z = new bhf(1) {
      @Override
      public void e() {
         super.e();
         cfo.this.s.run();
      }
   };

   public cfo(int $$0, cbt $$1) {
      this($$0, $$1, cew.a);
   }

   public cfo(int $$0, cbt $$1, final cew $$2) {
      super(cfq.r, $$0);
      this.p = $$2;
      this.t = this.a(new cgd(this.y, 0, 13, 26) {
         @Override
         public boolean a(cjf $$0) {
            return $$0.d() instanceof cgv;
         }
      });
      this.u = this.a(new cgd(this.y, 1, 33, 26) {
         @Override
         public boolean a(cjf $$0) {
            return $$0.d() instanceof chu;
         }
      });
      this.v = this.a(new cgd(this.y, 2, 23, 45) {
         @Override
         public boolean a(cjf $$0) {
            return $$0.d() instanceof cgw;
         }
      });
      this.w = this.a(new cgd(this.z, 0, 143, 57) {
         @Override
         public boolean a(cjf $$0) {
            return false;
         }

         @Override
         public void a(cbu $$0, cjf $$1) {
            cfo.this.t.a(1);
            cfo.this.u.a(1);
            if (!cfo.this.t.f() || !cfo.this.u.f()) {
               cfo.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (cfo.this.x != $$2xx) {
                  $$0x.a(null, $$1x, ape.yw, apf.e, 1.0F, 1.0F);
                  cfo.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cgd($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cgd($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cbu $$0) {
      return a(this.p, $$0, csw.nT);
   }

   @Override
   public boolean b(cbu $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<hg<dcm>> c(cjf $$0) {
      if ($$0.b()) {
         return jd.al.b(apr.a).<List<hg<dcm>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cgw $$1 ? jd.al.b($$1.b()).<List<hg<dcm>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bgr $$0) {
      cjf $$1 = this.t.e();
      cjf $$2 = this.u.e();
      cjf $$3 = this.v.e();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<hg<dcm>> $$6 = this.r;
         this.r = this.c($$3);
         hg<dcm> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            hg<dcm> $$9 = $$6.get($$4);
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
            qy $$13 = cgy.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.e(cjf.b);
            } else {
               this.a($$7);
            }
         } else {
            this.w.e(cjf.b);
         }

         this.d();
      } else {
         this.w.e(cjf.b);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<hg<dcm>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cjf a(cbu $$0, int $$1) {
      cjf $$2 = cjf.b;
      cgd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjf $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cjf.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof cgv) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cjf.b;
               }
            } else if ($$4.d() instanceof chu) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cjf.b;
               }
            } else if ($$4.d() instanceof cgw) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cjf.b;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cjf.b;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cjf.b;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cjf.b;
         }

         if ($$4.b()) {
            $$3.d(cjf.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cjf.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cbu $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(hg<dcm> $$0) {
      cjf $$1 = this.t.e();
      cjf $$2 = this.u.e();
      cjf $$3 = cjf.b;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         cht $$4 = ((chu)$$2.d()).d();
         qy $$5 = cgy.a($$3);
         re $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new re();
            if ($$5 == null) {
               $$5 = new qy();
            }

            $$5.a("Patterns", $$6);
         }

         qy $$8 = new qy();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         cgy.a($$3, dcx.t, $$5);
      }

      if (!cjf.a($$3, this.w.e())) {
         this.w.e($$3);
      }
   }

   public cgd n() {
      return this.t;
   }

   public cgd o() {
      return this.u;
   }

   public cgd p() {
      return this.v;
   }

   public cgd q() {
      return this.w;
   }
}
