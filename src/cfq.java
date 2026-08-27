import com.google.common.collect.ImmutableList;
import java.util.List;

public class cfq extends cen {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cey p;
   final cfd q = cfd.a();
   private List<hg<dco>> r = List.of();
   Runnable s = () -> {
   };
   final cgf t;
   final cgf u;
   private final cgf v;
   private final cgf w;
   long x;
   private final bgt y = new bhh(3) {
      @Override
      public void e() {
         super.e();
         cfq.this.a(this);
         cfq.this.s.run();
      }
   };
   private final bgt z = new bhh(1) {
      @Override
      public void e() {
         super.e();
         cfq.this.s.run();
      }
   };

   public cfq(int $$0, cbv $$1) {
      this($$0, $$1, cey.a);
   }

   public cfq(int $$0, cbv $$1, final cey $$2) {
      super(cfs.r, $$0);
      this.p = $$2;
      this.t = this.a(new cgf(this.y, 0, 13, 26) {
         @Override
         public boolean a(cjh $$0) {
            return $$0.d() instanceof cgx;
         }
      });
      this.u = this.a(new cgf(this.y, 1, 33, 26) {
         @Override
         public boolean a(cjh $$0) {
            return $$0.d() instanceof chw;
         }
      });
      this.v = this.a(new cgf(this.y, 2, 23, 45) {
         @Override
         public boolean a(cjh $$0) {
            return $$0.d() instanceof cgy;
         }
      });
      this.w = this.a(new cgf(this.z, 0, 143, 57) {
         @Override
         public boolean a(cjh $$0) {
            return false;
         }

         @Override
         public void a(cbw $$0, cjh $$1) {
            cfq.this.t.a(1);
            cfq.this.u.a(1);
            if (!cfq.this.t.f() || !cfq.this.u.f()) {
               cfq.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.V();
               if (cfq.this.x != $$2xx) {
                  $$0x.a(null, $$1x, apf.yw, apg.e, 1.0F, 1.0F);
                  cfq.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cgf($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cgf($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cbw $$0) {
      return a(this.p, $$0, csy.nT);
   }

   @Override
   public boolean b(cbw $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<hg<dco>> c(cjh $$0) {
      if ($$0.b()) {
         return jd.al.b(aps.a).<List<hg<dco>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cgy $$1 ? jd.al.b($$1.b()).<List<hg<dco>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bgt $$0) {
      cjh $$1 = this.t.e();
      cjh $$2 = this.u.e();
      cjh $$3 = this.v.e();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<hg<dco>> $$6 = this.r;
         this.r = this.c($$3);
         hg<dco> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            hg<dco> $$9 = $$6.get($$4);
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
            qy $$13 = cha.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.e(cjh.b);
            } else {
               this.a($$7);
            }
         } else {
            this.w.e(cjh.b);
         }

         this.d();
      } else {
         this.w.e(cjh.b);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<hg<dco>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cjh a(cbw $$0, int $$1) {
      cjh $$2 = cjh.b;
      cgf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjh $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cjh.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof cgx) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cjh.b;
               }
            } else if ($$4.d() instanceof chw) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cjh.b;
               }
            } else if ($$4.d() instanceof cgy) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cjh.b;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cjh.b;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cjh.b;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cjh.b;
         }

         if ($$4.b()) {
            $$3.d(cjh.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cjh.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cbw $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(hg<dco> $$0) {
      cjh $$1 = this.t.e();
      cjh $$2 = this.u.e();
      cjh $$3 = cjh.b;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         chv $$4 = ((chw)$$2.d()).d();
         qy $$5 = cha.a($$3);
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
         cha.a($$3, dcz.t, $$5);
      }

      if (!cjh.a($$3, this.w.e())) {
         this.w.e($$3);
      }
   }

   public cgf n() {
      return this.t;
   }

   public cgf o() {
      return this.u;
   }

   public cgf p() {
      return this.v;
   }

   public cgf q() {
      return this.w;
   }
}
