import com.mojang.datafixers.util.Pair;
import java.util.List;

public class ckv extends ckb {
   static final aiy n = new aiy("item/empty_slot_lapis_lazuli");
   private final bln o = new bmd(2) {
      @Override
      public void e() {
         super.e();
         ckv.this.a(this);
      }
   };
   private final ckm p;
   private final awo q = awo.a();
   private final ckt r = ckt.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public ckv(int $$0, chg $$1) {
      this($$0, $$1, ckm.a);
   }

   public ckv(int $$0, chg $$1, ckm $$2) {
      super(cli.n, $$0);
      this.p = $$2;
      this.a(new clw(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new clw(this.o, 1, 35, 47) {
         @Override
         public boolean a(coz $$0) {
            return $$0.a(cpc.oz);
         }

         @Override
         public Pair<aiy, aiy> c() {
            return Pair.of(clc.v, ckv.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new clw($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new clw($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(ckt.a(this.k, 0));
      this.a(ckt.a(this.k, 1));
      this.a(ckt.a(this.k, 2));
      this.a(this.r).a($$1.m.gb());
      this.a(ckt.a(this.l, 0));
      this.a(ckt.a(this.l, 1));
      this.a(ckt.a(this.l, 2));
      this.a(ckt.a(this.m, 0));
      this.a(ckt.a(this.m, 1));
      this.a(ckt.a(this.m, 2));
   }

   @Override
   public void a(bln $$0) {
      if ($$0 == this.o) {
         coz $$1 = $$0.a(0);
         if (!$$1.b() && $$1.E()) {
            this.p.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (hz $$4 : dba.c) {
                  if (dba.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = ctj.a(this.q, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<ctk> $$7 = this.a($$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        ctk $$8 = $$7.get(this.q.a($$7.size()));
                        this.l[$$6] = kf.f.a($$8.a);
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
   public boolean b(chh $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         coz $$2 = this.o.a(0);
         coz $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.b() || $$3.M() < $$4) && !$$0.fU().d) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.b() || ($$0.cj < $$4 || $$0.cj < this.k[$$1]) && !$$0.fU().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               coz $$7 = $$2;
               List<ctk> $$8 = this.a($$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  boolean $$9 = $$2.a(cpc.qO);
                  if ($$9) {
                     $$7 = new coz(cpc.us);
                     sw $$10 = $$2.w();
                     if ($$10 != null) {
                        $$7.c($$10.h());
                     }

                     this.o.a(0, $$7);
                  }

                  for (ctk $$11 : $$8) {
                     if ($$9) {
                        cnv.a($$7, $$11);
                     } else {
                        $$7.a($$11.a, $$11.b);
                     }
                  }

                  if (!$$0.fU().d) {
                     $$3.h($$4);
                     if ($$3.b()) {
                        this.o.a(1, coz.h);
                     }
                  }

                  $$0.a(atu.ak);
                  if ($$0 instanceof aow) {
                     am.j.a((aow)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.gb());
                  this.a(this.o);
                  $$5.a(null, $$6, atk.hI, atl.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.ad() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<ctk> a(coz $$0, int $$1, int $$2) {
      this.q.b((long)(this.r.b() + $$1));
      List<ctk> $$3 = ctj.b(this.q, $$0, $$2, false);
      if ($$0.a(cpc.qO) && $$3.size() > 1) {
         $$3.remove(this.q.a($$3.size()));
      }

      return $$3;
   }

   public int l() {
      coz $$0 = this.o.a(1);
      return $$0.b() ? 0 : $$0.M();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void b(chh $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean a(chh $$0) {
      return a(this.p, $$0, cyq.fr);
   }

   @Override
   public coz a(chh $$0, int $$1) {
      coz $$2 = coz.h;
      clw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         coz $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return coz.h;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return coz.h;
            }
         } else if ($$4.a(cpc.oz)) {
            if (!this.a($$4, 1, 2, true)) {
               return coz.h;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return coz.h;
            }

            coz $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).e($$5);
         }

         if ($$4.b()) {
            $$3.e(coz.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return coz.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
