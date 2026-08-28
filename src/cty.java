import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cty extends ctc {
   static final alz p = alz.b("item/empty_slot_lapis_lazuli");
   private final btc q = new btq(2) {
      @Override
      public void e() {
         super.e();
         cty.this.a(this);
      }
   };
   private final ctp r;
   private final bam s = bam.a();
   private final ctw t = ctw.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public cty(int $$0, cpw $$1) {
      this($$0, $$1, ctp.a);
   }

   public cty(int $$0, cpw $$1, ctp $$2) {
      super(cul.n, $$0);
      this.r = $$2;
      this.a(new cuz(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cuz(this.q, 1, 35, 47) {
         @Override
         public boolean a(cxp $$0) {
            return $$0.a(cxt.oX);
         }

         @Override
         public Pair<alz, alz> b() {
            return Pair.of(cuf.B, cty.p);
         }
      });
      this.c($$1, 8, 84);
      this.a(ctw.a(this.m, 0));
      this.a(ctw.a(this.m, 1));
      this.a(ctw.a(this.m, 2));
      this.a(this.t).a($$1.k.gr());
      this.a(ctw.a(this.n, 0));
      this.a(ctw.a(this.n, 1));
      this.a(ctw.a(this.n, 2));
      this.a(ctw.a(this.o, 0));
      this.a(ctw.a(this.o, 1));
      this.a(ctw.a(this.o, 2));
   }

   @Override
   public void a(btc $$0) {
      if ($$0 == this.q) {
         cxp $$1 = $$0.a(0);
         if (!$$1.f() && $$1.D()) {
            this.r.a(($$1x, $$2x) -> {
               jv<jq<ddz>> $$3 = $$1x.K_().e(mb.aO).t();
               int $$4 = 0;

               for (jh $$5 : dna.c) {
                  if (dna.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = deb.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<dec> $$8 = this.a($$1x.K_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        dec $$9 = $$8.get(this.s.a($$8.size()));
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
   public boolean a(cpx $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cxp $$2 = this.q.a(0);
         cxp $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.L() < $$4) && !$$0.fV()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cq < $$4 || $$0.cq < this.m[$$1]) && !$$0.gj().d) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cxp $$7 = $$2;
               List<dec> $$8 = this.a($$5.K_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cxt.rn)) {
                     $$7 = $$2.a((dhh)cxt.vm);
                     this.q.a(0, $$7);
                  }

                  for (dec $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, (bwg)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cxp.j);
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

   private List<dec> a(ke $$0, cxp $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<ju.c<ddz>> $$4 = $$0.e(mb.aO).a(axx.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<dec> $$5 = deb.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cxt.rn) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cxp $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.L();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(cpx $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cpx $$0) {
      return a(this.r, $$0, dko.fF);
   }

   @Override
   public cxp b(cpx $$0, int $$1) {
      cxp $$2 = cxp.j;
      cuz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cxp.j;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cxp.j;
            }
         } else if ($$4.a(cxt.oX)) {
            if (!this.a($$4, 1, 2, true)) {
               return cxp.j;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cxp.j;
            }

            cxp $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cxp.j);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxp.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
