import com.mojang.datafixers.util.Pair;
import java.util.List;

public class cnj extends cmp {
   static final ajt n = new ajt("item/empty_slot_lapis_lazuli");
   private final bnt o = new boj(2) {
      @Override
      public void e() {
         super.e();
         cnj.this.a(this);
      }
   };
   private final cna p;
   private final axr q = axr.a();
   private final cnh r = cnh.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cnj(int $$0, cjs $$1) {
      this($$0, $$1, cna.a);
   }

   public cnj(int $$0, cjs $$1, cna $$2) {
      super(cnw.n, $$0);
      this.p = $$2;
      this.a(new cok(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cok(this.o, 1, 35, 47) {
         @Override
         public boolean a(crj $$0) {
            return $$0.a(crm.oz);
         }

         @Override
         public Pair<ajt, ajt> c() {
            return Pair.of(cnq.v, cnj.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cok($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cok($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cnh.a(this.k, 0));
      this.a(cnh.a(this.k, 1));
      this.a(cnh.a(this.k, 2));
      this.a(this.r).a($$1.m.gh());
      this.a(cnh.a(this.l, 0));
      this.a(cnh.a(this.l, 1));
      this.a(cnh.a(this.l, 2));
      this.a(cnh.a(this.m, 0));
      this.a(cnh.a(this.m, 1));
      this.a(cnh.a(this.m, 2));
   }

   @Override
   public void a(bnt $$0) {
      if ($$0 == this.o) {
         crj $$1 = $$0.a(0);
         if (!$$1.d() && $$1.z()) {
            this.p.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (ib $$4 : dek.c) {
                  if (dek.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = cwr.a(this.q, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<cws> $$7 = this.a($$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        cws $$8 = $$7.get(this.q.a($$7.size()));
                        this.l[$$6] = kr.f.a($$8.a);
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
   public boolean b(cjt $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         crj $$2 = this.o.a(0);
         crj $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.d() || $$3.G() < $$4) && !$$0.fM()) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.d() || ($$0.cl < $$4 || $$0.cl < this.k[$$1]) && !$$0.ga().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               crj $$7 = $$2;
               List<cws> $$8 = this.a($$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(crm.qO)) {
                     $$7 = $$2.a(crm.uu, 1);
                     this.o.a(0, $$7);
                  }

                  for (cws $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  if (!$$0.fM()) {
                     $$3.g($$4);
                     if ($$3.d()) {
                        this.o.a(1, crj.i);
                     }
                  }

                  $$0.a(auw.ak);
                  if ($$0 instanceof apt) {
                     am.j.a((apt)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.gh());
                  this.a(this.o);
                  $$5.a(null, $$6, aum.hS, aun.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.ad() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<cws> a(crj $$0, int $$1, int $$2) {
      this.q.b((long)(this.r.b() + $$1));
      List<cws> $$3 = cwr.b(this.q, $$0, $$2, false);
      if ($$0.a(crm.qO) && $$3.size() > 1) {
         $$3.remove(this.q.a($$3.size()));
      }

      return $$3;
   }

   public int l() {
      crj $$0 = this.o.a(1);
      return $$0.d() ? 0 : $$0.G();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void b(cjt $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean a(cjt $$0) {
      return a(this.p, $$0, dca.fr);
   }

   @Override
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crj $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return crj.i;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return crj.i;
            }
         } else if ($$4.a(crm.oz)) {
            if (!this.a($$4, 1, 2, true)) {
               return crj.i;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return crj.i;
            }

            crj $$5 = $$4.c(1);
            $$4.g(1);
            this.i.get(0).e($$5);
         }

         if ($$4.d()) {
            $$3.e(crj.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crj.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
