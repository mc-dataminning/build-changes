import com.google.common.collect.Lists;
import java.util.List;

public class flg extends fkm<cnj> {
   private static final ajt[] H = new ajt[]{
      new ajt("container/enchanting_table/level_1"), new ajt("container/enchanting_table/level_2"), new ajt("container/enchanting_table/level_3")
   };
   private static final ajt[] I = new ajt[]{
      new ajt("container/enchanting_table/level_1_disabled"),
      new ajt("container/enchanting_table/level_2_disabled"),
      new ajt("container/enchanting_table/level_3_disabled")
   };
   private static final ajt J = new ajt("container/enchanting_table/enchantment_slot_disabled");
   private static final ajt K = new ajt("container/enchanting_table/enchantment_slot_highlighted");
   private static final ajt L = new ajt("container/enchanting_table/enchantment_slot");
   private static final ajt M = new ajt("textures/gui/container/enchanting_table.png");
   private static final ajt N = new ajt("textures/entity/enchanting_table_book.png");
   private final axr O = axr.a();
   private fpu P;
   public int A;
   public float B;
   public float C;
   public float D;
   public float E;
   public float F;
   public float G;
   private crj Q = crj.i;

   public flg(cnj $$0, cjs $$1, wg $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.P = new fpu(this.j.aR().a(ftl.r));
   }

   @Override
   public void C() {
      super.C();
      this.E();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      int $$3 = (this.k - this.c) / 2;
      int $$4 = (this.l - this.d) / 2;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         double $$6 = $$0 - (double)($$3 + 60);
         double $$7 = $$1 - (double)($$4 + 14 + 19 * $$5);
         if ($$6 >= 0.0 && $$7 >= 0.0 && $$6 < 108.0 && $$7 < 19.0 && this.s.b(this.j.s, $$5)) {
            this.j.q.a(this.s.j, $$5);
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.k - this.c) / 2;
      int $$5 = (this.l - this.d) / 2;
      $$0.a(M, $$4, $$5, 0, 0, this.c, this.d);
      this.d($$0, $$4, $$5, $$1);
      flf.a().a((long)this.s.m());
      int $$6 = this.s.l();

      for (int $$7 = 0; $$7 < 3; $$7++) {
         int $$8 = $$4 + 60;
         int $$9 = $$8 + 20;
         int $$10 = this.s.k[$$7];
         if ($$10 == 0) {
            $$0.a(J, $$8, $$5 + 14 + 19 * $$7, 108, 19);
         } else {
            String $$11 = $$10 + "";
            int $$12 = 86 - this.m.b($$11);
            wl $$13 = flf.a().a(this.m, $$12);
            int $$14 = 6839882;
            if (($$6 < $$7 + 1 || this.j.s.cl < $$10) && !this.j.s.ga().d) {
               $$0.a(J, $$8, $$5 + 14 + 19 * $$7, 108, 19);
               $$0.a(I[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
               $$0.a(this.m, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, ($$14 & 16711422) >> 1);
               $$14 = 4226832;
            } else {
               int $$15 = $$2 - ($$4 + 60);
               int $$16 = $$3 - ($$5 + 14 + 19 * $$7);
               if ($$15 >= 0 && $$16 >= 0 && $$15 < 108 && $$16 < 19) {
                  $$0.a(K, $$8, $$5 + 14 + 19 * $$7, 108, 19);
                  $$14 = 16777088;
               } else {
                  $$0.a(L, $$8, $$5 + 14 + 19 * $$7, 108, 19);
               }

               $$0.a(H[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
               $$0.a(this.m, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, $$14);
               $$14 = 8453920;
            }

            $$0.b(this.m, $$11, $$9 + 86 - this.m.b($$11), $$5 + 16 + 19 * $$7 + 7, $$14);
         }
      }
   }

   private void d(fdc $$0, int $$1, int $$2, float $$3) {
      float $$4 = axk.i($$3, this.G, this.F);
      float $$5 = axk.i($$3, this.C, this.B);
      eve.e();
      $$0.c().a();
      $$0.c().a((float)$$1 + 33.0F, (float)$$2 + 31.0F, 100.0F);
      float $$6 = 40.0F;
      $$0.c().b(-40.0F, 40.0F, 40.0F);
      $$0.c().a(a.b.rotationDegrees(25.0F));
      $$0.c().a((1.0F - $$4) * 0.2F, (1.0F - $$4) * 0.1F, (1.0F - $$4) * 0.25F);
      float $$7 = -(1.0F - $$4) * 90.0F - 90.0F;
      $$0.c().a(a.d.rotationDegrees($$7));
      $$0.c().a(a.b.rotationDegrees(180.0F));
      float $$8 = axk.a(axk.h($$5 + 0.25F) * 1.6F - 0.3F, 0.0F, 1.0F);
      float $$9 = axk.a(axk.h($$5 + 0.75F) * 1.6F - 0.3F, 0.0F, 1.0F);
      this.P.a(0.0F, $$8, $$9, $$4);
      ewm $$10 = $$0.d().getBuffer(this.P.a(N));
      this.P.a($$0.c(), $$10, 15728880, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$0.e();
      $$0.c().b();
      eve.d();
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      $$3 = this.j.au();
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
      boolean $$4 = this.j.s.ga().d;
      int $$5 = this.s.l();

      for (int $$6 = 0; $$6 < 3; $$6++) {
         int $$7 = this.s.k[$$6];
         cwq $$8 = cwq.c(this.s.l[$$6]);
         int $$9 = this.s.m[$$6];
         int $$10 = $$6 + 1;
         if (this.a(60, 14 + 19 * $$6, 108, 17, (double)$$1, (double)$$2) && $$7 > 0 && $$9 >= 0 && $$8 != null) {
            List<wg> $$11 = Lists.newArrayList();
            $$11.add(wg.a("container.enchant.clue", $$8.d($$9)).a(n.p));
            if (!$$4) {
               $$11.add(wf.a);
               if (this.j.s.cl < $$7) {
                  $$11.add(wg.a("container.enchant.level.requirement", this.s.k[$$6]).a(n.m));
               } else {
                  wu $$12;
                  if ($$10 == 1) {
                     $$12 = wg.c("container.enchant.lapis.one");
                  } else {
                     $$12 = wg.a("container.enchant.lapis.many", $$10);
                  }

                  $$11.add($$12.a($$5 >= $$10 ? n.h : n.m));
                  wu $$14;
                  if ($$10 == 1) {
                     $$14 = wg.c("container.enchant.level.one");
                  } else {
                     $$14 = wg.a("container.enchant.level.many", $$10);
                  }

                  $$11.add($$14.a(n.h));
               }
            }

            $$0.a(this.m, $$11, $$1, $$2);
            break;
         }
      }
   }

   public void E() {
      crj $$0 = this.s.b(0).g();
      if (!crj.a($$0, this.Q)) {
         this.Q = $$0;

         do {
            this.D = this.D + (float)(this.O.a(4) - this.O.a(4));
         } while (this.B <= this.D + 1.0F && this.B >= this.D - 1.0F);
      }

      this.A++;
      this.C = this.B;
      this.G = this.F;
      boolean $$1 = false;

      for (int $$2 = 0; $$2 < 3; $$2++) {
         if (this.s.k[$$2] != 0) {
            $$1 = true;
         }
      }

      if ($$1) {
         this.F += 0.2F;
      } else {
         this.F -= 0.2F;
      }

      this.F = axk.a(this.F, 0.0F, 1.0F);
      float $$3 = (this.D - this.B) * 0.4F;
      float $$4 = 0.2F;
      $$3 = axk.a($$3, -0.2F, 0.2F);
      this.E = this.E + ($$3 - this.E) * 0.9F;
      this.B = this.B + this.E;
   }
}
