import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class ctt extends csx {
   static final alz p = alz.b("item/empty_slot_lapis_lazuli");
   private final bsx q = new btl(2) {
      @Override
      public void e() {
         super.e();
         ctt.this.a(this);
      }
   };
   private final ctk r;
   private final bam s = bam.a();
   private final ctr t = ctr.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public ctt(int $$0, cpr $$1) {
      this($$0, $$1, ctk.a);
   }

   public ctt(int $$0, cpr $$1, ctk $$2) {
      super(cug.n, $$0);
      this.r = $$2;
      this.a(new cuu(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cuu(this.q, 1, 35, 47) {
         @Override
         public boolean a(cxk $$0) {
            return $$0.a(cxo.oX);
         }

         @Override
         public Pair<alz, alz> b() {
            return Pair.of(cua.B, ctt.p);
         }
      });
      this.c($$1, 8, 84);
      this.a(ctr.a(this.m, 0));
      this.a(ctr.a(this.m, 1));
      this.a(ctr.a(this.m, 2));
      this.a(this.t).a($$1.k.gp());
      this.a(ctr.a(this.n, 0));
      this.a(ctr.a(this.n, 1));
      this.a(ctr.a(this.n, 2));
      this.a(ctr.a(this.o, 0));
      this.a(ctr.a(this.o, 1));
      this.a(ctr.a(this.o, 2));
   }

   @Override
   public void a(bsx $$0) {
      if ($$0 == this.q) {
         cxk $$1 = $$0.a(0);
         if (!$$1.f() && $$1.D()) {
            this.r.a(($$1x, $$2x) -> {
               jv<jq<ddr>> $$3 = $$1x.K_().e(mb.aN).t();
               int $$4 = 0;

               for (jh $$5 : dms.c) {
                  if (dms.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = ddt.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<ddu> $$8 = this.a($$1x.K_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        ddu $$9 = $$8.get(this.s.a($$8.size()));
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
   public boolean a(cps $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cxk $$2 = this.q.a(0);
         cxk $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.L() < $$4) && !$$0.fT()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cq < $$4 || $$0.cq < this.m[$$1]) && !$$0.gh().d) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cxk $$7 = $$2;
               List<ddu> $$8 = this.a($$5.K_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cxo.rn)) {
                     $$7 = $$2.a((dgz)cxo.vm);
                     this.q.a(0, $$7);
                  }

                  for (ddu $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, (bwb)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cxk.k);
                  }

                  $$0.a(axp.ak);
                  if ($$0 instanceof asi) {
                     ao.j.a((asi)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gp());
                  this.a(this.q);
                  $$5.a(null, $$6, axf.iq, axg.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ae.b($$0.al() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<ddu> a(ke $$0, cxk $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<ju.c<ddr>> $$4 = $$0.e(mb.aN).a(axx.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<ddu> $$5 = ddt.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cxo.rn) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cxk $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.L();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(cps $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cps $$0) {
      return a(this.r, $$0, dkg.fF);
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      cxk $$2 = cxk.k;
      cuu $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cxk.k;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cxk.k;
            }
         } else if ($$4.a(cxo.oX)) {
            if (!this.a($$4, 1, 2, true)) {
               return cxk.k;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cxk.k;
            }

            cxk $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cxk.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxk.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
