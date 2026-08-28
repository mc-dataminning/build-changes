import com.google.common.collect.ImmutableList;
import java.util.List;

public class crx extends cqq {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final crd r;
   final crk s = crk.a();
   private List<jn<dqu>> t = List.of();
   Runnable u = () -> {
   };
   private final jo<dqu> v;
   final csn w;
   final csn x;
   private final csn y;
   private final csn z;
   long A;
   private final brd B = new brr(3) {
      @Override
      public void e() {
         super.e();
         crx.this.a(this);
         crx.this.u.run();
      }
   };
   private final brd C = new brr(1) {
      @Override
      public void e() {
         super.e();
         crx.this.u.run();
      }
   };

   public crx(int $$0, cno $$1) {
      this($$0, $$1, crd.a);
   }

   public crx(int $$0, cno $$1, final crd $$2) {
      super(crz.s, $$0);
      this.r = $$2;
      this.w = this.a(new csn(this.B, 0, 13, 26) {
         @Override
         public boolean a(cvl $$0) {
            return $$0.h() instanceof cti;
         }
      });
      this.x = this.a(new csn(this.B, 1, 33, 26) {
         @Override
         public boolean a(cvl $$0) {
            return $$0.h() instanceof cuf;
         }
      });
      this.y = this.a(new csn(this.B, 2, 23, 45) {
         @Override
         public boolean a(cvl $$0) {
            return $$0.h() instanceof ctj;
         }
      });
      this.z = this.a(new csn(this.C, 0, 143, 57) {
         @Override
         public boolean a(cvl $$0) {
            return false;
         }

         @Override
         public void a(cnp $$0, cvl $$1) {
            crx.this.w.a(1);
            crx.this.x.a(1);
            if (!crx.this.w.h() || !crx.this.x.h()) {
               crx.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.aa();
               if (crx.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awd.Az, awe.e, 1.0F, 1.0F);
                  crx.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dU().b(lv.d);
   }

   @Override
   public boolean b(cnp $$0) {
      return a(this.r, $$0, dgx.nT);
   }

   @Override
   public boolean a(cnp $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jn<dqu>> c(cvl $$0) {
      if ($$0.f()) {
         return this.v.a(awq.a).<List<jn<dqu>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof ctj $$1 ? this.v.a($$1.b()).<List<jn<dqu>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(brd $$0) {
      cvl $$1 = this.w.g();
      cvl $$2 = this.x.g();
      cvl $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jn<dqu>> $$6 = this.t;
         this.t = this.c($$3);
         jn<dqu> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jn<dqu> $$9 = $$6.get($$4);
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
            dqv $$13 = $$1.a(kr.aa, dqv.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cvl.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cvl.k);
         }

         this.d();
      } else {
         this.z.f(cvl.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jn<dqu>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cvl b(cnp $$0, int $$1) {
      cvl $$2 = cvl.k;
      csn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvl $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cvl.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cti) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cvl.k;
               }
            } else if ($$4.h() instanceof cuf) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cvl.k;
               }
            } else if ($$4.h() instanceof ctj) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cvl.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cvl.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cvl.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cvl.k;
         }

         if ($$4.f()) {
            $$3.e(cvl.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvl.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cnp $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jn<dqu> $$0) {
      cvl $$1 = this.w.g();
      cvl $$2 = this.x.g();
      cvl $$3 = cvl.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cue $$4 = ((cuf)$$2.h()).c();
         $$3.a(kr.aa, dqv.a, $$2x -> new dqv.a().a($$2x).a($$0, $$4).a());
      }

      if (!cvl.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public csn n() {
      return this.w;
   }

   public csn o() {
      return this.x;
   }

   public csn p() {
      return this.y;
   }

   public csn q() {
      return this.z;
   }
}
