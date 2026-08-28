import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class crs extends cqw {
   static final alc p = alc.b("item/empty_slot_lapis_lazuli");
   private final bri q = new brw(2) {
      @Override
      public void e() {
         super.e();
         crs.this.a(this);
      }
   };
   private final crj r;
   private final azl s = azl.a();
   private final crq t = crq.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public crs(int $$0, cnt $$1) {
      this($$0, $$1, crj.a);
   }

   public crs(int $$0, cnt $$1, crj $$2) {
      super(csf.n, $$0);
      this.r = $$2;
      this.a(new cst(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cst(this.q, 1, 35, 47) {
         @Override
         public boolean a(cvp $$0) {
            return $$0.a(cvt.oC);
         }

         @Override
         public Pair<alc, alc> b() {
            return Pair.of(crz.B, crs.p);
         }
      });
      this.c($$1, 8, 84);
      this.a(crq.a(this.m, 0));
      this.a(crq.a(this.m, 1));
      this.a(crq.a(this.m, 2));
      this.a(this.t).a($$1.k.gk());
      this.a(crq.a(this.n, 0));
      this.a(crq.a(this.n, 1));
      this.a(crq.a(this.n, 2));
      this.a(crq.a(this.o, 0));
      this.a(crq.a(this.o, 1));
      this.a(crq.a(this.o, 2));
   }

   @Override
   public void a(bri $$0) {
      if ($$0 == this.q) {
         cvp $$1 = $$0.a(0);
         if (!$$1.f() && $$1.B()) {
            this.r.a(($$1x, $$2x) -> {
               js<jn<dbk>> $$3 = $$1x.F_().d(lv.aM).t();
               int $$4 = 0;

               for (je $$5 : djv.c) {
                  if (djv.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = dbm.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<dbn> $$8 = this.a($$1x.F_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        dbn $$9 = $$8.get(this.s.a($$8.size()));
                        this.n[$$7] = $$3.a($$9.a);
                        this.o[$$7] = $$9.b;
                     }
                  }
               }

               this.d();
            });
         } else {
            for (int $$2 = 0; $$2 < 3; $$2++) {
               this.m[$$2] = 0;
               this.n[$$2] = -1;
               this.o[$$2] = -1;
            }
         }
      }
   }

   @Override
   public boolean a(cnu $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cvp $$2 = this.q.a(0);
         cvp $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.J() < $$4) && !$$0.fQ()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cm < $$4 || $$0.cm < this.m[$$1]) && !$$0.gd().d) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cvp $$7 = $$2;
               List<dbn> $$8 = this.a($$5.F_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cvt.qQ)) {
                     $$7 = $$2.a((def)cvt.uy);
                     this.q.a(0, $$7);
                  }

                  for (dbn $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, (buk)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cvp.k);
                  }

                  $$0.a(awo.ak);
                  if ($$0 instanceof ari) {
                     an.j.a((ari)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gk());
                  this.a(this.q);
                  $$5.a(null, $$6, awe.hY, awf.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ad.b($$0.aj() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<dbn> a(kb $$0, cvp $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<jr.c<dbk>> $$4 = $$0.d(lv.aM).a(aww.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<dbn> $$5 = dbm.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cvt.qQ) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cvp $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.J();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(cnu $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cnu $$0) {
      return a(this.r, $$0, dhl.fr);
   }

   @Override
   public cvp b(cnu $$0, int $$1) {
      cvp $$2 = cvp.k;
      cst $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvp $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cvp.k;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cvp.k;
            }
         } else if ($$4.a(cvt.oC)) {
            if (!this.a($$4, 1, 2, true)) {
               return cvp.k;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cvp.k;
            }

            cvp $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cvp.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvp.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
