import com.google.common.collect.ImmutableList;
import java.util.List;

public class cqo extends cpi {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cpu p;
   final cqb q = cqb.a();
   private List<jj<dpg>> r = List.of();
   Runnable s = () -> {
   };
   private final jk<dpg> t;
   final cre u;
   final cre v;
   private final cre w;
   private final cre x;
   long y;
   private final bqa z = new bqq(3) {
      @Override
      public void e() {
         super.e();
         cqo.this.a(this);
         cqo.this.s.run();
      }
   };
   private final bqa A = new bqq(1) {
      @Override
      public void e() {
         super.e();
         cqo.this.s.run();
      }
   };

   public cqo(int $$0, cmk $$1) {
      this($$0, $$1, cpu.a);
   }

   public cqo(int $$0, cmk $$1, final cpu $$2) {
      super(cqq.s, $$0);
      this.p = $$2;
      this.u = this.a(new cre(this.z, 0, 13, 26) {
         @Override
         public boolean a(cud $$0) {
            return $$0.g() instanceof crz;
         }
      });
      this.v = this.a(new cre(this.z, 1, 33, 26) {
         @Override
         public boolean a(cud $$0) {
            return $$0.g() instanceof csx;
         }
      });
      this.w = this.a(new cre(this.z, 2, 23, 45) {
         @Override
         public boolean a(cud $$0) {
            return $$0.g() instanceof csa;
         }
      });
      this.x = this.a(new cre(this.A, 0, 143, 57) {
         @Override
         public boolean a(cud $$0) {
            return false;
         }

         @Override
         public void a(cml $$0, cud $$1) {
            cqo.this.u.a(1);
            cqo.this.v.a(1);
            if (!cqo.this.u.h() || !cqo.this.v.h()) {
               cqo.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Z();
               if (cqo.this.y != $$2xx) {
                  $$0x.a(null, $$1x, avh.At, avi.e, 1.0F, 1.0F);
                  cqo.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cre($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cre($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.l.dT().b(lr.d);
   }

   @Override
   public boolean b(cml $$0) {
      return a(this.p, $$0, dfk.nT);
   }

   @Override
   public boolean a(cml $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jj<dpg>> c(cud $$0) {
      if ($$0.e()) {
         return this.t.a(avu.a).<List<jj<dpg>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.g() instanceof csa $$1 ? this.t.a($$1.b()).<List<jj<dpg>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bqa $$0) {
      cud $$1 = this.u.g();
      cud $$2 = this.v.g();
      cud $$3 = this.w.g();
      if (!$$1.e() && !$$2.e()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<jj<dpg>> $$6 = this.r;
         this.r = this.c($$3);
         jj<dpg> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            jj<dpg> $$9 = $$6.get($$4);
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
            dph $$13 = $$1.a(kn.X, dph.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(cud.l);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(cud.l);
         }

         this.d();
      } else {
         this.x.f(cud.l);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<jj<dpg>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cud b(cml $$0, int $$1) {
      cud $$2 = cud.l;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cud $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == this.x.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cud.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.d && $$1 != this.u.d && $$1 != this.w.d) {
            if ($$4.g() instanceof crz) {
               if (!this.a($$4, this.u.d, this.u.d + 1, false)) {
                  return cud.l;
               }
            } else if ($$4.g() instanceof csx) {
               if (!this.a($$4, this.v.d, this.v.d + 1, false)) {
                  return cud.l;
               }
            } else if ($$4.g() instanceof csa) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cud.l;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cud.l;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cud.l;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cud.l;
         }

         if ($$4.e()) {
            $$3.e(cud.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cud.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cml $$0) {
      super.a($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.z));
   }

   private void a(jj<dpg> $$0) {
      cud $$1 = this.u.g();
      cud $$2 = this.v.g();
      cud $$3 = cud.l;
      if (!$$1.e() && !$$2.e()) {
         $$3 = $$1.c(1);
         csw $$4 = ((csx)$$2.g()).c();
         $$3.a(kn.X, dph.a, $$2x -> new dph.a().a($$2x).a($$0, $$4).a());
      }

      if (!cud.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public cre n() {
      return this.u;
   }

   public cre o() {
      return this.v;
   }

   public cre p() {
      return this.w;
   }

   public cre q() {
      return this.x;
   }
}
