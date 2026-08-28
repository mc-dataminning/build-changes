import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class ctx extends ctb {
   static final alz p = alz.b("item/empty_slot_lapis_lazuli");
   private final btb q = new btp(2) {
      @Override
      public void e() {
         super.e();
         ctx.this.a(this);
      }
   };
   private final cto r;
   private final bam s = bam.a();
   private final ctv t = ctv.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public ctx(int $$0, cpv $$1) {
      this($$0, $$1, cto.a);
   }

   public ctx(int $$0, cpv $$1, cto $$2) {
      super(cuk.n, $$0);
      this.r = $$2;
      this.a(new cuy(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cuy(this.q, 1, 35, 47) {
         @Override
         public boolean a(cxo $$0) {
            return $$0.a(cxs.oX);
         }

         @Override
         public Pair<alz, alz> b() {
            return Pair.of(cue.B, ctx.p);
         }
      });
      this.c($$1, 8, 84);
      this.a(ctv.a(this.m, 0));
      this.a(ctv.a(this.m, 1));
      this.a(ctv.a(this.m, 2));
      this.a(this.t).a($$1.k.gr());
      this.a(ctv.a(this.n, 0));
      this.a(ctv.a(this.n, 1));
      this.a(ctv.a(this.n, 2));
      this.a(ctv.a(this.o, 0));
      this.a(ctv.a(this.o, 1));
      this.a(ctv.a(this.o, 2));
   }

   @Override
   public void a(btb $$0) {
      if ($$0 == this.q) {
         cxo $$1 = $$0.a(0);
         if (!$$1.f() && $$1.D()) {
            this.r.a(($$1x, $$2x) -> {
               jv<jq<ddy>> $$3 = $$1x.K_().e(mb.aO).t();
               int $$4 = 0;

               for (jh $$5 : dmz.c) {
                  if (dmz.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = dea.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<deb> $$8 = this.a($$1x.K_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        deb $$9 = $$8.get(this.s.a($$8.size()));
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
   public boolean a(cpw $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cxo $$2 = this.q.a(0);
         cxo $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.L() < $$4) && !$$0.fV()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cq < $$4 || $$0.cq < this.m[$$1]) && !$$0.gj().d) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cxo $$7 = $$2;
               List<deb> $$8 = this.a($$5.K_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cxs.rn)) {
                     $$7 = $$2.a((dhg)cxs.vm);
                     this.q.a(0, $$7);
                  }

                  for (deb $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, (bwf)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cxo.j);
                  }

                  $$0.a(axp.ak);
                  if ($$0 instanceof asi) {
                     ao.j.a((asi)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gr());
                  this.a(this.q);
                  $$5.a(null, $$6, axf.ir, axg.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ae.b($$0.al() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<deb> a(ke $$0, cxo $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<ju.c<ddy>> $$4 = $$0.e(mb.aO).a(axx.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<deb> $$5 = dea.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cxs.rn) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cxo $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.L();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(cpw $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cpw $$0) {
      return a(this.r, $$0, dkn.fF);
   }

   @Override
   public cxo b(cpw $$0, int $$1) {
      cxo $$2 = cxo.j;
      cuy $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxo $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cxo.j;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cxo.j;
            }
         } else if ($$4.a(cxs.oX)) {
            if (!this.a($$4, 1, 2, true)) {
               return cxo.j;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cxo.j;
            }

            cxo $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cxo.j);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxo.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
