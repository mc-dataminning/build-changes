import com.google.common.collect.ImmutableList;
import java.util.List;

public class csv extends cro {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final csb r;
   final csi s = csi.a();
   private List<jq<dsc>> t = List.of();
   Runnable u = () -> {
   };
   private final jr<dsc> v;
   final ctl w;
   final ctl x;
   private final ctl y;
   private final ctl z;
   long A;
   private final brw B = new bsk(3) {
      @Override
      public void e() {
         super.e();
         csv.this.a(this);
         csv.this.u.run();
      }
   };
   private final brw C = new bsk(1) {
      @Override
      public void e() {
         super.e();
         csv.this.u.run();
      }
   };

   public csv(int $$0, col $$1) {
      this($$0, $$1, csb.a);
   }

   public csv(int $$0, col $$1, final csb $$2) {
      super(csx.s, $$0);
      this.r = $$2;
      this.w = this.a(new ctl(this.B, 0, 13, 26) {
         @Override
         public boolean a(cwb $$0) {
            return $$0.h() instanceof cue;
         }
      });
      this.x = this.a(new ctl(this.B, 1, 33, 26) {
         @Override
         public boolean a(cwb $$0) {
            return $$0.h() instanceof cuz;
         }
      });
      this.y = this.a(new ctl(this.B, 2, 23, 45) {
         @Override
         public boolean a(cwb $$0) {
            return $$0.h() instanceof cuf;
         }
      });
      this.z = this.a(new ctl(this.C, 0, 143, 57) {
         @Override
         public boolean a(cwb $$0) {
            return false;
         }

         @Override
         public void a(com $$0, cwb $$1) {
            csv.this.w.a(1);
            csv.this.x.a(1);
            if (!csv.this.w.h() || !csv.this.x.h()) {
               csv.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.aa();
               if (csv.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awl.Ax, awm.e, 1.0F, 1.0F);
                  csv.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dZ().e(lz.d);
   }

   @Override
   public boolean b(com $$0) {
      return a(this.r, $$0, dig.nT);
   }

   @Override
   public boolean a(com $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jq<dsc>> c(cwb $$0) {
      if ($$0.f()) {
         return this.v.a(awy.a).<List<jq<dsc>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cuf $$1 ? this.v.a($$1.b()).<List<jq<dsc>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(brw $$0) {
      cwb $$1 = this.w.g();
      cwb $$2 = this.x.g();
      cwb $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jq<dsc>> $$6 = this.t;
         this.t = this.c($$3);
         jq<dsc> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jq<dsc> $$9 = $$6.get($$4);
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
            dsd $$13 = $$1.a(ku.ai, dsd.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cwb.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cwb.k);
         }

         this.d();
      } else {
         this.z.f(cwb.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jq<dsc>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cwb b(com $$0, int $$1) {
      cwb $$2 = cwb.k;
      ctl $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwb $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cwb.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cue) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cwb.k;
               }
            } else if ($$4.h() instanceof cuz) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cwb.k;
               }
            } else if ($$4.h() instanceof cuf) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cwb.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cwb.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cwb.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cwb.k;
         }

         if ($$4.f()) {
            $$3.e(cwb.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwb.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(com $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jq<dsc> $$0) {
      cwb $$1 = this.w.g();
      cwb $$2 = this.x.g();
      cwb $$3 = cwb.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cuy $$4 = ((cuz)$$2.h()).b();
         $$3.a(ku.ai, dsd.a, $$2x -> new dsd.a().a($$2x).a($$0, $$4).a());
      }

      if (!cwb.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public ctl n() {
      return this.w;
   }

   public ctl o() {
      return this.x;
   }

   public ctl p() {
      return this.y;
   }

   public ctl q() {
      return this.z;
   }
}
