import javax.annotation.Nullable;

public class fdk extends fdb<chq> {
   private static final agt x = new agt("container/cartography_table/error");
   private static final agt y = new agt("container/cartography_table/scaled_map");
   private static final agt z = new agt("container/cartography_table/duplicated_map");
   private static final agt A = new agt("container/cartography_table/map");
   private static final agt B = new agt("container/cartography_table/locked");
   private static final agt C = new agt("textures/gui/container/cartography_table.png");

   public fdk(chq $$0, ceq $$1, vb $$2) {
      super($$0, $$1, $$2);
      this.m -= 2;
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(evw $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      $$0.a(C, $$4, $$5, 0, 0, this.c, this.k);
      cmh $$6 = this.p.b(1).g();
      boolean $$7 = $$6.a(cmk.uc);
      boolean $$8 = $$6.a(cmk.qL);
      boolean $$9 = $$6.a(cmk.fS);
      cmh $$10 = this.p.b(0).g();
      boolean $$11 = false;
      Integer $$12;
      efj $$13;
      if ($$10.a(cmk.rR)) {
         $$12 = cmo.d($$10);
         $$13 = cmo.a($$12, this.f.r);
         if ($$13 != null) {
            if ($$13.h) {
               $$11 = true;
               if ($$8 || $$9) {
                  $$0.a(x, $$4 + 35, $$5 + 31, 28, 21);
               }
            }

            if ($$8 && $$13.f >= 4) {
               $$11 = true;
               $$0.a(x, $$4 + 35, $$5 + 31, 28, 21);
            }
         }
      } else {
         $$12 = null;
         $$13 = null;
      }

      this.a($$0, $$12, $$13, $$7, $$8, $$9, $$11);
   }

   private void a(evw $$0, @Nullable Integer $$1, @Nullable efj $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6) {
      int $$7 = this.t;
      int $$8 = this.u;
      if ($$4 && !$$6) {
         $$0.a(y, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 85, $$8 + 31, 0.226F);
      } else if ($$3) {
         $$0.a(z, $$7 + 67 + 16, $$8 + 13, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 86, $$8 + 16, 0.34F);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1.0F);
         $$0.a(z, $$7 + 67, $$8 + 13 + 16, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 70, $$8 + 32, 0.34F);
         $$0.c().b();
      } else if ($$5) {
         $$0.a(A, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1.0F);
         $$0.a(B, $$7 + 118, $$8 + 60, 10, 14);
         $$0.c().b();
      } else {
         $$0.a(A, $$7 + 67, $$8 + 13, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
      }
   }

   private void a(evw $$0, @Nullable Integer $$1, @Nullable efj $$2, int $$3, int $$4, float $$5) {
      if ($$1 != null && $$2 != null) {
         $$0.c().a();
         $$0.c().a((float)$$3, (float)$$4, 1.0F);
         $$0.c().b($$5, $$5, 1.0F);
         this.f.j.j().a($$0.c(), $$0.d(), $$1, $$2, true, 15728880);
         $$0.e();
         $$0.c().b();
      }
   }
}
