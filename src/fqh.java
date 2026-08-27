import com.google.common.collect.Lists;
import java.util.List;

public class fqh extends fpn<cqa> {
   private static final akt[] K = new akt[]{
      new akt("container/enchanting_table/level_1"), new akt("container/enchanting_table/level_2"), new akt("container/enchanting_table/level_3")
   };
   private static final akt[] L = new akt[]{
      new akt("container/enchanting_table/level_1_disabled"),
      new akt("container/enchanting_table/level_2_disabled"),
      new akt("container/enchanting_table/level_3_disabled")
   };
   private static final akt M = new akt("container/enchanting_table/enchantment_slot_disabled");
   private static final akt N = new akt("container/enchanting_table/enchantment_slot_highlighted");
   private static final akt O = new akt("container/enchanting_table/enchantment_slot");
   private static final akt P = new akt("textures/gui/container/enchanting_table.png");
   private static final akt Q = new akt("textures/entity/enchanting_table_book.png");
   private final ayt R = ayt.a();
   private fuy S;
   public int D;
   public float E;
   public float F;
   public float G;
   public float H;
   public float I;
   public float J;
   private cuh T = cuh.i;

   public fqh(cqa $$0, clx $$1, xe $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.S = new fuy(this.m.aS().a(fyr.s));
   }

   @Override
   public void C() {
      super.C();
      this.E();
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
   protected void a(fia $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(P, $$4, $$5, 0, 0, this.c, this.d);
      this.d($$0, $$4, $$5, $$1);
      fqg.a().a((long)this.w.m());
      int $$6 = this.w.l();

      for (int $$7 = 0; $$7 < 3; $$7++) {
         int $$8 = $$4 + 60;
         int $$9 = $$8 + 20;
         int $$10 = this.w.k[$$7];
         if ($$10 == 0) {
            $$0.a(M, $$8, $$5 + 14 + 19 * $$7, 108, 19);
         } else {
            String $$11 = $$10 + "";
            int $$12 = 86 - this.p.b($$11);
            xj $$13 = fqg.a().a(this.p, $$12);
            int $$14 = 6839882;
            if (($$6 < $$7 + 1 || this.m.s.cE < $$10) && !this.m.s.gm().d) {
               $$0.a(M, $$8, $$5 + 14 + 19 * $$7, 108, 19);
               $$0.a(L[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
               $$0.a(this.p, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, ($$14 & 16711422) >> 1);
               $$14 = 4226832;
            } else {
               int $$15 = $$2 - ($$4 + 60);
               int $$16 = $$3 - ($$5 + 14 + 19 * $$7);
               if ($$15 >= 0 && $$16 >= 0 && $$15 < 108 && $$16 < 19) {
                  $$0.a(N, $$8, $$5 + 14 + 19 * $$7, 108, 19);
                  $$14 = 16777088;
               } else {
                  $$0.a(O, $$8, $$5 + 14 + 19 * $$7, 108, 19);
               }

               $$0.a(K[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
               $$0.a(this.p, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, $$14);
               $$14 = 8453920;
            }

            $$0.b(this.p, $$11, $$9 + 86 - this.p.b($$11), $$5 + 16 + 19 * $$7 + 7, $$14);
         }
      }
   }

   private void d(fia $$0, int $$1, int $$2, float $$3) {
      float $$4 = aym.i($$3, this.J, this.I);
      float $$5 = aym.i($$3, this.F, this.E);
      ezy.e();
      $$0.c().a();
      $$0.c().a((float)$$1 + 33.0F, (float)$$2 + 31.0F, 100.0F);
      float $$6 = 40.0F;
      $$0.c().b(-40.0F, 40.0F, 40.0F);
      $$0.c().a(a.b.rotationDegrees(25.0F));
      $$0.c().a((1.0F - $$4) * 0.2F, (1.0F - $$4) * 0.1F, (1.0F - $$4) * 0.25F);
      float $$7 = -(1.0F - $$4) * 90.0F - 90.0F;
      $$0.c().a(a.d.rotationDegrees($$7));
      $$0.c().a(a.b.rotationDegrees(180.0F));
      float $$8 = aym.a(aym.h($$5 + 0.25F) * 1.6F - 0.3F, 0.0F, 1.0F);
      float $$9 = aym.a(aym.h($$5 + 0.75F) * 1.6F - 0.3F, 0.0F, 1.0F);
      this.S.a(0.0F, $$8, $$9, $$4);
      fbg $$10 = $$0.d().getBuffer(this.S.a(Q));
      this.S.a($$0.c(), $$10, 15728880, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$0.e();
      $$0.c().b();
      ezy.d();
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      $$3 = this.m.au();
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
      boolean $$4 = this.m.s.gm().d;
      int $$5 = this.w.l();

      for (int $$6 = 0; $$6 < 3; $$6++) {
         int $$7 = this.w.k[$$6];
         dad $$8 = dad.b(this.w.l[$$6]);
         int $$9 = this.w.m[$$6];
         int $$10 = $$6 + 1;
         if (this.a(60, 14 + 19 * $$6, 108, 17, (double)$$1, (double)$$2) && $$7 > 0 && $$9 >= 0 && $$8 != null) {
            List<xe> $$11 = Lists.newArrayList();
            $$11.add(xe.a("container.enchant.clue", $$8.e($$9)).a(n.p));
            if (!$$4) {
               $$11.add(xd.a);
               if (this.m.s.cE < $$7) {
                  $$11.add(xe.a("container.enchant.level.requirement", this.w.k[$$6]).a(n.m));
               } else {
                  xs $$12;
                  if ($$10 == 1) {
                     $$12 = xe.c("container.enchant.lapis.one");
                  } else {
                     $$12 = xe.a("container.enchant.lapis.many", $$10);
                  }

                  $$11.add($$12.a($$5 >= $$10 ? n.h : n.m));
                  xs $$14;
                  if ($$10 == 1) {
                     $$14 = xe.c("container.enchant.level.one");
                  } else {
                     $$14 = xe.a("container.enchant.level.many", $$10);
                  }

                  $$11.add($$14.a(n.h));
               }
            }

            $$0.a(this.p, $$11, $$1, $$2);
            break;
         }
      }
   }

   public void E() {
      cuh $$0 = this.w.b(0).g();
      if (!cuh.a($$0, this.T)) {
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

      this.I = aym.a(this.I, 0.0F, 1.0F);
      float $$3 = (this.G - this.E) * 0.4F;
      float $$4 = 0.2F;
      $$3 = aym.a($$3, -0.2F, 0.2F);
      this.H = this.H + ($$3 - this.H) * 0.9F;
      this.E = this.E + this.H;
   }
}
