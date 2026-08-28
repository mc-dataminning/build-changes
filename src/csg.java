import com.google.common.collect.ImmutableList;
import java.util.List;

public class csg extends cqz {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final crm r;
   final crt s = crt.a();
   private List<jo<drl>> t = List.of();
   Runnable u = () -> {
   };
   private final jp<drl> v;
   final csw w;
   final csw x;
   private final csw y;
   private final csw z;
   long A;
   private final brl B = new brz(3) {
      @Override
      public void e() {
         super.e();
         csg.this.a(this);
         csg.this.u.run();
      }
   };
   private final brl C = new brz(1) {
      @Override
      public void e() {
         super.e();
         csg.this.u.run();
      }
   };

   public csg(int $$0, cnw $$1) {
      this($$0, $$1, crm.a);
   }

   public csg(int $$0, cnw $$1, final crm $$2) {
      super(csi.s, $$0);
      this.r = $$2;
      this.w = this.a(new csw(this.B, 0, 13, 26) {
         @Override
         public boolean a(cvs $$0) {
            return $$0.h() instanceof ctr;
         }
      });
      this.x = this.a(new csw(this.B, 1, 33, 26) {
         @Override
         public boolean a(cvs $$0) {
            return $$0.h() instanceof cun;
         }
      });
      this.y = this.a(new csw(this.B, 2, 23, 45) {
         @Override
         public boolean a(cvs $$0) {
            return $$0.h() instanceof cts;
         }
      });
      this.z = this.a(new csw(this.C, 0, 143, 57) {
         @Override
         public boolean a(cvs $$0) {
            return false;
         }

         @Override
         public void a(cnx $$0, cvs $$1) {
            csg.this.w.a(1);
            csg.this.x.a(1);
            if (!csg.this.w.h() || !csg.this.x.h()) {
               csg.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.aa();
               if (csg.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awg.Az, awh.e, 1.0F, 1.0F);
                  csg.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dU().e(lw.d);
   }

   @Override
   public boolean b(cnx $$0) {
      return a(this.r, $$0, dho.nT);
   }

   @Override
   public boolean a(cnx $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jo<drl>> c(cvs $$0) {
      if ($$0.f()) {
         return this.v.a(awt.a).<List<jo<drl>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cts $$1 ? this.v.a($$1.b()).<List<jo<drl>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(brl $$0) {
      cvs $$1 = this.w.g();
      cvs $$2 = this.x.g();
      cvs $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jo<drl>> $$6 = this.t;
         this.t = this.c($$3);
         jo<drl> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jo<drl> $$9 = $$6.get($$4);
            int $$10 = this.t.indexOf($$9);
            if ($$10 != -1) {
               $$7 = $$9;
               this.s.a($$10);
            } else {
               $$7 = null;
               this.s.a(-1);
            }
         }

         if ($$7 != null) {
            drm $$13 = $$1.a(ks.ad, drm.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cvs.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cvs.k);
         }

         this.d();
      } else {
         this.z.f(cvs.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jo<drl>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cvs b(cnx $$0, int $$1) {
      cvs $$2 = cvs.k;
      csw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvs $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cvs.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof ctr) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cvs.k;
               }
            } else if ($$4.h() instanceof cun) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cvs.k;
               }
            } else if ($$4.h() instanceof cts) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cvs.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cvs.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cvs.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cvs.k;
         }

         if ($$4.f()) {
            $$3.e(cvs.k);
         } else {
            $$3.c();
         }

         if ($$4.K() == $$2.K()) {
            return cvs.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cnx $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jo<drl> $$0) {
      cvs $$1 = this.w.g();
      cvs $$2 = this.x.g();
      cvs $$3 = cvs.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cum $$4 = ((cun)$$2.h()).c();
         $$3.a(ks.ad, drm.a, $$2x -> new drm.a().a($$2x).a($$0, $$4).a());
      }

      if (!cvs.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public csw n() {
      return this.w;
   }

   public csw o() {
      return this.x;
   }

   public csw p() {
      return this.y;
   }

   public csw q() {
      return this.z;
   }
}
