import com.mojang.datafixers.util.Pair;
import java.util.List;

public class cob extends cnh {
   static final akf n = new akf("item/empty_slot_lapis_lazuli");
   private final boj o = new boz(2) {
      @Override
      public void e() {
         super.e();
         cob.this.a(this);
      }
   };
   private final cns p;
   private final ayd q = ayd.a();
   private final cnz r = cnz.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cob(int $$0, ckk $$1) {
      this($$0, $$1, cns.a);
   }

   public cob(int $$0, ckk $$1, cns $$2) {
      super(cop.n, $$0);
      this.p = $$2;
      this.a(new cpd(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cpd(this.o, 1, 35, 47) {
         @Override
         public boolean a(csd $$0) {
            return $$0.a(csg.oA);
         }

         @Override
         public Pair<akf, akf> c() {
            return Pair.of(coi.x, cob.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cpd($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cpd($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cnz.a(this.k, 0));
      this.a(cnz.a(this.k, 1));
      this.a(cnz.a(this.k, 2));
      this.a(this.r).a($$1.m.gi());
      this.a(cnz.a(this.l, 0));
      this.a(cnz.a(this.l, 1));
      this.a(cnz.a(this.l, 2));
      this.a(cnz.a(this.m, 0));
      this.a(cnz.a(this.m, 1));
      this.a(cnz.a(this.m, 2));
   }

   @Override
   public void a(boj $$0) {
      if ($$0 == this.o) {
         csd $$1 = $$0.a(0);
         if (!$$1.d() && $$1.z()) {
            this.p.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (im $$4 : dfh.c) {
                  if (dfh.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = cxo.a(this.q, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<cxp> $$7 = this.a($$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        cxp $$8 = $$7.get(this.q.a($$7.size()));
                        this.l[$$6] = lc.f.a($$8.a);
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
   public boolean b(ckl $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         csd $$2 = this.o.a(0);
         csd $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.d() || $$3.G() < $$4) && !$$0.fN()) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.d() || ($$0.cp < $$4 || $$0.cp < this.k[$$1]) && !$$0.gb().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               csd $$7 = $$2;
               List<cxp> $$8 = this.a($$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(csg.qP)) {
                     $$7 = $$2.a(csg.uw, 1);
                     this.o.a(0, $$7);
                  }

                  for (cxp $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  if (!$$0.fN()) {
                     $$3.g($$4);
                     if ($$3.d()) {
                        this.o.a(1, csd.i);
                     }
                  }

                  $$0.a(avj.ak);
                  if ($$0 instanceof aqf) {
                     am.j.a((aqf)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.gi());
                  this.a(this.o);
                  $$5.a(null, $$6, auz.hS, ava.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.ad() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<cxp> a(csd $$0, int $$1, int $$2) {
      this.q.b((long)(this.r.b() + $$1));
      List<cxp> $$3 = cxo.b(this.q, $$0, $$2, false);
      if ($$0.a(csg.qP) && $$3.size() > 1) {
         $$3.remove(this.q.a($$3.size()));
      }

      return $$3;
   }

   public int l() {
      csd $$0 = this.o.a(1);
      return $$0.d() ? 0 : $$0.G();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void b(ckl $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean a(ckl $$0) {
      return a(this.p, $$0, dcx.fr);
   }

   @Override
   public csd a(ckl $$0, int $$1) {
      csd $$2 = csd.i;
      cpd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csd $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return csd.i;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return csd.i;
            }
         } else if ($$4.a(csg.oA)) {
            if (!this.a($$4, 1, 2, true)) {
               return csd.i;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return csd.i;
            }

            csd $$5 = $$4.c(1);
            $$4.g(1);
            this.i.get(0).e($$5);
         }

         if ($$4.d()) {
            $$3.e(csd.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return csd.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
