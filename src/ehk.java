import java.util.ArrayList;
import java.util.List;

public class ehk extends efo {
   public static final int h = 21;
   public static final int i = 21;
   private final boolean[] j = new boolean[4];
   private final List<id> k = new ArrayList<>();
   private id l = id.c;

   public ehk(axt $$0, int $$1, int $$2) {
      super(egh.L, $$1, 64, $$2, 21, 15, 21, a($$0));
   }

   public ehk(to $$0) {
      super(egh.L, $$0);
      this.j[0] = $$0.q("hasPlacedChest0");
      this.j[1] = $$0.q("hasPlacedChest1");
      this.j[2] = $$0.q("hasPlacedChest2");
      this.j[3] = $$0.q("hasPlacedChest3");
   }

   @Override
   protected void a(egg $$0, to $$1) {
      super.a($$0, $$1);
      $$1.a("hasPlacedChest0", this.j[0]);
      $$1.a("hasPlacedChest1", this.j[1]);
      $$1.a("hasPlacedChest2", this.j[2]);
      $$1.a("hasPlacedChest3", this.j[3]);
   }

   @Override
   public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
      if (this.a($$0, -$$3.a(3))) {
         this.a($$0, $$4, 0, -4, 0, this.a - 1, 0, this.c - 1, dcj.aV.n(), dcj.aV.n(), false);

         for (int $$7 = 1; $$7 <= 9; $$7++) {
            this.a($$0, $$4, $$7, $$7, $$7, this.a - 1 - $$7, $$7, this.c - 1 - $$7, dcj.aV.n(), dcj.aV.n(), false);
            this.a($$0, $$4, $$7 + 1, $$7, $$7 + 1, this.a - 2 - $$7, $$7, this.c - 2 - $$7, dcj.a.n(), dcj.a.n(), false);
         }

         for (int $$8 = 0; $$8 < this.a; $$8++) {
            for (int $$9 = 0; $$9 < this.c; $$9++) {
               int $$10 = -5;
               this.b($$0, dcj.aV.n(), $$8, -5, $$9, $$4);
            }
         }

         dpi $$11 = dcj.fD.n().a(dka.b, ij.c);
         dpi $$12 = dcj.fD.n().a(dka.b, ij.d);
         dpi $$13 = dcj.fD.n().a(dka.b, ij.f);
         dpi $$14 = dcj.fD.n().a(dka.b, ij.e);
         this.a($$0, $$4, 0, 0, 0, 4, 9, 4, dcj.aV.n(), dcj.a.n(), false);
         this.a($$0, $$4, 1, 10, 1, 3, 10, 3, dcj.aV.n(), dcj.aV.n(), false);
         this.a($$0, $$11, 2, 10, 0, $$4);
         this.a($$0, $$12, 2, 10, 4, $$4);
         this.a($$0, $$13, 0, 10, 2, $$4);
         this.a($$0, $$14, 4, 10, 2, $$4);
         this.a($$0, $$4, this.a - 5, 0, 0, this.a - 1, 9, 4, dcj.aV.n(), dcj.a.n(), false);
         this.a($$0, $$4, this.a - 4, 10, 1, this.a - 2, 10, 3, dcj.aV.n(), dcj.aV.n(), false);
         this.a($$0, $$11, this.a - 3, 10, 0, $$4);
         this.a($$0, $$12, this.a - 3, 10, 4, $$4);
         this.a($$0, $$13, this.a - 5, 10, 2, $$4);
         this.a($$0, $$14, this.a - 1, 10, 2, $$4);
         this.a($$0, $$4, 8, 0, 0, 12, 4, 4, dcj.aV.n(), dcj.a.n(), false);
         this.a($$0, $$4, 9, 1, 0, 11, 3, 4, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, dcj.aX.n(), 9, 1, 1, $$4);
         this.a($$0, dcj.aX.n(), 9, 2, 1, $$4);
         this.a($$0, dcj.aX.n(), 9, 3, 1, $$4);
         this.a($$0, dcj.aX.n(), 10, 3, 1, $$4);
         this.a($$0, dcj.aX.n(), 11, 3, 1, $$4);
         this.a($$0, dcj.aX.n(), 11, 2, 1, $$4);
         this.a($$0, dcj.aX.n(), 11, 1, 1, $$4);
         this.a($$0, $$4, 4, 1, 1, 8, 3, 3, dcj.aV.n(), dcj.a.n(), false);
         this.a($$0, $$4, 4, 1, 2, 8, 2, 2, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 12, 1, 1, 16, 3, 3, dcj.aV.n(), dcj.a.n(), false);
         this.a($$0, $$4, 12, 1, 2, 16, 2, 2, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 5, 4, 5, this.a - 6, 4, this.c - 6, dcj.aV.n(), dcj.aV.n(), false);
         this.a($$0, $$4, 9, 4, 9, 11, 4, 11, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, 8, 1, 8, 8, 3, 8, dcj.aX.n(), dcj.aX.n(), false);
         this.a($$0, $$4, 12, 1, 8, 12, 3, 8, dcj.aX.n(), dcj.aX.n(), false);
         this.a($$0, $$4, 8, 1, 12, 8, 3, 12, dcj.aX.n(), dcj.aX.n(), false);
         this.a($$0, $$4, 12, 1, 12, 12, 3, 12, dcj.aX.n(), dcj.aX.n(), false);
         this.a($$0, $$4, 1, 1, 5, 4, 4, 11, dcj.aV.n(), dcj.aV.n(), false);
         this.a($$0, $$4, this.a - 5, 1, 5, this.a - 2, 4, 11, dcj.aV.n(), dcj.aV.n(), false);
         this.a($$0, $$4, 6, 7, 9, 6, 7, 11, dcj.aV.n(), dcj.aV.n(), false);
         this.a($$0, $$4, this.a - 7, 7, 9, this.a - 7, 7, 11, dcj.aV.n(), dcj.aV.n(), false);
         this.a($$0, $$4, 5, 5, 9, 5, 7, 11, dcj.aX.n(), dcj.aX.n(), false);
         this.a($$0, $$4, this.a - 6, 5, 9, this.a - 6, 7, 11, dcj.aX.n(), dcj.aX.n(), false);
         this.a($$0, dcj.a.n(), 5, 5, 10, $$4);
         this.a($$0, dcj.a.n(), 5, 6, 10, $$4);
         this.a($$0, dcj.a.n(), 6, 6, 10, $$4);
         this.a($$0, dcj.a.n(), this.a - 6, 5, 10, $$4);
         this.a($$0, dcj.a.n(), this.a - 6, 6, 10, $$4);
         this.a($$0, dcj.a.n(), this.a - 7, 6, 10, $$4);
         this.a($$0, $$4, 2, 4, 4, 2, 6, 4, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, this.a - 3, 4, 4, this.a - 3, 6, 4, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$11, 2, 4, 5, $$4);
         this.a($$0, $$11, 2, 3, 4, $$4);
         this.a($$0, $$11, this.a - 3, 4, 5, $$4);
         this.a($$0, $$11, this.a - 3, 3, 4, $$4);
         this.a($$0, $$4, 1, 1, 3, 2, 2, 3, dcj.aV.n(), dcj.aV.n(), false);
         this.a($$0, $$4, this.a - 3, 1, 3, this.a - 2, 2, 3, dcj.aV.n(), dcj.aV.n(), false);
         this.a($$0, dcj.aV.n(), 1, 1, 2, $$4);
         this.a($$0, dcj.aV.n(), this.a - 2, 1, 2, $$4);
         this.a($$0, dcj.jF.n(), 1, 2, 2, $$4);
         this.a($$0, dcj.jF.n(), this.a - 2, 2, 2, $$4);
         this.a($$0, $$14, 2, 1, 2, $$4);
         this.a($$0, $$13, this.a - 3, 1, 2, $$4);
         this.a($$0, $$4, 4, 3, 5, 4, 3, 17, dcj.aV.n(), dcj.aV.n(), false);
         this.a($$0, $$4, this.a - 5, 3, 5, this.a - 5, 3, 17, dcj.aV.n(), dcj.aV.n(), false);
         this.a($$0, $$4, 3, 1, 5, 4, 2, 16, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, $$4, this.a - 6, 1, 5, this.a - 5, 2, 16, dcj.a.n(), dcj.a.n(), false);

         for (int $$15 = 5; $$15 <= 17; $$15 += 2) {
            this.a($$0, dcj.aX.n(), 4, 1, $$15, $$4);
            this.a($$0, dcj.aW.n(), 4, 2, $$15, $$4);
            this.a($$0, dcj.aX.n(), this.a - 5, 1, $$15, $$4);
            this.a($$0, dcj.aW.n(), this.a - 5, 2, $$15, $$4);
         }

         this.a($$0, dcj.hk.n(), 10, 0, 7, $$4);
         this.a($$0, dcj.hk.n(), 10, 0, 8, $$4);
         this.a($$0, dcj.hk.n(), 9, 0, 9, $$4);
         this.a($$0, dcj.hk.n(), 11, 0, 9, $$4);
         this.a($$0, dcj.hk.n(), 8, 0, 10, $$4);
         this.a($$0, dcj.hk.n(), 12, 0, 10, $$4);
         this.a($$0, dcj.hk.n(), 7, 0, 10, $$4);
         this.a($$0, dcj.hk.n(), 13, 0, 10, $$4);
         this.a($$0, dcj.hk.n(), 9, 0, 11, $$4);
         this.a($$0, dcj.hk.n(), 11, 0, 11, $$4);
         this.a($$0, dcj.hk.n(), 10, 0, 12, $$4);
         this.a($$0, dcj.hk.n(), 10, 0, 13, $$4);
         this.a($$0, dcj.hu.n(), 10, 0, 10, $$4);

         for (int $$16 = 0; $$16 <= this.a - 1; $$16 += this.a - 1) {
            this.a($$0, dcj.aX.n(), $$16, 2, 1, $$4);
            this.a($$0, dcj.hk.n(), $$16, 2, 2, $$4);
            this.a($$0, dcj.aX.n(), $$16, 2, 3, $$4);
            this.a($$0, dcj.aX.n(), $$16, 3, 1, $$4);
            this.a($$0, dcj.hk.n(), $$16, 3, 2, $$4);
            this.a($$0, dcj.aX.n(), $$16, 3, 3, $$4);
            this.a($$0, dcj.hk.n(), $$16, 4, 1, $$4);
            this.a($$0, dcj.aW.n(), $$16, 4, 2, $$4);
            this.a($$0, dcj.hk.n(), $$16, 4, 3, $$4);
            this.a($$0, dcj.aX.n(), $$16, 5, 1, $$4);
            this.a($$0, dcj.hk.n(), $$16, 5, 2, $$4);
            this.a($$0, dcj.aX.n(), $$16, 5, 3, $$4);
            this.a($$0, dcj.hk.n(), $$16, 6, 1, $$4);
            this.a($$0, dcj.aW.n(), $$16, 6, 2, $$4);
            this.a($$0, dcj.hk.n(), $$16, 6, 3, $$4);
            this.a($$0, dcj.hk.n(), $$16, 7, 1, $$4);
            this.a($$0, dcj.hk.n(), $$16, 7, 2, $$4);
            this.a($$0, dcj.hk.n(), $$16, 7, 3, $$4);
            this.a($$0, dcj.aX.n(), $$16, 8, 1, $$4);
            this.a($$0, dcj.aX.n(), $$16, 8, 2, $$4);
            this.a($$0, dcj.aX.n(), $$16, 8, 3, $$4);
         }

         for (int $$17 = 2; $$17 <= this.a - 3; $$17 += this.a - 3 - 2) {
            this.a($$0, dcj.aX.n(), $$17 - 1, 2, 0, $$4);
            this.a($$0, dcj.hk.n(), $$17, 2, 0, $$4);
            this.a($$0, dcj.aX.n(), $$17 + 1, 2, 0, $$4);
            this.a($$0, dcj.aX.n(), $$17 - 1, 3, 0, $$4);
            this.a($$0, dcj.hk.n(), $$17, 3, 0, $$4);
            this.a($$0, dcj.aX.n(), $$17 + 1, 3, 0, $$4);
            this.a($$0, dcj.hk.n(), $$17 - 1, 4, 0, $$4);
            this.a($$0, dcj.aW.n(), $$17, 4, 0, $$4);
            this.a($$0, dcj.hk.n(), $$17 + 1, 4, 0, $$4);
            this.a($$0, dcj.aX.n(), $$17 - 1, 5, 0, $$4);
            this.a($$0, dcj.hk.n(), $$17, 5, 0, $$4);
            this.a($$0, dcj.aX.n(), $$17 + 1, 5, 0, $$4);
            this.a($$0, dcj.hk.n(), $$17 - 1, 6, 0, $$4);
            this.a($$0, dcj.aW.n(), $$17, 6, 0, $$4);
            this.a($$0, dcj.hk.n(), $$17 + 1, 6, 0, $$4);
            this.a($$0, dcj.hk.n(), $$17 - 1, 7, 0, $$4);
            this.a($$0, dcj.hk.n(), $$17, 7, 0, $$4);
            this.a($$0, dcj.hk.n(), $$17 + 1, 7, 0, $$4);
            this.a($$0, dcj.aX.n(), $$17 - 1, 8, 0, $$4);
            this.a($$0, dcj.aX.n(), $$17, 8, 0, $$4);
            this.a($$0, dcj.aX.n(), $$17 + 1, 8, 0, $$4);
         }

         this.a($$0, $$4, 8, 4, 0, 12, 6, 0, dcj.aX.n(), dcj.aX.n(), false);
         this.a($$0, dcj.a.n(), 8, 6, 0, $$4);
         this.a($$0, dcj.a.n(), 12, 6, 0, $$4);
         this.a($$0, dcj.hk.n(), 9, 5, 0, $$4);
         this.a($$0, dcj.aW.n(), 10, 5, 0, $$4);
         this.a($$0, dcj.hk.n(), 11, 5, 0, $$4);
         this.a($$0, $$4, 8, -14, 8, 12, -11, 12, dcj.aX.n(), dcj.aX.n(), false);
         this.a($$0, $$4, 8, -10, 8, 12, -10, 12, dcj.aW.n(), dcj.aW.n(), false);
         this.a($$0, $$4, 8, -9, 8, 12, -9, 12, dcj.aX.n(), dcj.aX.n(), false);
         this.a($$0, $$4, 8, -8, 8, 12, -1, 12, dcj.aV.n(), dcj.aV.n(), false);
         this.a($$0, $$4, 9, -11, 9, 11, -1, 11, dcj.a.n(), dcj.a.n(), false);
         this.a($$0, dcj.dx.n(), 10, -11, 10, $$4);
         this.a($$0, $$4, 9, -13, 9, 11, -13, 11, dcj.ck.n(), dcj.a.n(), false);
         this.a($$0, dcj.a.n(), 8, -11, 10, $$4);
         this.a($$0, dcj.a.n(), 8, -10, 10, $$4);
         this.a($$0, dcj.aW.n(), 7, -10, 10, $$4);
         this.a($$0, dcj.aX.n(), 7, -11, 10, $$4);
         this.a($$0, dcj.a.n(), 12, -11, 10, $$4);
         this.a($$0, dcj.a.n(), 12, -10, 10, $$4);
         this.a($$0, dcj.aW.n(), 13, -10, 10, $$4);
         this.a($$0, dcj.aX.n(), 13, -11, 10, $$4);
         this.a($$0, dcj.a.n(), 10, -11, 8, $$4);
         this.a($$0, dcj.a.n(), 10, -10, 8, $$4);
         this.a($$0, dcj.aW.n(), 10, -10, 7, $$4);
         this.a($$0, dcj.aX.n(), 10, -11, 7, $$4);
         this.a($$0, dcj.a.n(), 10, -11, 12, $$4);
         this.a($$0, dcj.a.n(), 10, -10, 12, $$4);
         this.a($$0, dcj.aW.n(), 10, -10, 13, $$4);
         this.a($$0, dcj.aX.n(), 10, -11, 13, $$4);

         for (ij $$18 : ij.c.a) {
            if (!this.j[$$18.e()]) {
               int $$19 = $$18.j() * 2;
               int $$20 = $$18.l() * 2;
               this.j[$$18.e()] = this.a($$0, $$4, $$3, 10 + $$19, -11, 10 + $$20, eni.z);
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dab $$0, efi $$1) {
      id $$2 = new id(16, -4, 13);
      this.a($$2, $$0, $$1);
      this.b($$2, $$0, $$1);
   }

   private void a(id $$0, dab $$1, efi $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      dpi $$6 = dcj.fD.n();
      this.a($$1, $$6.a(dit.d), 13, -1, 17, $$2);
      this.a($$1, $$6.a(dit.d), 14, -2, 17, $$2);
      this.a($$1, $$6.a(dit.d), 15, -3, 17, $$2);
      dpi $$7 = dcj.I.n();
      dpi $$8 = dcj.aV.n();
      boolean $$9 = $$1.E_().h();
      this.a($$1, $$7, $$3 - 4, $$4 + 4, $$5 + 4, $$2);
      this.a($$1, $$7, $$3 - 3, $$4 + 4, $$5 + 4, $$2);
      this.a($$1, $$7, $$3 - 2, $$4 + 4, $$5 + 4, $$2);
      this.a($$1, $$7, $$3 - 1, $$4 + 4, $$5 + 4, $$2);
      this.a($$1, $$7, $$3, $$4 + 4, $$5 + 4, $$2);
      this.a($$1, $$7, $$3 - 2, $$4 + 3, $$5 + 4, $$2);
      this.a($$1, $$9 ? $$7 : $$8, $$3 - 1, $$4 + 3, $$5 + 4, $$2);
      this.a($$1, !$$9 ? $$7 : $$8, $$3, $$4 + 3, $$5 + 4, $$2);
      this.a($$1, $$7, $$3 - 1, $$4 + 2, $$5 + 4, $$2);
      this.a($$1, $$8, $$3, $$4 + 2, $$5 + 4, $$2);
      this.a($$1, $$7, $$3, $$4 + 1, $$5 + 4, $$2);
   }

   private void b(id $$0, dab $$1, efi $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      dpi $$6 = dcj.aX.n();
      dpi $$7 = dcj.aW.n();
      this.a($$1, $$2, $$3 - 3, $$4 + 1, $$5 - 3, $$3 - 3, $$4 + 1, $$5 + 2, $$6, $$6, true);
      this.a($$1, $$2, $$3 + 3, $$4 + 1, $$5 - 3, $$3 + 3, $$4 + 1, $$5 + 2, $$6, $$6, true);
      this.a($$1, $$2, $$3 - 3, $$4 + 1, $$5 - 3, $$3 + 3, $$4 + 1, $$5 - 2, $$6, $$6, true);
      this.a($$1, $$2, $$3 - 3, $$4 + 1, $$5 + 3, $$3 + 3, $$4 + 1, $$5 + 3, $$6, $$6, true);
      this.a($$1, $$2, $$3 - 3, $$4 + 2, $$5 - 3, $$3 - 3, $$4 + 2, $$5 + 2, $$7, $$7, true);
      this.a($$1, $$2, $$3 + 3, $$4 + 2, $$5 - 3, $$3 + 3, $$4 + 2, $$5 + 2, $$7, $$7, true);
      this.a($$1, $$2, $$3 - 3, $$4 + 2, $$5 - 3, $$3 + 3, $$4 + 2, $$5 - 2, $$7, $$7, true);
      this.a($$1, $$2, $$3 - 3, $$4 + 2, $$5 + 3, $$3 + 3, $$4 + 2, $$5 + 3, $$7, $$7, true);
      this.a($$1, $$2, $$3 - 3, -1, $$5 - 3, $$3 - 3, -1, $$5 + 2, $$6, $$6, true);
      this.a($$1, $$2, $$3 + 3, -1, $$5 - 3, $$3 + 3, -1, $$5 + 2, $$6, $$6, true);
      this.a($$1, $$2, $$3 - 3, -1, $$5 - 3, $$3 + 3, -1, $$5 - 2, $$6, $$6, true);
      this.a($$1, $$2, $$3 - 3, -1, $$5 + 3, $$3 + 3, -1, $$5 + 3, $$6, $$6, true);
      this.a($$3 - 2, $$4 + 1, $$5 - 2, $$3 + 2, $$4 + 3, $$5 + 2);
      this.a($$1, $$2, $$3 - 2, $$4 + 4, $$5 - 2, $$3 + 2, $$5 + 2);
      dpi $$8 = dcj.hk.n();
      dpi $$9 = dcj.hu.n();
      this.a($$1, $$9, $$3, $$4, $$5, $$2);
      this.a($$1, $$8, $$3 + 1, $$4, $$5 - 1, $$2);
      this.a($$1, $$8, $$3 + 1, $$4, $$5 + 1, $$2);
      this.a($$1, $$8, $$3 - 1, $$4, $$5 - 1, $$2);
      this.a($$1, $$8, $$3 - 1, $$4, $$5 + 1, $$2);
      this.a($$1, $$8, $$3 + 2, $$4, $$5, $$2);
      this.a($$1, $$8, $$3 - 2, $$4, $$5, $$2);
      this.a($$1, $$8, $$3, $$4, $$5 + 2, $$2);
      this.a($$1, $$8, $$3, $$4, $$5 - 2, $$2);
      this.a($$1, $$8, $$3 + 3, $$4, $$5, $$2);
      this.c($$3 + 3, $$4 + 1, $$5);
      this.c($$3 + 3, $$4 + 2, $$5);
      this.a($$1, $$6, $$3 + 4, $$4 + 1, $$5, $$2);
      this.a($$1, $$7, $$3 + 4, $$4 + 2, $$5, $$2);
      this.a($$1, $$8, $$3 - 3, $$4, $$5, $$2);
      this.c($$3 - 3, $$4 + 1, $$5);
      this.c($$3 - 3, $$4 + 2, $$5);
      this.a($$1, $$6, $$3 - 4, $$4 + 1, $$5, $$2);
      this.a($$1, $$7, $$3 - 4, $$4 + 2, $$5, $$2);
      this.a($$1, $$8, $$3, $$4, $$5 + 3, $$2);
      this.c($$3, $$4 + 1, $$5 + 3);
      this.c($$3, $$4 + 2, $$5 + 3);
      this.a($$1, $$8, $$3, $$4, $$5 - 3, $$2);
      this.c($$3, $$4 + 1, $$5 - 3);
      this.c($$3, $$4 + 2, $$5 - 3);
      this.a($$1, $$6, $$3, $$4 + 1, $$5 - 4, $$2);
      this.a($$1, $$7, $$3, -2, $$5 - 4, $$2);
   }

   private void c(int $$0, int $$1, int $$2) {
      id $$3 = this.b($$0, $$1, $$2);
      this.k.add($$3);
   }

   private void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = $$1; $$6 <= $$4; $$6++) {
         for (int $$7 = $$0; $$7 <= $$3; $$7++) {
            for (int $$8 = $$2; $$8 <= $$5; $$8++) {
               this.c($$7, $$6, $$8);
            }
         }
      }
   }

   private void a(dab $$0, int $$1, int $$2, int $$3, efi $$4) {
      if ($$0.E_().i() < 0.33F) {
         dpi $$5 = dcj.aV.n();
         this.a($$0, $$5, $$1, $$2, $$3, $$4);
      } else {
         dpi $$6 = dcj.I.n();
         this.a($$0, $$6, $$1, $$2, $$3, $$4);
      }
   }

   private void a(dab $$0, efi $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      for (int $$7 = $$2; $$7 <= $$5; $$7++) {
         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            this.a($$0, $$7, $$3, $$8, $$1);
         }
      }

      axt $$9 = axt.a($$0.C()).e().a(this.b($$2, $$3, $$4));
      int $$10 = $$9.a($$2, $$5);
      int $$11 = $$9.a($$4, $$6);
      this.l = new id(this.a($$10, $$11), this.b($$3), this.b($$10, $$11));
   }

   public List<id> b() {
      return this.k;
   }

   public id c() {
      return this.l;
   }
}
