import com.google.common.collect.ImmutableList;
import java.util.List;

public class cuu extends ctn {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final cua r;
   final cuh s = cuh.a();
   private List<js<dva>> t = List.of();
   Runnable u = () -> {
   };
   private final jt<dva> v;
   final cvk w;
   final cvk x;
   private final cvk y;
   private final cvk z;
   long A;
   private final btj B = new btx(3) {
      @Override
      public void e() {
         super.e();
         cuu.this.a(this);
         cuu.this.u.run();
      }
   };
   private final btj C = new btx(1) {
      @Override
      public void e() {
         super.e();
         cuu.this.u.run();
      }
   };

   public cuu(int $$0, cqh $$1) {
      this($$0, $$1, cua.a);
   }

   public cuu(int $$0, cqh $$1, final cua $$2) {
      super(cuw.s, $$0);
      this.r = $$2;
      this.w = this.a(new cvk(this.B, 0, 13, 26) {
         @Override
         public boolean a(cxy $$0) {
            return $$0.h() instanceof cwc;
         }
      });
      this.x = this.a(new cvk(this.B, 1, 33, 26) {
         @Override
         public boolean a(cxy $$0) {
            return $$0.h() instanceof cww;
         }
      });
      this.y = this.a(new cvk(this.B, 2, 23, 45) {
         @Override
         public boolean a(cxy $$0) {
            return $$0.h() instanceof cwd;
         }
      });
      this.z = this.a(new cvk(this.C, 0, 143, 57) {
         @Override
         public boolean a(cxy $$0) {
            return false;
         }

         @Override
         public void a(cqi $$0, cxy $$1) {
            cuu.this.w.a(1);
            cuu.this.x.a(1);
            if (!cuu.this.w.h() || !cuu.this.x.h()) {
               cuu.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cuu.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awk.Br, awl.e, 1.0F, 1.0F);
                  cuu.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dX().f(me.d);
   }

   @Override
   public boolean b(cqi $$0) {
      return a(this.r, $$0, dkw.ov);
   }

   @Override
   public boolean a(cqi $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<js<dva>> c(cxy $$0) {
      if ($$0.f()) {
         return this.v.a(awx.a).<List<js<dva>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cwd $$1 ? this.v.a($$1.b()).<List<js<dva>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(btj $$0) {
      cxy $$1 = this.w.g();
      cxy $$2 = this.x.g();
      cxy $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<js<dva>> $$6 = this.t;
         this.t = this.c($$3);
         js<dva> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            js<dva> $$9 = $$6.get($$4);
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
            dvb $$13 = $$1.a(kx.ak, dvb.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cxy.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cxy.k);
         }

         this.d();
      } else {
         this.z.f(cxy.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<js<dva>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cxy b(cqi $$0, int $$1) {
      cxy $$2 = cxy.k;
      cvk $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cxy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cwc) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cxy.k;
               }
            } else if ($$4.h() instanceof cww) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cxy.k;
               }
            } else if ($$4.h() instanceof cwd) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cxy.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cxy.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cxy.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cxy.k;
         }

         if ($$4.f()) {
            $$3.e(cxy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cxy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cqi $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(js<dva> $$0) {
      cxy $$1 = this.w.g();
      cxy $$2 = this.x.g();
      cxy $$3 = cxy.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cwv $$4 = ((cww)$$2.h()).b();
         $$3.a(kx.ak, dvb.a, $$2x -> new dvb.a().a($$2x).a($$0, $$4).a());
      }

      if (!cxy.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cvk n() {
      return this.w;
   }

   public cvk o() {
      return this.x;
   }

   public cvk p() {
      return this.y;
   }

   public cvk q() {
      return this.z;
   }
}
