import com.mojang.datafixers.util.Pair;
import java.util.List;

public class cqo extends cpu {
   static final alf n = new alf("item/empty_slot_lapis_lazuli");
   private final bqn o = new brd(2) {
      @Override
      public void e() {
         super.e();
         cqo.this.a(this);
      }
   };
   private final cqf p;
   private final azh q = azh.a();
   private final cqm r = cqm.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cqo(int $$0, cmw $$1) {
      this($$0, $$1, cqf.a);
   }

   public cqo(int $$0, cmw $$1, cqf $$2) {
      super(crb.n, $$0);
      this.p = $$2;
      this.a(new crp(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new crp(this.o, 1, 35, 47) {
         @Override
         public boolean a(cup $$0) {
            return $$0.a(cus.oA);
         }

         @Override
         public Pair<alf, alf> c() {
            return Pair.of(cqv.x, cqo.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crp($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crp($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cqm.a(this.k, 0));
      this.a(cqm.a(this.k, 1));
      this.a(cqm.a(this.k, 2));
      this.a(this.r).a($$1.l.gk());
      this.a(cqm.a(this.l, 0));
      this.a(cqm.a(this.l, 1));
      this.a(cqm.a(this.l, 2));
      this.a(cqm.a(this.m, 0));
      this.a(cqm.a(this.m, 1));
      this.a(cqm.a(this.m, 2));
   }

   @Override
   public void a(bqn $$0) {
      if ($$0 == this.o) {
         cup $$1 = $$0.a(0);
         if (!$$1.e() && $$1.A()) {
            this.p.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (iz $$4 : dhl.c) {
                  if (dhl.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = dab.a(this.q, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<dac> $$7 = this.a($$1x.J(), $$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        dac $$8 = $$7.get(this.q.a($$7.size()));
                        this.l[$$6] = lp.f.a($$8.a);
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
   public boolean b(cmx $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cup $$2 = this.o.a(0);
         cup $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.e() || $$3.I() < $$4) && !$$0.fP()) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.e() || ($$0.co < $$4 || $$0.co < this.k[$$1]) && !$$0.gd().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               cup $$7 = $$2;
               List<dac> $$8 = this.a($$5.J(), $$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cus.qP)) {
                     $$7 = $$2.a(cus.uw, 1);
                     this.o.a(0, $$7);
                  }

                  for (dac $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  if (!$$0.fP()) {
                     $$3.h($$4);
                     if ($$3.e()) {
                        this.o.a(1, cup.l);
                     }
                  }

                  $$0.a(awk.ak);
                  if ($$0 instanceof arg) {
                     am.j.a((arg)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.gk());
                  this.a(this.o);
                  $$5.a(null, $$6, awa.hX, awb.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.af() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<dac> a(cpl $$0, cup $$1, int $$2, int $$3) {
      this.q.b((long)(this.r.b() + $$2));
      List<dac> $$4 = dab.b($$0, this.q, $$1, $$3, false);
      if ($$1.a(cus.qP) && $$4.size() > 1) {
         $$4.remove(this.q.a($$4.size()));
      }

      return $$4;
   }

   public int l() {
      cup $$0 = this.o.a(1);
      return $$0.e() ? 0 : $$0.I();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void b(cmx $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean a(cmx $$0) {
      return a(this.p, $$0, dfb.fr);
   }

   @Override
   public cup a(cmx $$0, int $$1) {
      cup $$2 = cup.l;
      crp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cup $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cup.l;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cup.l;
            }
         } else if ($$4.a(cus.oA)) {
            if (!this.a($$4, 1, 2, true)) {
               return cup.l;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return cup.l;
            }

            cup $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).e($$5);
         }

         if ($$4.e()) {
            $$3.e(cup.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cup.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
