import javax.annotation.Nullable;

public class fpw extends fpn<cpm> {
   private static final akt D = new akt("container/cartography_table/error");
   private static final akt E = new akt("container/cartography_table/scaled_map");
   private static final akt F = new akt("container/cartography_table/duplicated_map");
   private static final akt G = new akt("container/cartography_table/map");
   private static final akt H = new akt("container/cartography_table/locked");
   private static final akt I = new akt("textures/gui/container/cartography_table.png");

   public fpw(cpm $$0, clx $$1, xe $$2) {
      super($$0, $$1, $$2);
      this.s -= 2;
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fia $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.z;
      int $$5 = this.A;
      $$0.a(I, $$4, $$5, 0, 0, this.c, this.d);
      cuh $$6 = this.w.b(1).g();
      boolean $$7 = $$6.a(cuk.vU);
      boolean $$8 = $$6.a(cuk.sl);
      boolean $$9 = $$6.a(cuk.hg);
      cuh $$10 = this.w.b(0).g();
      eqr $$11 = $$10.a(ke.z);
      boolean $$12 = false;
      eqt $$13;
      if ($$11 != null) {
         $$13 = cuq.a($$11, this.m.r);
         if ($$13 != null) {
            if ($$13.h) {
               $$12 = true;
               if ($$8 || $$9) {
                  $$0.a(D, $$4 + 35, $$5 + 31, 28, 21);
               }
            }

            if ($$8 && $$13.f >= 4) {
               $$12 = true;
               $$0.a(D, $$4 + 35, $$5 + 31, 28, 21);
            }
         }
      } else {
         $$13 = null;
      }

      this.a($$0, $$11, $$13, $$7, $$8, $$9, $$12);
   }

   private void a(fia $$0, @Nullable eqr $$1, @Nullable eqt $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6) {
      int $$7 = this.z;
      int $$8 = this.A;
      if ($$4 && !$$6) {
         $$0.a(E, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 85, $$8 + 31, 0.226F);
      } else if ($$3) {
         $$0.a(F, $$7 + 67 + 16, $$8 + 13, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 86, $$8 + 16, 0.34F);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1.0F);
         $$0.a(F, $$7 + 67, $$8 + 13 + 16, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 70, $$8 + 32, 0.34F);
         $$0.c().b();
      } else if ($$5) {
         $$0.a(G, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1.0F);
         $$0.a(H, $$7 + 118, $$8 + 60, 10, 14);
         $$0.c().b();
      } else {
         $$0.a(G, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
      }
   }

   private void a(fia $$0, @Nullable eqr $$1, @Nullable eqt $$2, int $$3, int $$4, float $$5) {
      if ($$1 != null && $$2 != null) {
         $$0.c().a();
         $$0.c().a((float)$$3, (float)$$4, 1.0F);
         $$0.c().b($$5, $$5, 1.0F);
         this.m.j.j().a($$0.c(), $$0.d(), $$1, $$2, true, 15728880);
         $$0.e();
         $$0.c().b();
      }
   }
}
