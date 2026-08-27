import com.google.common.collect.Lists;
import java.util.List;

public class ewi extends evp<cbx> {
   private static final acq E = new acq("textures/gui/container/enchanting_table.png");
   private static final acq F = new acq("textures/entity/enchanting_table_book.png");
   private final apf G = apf.a();
   private fao H;
   public int w;
   public float x;
   public float y;
   public float z;
   public float A;
   public float C;
   public float D;
   private cfz I = cfz.b;

   public ewi(cbx $$0, byn $$1, sw $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void b() {
      super.b();
      this.H = new fao(this.f.aO().a(fed.m));
   }

   @Override
   public void B() {
      super.B();
      this.D();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      int $$3 = (this.g - this.c) / 2;
      int $$4 = (this.h - this.k) / 2;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         double $$6 = $$0 - (double)($$3 + 60);
         double $$7 = $$1 - (double)($$4 + 14 + 19 * $$5);
         if ($$6 >= 0.0 && $$7 >= 0.0 && $$6 < 108.0 && $$7 < 19.0 && this.p.b(this.f.t, $$5)) {
            this.f.r.a(this.p.j, $$5);
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eox $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(E, $$4, $$5, 0, 0, this.c, this.k);
      this.c($$0, $$4, $$5, $$1);
      ewh.a().a((long)this.p.m());
      int $$6 = this.p.l();

      for (int $$7 = 0; $$7 < 3; $$7++) {
         int $$8 = $$4 + 60;
         int $$9 = $$8 + 20;
         int $$10 = this.p.k[$$7];
         if ($$10 == 0) {
            $$0.a(E, $$8, $$5 + 14 + 19 * $$7, 0, 185, 108, 19);
         } else {
            String $$11 = $$10 + "";
            int $$12 = 86 - this.i.b($$11);
            ta $$13 = ewh.a().a(this.i, $$12);
            int $$14 = 6839882;
            if (($$6 < $$7 + 1 || this.f.t.ce < $$10) && !this.f.t.fO().d) {
               $$0.a(E, $$8, $$5 + 14 + 19 * $$7, 0, 185, 108, 19);
               $$0.a(E, $$8 + 1, $$5 + 15 + 19 * $$7, 16 * $$7, 239, 16, 16);
               $$0.a(this.i, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, ($$14 & 16711422) >> 1);
               $$14 = 4226832;
            } else {
               int $$15 = $$2 - ($$4 + 60);
               int $$16 = $$3 - ($$5 + 14 + 19 * $$7);
               if ($$15 >= 0 && $$16 >= 0 && $$15 < 108 && $$16 < 19) {
                  $$0.a(E, $$8, $$5 + 14 + 19 * $$7, 0, 204, 108, 19);
                  $$14 = 16777088;
               } else {
                  $$0.a(E, $$8, $$5 + 14 + 19 * $$7, 0, 166, 108, 19);
               }

               $$0.a(E, $$8 + 1, $$5 + 15 + 19 * $$7, 16 * $$7, 223, 16, 16);
               $$0.a(this.i, $$13, $$9, $$5 + 16 + 19 * $$7, $$12, $$14);
               $$14 = 8453920;
            }

            $$0.b(this.i, $$11, $$9 + 86 - this.i.b($$11), $$5 + 16 + 19 * $$7 + 7, $$14);
         }
      }
   }

   private void c(eox $$0, int $$1, int $$2, float $$3) {
      float $$4 = apa.i($$3, this.D, this.C);
      float $$5 = apa.i($$3, this.y, this.x);
      ehf.c();
      $$0.c().a();
      $$0.c().a((float)$$1 + 33.0F, (float)$$2 + 31.0F, 100.0F);
      float $$6 = 40.0F;
      $$0.c().b(-40.0F, 40.0F, 40.0F);
      $$0.c().a(a.b.rotationDegrees(25.0F));
      $$0.c().a((1.0F - $$4) * 0.2F, (1.0F - $$4) * 0.1F, (1.0F - $$4) * 0.25F);
      float $$7 = -(1.0F - $$4) * 90.0F - 90.0F;
      $$0.c().a(a.d.rotationDegrees($$7));
      $$0.c().a(a.b.rotationDegrees(180.0F));
      float $$8 = apa.a(apa.h($$5 + 0.25F) * 1.6F - 0.3F, 0.0F, 1.0F);
      float $$9 = apa.a(apa.h($$5 + 0.75F) * 1.6F - 0.3F, 0.0F, 1.0F);
      this.H.a(0.0F, $$8, $$9, $$4);
      ein $$10 = $$0.d().getBuffer(this.H.a(F));
      this.H.a($$0.c(), $$10, 15728880, fum.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$0.e();
      $$0.c().b();
      ehf.b();
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      $$3 = this.f.av();
      this.a($$0);
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
      boolean $$4 = this.f.t.fO().d;
      int $$5 = this.p.l();

      for (int $$6 = 0; $$6 < 3; $$6++) {
         int $$7 = this.p.k[$$6];
         ckg $$8 = ckg.c(this.p.l[$$6]);
         int $$9 = this.p.m[$$6];
         int $$10 = $$6 + 1;
         if (this.a(60, 14 + 19 * $$6, 108, 17, (double)$$1, (double)$$2) && $$7 > 0 && $$9 >= 0 && $$8 != null) {
            List<sw> $$11 = Lists.newArrayList();
            $$11.add(sw.a("container.enchant.clue", $$8.d($$9)).a(n.p));
            if (!$$4) {
               $$11.add(sv.a);
               if (this.f.t.ce < $$7) {
                  $$11.add(sw.a("container.enchant.level.requirement", this.p.k[$$6]).a(n.m));
               } else {
                  tj $$12;
                  if ($$10 == 1) {
                     $$12 = sw.c("container.enchant.lapis.one");
                  } else {
                     $$12 = sw.a("container.enchant.lapis.many", $$10);
                  }

                  $$11.add($$12.a($$5 >= $$10 ? n.h : n.m));
                  tj $$14;
                  if ($$10 == 1) {
                     $$14 = sw.c("container.enchant.level.one");
                  } else {
                     $$14 = sw.a("container.enchant.level.many", $$10);
                  }

                  $$11.add($$14.a(n.h));
               }
            }

            $$0.a(this.i, $$11, $$1, $$2);
            break;
         }
      }
   }

   public void D() {
      cfz $$0 = this.p.b(0).e();
      if (!cfz.a($$0, this.I)) {
         this.I = $$0;

         do {
            this.z = this.z + (float)(this.G.a(4) - this.G.a(4));
         } while (this.x <= this.z + 1.0F && this.x >= this.z - 1.0F);
      }

      this.w++;
      this.y = this.x;
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

      this.C = apa.a(this.C, 0.0F, 1.0F);
      float $$3 = (this.z - this.x) * 0.4F;
      float $$4 = 0.2F;
      $$3 = apa.a($$3, -0.2F, 0.2F);
      this.A = this.A + ($$3 - this.A) * 0.9F;
      this.x = this.x + this.A;
   }
}
