import com.google.common.collect.ImmutableList;
import java.util.List;

public class cob extends cmw {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cnh p;
   final cno q = cno.a();
   private List<in<dme>> r = List.of();
   Runnable s = () -> {
   };
   private final io<dme> t;
   final cos u;
   final cos v;
   private final cos w;
   private final cos x;
   long y;
   private final bny z = new boo(3) {
      @Override
      public void e() {
         super.e();
         cob.this.a(this);
         cob.this.s.run();
      }
   };
   private final bny A = new boo(1) {
      @Override
      public void e() {
         super.e();
         cob.this.s.run();
      }
   };

   public cob(int $$0, cjz $$1) {
      this($$0, $$1, cnh.a);
   }

   public cob(int $$0, cjz $$1, final cnh $$2) {
      super(cod.s, $$0);
      this.p = $$2;
      this.u = this.a(new cos(this.z, 0, 13, 26) {
         @Override
         public boolean a(crs $$0) {
            return $$0.f() instanceof cpn;
         }
      });
      this.v = this.a(new cos(this.z, 1, 33, 26) {
         @Override
         public boolean a(crs $$0) {
            return $$0.f() instanceof cqm;
         }
      });
      this.w = this.a(new cos(this.z, 2, 23, 45) {
         @Override
         public boolean a(crs $$0) {
            return $$0.f() instanceof cpo;
         }
      });
      this.x = this.a(new cos(this.A, 0, 143, 57) {
         @Override
         public boolean a(crs $$0) {
            return false;
         }

         @Override
         public void a(cka $$0, crs $$1) {
            cob.this.u.a(1);
            cob.this.v.a(1);
            if (!cob.this.u.h() || !cob.this.v.h()) {
               cob.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Y();
               if (cob.this.y != $$2xx) {
                  $$0x.a(null, $$1x, auo.zX, aup.e, 1.0F, 1.0F);
                  cob.this.y = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cos($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cos($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
      this.t = $$1.m.dO().b(ku.d);
   }

   @Override
   public boolean a(cka $$0) {
      return a(this.p, $$0, dcj.nT);
   }

   @Override
   public boolean b(cka $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<in<dme>> c(crs $$0) {
      if ($$0.d()) {
         return this.t.a(avc.a).<List<in<dme>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.f() instanceof cpo $$1 ? this.t.a($$1.b()).<List<in<dme>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bny $$0) {
      crs $$1 = this.u.g();
      crs $$2 = this.v.g();
      crs $$3 = this.w.g();
      if (!$$1.d() && !$$2.d()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<in<dme>> $$6 = this.r;
         this.r = this.c($$3);
         in<dme> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            in<dme> $$9 = $$6.get($$4);
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
            dmf $$13 = $$1.a(jr.N, dmf.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.x.f(crs.i);
            } else {
               this.a($$7);
            }
         } else {
            this.x.f(crs.i);
         }

         this.d();
      } else {
         this.x.f(crs.i);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<in<dme>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public crs a(cka $$0, int $$1) {
      crs $$2 = crs.i;
      cos $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crs $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == this.x.e) {
            if (!this.a($$4, 4, 40, true)) {
               return crs.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.v.e && $$1 != this.u.e && $$1 != this.w.e) {
            if ($$4.f() instanceof cpn) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return crs.i;
               }
            } else if ($$4.f() instanceof cqm) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return crs.i;
               }
            } else if ($$4.f() instanceof cpo) {
               if (!this.a($$4, this.w.e, this.w.e + 1, false)) {
                  return crs.i;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return crs.i;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return crs.i;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return crs.i;
         }

         if ($$4.d()) {
            $$3.e(crs.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crs.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cka $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.z));
   }

   private void a(in<dme> $$0) {
      crs $$1 = this.u.g();
      crs $$2 = this.v.g();
      crs $$3 = crs.i;
      if (!$$1.d() && !$$2.d()) {
         $$3 = $$1.c(1);
         cql $$4 = ((cqm)$$2.f()).c();
         $$3.a(jr.N, dmf.a, $$2x -> new dmf.a().a($$2x).a($$0, $$4).a());
      }

      if (!crs.a($$3, this.x.g())) {
         this.x.f($$3);
      }
   }

   public cos n() {
      return this.u;
   }

   public cos o() {
      return this.v;
   }

   public cos p() {
      return this.w;
   }

   public cos q() {
      return this.x;
   }
}
