import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class csk extends cro {
   static final ali p = ali.b("item/empty_slot_lapis_lazuli");
   private final brw q = new bsk(2) {
      @Override
      public void e() {
         super.e();
         csk.this.a(this);
      }
   };
   private final csb r;
   private final azs s = azs.a();
   private final csi t = csi.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public csk(int $$0, col $$1) {
      this($$0, $$1, csb.a);
   }

   public csk(int $$0, col $$1, csb $$2) {
      super(csx.n, $$0);
      this.r = $$2;
      this.a(new ctl(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new ctl(this.q, 1, 35, 47) {
         @Override
         public boolean a(cwb $$0) {
            return $$0.a(cwf.oC);
         }

         @Override
         public Pair<ali, ali> b() {
            return Pair.of(csr.B, csk.p);
         }
      });
      this.c($$1, 8, 84);
      this.a(csi.a(this.m, 0));
      this.a(csi.a(this.m, 1));
      this.a(csi.a(this.m, 2));
      this.a(this.t).a($$1.k.gs());
      this.a(csi.a(this.n, 0));
      this.a(csi.a(this.n, 1));
      this.a(csi.a(this.n, 2));
      this.a(csi.a(this.o, 0));
      this.a(csi.a(this.o, 1));
      this.a(csi.a(this.o, 2));
   }

   @Override
   public void a(brw $$0) {
      if ($$0 == this.q) {
         cwb $$1 = $$0.a(0);
         if (!$$1.f() && $$1.D()) {
            this.r.a(($$1x, $$2x) -> {
               jv<jq<dbs>> $$3 = $$1x.H_().e(lz.aM).t();
               int $$4 = 0;

               for (jh $$5 : dkq.c) {
                  if (dkq.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = dbu.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<dbv> $$8 = this.a($$1x.H_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        dbv $$9 = $$8.get(this.s.a($$8.size()));
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
   public boolean a(com $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cwb $$2 = this.q.a(0);
         cwb $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.L() < $$4) && !$$0.fX()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cq < $$4 || $$0.cq < this.m[$$1]) && !$$0.gl().d) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cwb $$7 = $$2;
               List<dbv> $$8 = this.a($$5.H_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cwf.qQ)) {
                     $$7 = $$2.a((dfa)cwf.uy);
                     this.q.a(0, $$7);
                  }

                  for (dbv $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, (bva)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cwb.k);
                  }

                  $$0.a(awv.ak);
                  if ($$0 instanceof aro) {
                     ao.j.a((aro)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gs());
                  this.a(this.q);
                  $$5.a(null, $$6, awl.hY, awm.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ae.b($$0.am() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<dbv> a(ke $$0, cwb $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<ju.c<dbs>> $$4 = $$0.e(lz.aM).a(axd.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<dbv> $$5 = dbu.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cwf.qQ) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cwb $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.L();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(com $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(com $$0) {
      return a(this.r, $$0, dig.fr);
   }

   @Override
   public cwb b(com $$0, int $$1) {
      cwb $$2 = cwb.k;
      ctl $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwb $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cwb.k;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cwb.k;
            }
         } else if ($$4.a(cwf.oC)) {
            if (!this.a($$4, 1, 2, true)) {
               return cwb.k;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cwb.k;
            }

            cwb $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
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
}
