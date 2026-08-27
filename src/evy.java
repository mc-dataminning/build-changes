import javax.annotation.Nullable;

public class evy extends evp<cbl> {
   private static final acq w = new acq("textures/gui/container/cartography_table.png");

   public evy(cbl $$0, byn $$1, sw $$2) {
      super($$0, $$1, $$2);
      this.m -= 2;
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(eox $$0, float $$1, int $$2, int $$3) {
      this.a($$0);
      int $$4 = this.s;
      int $$5 = this.t;
      $$0.a(w, $$4, $$5, 0, 0, this.c, this.k);
      cfz $$6 = this.p.b(1).e();
      boolean $$7 = $$6.a(cgc.tp);
      boolean $$8 = $$6.a(cgc.qa);
      boolean $$9 = $$6.a(cgc.fx);
      cfz $$10 = this.p.b(0).e();
      boolean $$11 = false;
      Integer $$12;
      dyo $$13;
      if ($$10.a(cgc.rf)) {
         $$12 = cgg.d($$10);
         $$13 = cgg.a($$12, this.f.s);
         if ($$13 != null) {
            if ($$13.h) {
               $$11 = true;
               if ($$8 || $$9) {
                  $$0.a(w, $$4 + 35, $$5 + 31, this.c + 50, 132, 28, 21);
               }
            }

            if ($$8 && $$13.f >= 4) {
               $$11 = true;
               $$0.a(w, $$4 + 35, $$5 + 31, this.c + 50, 132, 28, 21);
            }
         }
      } else {
         $$12 = null;
         $$13 = null;
      }

      this.a($$0, $$12, $$13, $$7, $$8, $$9, $$11);
   }

   private void a(eox $$0, @Nullable Integer $$1, @Nullable dyo $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6) {
      int $$7 = this.s;
      int $$8 = this.t;
      if ($$4 && !$$6) {
         $$0.a(w, $$7 + 67, $$8 + 13, this.c, 66, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 85, $$8 + 31, 0.226F);
      } else if ($$3) {
         $$0.a(w, $$7 + 67 + 16, $$8 + 13, this.c, 132, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 86, $$8 + 16, 0.34F);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1.0F);
         $$0.a(w, $$7 + 67, $$8 + 13 + 16, this.c, 132, 50, 66);
         this.a($$0, $$1, $$2, $$7 + 70, $$8 + 32, 0.34F);
         $$0.c().b();
      } else if ($$5) {
         $$0.a(w, $$7 + 67, $$8 + 13, this.c, 0, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
         $$0.c().a();
         $$0.c().a(0.0F, 0.0F, 1.0F);
         $$0.a(w, $$7 + 66, $$8 + 12, 0, this.k, 66, 66);
         $$0.c().b();
      } else {
         $$0.a(w, $$7 + 67, $$8 + 13, this.c, 0, 66, 66);
         this.a($$0, $$1, $$2, $$7 + 71, $$8 + 17, 0.45F);
      }
   }

   private void a(eox $$0, @Nullable Integer $$1, @Nullable dyo $$2, int $$3, int $$4, float $$5) {
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
