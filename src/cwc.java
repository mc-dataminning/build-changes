import com.google.common.collect.ImmutableList;
import java.util.List;

public class cwc extends cuv {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final cvi r;
   final cvp s = cvp.a();
   private List<je<dwu>> t = List.of();
   Runnable u = () -> {
   };
   private final jf<dwu> v;
   final cws w;
   final cws x;
   private final cws y;
   private final cws z;
   long A;
   private final btw B = new buk(3) {
      @Override
      public void e() {
         super.e();
         cwc.this.a(this);
         cwc.this.u.run();
      }
   };
   private final btw C = new buk(1) {
      @Override
      public void e() {
         super.e();
         cwc.this.u.run();
      }
   };

   public cwc(int $$0, crb $$1) {
      this($$0, $$1, cvi.a);
   }

   public cwc(int $$0, crb $$1, final cvi $$2) {
      super(cwe.s, $$0);
      this.r = $$2;
      this.w = this.a(new cws(this.B, 0, 13, 26) {
         @Override
         public boolean a(czd $$0) {
            return $$0.h() instanceof cxj;
         }
      });
      this.x = this.a(new cws(this.B, 1, 33, 26) {
         @Override
         public boolean a(czd $$0) {
            return $$0.h() instanceof cyc;
         }
      });
      this.y = this.a(new cws(this.B, 2, 23, 45) {
         @Override
         public boolean a(czd $$0) {
            return $$0.c(kj.af);
         }
      });
      this.z = this.a(new cws(this.C, 0, 143, 57) {
         @Override
         public boolean a(czd $$0) {
            return false;
         }

         @Override
         public void a(crc $$0, czd $$1) {
            cwc.this.w.a(1);
            cwc.this.x.a(1);
            if (!cwc.this.w.h() || !cwc.this.x.h()) {
               cwc.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ae();
               if (cwc.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awn.Bx, awo.e, 1.0F, 1.0F);
                  cwc.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.h.dX().f(mg.aF);
   }

   @Override
   public boolean b(crc $$0) {
      return a(this.r, $$0, dmh.oz);
   }

   @Override
   public boolean a(crc $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<je<dwu>> c(czd $$0) {
      if ($$0.f()) {
         return this.v.a(axa.a).<List<je<dwu>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         axr<dwu> $$1 = $$0.a(kj.af);
         return $$1 != null ? this.v.a($$1).<List<je<dwu>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(btw $$0) {
      czd $$1 = this.w.g();
      czd $$2 = this.x.g();
      czd $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<je<dwu>> $$6 = this.t;
         this.t = this.c($$3);
         je<dwu> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            je<dwu> $$9 = $$6.get($$4);
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
            dwv $$13 = $$1.a(kj.am, dwv.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(czd.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(czd.k);
         }

         this.d();
      } else {
         this.z.f(czd.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<je<dwu>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public czd b(crc $$0, int $$1) {
      czd $$2 = czd.k;
      cws $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czd $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return czd.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cxj) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return czd.k;
               }
            } else if ($$4.h() instanceof cyc) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return czd.k;
               }
            } else if ($$4.c(kj.af)) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return czd.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return czd.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return czd.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return czd.k;
         }

         if ($$4.f()) {
            $$3.e(czd.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czd.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(crc $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(je<dwu> $$0) {
      czd $$1 = this.w.g();
      czd $$2 = this.x.g();
      czd $$3 = czd.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cyb $$4 = ((cyc)$$2.h()).a();
         $$3.a(kj.am, dwv.a, $$2x -> new dwv.a().a($$2x).a($$0, $$4).a());
      }

      if (!czd.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cws n() {
      return this.w;
   }

   public cws o() {
      return this.x;
   }

   public cws p() {
      return this.y;
   }

   public cws q() {
      return this.z;
   }
}
