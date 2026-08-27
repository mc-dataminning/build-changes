import com.mojang.datafixers.util.Pair;
import java.util.List;

public class clo extends cku {
   static final ajc n = new ajc("item/empty_slot_lapis_lazuli");
   private final bme o = new bmu(2) {
      @Override
      public void e() {
         super.e();
         clo.this.a(this);
      }
   };
   private final clf p;
   private final awt q = awt.a();
   private final clm r = clm.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public clo(int $$0, chz $$1) {
      this($$0, $$1, clf.a);
   }

   public clo(int $$0, chz $$1, clf $$2) {
      super(cmb.n, $$0);
      this.p = $$2;
      this.a(new cmp(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cmp(this.o, 1, 35, 47) {
         @Override
         public boolean a(cpq $$0) {
            return $$0.a(cpt.oz);
         }

         @Override
         public Pair<ajc, ajc> c() {
            return Pair.of(clv.v, clo.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cmp($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cmp($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(clm.a(this.k, 0));
      this.a(clm.a(this.k, 1));
      this.a(clm.a(this.k, 2));
      this.a(this.r).a($$1.m.gd());
      this.a(clm.a(this.l, 0));
      this.a(clm.a(this.l, 1));
      this.a(clm.a(this.l, 2));
      this.a(clm.a(this.m, 0));
      this.a(clm.a(this.m, 1));
      this.a(clm.a(this.m, 2));
   }

   @Override
   public void a(bme $$0) {
      if ($$0 == this.o) {
         cpq $$1 = $$0.a(0);
         if (!$$1.b() && $$1.E()) {
            this.p.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (ib $$4 : dbr.c) {
                  if (dbr.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = cua.a(this.q, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<cub> $$7 = this.a($$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        cub $$8 = $$7.get(this.q.a($$7.size()));
                        this.l[$$6] = kh.f.a($$8.a);
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
   public boolean b(cia $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cpq $$2 = this.o.a(0);
         cpq $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.b() || $$3.M() < $$4) && !$$0.fW().d) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.b() || ($$0.ck < $$4 || $$0.ck < this.k[$$1]) && !$$0.fW().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               cpq $$7 = $$2;
               List<cub> $$8 = this.a($$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cpt.qO)) {
                     $$7 = $$2.a(cpt.us, 1);
                     this.o.a(0, $$7);
                  }

                  for (cub $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  if (!$$0.fW().d) {
                     $$3.h($$4);
                     if ($$3.b()) {
                        this.o.a(1, cpq.h);
                     }
                  }

                  $$0.a(atz.ak);
                  if ($$0 instanceof apb) {
                     am.j.a((apb)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.gd());
                  this.a(this.o);
                  $$5.a(null, $$6, atp.hJ, atq.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.ad() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<cub> a(cpq $$0, int $$1, int $$2) {
      this.q.b((long)(this.r.b() + $$1));
      List<cub> $$3 = cua.b(this.q, $$0, $$2, false);
      if ($$0.a(cpt.qO) && $$3.size() > 1) {
         $$3.remove(this.q.a($$3.size()));
      }

      return $$3;
   }

   public int l() {
      cpq $$0 = this.o.a(1);
      return $$0.b() ? 0 : $$0.M();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void b(cia $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean a(cia $$0) {
      return a(this.p, $$0, czh.fr);
   }

   @Override
   public cpq a(cia $$0, int $$1) {
      cpq $$2 = cpq.h;
      cmp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpq $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cpq.h;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cpq.h;
            }
         } else if ($$4.a(cpt.oz)) {
            if (!this.a($$4, 1, 2, true)) {
               return cpq.h;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return cpq.h;
            }

            cpq $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).e($$5);
         }

         if ($$4.b()) {
            $$3.e(cpq.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cpq.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
