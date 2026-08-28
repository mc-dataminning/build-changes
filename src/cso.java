import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cso extends crs {
   static final all p = all.b("item/empty_slot_lapis_lazuli");
   private final bsa q = new bso(2) {
      @Override
      public void e() {
         super.e();
         cso.this.a(this);
      }
   };
   private final csf r;
   private final azv s = azv.a();
   private final csm t = csm.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public cso(int $$0, coq $$1) {
      this($$0, $$1, csf.a);
   }

   public cso(int $$0, coq $$1, csf $$2) {
      super(ctb.n, $$0);
      this.r = $$2;
      this.a(new ctp(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new ctp(this.q, 1, 35, 47) {
         @Override
         public boolean a(cwf $$0) {
            return $$0.a(cwj.oC);
         }

         @Override
         public Pair<all, all> b() {
            return Pair.of(csv.B, cso.p);
         }
      });
      this.c($$1, 8, 84);
      this.a(csm.a(this.m, 0));
      this.a(csm.a(this.m, 1));
      this.a(csm.a(this.m, 2));
      this.a(this.t).a($$1.k.gu());
      this.a(csm.a(this.n, 0));
      this.a(csm.a(this.n, 1));
      this.a(csm.a(this.n, 2));
      this.a(csm.a(this.o, 0));
      this.a(csm.a(this.o, 1));
      this.a(csm.a(this.o, 2));
   }

   @Override
   public void a(bsa $$0) {
      if ($$0 == this.q) {
         cwf $$1 = $$0.a(0);
         if (!$$1.f() && $$1.D()) {
            this.r.a(($$1x, $$2x) -> {
               jv<jq<dbw>> $$3 = $$1x.H_().e(ma.aM).t();
               int $$4 = 0;

               for (jh $$5 : dkv.c) {
                  if (dkv.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = dby.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<dbz> $$8 = this.a($$1x.H_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        dbz $$9 = $$8.get(this.s.a($$8.size()));
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
   public boolean a(cor $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cwf $$2 = this.q.a(0);
         cwf $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.L() < $$4) && !$$0.fY()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cq < $$4 || $$0.cq < this.m[$$1]) && !$$0.gm().d) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cwf $$7 = $$2;
               List<dbz> $$8 = this.a($$5.H_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cwj.qQ)) {
                     $$7 = $$2.a((dfe)cwj.uO);
                     this.q.a(0, $$7);
                  }

                  for (dbz $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, (bve)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cwf.k);
                  }

                  $$0.a(awy.ak);
                  if ($$0 instanceof arr) {
                     ao.j.a((arr)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gu());
                  this.a(this.q);
                  $$5.a(null, $$6, awo.hY, awp.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ae.b($$0.am() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<dbz> a(ke $$0, cwf $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<ju.c<dbw>> $$4 = $$0.e(ma.aM).a(axg.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<dbz> $$5 = dby.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cwj.qQ) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cwf $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.L();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(cor $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cor $$0) {
      return a(this.r, $$0, dil.fr);
   }

   @Override
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwf $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cwf.k;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cwf.k;
            }
         } else if ($$4.a(cwj.oC)) {
            if (!this.a($$4, 1, 2, true)) {
               return cwf.k;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cwf.k;
            }

            cwf $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cwf.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwf.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
