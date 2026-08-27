import com.google.common.collect.Lists;
import java.util.List;

public class fab extends ezi<cfd> {
   private static final aex[] E = new aex[]{
      new aex("container/enchanting_table/level_1"), new aex("container/enchanting_table/level_2"), new aex("container/enchanting_table/level_3")
   };
   private static final aex[] F = new aex[]{
      new aex("container/enchanting_table/level_1_disabled"),
      new aex("container/enchanting_table/level_2_disabled"),
      new aex("container/enchanting_table/level_3_disabled")
   };
   private static final aex G = new aex("container/enchanting_table/enchantment_slot_disabled");
   private static final aex H = new aex("container/enchanting_table/enchantment_slot_highlighted");
   private static final aex I = new aex("container/enchanting_table/enchantment_slot");
   private static final aex J = new aex("textures/gui/container/enchanting_table.png");
   private static final aex K = new aex("textures/entity/enchanting_table_book.png");
   private final asc L = asc.a();
   private fem M;
   public int x;
   public float y;
   public float z;
   public float A;
   public float B;
   public float C;
   public float D;
   private cjf N = cjf.b;

   public fab(cfd $$0, cbt $$1, tl $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aI_() {
      super.aI_();
      this.M = new fem(this.f.aP().a(fib.m));
   }

   @Override
   public void C() {
      super.C();
      this.E();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      int $$3 = (this.g - this.c) / 2;
      int $$4 = (this.h - this.k) / 2;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         double $$6 = $$0 - (double)($$3 + 60);
         double $$7 = $$1 - (double)($$4 + 14 + 19 * $$5);
         if ($$6 >= 0.0 && $$7 >= 0.0 && $$6 < 108.0 && $$7 < 19.0 && this.p.b(this.f.s, $$5)) {
            this.f.q.a(this.p.j, $$5);
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void a(esf $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(J, $$4, $$5, 0, 0, this.c, this.k);
      this.d($$0, $$4, $$5, $$1);
      faa.a().a((long)this.p.m());
      int $$6 = this.p.l();

      for (int $$7 = 0; $$7 < 3; $$7++) {
         int $$8 = $$4 + 60;
         int $$9 = $$8 + 20;
         int $$10 = this.p.k[$$7];
         if ($$10 == 0) {
            $$0.a(G, $$8, $$5 + 14 + 19 * $$7, 108, 19);
         } else {
            String $$11 = $$10 + "";
            int $$12 = 86 - this.i.b($$11);
            tp $$13 = faa.a().a(this.i, $$12);
            int $$14 = 6839882;
            if (($$6 < $$7 + 1 || this.f.s.cf < $$10) && !this.f.s.fS().d) {
               $$0.a(G, $$8, $$5 + 14 + 19 * $$7, 108, 19);
               $$0.a(F[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
               $$0.a(this.i, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, ($$14 & 16711422) >> 1);
               $$14 = 4226832;
            } else {
               int $$15 = $$2 - ($$4 + 60);
               int $$16 = $$3 - ($$5 + 14 + 19 * $$7);
               if ($$15 >= 0 && $$16 >= 0 && $$15 < 108 && $$16 < 19) {
                  $$0.a(H, $$8, $$5 + 14 + 19 * $$7, 108, 19);
                  $$14 = 16777088;
               } else {
                  $$0.a(I, $$8, $$5 + 14 + 19 * $$7, 108, 19);
               }

               $$0.a(E[$$7], $$8 + 1, $$5 + 15 + 19 * $$7, 16, 16);
               $$0.a(this.i, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, $$14);
               $$14 = 8453920;
            }

            $$0.b(this.i, $$11, $$9 + 86 - this.i.b($$11), $$5 + 16 + 19 * $$7 + 7, $$14);
         }
      }
   }

   private void d(esf $$0, int $$1, int $$2, float $$3) {
      float $$4 = arx.i($$3, this.D, this.C);
      float $$5 = arx.i($$3, this.z, this.y);
      ekl.c();
      $$0.c().a();
      $$0.c().a((float)$$1 + 33.0F, (float)$$2 + 31.0F, 100.0F);
      float $$6 = 40.0F;
      $$0.c().b(-40.0F, 40.0F, 40.0F);
      $$0.c().a(a.b.rotationDegrees(25.0F));
      $$0.c().a((1.0F - $$4) * 0.2F, (1.0F - $$4) * 0.1F, (1.0F - $$4) * 0.25F);
      float $$7 = -(1.0F - $$4) * 90.0F - 90.0F;
      $$0.c().a(a.d.rotationDegrees($$7));
      $$0.c().a(a.b.rotationDegrees(180.0F));
      float $$8 = arx.a(arx.h($$5 + 0.25F) * 1.6F - 0.3F, 0.0F, 1.0F);
      float $$9 = arx.a(arx.h($$5 + 0.75F) * 1.6F - 0.3F, 0.0F, 1.0F);
      this.M.a(0.0F, $$8, $$9, $$4);
      elt $$10 = $$0.d().getBuffer(this.M.a(K));
      this.M.a($$0.c(), $$10, 15728880, fyv.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$0.e();
      $$0.c().b();
      ekl.b();
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      $$3 = this.f.as();
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
      boolean $$4 = this.f.s.fS().d;
      int $$5 = this.p.l();

      for (int $$6 = 0; $$6 < 3; $$6++) {
         int $$7 = this.p.k[$$6];
         cno $$8 = cno.c(this.p.l[$$6]);
         int $$9 = this.p.m[$$6];
         int $$10 = $$6 + 1;
         if (this.a(60, 14 + 19 * $$6, 108, 17, (double)$$1, (double)$$2) && $$7 > 0 && $$9 >= 0 && $$8 != null) {
            List<tl> $$11 = Lists.newArrayList();
            $$11.add(tl.a("container.enchant.clue", $$8.d($$9)).a(n.p));
            if (!$$4) {
               $$11.add(tk.a);
               if (this.f.s.cf < $$7) {
                  $$11.add(tl.a("container.enchant.level.requirement", this.p.k[$$6]).a(n.m));
               } else {
                  ty $$12;
                  if ($$10 == 1) {
                     $$12 = tl.c("container.enchant.lapis.one");
                  } else {
                     $$12 = tl.a("container.enchant.lapis.many", $$10);
                  }

                  $$11.add($$12.a($$5 >= $$10 ? n.h : n.m));
                  ty $$14;
                  if ($$10 == 1) {
                     $$14 = tl.c("container.enchant.level.one");
                  } else {
                     $$14 = tl.a("container.enchant.level.many", $$10);
                  }

                  $$11.add($$14.a(n.h));
               }
            }

            $$0.a(this.i, $$11, $$1, $$2);
            break;
         }
      }
   }

   public void E() {
      cjf $$0 = this.p.b(0).e();
      if (!cjf.a($$0, this.N)) {
         this.N = $$0;

         do {
            this.A = this.A + (float)(this.L.a(4) - this.L.a(4));
         } while (this.y <= this.A + 1.0F && this.y >= this.A - 1.0F);
      }

      this.x++;
      this.z = this.y;
      this.D = this.C;
      boolean $$1 = false;

      for (int $$2 = 0; $$2 < 3; $$2++) {
         if (this.p.k[$$2] != 0) {
            $$1 = true;
         }
      }

      if ($$1) {
         this.C += 0.2F;
      } else {
         this.C -= 0.2F;
      }

      this.C = arx.a(this.C, 0.0F, 1.0F);
      float $$3 = (this.A - this.y) * 0.4F;
      float $$4 = 0.2F;
      $$3 = arx.a($$3, -0.2F, 0.2F);
      this.B = this.B + ($$3 - this.B) * 0.9F;
      this.y = this.y + this.B;
   }
}
