import java.util.ArrayList;
import java.util.List;

public class ejz extends eid {
   public static final int h = 21;
   public static final int i = 21;
   private final boolean[] j = new boolean[4];
   private final List<iz> k = new ArrayList<>();
   private iz l = iz.c;

   public ejz(azc $$0, int $$1, int $$2) {
      super(eiw.L, $$1, 64, $$2, 21, 15, 21, a($$0));
   }

   public ejz(ur $$0) {
      super(eiw.L, $$0);
      this.j[0] = $$0.q("hasPlacedChest0");
      this.j[1] = $$0.q("hasPlacedChest1");
      this.j[2] = $$0.q("hasPlacedChest2");
      this.j[3] = $$0.q("hasPlacedChest3");
   }

   @Override
   protected void a(eiv $$0, ur $$1) {
      super.a($$0, $$1);
      $$1.a("hasPlacedChest0", this.j[0]);
      $$1.a("hasPlacedChest1", this.j[1]);
      $$1.a("hasPlacedChest2", this.j[2]);
      $$1.a("hasPlacedChest3", this.j[3]);
   }

   @Override
   public void a(dco $$0, dcm $$1, dtu $$2, azc $$3, ehx $$4, dba $$5, iz $$6) {
      if (this.a($$0, -$$3.a(3))) {
         this.a($$0, $$4, 0, -4, 0, this.a - 1, 0, this.c - 1, dew.aV.n(), dew.aV.n(), false);

         for (int $$7 = 1; $$7 <= 9; $$7++) {
            this.a($$0, $$4, $$7, $$7, $$7, this.a - 1 - $$7, $$7, this.c - 1 - $$7, dew.aV.n(), dew.aV.n(), false);
            this.a($$0, $$4, $$7 + 1, $$7, $$7 + 1, this.a - 2 - $$7, $$7, this.c - 2 - $$7, dew.a.n(), dew.a.n(), false);
         }

         for (int $$8 = 0; $$8 < this.a; $$8++) {
            for (int $$9 = 0; $$9 < this.c; $$9++) {
               int $$10 = -5;
               this.b($$0, dew.aV.n(), $$8, -5, $$9, $$4);
            }
         }

         drx $$11 = dew.fD.n().a(dmo.b, je.c);
         drx $$12 = dew.fD.n().a(dmo.b, je.d);
         drx $$13 = dew.fD.n().a(dmo.b, je.f);
         drx $$14 = dew.fD.n().a(dmo.b, je.e);
         this.a($$0, $$4, 0, 0, 0, 4, 9, 4, dew.aV.n(), dew.a.n(), false);
         this.a($$0, $$4, 1, 10, 1, 3, 10, 3, dew.aV.n(), dew.aV.n(), false);
         this.a($$0, $$11, 2, 10, 0, $$4);
         this.a($$0, $$12, 2, 10, 4, $$4);
         this.a($$0, $$13, 0, 10, 2, $$4);
         this.a($$0, $$14, 4, 10, 2, $$4);
         this.a($$0, $$4, this.a - 5, 0, 0, this.a - 1, 9, 4, dew.aV.n(), dew.a.n(), false);
         this.a($$0, $$4, this.a - 4, 10, 1, this.a - 2, 10, 3, dew.aV.n(), dew.aV.n(), false);
         this.a($$0, $$11, this.a - 3, 10, 0, $$4);
         this.a($$0, $$12, this.a - 3, 10, 4, $$4);
         this.a($$0, $$13, this.a - 5, 10, 2, $$4);
         this.a($$0, $$14, this.a - 1, 10, 2, $$4);
         this.a($$0, $$4, 8, 0, 0, 12, 4, 4, dew.aV.n(), dew.a.n(), false);
         this.a($$0, $$4, 9, 1, 0, 11, 3, 4, dew.a.n(), dew.a.n(), false);
         this.a($$0, dew.aX.n(), 9, 1, 1, $$4);
         this.a($$0, dew.aX.n(), 9, 2, 1, $$4);
         this.a($$0, dew.aX.n(), 9, 3, 1, $$4);
         this.a($$0, dew.aX.n(), 10, 3, 1, $$4);
         this.a($$0, dew.aX.n(), 11, 3, 1, $$4);
         this.a($$0, dew.aX.n(), 11, 2, 1, $$4);
         this.a($$0, dew.aX.n(), 11, 1, 1, $$4);
         this.a($$0, $$4, 4, 1, 1, 8, 3, 3, dew.aV.n(), dew.a.n(), false);
         this.a($$0, $$4, 4, 1, 2, 8, 2, 2, dew.a.n(), dew.a.n(), false);
         this.a($$0, $$4, 12, 1, 1, 16, 3, 3, dew.aV.n(), dew.a.n(), false);
         this.a($$0, $$4, 12, 1, 2, 16, 2, 2, dew.a.n(), dew.a.n(), false);
         this.a($$0, $$4, 5, 4, 5, this.a - 6, 4, this.c - 6, dew.aV.n(), dew.aV.n(), false);
         this.a($$0, $$4, 9, 4, 9, 11, 4, 11, dew.a.n(), dew.a.n(), false);
         this.a($$0, $$4, 8, 1, 8, 8, 3, 8, dew.aX.n(), dew.aX.n(), false);
         this.a($$0, $$4, 12, 1, 8, 12, 3, 8, dew.aX.n(), dew.aX.n(), false);
         this.a($$0, $$4, 8, 1, 12, 8, 3, 12, dew.aX.n(), dew.aX.n(), false);
         this.a($$0, $$4, 12, 1, 12, 12, 3, 12, dew.aX.n(), dew.aX.n(), false);
         this.a($$0, $$4, 1, 1, 5, 4, 4, 11, dew.aV.n(), dew.aV.n(), false);
         this.a($$0, $$4, this.a - 5, 1, 5, this.a - 2, 4, 11, dew.aV.n(), dew.aV.n(), false);
         this.a($$0, $$4, 6, 7, 9, 6, 7, 11, dew.aV.n(), dew.aV.n(), false);
         this.a($$0, $$4, this.a - 7, 7, 9, this.a - 7, 7, 11, dew.aV.n(), dew.aV.n(), false);
         this.a($$0, $$4, 5, 5, 9, 5, 7, 11, dew.aX.n(), dew.aX.n(), false);
         this.a($$0, $$4, this.a - 6, 5, 9, this.a - 6, 7, 11, dew.aX.n(), dew.aX.n(), false);
         this.a($$0, dew.a.n(), 5, 5, 10, $$4);
         this.a($$0, dew.a.n(), 5, 6, 10, $$4);
         this.a($$0, dew.a.n(), 6, 6, 10, $$4);
         this.a($$0, dew.a.n(), this.a - 6, 5, 10, $$4);
         this.a($$0, dew.a.n(), this.a - 6, 6, 10, $$4);
         this.a($$0, dew.a.n(), this.a - 7, 6, 10, $$4);
         this.a($$0, $$4, 2, 4, 4, 2, 6, 4, dew.a.n(), dew.a.n(), false);
         this.a($$0, $$4, this.a - 3, 4, 4, this.a - 3, 6, 4, dew.a.n(), dew.a.n(), false);
         this.a($$0, $$11, 2, 4, 5, $$4);
         this.a($$0, $$11, 2, 3, 4, $$4);
         this.a($$0, $$11, this.a - 3, 4, 5, $$4);
         this.a($$0, $$11, this.a - 3, 3, 4, $$4);
         this.a($$0, $$4, 1, 1, 3, 2, 2, 3, dew.aV.n(), dew.aV.n(), false);
         this.a($$0, $$4, this.a - 3, 1, 3, this.a - 2, 2, 3, dew.aV.n(), dew.aV.n(), false);
         this.a($$0, dew.aV.n(), 1, 1, 2, $$4);
         this.a($$0, dew.aV.n(), this.a - 2, 1, 2, $$4);
         this.a($$0, dew.jF.n(), 1, 2, 2, $$4);
         this.a($$0, dew.jF.n(), this.a - 2, 2, 2, $$4);
         this.a($$0, $$14, 2, 1, 2, $$4);
         this.a($$0, $$13, this.a - 3, 1, 2, $$4);
         this.a($$0, $$4, 4, 3, 5, 4, 3, 17, dew.aV.n(), dew.aV.n(), false);
         this.a($$0, $$4, this.a - 5, 3, 5, this.a - 5, 3, 17, dew.aV.n(), dew.aV.n(), false);
         this.a($$0, $$4, 3, 1, 5, 4, 2, 16, dew.a.n(), dew.a.n(), false);
         this.a($$0, $$4, this.a - 6, 1, 5, this.a - 5, 2, 16, dew.a.n(), dew.a.n(), false);

         for (int $$15 = 5; $$15 <= 17; $$15 += 2) {
            this.a($$0, dew.aX.n(), 4, 1, $$15, $$4);
            this.a($$0, dew.aW.n(), 4, 2, $$15, $$4);
            this.a($$0, dew.aX.n(), this.a - 5, 1, $$15, $$4);
            this.a($$0, dew.aW.n(), this.a - 5, 2, $$15, $$4);
         }

         this.a($$0, dew.hk.n(), 10, 0, 7, $$4);
         this.a($$0, dew.hk.n(), 10, 0, 8, $$4);
         this.a($$0, dew.hk.n(), 9, 0, 9, $$4);
         this.a($$0, dew.hk.n(), 11, 0, 9, $$4);
         this.a($$0, dew.hk.n(), 8, 0, 10, $$4);
         this.a($$0, dew.hk.n(), 12, 0, 10, $$4);
         this.a($$0, dew.hk.n(), 7, 0, 10, $$4);
         this.a($$0, dew.hk.n(), 13, 0, 10, $$4);
         this.a($$0, dew.hk.n(), 9, 0, 11, $$4);
         this.a($$0, dew.hk.n(), 11, 0, 11, $$4);
         this.a($$0, dew.hk.n(), 10, 0, 12, $$4);
         this.a($$0, dew.hk.n(), 10, 0, 13, $$4);
         this.a($$0, dew.hu.n(), 10, 0, 10, $$4);

         for (int $$16 = 0; $$16 <= this.a - 1; $$16 += this.a - 1) {
            this.a($$0, dew.aX.n(), $$16, 2, 1, $$4);
            this.a($$0, dew.hk.n(), $$16, 2, 2, $$4);
            this.a($$0, dew.aX.n(), $$16, 2, 3, $$4);
            this.a($$0, dew.aX.n(), $$16, 3, 1, $$4);
            this.a($$0, dew.hk.n(), $$16, 3, 2, $$4);
            this.a($$0, dew.aX.n(), $$16, 3, 3, $$4);
            this.a($$0, dew.hk.n(), $$16, 4, 1, $$4);
            this.a($$0, dew.aW.n(), $$16, 4, 2, $$4);
            this.a($$0, dew.hk.n(), $$16, 4, 3, $$4);
            this.a($$0, dew.aX.n(), $$16, 5, 1, $$4);
            this.a($$0, dew.hk.n(), $$16, 5, 2, $$4);
            this.a($$0, dew.aX.n(), $$16, 5, 3, $$4);
            this.a($$0, dew.hk.n(), $$16, 6, 1, $$4);
            this.a($$0, dew.aW.n(), $$16, 6, 2, $$4);
            this.a($$0, dew.hk.n(), $$16, 6, 3, $$4);
            this.a($$0, dew.hk.n(), $$16, 7, 1, $$4);
            this.a($$0, dew.hk.n(), $$16, 7, 2, $$4);
            this.a($$0, dew.hk.n(), $$16, 7, 3, $$4);
            this.a($$0, dew.aX.n(), $$16, 8, 1, $$4);
            this.a($$0, dew.aX.n(), $$16, 8, 2, $$4);
            this.a($$0, dew.aX.n(), $$16, 8, 3, $$4);
         }

         for (int $$17 = 2; $$17 <= this.a - 3; $$17 += this.a - 3 - 2) {
            this.a($$0, dew.aX.n(), $$17 - 1, 2, 0, $$4);
            this.a($$0, dew.hk.n(), $$17, 2, 0, $$4);
            this.a($$0, dew.aX.n(), $$17 + 1, 2, 0, $$4);
            this.a($$0, dew.aX.n(), $$17 - 1, 3, 0, $$4);
            this.a($$0, dew.hk.n(), $$17, 3, 0, $$4);
            this.a($$0, dew.aX.n(), $$17 + 1, 3, 0, $$4);
            this.a($$0, dew.hk.n(), $$17 - 1, 4, 0, $$4);
            this.a($$0, dew.aW.n(), $$17, 4, 0, $$4);
            this.a($$0, dew.hk.n(), $$17 + 1, 4, 0, $$4);
            this.a($$0, dew.aX.n(), $$17 - 1, 5, 0, $$4);
            this.a($$0, dew.hk.n(), $$17, 5, 0, $$4);
            this.a($$0, dew.aX.n(), $$17 + 1, 5, 0, $$4);
            this.a($$0, dew.hk.n(), $$17 - 1, 6, 0, $$4);
            this.a($$0, dew.aW.n(), $$17, 6, 0, $$4);
            this.a($$0, dew.hk.n(), $$17 + 1, 6, 0, $$4);
            this.a($$0, dew.hk.n(), $$17 - 1, 7, 0, $$4);
            this.a($$0, dew.hk.n(), $$17, 7, 0, $$4);
            this.a($$0, dew.hk.n(), $$17 + 1, 7, 0, $$4);
            this.a($$0, dew.aX.n(), $$17 - 1, 8, 0, $$4);
            this.a($$0, dew.aX.n(), $$17, 8, 0, $$4);
            this.a($$0, dew.aX.n(), $$17 + 1, 8, 0, $$4);
         }

         this.a($$0, $$4, 8, 4, 0, 12, 6, 0, dew.aX.n(), dew.aX.n(), false);
         this.a($$0, dew.a.n(), 8, 6, 0, $$4);
         this.a($$0, dew.a.n(), 12, 6, 0, $$4);
         this.a($$0, dew.hk.n(), 9, 5, 0, $$4);
         this.a($$0, dew.aW.n(), 10, 5, 0, $$4);
         this.a($$0, dew.hk.n(), 11, 5, 0, $$4);
         this.a($$0, $$4, 8, -14, 8, 12, -11, 12, dew.aX.n(), dew.aX.n(), false);
         this.a($$0, $$4, 8, -10, 8, 12, -10, 12, dew.aW.n(), dew.aW.n(), false);
         this.a($$0, $$4, 8, -9, 8, 12, -9, 12, dew.aX.n(), dew.aX.n(), false);
         this.a($$0, $$4, 8, -8, 8, 12, -1, 12, dew.aV.n(), dew.aV.n(), false);
         this.a($$0, $$4, 9, -11, 9, 11, -1, 11, dew.a.n(), dew.a.n(), false);
         this.a($$0, dew.dx.n(), 10, -11, 10, $$4);
         this.a($$0, $$4, 9, -13, 9, 11, -13, 11, dew.ck.n(), dew.a.n(), false);
         this.a($$0, dew.a.n(), 8, -11, 10, $$4);
         this.a($$0, dew.a.n(), 8, -10, 10, $$4);
         this.a($$0, dew.aW.n(), 7, -10, 10, $$4);
         this.a($$0, dew.aX.n(), 7, -11, 10, $$4);
         this.a($$0, dew.a.n(), 12, -11, 10, $$4);
         this.a($$0, dew.a.n(), 12, -10, 10, $$4);
         this.a($$0, dew.aW.n(), 13, -10, 10, $$4);
         this.a($$0, dew.aX.n(), 13, -11, 10, $$4);
         this.a($$0, dew.a.n(), 10, -11, 8, $$4);
         this.a($$0, dew.a.n(), 10, -10, 8, $$4);
         this.a($$0, dew.aW.n(), 10, -10, 7, $$4);
         this.a($$0, dew.aX.n(), 10, -11, 7, $$4);
         this.a($$0, dew.a.n(), 10, -11, 12, $$4);
         this.a($$0, dew.a.n(), 10, -10, 12, $$4);
         this.a($$0, dew.aW.n(), 10, -10, 13, $$4);
         this.a($$0, dew.aX.n(), 10, -11, 13, $$4);

         for (je $$18 : je.c.a) {
            if (!this.j[$$18.e()]) {
               int $$19 = $$18.j() * 2;
               int $$20 = $$18.l() * 2;
               this.j[$$18.e()] = this.a($$0, $$4, $$3, 10 + $$19, -11, 10 + $$20, epz.z);
            }
         }

         this.a($$0, $$4);
      }
   }

   private void a(dco $$0, ehx $$1) {
      iz $$2 = new iz(16, -4, 13);
      this.a($$2, $$0, $$1);
      this.b($$2, $$0, $$1);
   }

   private void a(iz $$0, dco $$1, ehx $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      drx $$6 = dew.fD.n();
      this.a($$1, $$6.a(dlh.d), 13, -1, 17, $$2);
      this.a($$1, $$6.a(dlh.d), 14, -2, 17, $$2);
      this.a($$1, $$6.a(dlh.d), 15, -3, 17, $$2);
      drx $$7 = dew.I.n();
      drx $$8 = dew.aV.n();
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

   private void b(iz $$0, dco $$1, ehx $$2) {
      int $$3 = $$0.u();
      int $$4 = $$0.v();
      int $$5 = $$0.w();
      drx $$6 = dew.aX.n();
      drx $$7 = dew.aW.n();
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
      drx $$8 = dew.hk.n();
      drx $$9 = dew.hu.n();
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
      iz $$3 = this.b($$0, $$1, $$2);
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

   private void a(dco $$0, int $$1, int $$2, int $$3, ehx $$4) {
      if ($$0.E_().i() < 0.33F) {
         drx $$5 = dew.aV.n();
         this.a($$0, $$5, $$1, $$2, $$3, $$4);
      } else {
         drx $$6 = dew.I.n();
         this.a($$0, $$6, $$1, $$2, $$3, $$4);
      }
   }

   private void a(dco $$0, ehx $$1, int $$2, int $$3, int $$4, int $$5, int $$6) {
      for (int $$7 = $$2; $$7 <= $$5; $$7++) {
         for (int $$8 = $$4; $$8 <= $$6; $$8++) {
            this.a($$0, $$7, $$3, $$8, $$1);
         }
      }

      azc $$9 = azc.a($$0.C()).e().a(this.b($$2, $$3, $$4));
      int $$10 = $$9.a($$2, $$5);
      int $$11 = $$9.a($$4, $$6);
      this.l = new iz(this.a($$10, $$11), this.b($$3), this.b($$10, $$11));
   }

   public List<iz> b() {
      return this.k;
   }

   public iz c() {
      return this.l;
   }
}
