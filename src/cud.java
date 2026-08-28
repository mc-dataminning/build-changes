import com.google.common.collect.ImmutableList;
import java.util.List;

public class cud extends csw {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final ctj r;
   final ctq s = ctq.a();
   private List<jr<dui>> t = List.of();
   Runnable u = () -> {
   };
   private final js<dui> v;
   final cut w;
   final cut x;
   private final cut y;
   private final cut z;
   long A;
   private final bsr B = new btf(3) {
      @Override
      public void e() {
         super.e();
         cud.this.a(this);
         cud.this.u.run();
      }
   };
   private final bsr C = new btf(1) {
      @Override
      public void e() {
         super.e();
         cud.this.u.run();
      }
   };

   public cud(int $$0, cpq $$1) {
      this($$0, $$1, ctj.a);
   }

   public cud(int $$0, cpq $$1, final ctj $$2) {
      super(cuf.s, $$0);
      this.r = $$2;
      this.w = this.a(new cut(this.B, 0, 13, 26) {
         @Override
         public boolean a(cxh $$0) {
            return $$0.h() instanceof cvl;
         }
      });
      this.x = this.a(new cut(this.B, 1, 33, 26) {
         @Override
         public boolean a(cxh $$0) {
            return $$0.h() instanceof cwf;
         }
      });
      this.y = this.a(new cut(this.B, 2, 23, 45) {
         @Override
         public boolean a(cxh $$0) {
            return $$0.h() instanceof cvm;
         }
      });
      this.z = this.a(new cut(this.C, 0, 143, 57) {
         @Override
         public boolean a(cxh $$0) {
            return false;
         }

         @Override
         public void a(cpr $$0, cxh $$1) {
            cud.this.w.a(1);
            cud.this.x.a(1);
            if (!cud.this.w.h() || !cud.this.x.h()) {
               cud.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cud.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awa.Br, awb.e, 1.0F, 1.0F);
                  cud.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dW().e(mc.d);
   }

   @Override
   public boolean b(cpr $$0) {
      return a(this.r, $$0, dkg.ov);
   }

   @Override
   public boolean a(cpr $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jr<dui>> c(cxh $$0) {
      if ($$0.f()) {
         return this.v.a(awn.a).<List<jr<dui>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cvm $$1 ? this.v.a($$1.b()).<List<jr<dui>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(bsr $$0) {
      cxh $$1 = this.w.g();
      cxh $$2 = this.x.g();
      cxh $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jr<dui>> $$6 = this.t;
         this.t = this.c($$3);
         jr<dui> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jr<dui> $$9 = $$6.get($$4);
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
            duj $$13 = $$1.a(kv.ak, duj.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cxh.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cxh.k);
         }

         this.d();
      } else {
         this.z.f(cxh.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jr<dui>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cxh b(cpr $$0, int $$1) {
      cxh $$2 = cxh.k;
      cut $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxh $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cxh.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cvl) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cxh.k;
               }
            } else if ($$4.h() instanceof cwf) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cxh.k;
               }
            } else if ($$4.h() instanceof cvm) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cxh.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cxh.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cxh.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cxh.k;
         }

         if ($$4.f()) {
            $$3.e(cxh.k);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxh.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cpr $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jr<dui> $$0) {
      cxh $$1 = this.w.g();
      cxh $$2 = this.x.g();
      cxh $$3 = cxh.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cwe $$4 = ((cwf)$$2.h()).b();
         $$3.a(kv.ak, duj.a, $$2x -> new duj.a().a($$2x).a($$0, $$4).a());
      }

      if (!cxh.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cut n() {
      return this.w;
   }

   public cut o() {
      return this.x;
   }

   public cut p() {
      return this.y;
   }

   public cut q() {
      return this.z;
   }
}
