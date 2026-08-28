import javax.annotation.Nullable;

public class foi extends fnz<cpy> {
   private static final ale D = new ale("container/cartography_table/error");
   private static final ale E = new ale("container/cartography_table/scaled_map");
   private static final ale F = new ale("container/cartography_table/duplicated_map");
   private static final ale G = new ale("container/cartography_table/map");
   private static final ale H = new ale("container/cartography_table/locked");
   private static final ale I = new ale("textures/gui/container/cartography_table.png");

   public foi(cpy $$0, cmu $$1, xo $$2) {
      super($$0, $$1, $$2);
      this.s -= 2;
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fgp $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.z;
      int $$5 = this.A;
      $$0.a(I, $$4, $$5, 0, 0, this.c, this.d);
      cun $$6 = this.w.b(1).g();
      boolean $$7 = $$6.a(cuq.uj);
      boolean $$8 = $$6.a(cuq.qO);
      boolean $$9 = $$6.a(cuq.fT);
      cun $$10 = this.w.b(0).g();
      epg $$11 = $$10.a(km.A);
      boolean $$12 = false;
      epi $$13;
      if ($$11 != null) {
         $$13 = cuv.a($$11, this.m.r);
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

   private void a(fgp $$0, @Nullable epg $$1, @Nullable epi $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6) {
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

   private void a(fgp $$0, @Nullable epg $$1, @Nullable epi $$2, int $$3, int $$4, float $$5) {
      if ($$1 != null && $$2 != null) {
         $$0.c().a();
         $$0.c().a((float)$$3, (float)$$4, 1.0F);
         $$0.c().b($$5, $$5, 1.0F);
         this.m.j.i().a($$0.c(), $$0.d(), $$1, $$2, true, 15728880);
         $$0.e();
         $$0.c().b();
      }
   }
}
