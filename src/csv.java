import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class csv extends crz {
   static final alj p = alj.b("item/empty_slot_lapis_lazuli");
   private final bsd q = new bsr(2) {
      @Override
      public void e() {
         super.e();
         csv.this.a(this);
      }
   };
   private final csm r;
   private final azu s = azu.a();
   private final cst t = cst.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public csv(int $$0, cot $$1) {
      this($$0, $$1, csm.a);
   }

   public csv(int $$0, cot $$1, csm $$2) {
      super(cti.n, $$0);
      this.r = $$2;
      this.a(new ctw(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new ctw(this.q, 1, 35, 47) {
         @Override
         public boolean a(cwm $$0) {
            return $$0.a(cwq.oC);
         }

         @Override
         public Pair<alj, alj> b() {
            return Pair.of(ctc.B, csv.p);
         }
      });
      this.c($$1, 8, 84);
      this.a(cst.a(this.m, 0));
      this.a(cst.a(this.m, 1));
      this.a(cst.a(this.m, 2));
      this.a(this.t).a($$1.k.gp());
      this.a(cst.a(this.n, 0));
      this.a(cst.a(this.n, 1));
      this.a(cst.a(this.n, 2));
      this.a(cst.a(this.o, 0));
      this.a(cst.a(this.o, 1));
      this.a(cst.a(this.o, 2));
   }

   @Override
   public void a(bsd $$0) {
      if ($$0 == this.q) {
         cwm $$1 = $$0.a(0);
         if (!$$1.f() && $$1.D()) {
            this.r.a(($$1x, $$2x) -> {
               jv<jq<dcd>> $$3 = $$1x.J_().e(ma.aM).t();
               int $$4 = 0;

               for (jh $$5 : dlc.c) {
                  if (dlc.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = dcf.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<dcg> $$8 = this.a($$1x.J_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        dcg $$9 = $$8.get(this.s.a($$8.size()));
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
   public boolean a(cou $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cwm $$2 = this.q.a(0);
         cwm $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.L() < $$4) && !$$0.fT()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cp < $$4 || $$0.cp < this.m[$$1]) && !$$0.gh().d) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cwm $$7 = $$2;
               List<dcg> $$8 = this.a($$5.J_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cwq.qQ)) {
                     $$7 = $$2.a((dfl)cwq.uO);
                     this.q.a(0, $$7);
                  }

                  for (dcg $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, (bvh)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cwm.k);
                  }

                  $$0.a(awx.ak);
                  if ($$0 instanceof arq) {
                     ao.j.a((arq)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gp());
                  this.a(this.q);
                  $$5.a(null, $$6, awn.hY, awo.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ae.b($$0.al() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<dcg> a(ke $$0, cwm $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<ju.c<dcd>> $$4 = $$0.e(ma.aM).a(axf.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<dcg> $$5 = dcf.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cwq.qQ) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cwm $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.L();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(cou $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cou $$0) {
      return a(this.r, $$0, dis.fr);
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cwm.k;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cwm.k;
            }
         } else if ($$4.a(cwq.oC)) {
            if (!this.a($$4, 1, 2, true)) {
               return cwm.k;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cwm.k;
            }

            cwm $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwm.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
