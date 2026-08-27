import com.mojang.datafixers.util.Pair;
import java.util.List;

public class cie extends chk {
   static final agt n = new agt("item/empty_slot_lapis_lazuli");
   private final bje o = new bjt(2) {
      @Override
      public void e() {
         super.e();
         cie.this.a(this);
      }
   };
   private final chv p;
   private final auf q = auf.a();
   private final cic r = cic.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cie(int $$0, ceq $$1) {
      this($$0, $$1, chv.a);
   }

   public cie(int $$0, ceq $$1, chv $$2) {
      super(cir.n, $$0);
      this.p = $$2;
      this.a(new cjf(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cjf(this.o, 1, 35, 47) {
         @Override
         public boolean a(cmh $$0) {
            return $$0.a(cmk.ox);
         }

         @Override
         public Pair<agt, agt> c() {
            return Pair.of(cil.v, cie.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjf($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjf($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cic.a(this.k, 0));
      this.a(cic.a(this.k, 1));
      this.a(cic.a(this.k, 2));
      this.a(this.r).a($$1.m.ga());
      this.a(cic.a(this.l, 0));
      this.a(cic.a(this.l, 1));
      this.a(cic.a(this.l, 2));
      this.a(cic.a(this.m, 0));
      this.a(cic.a(this.m, 1));
      this.a(cic.a(this.m, 2));
   }

   @Override
   public void a(bje $$0) {
      if ($$0 == this.o) {
         cmh $$1 = $$0.a(0);
         if (!$$1.b() && $$1.D()) {
            this.p.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (hv $$4 : cyl.c) {
                  if (cyl.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = cqu.a(this.q, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<cqv> $$7 = this.a($$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        cqv $$8 = $$7.get(this.q.a($$7.size()));
                        this.l[$$6] = kb.f.a($$8.a);
                        this.m[$$6] = $$8.b;
                     }
                  }
               }

               this.d();
            });
         } else {
            for (int $$2 = 0; $$2 < 3; $$2++) {
               this.k[$$2] = 0;
               this.l[$$2] = -1;
               this.m[$$2] = -1;
            }
         }
      }
   }

   @Override
   public boolean b(cer $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cmh $$2 = this.o.a(0);
         cmh $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.b() || $$3.L() < $$4) && !$$0.fT().d) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.b() || ($$0.cf < $$4 || $$0.cf < this.k[$$1]) && !$$0.fT().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               cmh $$7 = $$2;
               List<cqv> $$8 = this.a($$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  boolean $$9 = $$2.a(cmk.qM);
                  if ($$9) {
                     $$7 = new cmh(cmk.up);
                     sj $$10 = $$2.v();
                     if ($$10 != null) {
                        $$7.c($$10.h());
                     }

                     this.o.a(0, $$7);
                  }

                  for (cqv $$11 : $$8) {
                     if ($$9) {
                        cld.a($$7, $$11);
                     } else {
                        $$7.a($$11.a, $$11.b);
                     }
                  }

                  if (!$$0.fT().d) {
                     $$3.h($$4);
                     if ($$3.b()) {
                        this.o.a(1, cmh.f);
                     }
                  }

                  $$0.a(arm.ak);
                  if ($$0 instanceof amq) {
                     am.j.a((amq)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.ga());
                  this.a(this.o);
                  $$5.a(null, $$6, arc.ht, ard.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.ad() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<cqv> a(cmh $$0, int $$1, int $$2) {
      this.q.b((long)(this.r.b() + $$1));
      List<cqv> $$3 = cqu.b(this.q, $$0, $$2, false);
      if ($$0.a(cmk.qM) && $$3.size() > 1) {
         $$3.remove(this.q.a($$3.size()));
      }

      return $$3;
   }

   public int l() {
      cmh $$0 = this.o.a(1);
      return $$0.b() ? 0 : $$0.L();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void b(cer $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean a(cer $$0) {
      return a(this.p, $$0, cwb.fr);
   }

   @Override
   public cmh a(cer $$0, int $$1) {
      cmh $$2 = cmh.f;
      cjf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmh $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cmh.f;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cmh.f;
            }
         } else if ($$4.a(cmk.ox)) {
            if (!this.a($$4, 1, 2, true)) {
               return cmh.f;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return cmh.f;
            }

            cmh $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).e($$5);
         }

         if ($$4.b()) {
            $$3.e(cmh.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmh.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
