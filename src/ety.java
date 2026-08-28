import java.util.ArrayList;
import java.util.List;

public class ety extends esb {
   public static final int h = 21;
   public static final int i = 21;
   private final boolean[] j = new boolean[4];
   private final List<iw> k = new ArrayList<>();
   private iw l = iw.c;

   public ety(azz $$0, int $$1, int $$2) {
      super(esu.L, $$1, 64, $$2, 21, 15, 21, a($$0));
   }

   public ety(ua $$0) {
      super(esu.L, $$0);
      this.j[0] = $$0.b("hasPlacedChest0", false);
      this.j[1] = $$0.b("hasPlacedChest1", false);
      this.j[2] = $$0.b("hasPlacedChest2", false);
      this.j[3] = $$0.b("hasPlacedChest3", false);
   }

   @Override
   protected void a(est $$0, ua $$1) {
      super.a($$0, $$1);
      $$1.a("hasPlacedChest0", this.j[0]);
      $$1.a("hasPlacedChest1", this.j[1]);
      $$1.a("hasPlacedChest2", this.j[2]);
      $$1.a("hasPlacedChest3", this.j[3]);
   }

   @Override
   public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
      if (this.a($$0, -$$3.a(3))) {
         this.a($$0, $$4, 0, -4, 0, this.a - 1, 0, this.c - 1, dng.bc.m(), dng.bc.m(), false);

         for (int $$7 = 1; $$7 <= 9; $$7++) {
            this.a($$0, $$4, $$7, $$7, $$7, this.a - 1 - $$7, $$7, this.c - 1 - $$7, dng.bc.m(), dng.bc.m(), false);
            this.a($$0, $$4, $$7 + 1, $$7, $$7 + 1, this.a - 2 - $$7, $$7, this.c - 2 - $$7, dng.a.m(), dng.a.m(), false);
         }

         for (int $$8 = 0; $$8 < this.a; $$8++) {
            for (int $$9 = 0; $$9 < this.c; $$9++) {
               int $$10 = -5;
               this.b($$0, dng.bc.m(), $$8, -5, $$9, $$4);
            }
         }

         ebg $$11 = dng.gc.m().b(dvi.b, jc.c);
         ebg $$12 = dng.gc.m().b(dvi.b, jc.d);
         ebg $$13 = dng.gc.m().b(dvi.b, jc.f);
         ebg $$14 = dng.gc.m().b(dvi.b, jc.e);
         this.a($$0, $$4, 0, 0, 0, 4, 9, 4, dng.bc.m(), dng.a.m(), false);
         this.a($$0, $$4, 1, 10, 1, 3, 10, 3, dng.bc.m(), dng.bc.m(), false);
         this.a($$0, $$11, 2, 10, 0, $$4);
         this.a($$0, $$12, 2, 10, 4, $$4);
         this.a($$0, $$13, 0, 10, 2, $$4);
         this.a($$0, $$14, 4, 10, 2, $$4);
         this.a($$0, $$4, this.a - 5, 0, 0, this.a - 1, 9, 4, dng.bc.m(), dng.a.m(), false);
         this.a($$0, $$4, this.a - 4, 10, 1, this.a - 2, 10, 3, dng.bc.m(), dng.bc.m(), false);
         this.a($$0, $$11, this.a - 3, 10, 0, $$4);
         this.a($$0, $$12, this.a - 3, 10, 4, $$4);
         this.a($$0, $$13, this.a - 5, 10, 2, $$4);
         this.a($$0, $$14, this.a - 1, 10, 2, $$4);
         this.a($$0, $$4, 8, 0, 0, 12, 4, 4, dng.bc.m(), dng.a.m(), false);
         this.a($$0, $$4, 9, 1, 0, 11, 3, 4, dng.a.m(), dng.a.m(), false);
         this.a($$0, dng.be.m(), 9, 1, 1, $$4);
         this.a($$0, dng.be.m(), 9, 2, 1, $$4);
         this.a($$0, dng.be.m(), 9, 3, 1, $$4);
         this.a($$0, dng.be.m(), 10, 3, 1, $$4);
         this.a($$0, dng.be.m(), 11, 3, 1, $$4);
         this.a($$0, dng.be.m(), 11, 2, 1, $$4);
         this.a($$0, dng.be.m(), 11, 1, 1, $$4);
         this.a($$0, $$4, 4, 1, 1, 8, 3, 3, dng.bc.m(), dng.a.m(), false);
         this.a($$0, $$4, 4, 1, 2, 8, 2, 2, dng.a.m(), dng.a.m(), false);
         this.a($$0, $$4, 12, 1, 1, 16, 3, 3, dng.bc.m(), dng.a.m(), false);
         this.a($$0, $$4, 12, 1, 2, 16, 2, 2, dng.a.m(), dng.a.m(), false);
         this.a($$0, $$4, 5, 4, 5, this.a - 6, 4, this.c - 6, dng.bc.m(), dng.bc.m(), false);
         this.a($$0, $$4, 9, 4, 9, 11, 4, 11, dng.a.m(), dng.a.m(), false);
         this.a($$0, $$4, 8, 1, 8, 8, 3, 8, dng.be.m(), dng.be.m(), false);
         this.a($$0, $$4, 12, 1, 8, 12, 3, 8, dng.be.m(), dng.be.m(), false);
         this.a($$0, $$4, 8, 1, 12, 8, 3, 12, dng.be.m(), dng.be.m(), false);
         this.a($$0, $$4, 12, 1, 12, 12, 3, 12, dng.be.m(), dng.be.m(), false);
         this.a($$0, $$4, 1, 1, 5, 4, 4, 11, dng.bc.m(), dng.bc.m(), false);
         this.a($$0, $$4, this.a - 5, 1, 5, this.a - 2, 4, 11, dng.bc.m(), dng.bc.m(), false);
         this.a($$0, $$4, 6, 7, 9, 6, 7, 11, dng.bc.m(), dng.bc.m(), false);
         this.a($$0, $$4, this.a - 7, 7, 9, this.a - 7, 7, 11, dng.bc.m(), dng.bc.m(), false);
         this.a($$0, $$4, 5, 5, 9, 5, 7, 11, dng.be.m(), dng.be.m(), false);
         this.a($$0, $$4, this.a - 6, 5, 9, this.a - 6, 7, 11, dng.be.m(), dng.be.m(), false);
         this.a($$0, dng.a.m(), 5, 5, 10, $$4);
         this.a($$0, dng.a.m(), 5, 6, 10, $$4);
         this.a($$0, dng.a.m(), 6, 6, 10, $$4);
         this.a($$0, dng.a.m(), this.a - 6, 5, 10, $$4);
         this.a($$0, dng.a.m(), this.a - 6, 6, 10, $$4);
         this.a($$0, dng.a.m(), this.a - 7, 6, 10, $$4);
         this.a($$0, $$4, 2, 4, 4, 2, 6, 4, dng.a.m(), dng.a.m(), false);
         this.a($$0, $$4, this.a - 3, 4, 4, this.a - 3, 6, 4, dng.a.m(), dng.a.m(), false);
         this.a($$0, $$11, 2, 4, 5, $$4);
         this.a($$0, $$11, 2, 3, 4, $$4);
         this.a($$0, $$11, this.a - 3, 4, 5, $$4);
         this.a($$0, $$11, this.a - 3, 3, 4, $$4);
         this.a($$0, $$4, 1, 1, 3, 2, 2, 3, dng.bc.m(), dng.bc.m(), false);
         this.a($$0, $$4, this.a - 3, 1, 3, this.a - 2, 2, 3, dng.bc.m(), dng.bc.m(), false);
         this.a($$0, dng.bc.m(), 1, 1, 2, $$4);
         this.a($$0, dng.bc.m(), this.a - 2, 1, 2, $$4);
         this.a($$0, dng.ki.m(), 1, 2, 2, $$4);
         this.a($$0, dng.ki.m(), this.a - 2, 2, 2, $$4);
         this.a($$0, $$14, 2, 1, 2, $$4);
         this.a($$0, $$13, this.a - 3, 1, 2, $$4);
         this.a($$0, $$4, 4, 3, 5, 4, 3, 17, dng.bc.m(), dng.bc.m(), false);
         this.a($$0, $$4, this.a - 5, 3, 5, this.a - 5, 3, 17, dng.bc.m(), dng.bc.m(), false);
         this.a($$0, $$4, 3, 1, 5, 4, 2, 16, dng.a.m(), dng.a.m(), false);
         this.a($$0, $$4, this.a - 6, 1, 5, this.a - 5, 2, 16, dng.a.m(), dng.a.m(), false);

         for (int $$15 = 5; $$15 <= 17; $$15 += 2) {
            this.a($$0, dng.be.m(), 4, 1, $$15, $$4);
            this.a($$0, dng.bd.m(), 4, 2, $$15, $$4);
            this.a($$0, dng.be.m(), this.a - 5, 1, $$15, $$4);
            this.a($$0, dng.bd.m(), this.a - 5, 2, $$15, $$4);
         }

         this.a($$0, dng.hL.m(), 10, 0, 7, $$4);
         this.a($$0, dng.hL.m(), 10, 0, 8, $$4);
         this.a($$0, dng.hL.m(), 9, 0, 9, $$4);
         this.a($$0, dng.hL.m(), 11, 0, 9, $$4);
         this.a($$0, dng.hL.m(), 8, 0, 10, $$4);
         this.a($$0, dng.hL.m(), 12, 0, 10, $$4);
         this.a($$0, dng.hL.m(), 7, 0, 10, $$4);
         this.a($$0, dng.hL.m(), 13, 0, 10, $$4);
         this.a($$0, dng.hL.m(), 9, 0, 11, $$4);
         this.a($$0, dng.hL.m(), 11, 0, 11, $$4);
         this.a($$0, dng.hL.m(), 10, 0, 12, $$4);
         this.a($$0, dng.hL.m(), 10, 0, 13, $$4);
         this.a($$0, dng.hV.m(), 10, 0, 10, $$4);

         for (int $$16 = 0; $$16 <= this.a - 1; $$16 += this.a - 1) {
            this.a($$0, dng.be.m(), $$16, 2, 1, $$4);
            this.a($$0, dng.hL.m(), $$16, 2, 2, $$4);
            this.a($$0, dng.be.m(), $$16, 2, 3, $$4);
            this.a($$0, dng.be.m(), $$16, 3, 1, $$4);
            this.a($$0, dng.hL.m(), $$16, 3, 2, $$4);
            this.a($$0, dng.be.m(), $$16, 3, 3, $$4);
            this.a($$0, dng.hL.m(), $$16, 4, 1, $$4);
            this.a($$0, dng.bd.m(), $$16, 4, 2, $$4);
            this.a($$0, dng.hL.m(), $$16, 4, 3, $$4);
            this.a($$0, dng.be.m(), $$16, 5, 1, $$4);
            this.a($$0, dng.hL.m(), $$16, 5, 2, $$4);
            this.a($$0, dng.be.m(), $$16, 5, 3, $$4);
            this.a($$0, dng.hL.m(), $$16, 6, 1, $$4);
            this.a($$0, dng.bd.m(), $$16, 6, 2, $$4);
            this.a($$0, dng.hL.m(), $$16, 6, 3, $$4);
            this.a($$0, dng.hL.m(), $$16, 7, 1, $$4);
            this.a($$0, dng.hL.m(), $$16, 7, 2, $$4);
            this.a($$0, dng.hL.m(), $$16, 7, 3, $$4);
            this.a($$0, dng.be.m(), $$16, 8, 1, $$4);
            this.a($$0, dng.be.m(), $$16, 8, 2, $$4);
            this.a($$0, dng.be.m(), $$16, 8, 3, $$4);
         }

         for (int $$17 = 2; $$17 <= this.a - 3; $$17 += this.a - 3 - 2) {
            this.a($$0, dng.be.m(), $$17 - 1, 2, 0, $$4);
            this.a($$0, dng.hL.m(), $$17, 2, 0, $$4);
            this.a($$0, dng.be.m(), $$17 + 1, 2, 0, $$4);
            this.a($$0, dng.be.m(), $$17 - 1, 3, 0, $$4);
            this.a($$0, dng.hL.m(), $$17, 3, 0, $$4);
            this.a($$0, dng.be.m(), $$17 + 1, 3, 0, $$4);
            this.a($$0, dng.hL.m(), $$17 - 1, 4, 0, $$4);
            this.a($$0, dng.bd.m(), $$17, 4, 0, $$4);
            this.a($$0, dng.hL.m(), $$17 + 1, 4, 0, $$4);
            this.a($$0, dng.be.m(), $$17 - 1, 5, 0, $$4);
            this.a($$0, dng.hL.m(), $$17, 5, 0, $$4);
            this.a($$0, dng.be.m(), $$17 + 1, 5, 0, $$4);
            this.a($$0, dng.hL.m(), $$17 - 1, 6, 0, $$4);
            this.a($$0, dng.bd.m(), $$17, 6, 0, $$4);
            this.a($$0, dng.hL.m(), $$17 + 1, 6, 0, $$4);
            this.a($$0, dng.hL.m(), $$17 - 1, 7, 0, $$4);
            this.a($$0, dng.hL.m(), $$17, 7, 0, $$4);
            this.a($$0, dng.hL.m(), $$17 + 1, 7, 0, $$4);
            this.a($$0, dng.be.m(), $$17 - 1, 8, 0, $$4);
            this.a($$0, dng.be.m(), $$17, 8, 0, $$4);
            this.a($$0, dng.be.m(), $$17 + 1, 8, 0, $$4);
         }

         this.a($$0, $$4, 8, 4, 0, 12, 6, 0, dng.be.m(), dng.be.m(), false);
         this.a($$0, dng.a.m(), 8, 6, 0, $$4);
         this.a($$0, dng.a.m(), 12, 6, 0, $$4);
         this.a($$0, dng.hL.m(), 9, 5, 0, $$4);
         this.a($$0, dng.bd.m(), 10, 5, 0, $$4);
         this.a($$0, dng.hL.m(), 11, 5, 0, $$4);
         this.a($$0, $$4, 8, -14, 8, 12, -11, 12, dng.be.m(), dng.be.m(), false);
         this.a($$0, $$4, 8, -10, 8, 12, -10, 12, dng.bd.m(), dng.bd.m(), false);
         this.a($$0, $$4, 8, -9, 8, 12, -9, 12, dng.be.m(), dng.be.m(), false);
         this.a($$0, $$4, 8, -8, 8, 12, -1, 12, dng.bc.m(), dng.bc.m(), false);
         this.a($$0, $$4, 9, -11, 9, 11, -1, 11, dng.a.m(), dng.a.m(), false);
         this.a($$0, dng.dM.m(), 10, -11, 10, $$4);
         this.a($$0, $$4, 9, -13, 9, 11, -13, 11, dng.cu.m(), dng.a.m(), false);
         this.a($$0, dng.a.m(), 8, -11, 10, $$4);
         this.a($$0, dng.a.m(), 8, -10, 10, $$4);
         this.a($$0, dng.bd.m(), 7, -10, 10, $$4);
         this.a($$0, dng.be.m(), 7, -11, 10, $$4);
         this.a($$0, dng.a.m(), 12, -11, 10, $$4);
         this.a($$0, dng.a.m(), 12, -10, 10, $$4);
         this.a($$0, dng.bd.m(), 13, -10, 10, $$4);
         this.a($$0, dng.be.m(), 13, -11, 10, $$4);
         this.a($$0, dng.a.m(), 10, -11, 8, $$4);
         this.a($$0, dng.a.m(), 10, -10, 8, $$4);
         this.a($$0, dng.bd.m(), 10, -10, 7, $$4);
         this.a($$0, dng.be.m(), 10, -11, 7, $$4);
         this.a($$0, dng.a.m(), 10, -11, 12, $$4);
         this.a($$0, dng.a.m(), 10, -10, 12, $$4);
         this.a($$0, dng.bd.m(), 10, -10, 13, $$4);
         this.a($$0, dng.be.m(), 10, -11, 13, $$4);

         for (jc $$18 : jc.c.a) {
            if (!this.j[$$18.e()]) {
               int $$19 = $$18.j() * 2;
               int $$20 = $$18.l() * 2;
               this.j[$$18.e()] = this.a($$0, $$4, $$3, 10 + $$19, -11, 10 + $$20, faf.y);
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dky $$0, erv $$1) {
      iw $$2 = new iw(16, -4, 13);
      this.a($$2, $$0, $$1);
      this.b($$2, $$0, $$1);
   }

   private void a(iw $$0, dky $$1, erv $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      ebg $$6 = dng.gc.m();
      this.a($$1, $$6.a(dty.d), 13, -1, 17, $$2);
      this.a($$1, $$6.a(dty.d), 14, -2, 17, $$2);
      this.a($$1, $$6.a(dty.d), 15, -3, 17, $$2);
      ebg $$7 = dng.L.m();
      ebg $$8 = dng.bc.m();
      boolean $$9 = $$1.G_().h();
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

   private void b(iw $$0, dky $$1, erv $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      ebg $$6 = dng.be.m();
      ebg $$7 = dng.bd.m();
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
      ebg $$8 = dng.hL.m();
      ebg $$9 = dng.hV.m();
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
      iw $$3 = this.b($$0, $$1, $$2);
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

   private void a(dky $$0, int $$1, int $$2, int $$3, erv $$4) {
      if ($$0.G_().i() < 0.33F) {
         ebg $$5 = dng.bc.m();
         this.a($$0, $$5, $$1, $$2, $$3, $$4);
      } else {
         ebg $$6 = dng.L.m();
         this.a($$0, $$6, $$1, $$2, $$3, $$4);
      }
   }

   private void a(dky $$0, erv $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      for (int $$7 = $$2; $$7 <= $$5; $$7++) {
         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            this.a($$0, $$7, $$3, $$8, $$1);
         }
      }

      azz $$9 = azz.a($$0.E()).e().a(this.b($$2, $$3, $$4));
      int $$10 = $$9.a($$2, $$5);
      int $$11 = $$9.a($$4, $$6);
      this.l = new iw(this.a($$10, $$11), this.b($$3), this.b($$10, $$11));
   }

   public List<iw> b() {
      return this.k;
   }

   public iw c() {
      return this.l;
   }
}
