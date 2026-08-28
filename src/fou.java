import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fou extends fnz<cqm> {
   private static final ale[] K = new ale[]{
      new ale("container/enchanting_table/level_1"), new ale("container/enchanting_table/level_2"), new ale("container/enchanting_table/level_3")
   };
   private static final ale[] L = new ale[]{
      new ale("container/enchanting_table/level_1_disabled"),
      new ale("container/enchanting_table/level_2_disabled"),
      new ale("container/enchanting_table/level_3_disabled")
   };
   private static final ale M = new ale("container/enchanting_table/enchantment_slot_disabled");
   private static final ale N = new ale("container/enchanting_table/enchantment_slot_highlighted");
   private static final ale O = new ale("container/enchanting_table/enchantment_slot");
   private static final ale P = new ale("textures/gui/container/enchanting_table.png");
   private static final ale Q = new ale("textures/entity/enchanting_table_book.png");
   private final azf R = azf.a();
   private ftg S;
   public int D;
   public float E;
   public float F;
   public float G;
   public float H;
   public float I;
   public float J;
   private cun T = cun.l;

   public fou(cqm $$0, cmu $$1, xo $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.S = new ftg(this.m.aR().a(fwx.r));
   }

   @Override
   public void D() {
      super.D();
      this.F();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      int $$3 = (this.n - this.c) / 2;
      int $$4 = (this.o - this.d) / 2;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         double $$6 = $$0 - (double)($$3 + 60);
         double $$7 = $$1 - (double)($$4 + 14 + 19 * $$5);
         if ($$6 >= 0.0 && $$7 >= 0.0 && $$6 < 108.0 && $$7 < 19.0 && this.w.b(this.m.s, $$5)) {
            this.m.q.a(this.w.j, $$5);
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fgp $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(P, $$4, $$5, 0, 0, this.c, this.d);
      this.d($$0, $$4, $$5, $$1);
      fot.a().a((long)this.w.m());
      int $$6 = this.w.l();

      for (int $$7 = 0; $$7 < 3; $$7++) {
         int $$8 = $$4 + 60;
         int $$9 = $$8 + 20;
         int $$10 = this.w.k[$$7];
         if ($$10 == 0) {
            RenderSystem.enableBlend();
            $$0.a(M, $$8, $$5 + 14 + 19 * $$7, 108, 19);
            RenderSystem.disableBlend();
         } else {
            String $$11 = $$10 + "";
            int $$12 = 86 - this.p.b($$11);
            xt $$13 = fot.a().a(this.p, $$12);
            int $$14 = 6839882;
            if (($$6 < $$7 + 1 || this.m.s.co < $$10) && !this.m.s.gd().d) {
               RenderSystem.enableBlend();
               $$0.a(M, $$8, $$5 + 14 + 19 * $$7, 108, 19);
               $$0.a(L[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
               RenderSystem.disableBlend();
               $$0.a(this.p, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, ($$14 & 16711422) >> 1);
               $$14 = 4226832;
            } else {
               int $$15 = $$2 - ($$4 + 60);
               int $$16 = $$3 - ($$5 + 14 + 19 * $$7);
               RenderSystem.enableBlend();
               if ($$15 >= 0 && $$16 >= 0 && $$15 < 108 && $$16 < 19) {
                  $$0.a(N, $$8, $$5 + 14 + 19 * $$7, 108, 19);
                  $$14 = 16777088;
               } else {
                  $$0.a(O, $$8, $$5 + 14 + 19 * $$7, 108, 19);
               }

               $$0.a(K[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
               RenderSystem.disableBlend();
               $$0.a(this.p, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, $$14);
               $$14 = 8453920;
            }

            $$0.b(this.p, $$11, $$9 + 86 - this.p.b($$11), $$5 + 16 + 19 * $$7 + 7, $$14);
         }
      }
   }

   private void d(fgp $$0, int $$1, int $$2, float $$3) {
      float $$4 = ayx.i($$3, this.J, this.I);
      float $$5 = ayx.i($$3, this.F, this.E);
      eys.e();
      $$0.c().a();
      $$0.c().a((float)$$1 + 33.0F, (float)$$2 + 31.0F, 100.0F);
      float $$6 = 40.0F;
      $$0.c().b(-40.0F, 40.0F, 40.0F);
      $$0.c().a(a.b.rotationDegrees(25.0F));
      $$0.c().a((1.0F - $$4) * 0.2F, (1.0F - $$4) * 0.1F, (1.0F - $$4) * 0.25F);
      float $$7 = -(1.0F - $$4) * 90.0F - 90.0F;
      $$0.c().a(a.d.rotationDegrees($$7));
      $$0.c().a(a.b.rotationDegrees(180.0F));
      float $$8 = ayx.a(ayx.h($$5 + 0.25F) * 1.6F - 0.3F, 0.0F, 1.0F);
      float $$9 = ayx.a(ayx.h($$5 + 0.75F) * 1.6F - 0.3F, 0.0F, 1.0F);
      this.S.a(0.0F, $$8, $$9, $$4);
      faa $$10 = $$0.d().getBuffer(this.S.a(Q));
      this.S.a($$0.c(), $$10, 15728880, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$0.e();
      $$0.c().b();
      eys.d();
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      $$3 = this.m.at();
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
      boolean $$4 = this.m.s.gd().d;
      int $$5 = this.w.l();

      for (int $$6 = 0; $$6 < 3; $$6++) {
         int $$7 = this.w.k[$$6];
         czy $$8 = czy.b(this.w.l[$$6]);
         int $$9 = this.w.m[$$6];
         int $$10 = $$6 + 1;
         if (this.a(60, 14 + 19 * $$6, 108, 17, (double)$$1, (double)$$2) && $$7 > 0 && $$9 >= 0 && $$8 != null) {
            List<xo> $$11 = Lists.newArrayList();
            $$11.add(xo.a("container.enchant.clue", $$8.e($$9)).a(n.p));
            if (!$$4) {
               $$11.add(xn.a);
               if (this.m.s.co < $$7) {
                  $$11.add(xo.a("container.enchant.level.requirement", this.w.k[$$6]).a(n.m));
               } else {
                  yc $$12;
                  if ($$10 == 1) {
                     $$12 = xo.c("container.enchant.lapis.one");
                  } else {
                     $$12 = xo.a("container.enchant.lapis.many", $$10);
                  }

                  $$11.add($$12.a($$5 >= $$10 ? n.h : n.m));
                  yc $$14;
                  if ($$10 == 1) {
                     $$14 = xo.c("container.enchant.level.one");
                  } else {
                     $$14 = xo.a("container.enchant.level.many", $$10);
                  }

                  $$11.add($$14.a(n.h));
               }
            }

            $$0.a(this.p, $$11, $$1, $$2);
            break;
         }
      }
   }

   public void F() {
      cun $$0 = this.w.b(0).g();
      if (!cun.a($$0, this.T)) {
         this.T = $$0;

         do {
            this.G = this.G + (float)(this.R.a(4) - this.R.a(4));
         } while (this.E <= this.G + 1.0F && this.E >= this.G - 1.0F);
      }

      this.D++;
      this.F = this.E;
      this.J = this.I;
      boolean $$1 = false;

      for (int $$2 = 0; $$2 < 3; $$2++) {
         if (this.w.k[$$2] != 0) {
            $$1 = true;
         }
      }

      if ($$1) {
         this.I += 0.2F;
      } else {
         this.I -= 0.2F;
      }

      this.I = ayx.a(this.I, 0.0F, 1.0F);
      float $$3 = (this.G - this.E) * 0.4F;
      float $$4 = 0.2F;
      $$3 = ayx.a($$3, -0.2F, 0.2F);
      this.H = this.H + ($$3 - this.H) * 0.9F;
      this.E = this.E + this.H;
   }
}
