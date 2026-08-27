import com.mojang.datafixers.util.Pair;
import java.util.List;

public class cqa extends cpg {
   static final akt n = new akt("item/empty_slot_lapis_lazuli");
   private final bpt o = new bqj(2) {
      @Override
      public void e() {
         super.e();
         cqa.this.a(this);
      }
   };
   private final cpr p;
   private final ayt q = ayt.a();
   private final cpy r = cpy.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cqa(int $$0, clx $$1) {
      this($$0, $$1, cpr.a);
   }

   public cqa(int $$0, clx $$1, cpr $$2) {
      super(cqo.n, $$0);
      this.p = $$2;
      this.a(new cre(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cre(this.o, 1, 35, 47) {
         @Override
         public boolean a(cuh $$0) {
            return $$0.a(cuk.pQ);
         }

         @Override
         public Pair<akt, akt> c() {
            return Pair.of(cqi.x, cqa.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cre($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cre($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cpy.a(this.k, 0));
      this.a(cpy.a(this.k, 1));
      this.a(cpy.a(this.k, 2));
      this.a(this.r).a($$1.l.gv());
      this.a(cpy.a(this.l, 0));
      this.a(cpy.a(this.l, 1));
      this.a(cpy.a(this.l, 2));
      this.a(cpy.a(this.m, 0));
      this.a(cpy.a(this.m, 1));
      this.a(cpy.a(this.m, 2));
   }

   @Override
   public void a(bpt $$0) {
      if ($$0 == this.o) {
         cuh $$1 = $$0.a(0);
         if (!$$1.d() && $$1.z()) {
            this.p.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (ir $$4 : dhq.c) {
                  if (dhq.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = dae.a(this.q, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<daf> $$7 = this.a($$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        daf $$8 = $$7.get(this.q.a($$7.size()));
                        this.l[$$6] = lh.f.a($$8.a);
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
   public boolean b(cly $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cuh $$2 = this.o.a(0);
         cuh $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.d() || $$3.G() < $$4) && !$$0.fY()) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.d() || ($$0.cE < $$4 || $$0.cE < this.k[$$1]) && !$$0.gm().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               cuh $$7 = $$2;
               List<daf> $$8 = this.a($$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cuk.sm)) {
                     $$7 = $$2.a(cuk.wh, 1);
                     this.o.a(0, $$7);
                  }

                  for (daf $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  if (!$$0.fY()) {
                     $$3.h($$4);
                     if ($$3.d()) {
                        this.o.a(1, cuh.i);
                     }
                  }

                  $$0.a(avz.al);
                  if ($$0 instanceof aqu) {
                     an.j.a((aqu)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.gv());
                  this.a(this.o);
                  $$5.a(null, $$6, avo.ik, avq.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ad.a($$0.af() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<daf> a(cuh $$0, int $$1, int $$2) {
      this.q.b((long)(this.r.b() + $$1));
      List<daf> $$3 = dae.b(this.q, $$0, $$2, false);
      if ($$0.a(cuk.sm) && $$3.size() > 1) {
         $$3.remove(this.q.a($$3.size()));
      }

      return $$3;
   }

   public int l() {
      cuh $$0 = this.o.a(1);
      return $$0.d() ? 0 : $$0.G();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean a(cly $$0) {
      return a(this.p, $$0, dfe.gj);
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      cuh $$2 = cuh.i;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuh $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cuh.i;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cuh.i;
            }
         } else if ($$4.a(cuk.pQ)) {
            if (!this.a($$4, 1, 2, true)) {
               return cuh.i;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return cuh.i;
            }

            cuh $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).e($$5);
         }

         if ($$4.d()) {
            $$3.e(cuh.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return cuh.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
