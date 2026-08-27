import com.mojang.datafixers.util.Pair;
import java.util.List;

public class civ extends cib {
   static final ahg n = new ahg("item/empty_slot_lapis_lazuli");
   private final bju o = new bkj(2) {
      @Override
      public void e() {
         super.e();
         civ.this.a(this);
      }
   };
   private final cim p;
   private final auv q = auv.a();
   private final cit r = cit.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public civ(int $$0, cfh $$1) {
      this($$0, $$1, cim.a);
   }

   public civ(int $$0, cfh $$1, cim $$2) {
      super(cji.n, $$0);
      this.p = $$2;
      this.a(new cjw(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cjw(this.o, 1, 35, 47) {
         @Override
         public boolean a(cmy $$0) {
            return $$0.a(cnb.ox);
         }

         @Override
         public Pair<ahg, ahg> c() {
            return Pair.of(cjc.v, civ.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjw($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjw($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cit.a(this.k, 0));
      this.a(cit.a(this.k, 1));
      this.a(cit.a(this.k, 2));
      this.a(this.r).a($$1.m.ga());
      this.a(cit.a(this.l, 0));
      this.a(cit.a(this.l, 1));
      this.a(cit.a(this.l, 2));
      this.a(cit.a(this.m, 0));
      this.a(cit.a(this.m, 1));
      this.a(cit.a(this.m, 2));
   }

   @Override
   public void a(bju $$0) {
      if ($$0 == this.o) {
         cmy $$1 = $$0.a(0);
         if (!$$1.b() && $$1.D()) {
            this.p.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (hx $$4 : czc.c) {
                  if (czc.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = crl.a(this.q, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<crm> $$7 = this.a($$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        crm $$8 = $$7.get(this.q.a($$7.size()));
                        this.l[$$6] = kd.f.a($$8.a);
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
   public boolean b(cfi $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cmy $$2 = this.o.a(0);
         cmy $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.b() || $$3.L() < $$4) && !$$0.fT().d) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.b() || ($$0.cf < $$4 || $$0.cf < this.k[$$1]) && !$$0.fT().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               cmy $$7 = $$2;
               List<crm> $$8 = this.a($$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  boolean $$9 = $$2.a(cnb.qM);
                  if ($$9) {
                     $$7 = new cmy(cnb.up);
                     sn $$10 = $$2.v();
                     if ($$10 != null) {
                        $$7.c($$10.h());
                     }

                     this.o.a(0, $$7);
                  }

                  for (crm $$11 : $$8) {
                     if ($$9) {
                        clu.a($$7, $$11);
                     } else {
                        $$7.a($$11.a, $$11.b);
                     }
                  }

                  if (!$$0.fT().d) {
                     $$3.h($$4);
                     if ($$3.b()) {
                        this.o.a(1, cmy.f);
                     }
                  }

                  $$0.a(asc.ak);
                  if ($$0 instanceof ane) {
                     am.j.a((ane)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.ga());
                  this.a(this.o);
                  $$5.a(null, $$6, ars.ht, art.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.ad() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<crm> a(cmy $$0, int $$1, int $$2) {
      this.q.b((long)(this.r.b() + $$1));
      List<crm> $$3 = crl.b(this.q, $$0, $$2, false);
      if ($$0.a(cnb.qM) && $$3.size() > 1) {
         $$3.remove(this.q.a($$3.size()));
      }

      return $$3;
   }

   public int l() {
      cmy $$0 = this.o.a(1);
      return $$0.b() ? 0 : $$0.L();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void b(cfi $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean a(cfi $$0) {
      return a(this.p, $$0, cws.fr);
   }

   @Override
   public cmy a(cfi $$0, int $$1) {
      cmy $$2 = cmy.f;
      cjw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmy $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cmy.f;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cmy.f;
            }
         } else if ($$4.a(cnb.ox)) {
            if (!this.a($$4, 1, 2, true)) {
               return cmy.f;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return cmy.f;
            }

            cmy $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).e($$5);
         }

         if ($$4.b()) {
            $$3.e(cmy.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmy.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
