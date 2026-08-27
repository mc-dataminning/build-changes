import com.google.common.collect.Lists;
import java.util.List;

public class dzx {
   static final ebj a = a(cvh.I, cvh.J, efa.aG);
   static final ebj b = a(cvh.L, cvh.M, efa.aH);
   private static final agm[] c = new agm[]{
      new agm("underwater_ruin/warm_1"),
      new agm("underwater_ruin/warm_2"),
      new agm("underwater_ruin/warm_3"),
      new agm("underwater_ruin/warm_4"),
      new agm("underwater_ruin/warm_5"),
      new agm("underwater_ruin/warm_6"),
      new agm("underwater_ruin/warm_7"),
      new agm("underwater_ruin/warm_8")
   };
   private static final agm[] d = new agm[]{
      new agm("underwater_ruin/brick_1"),
      new agm("underwater_ruin/brick_2"),
      new agm("underwater_ruin/brick_3"),
      new agm("underwater_ruin/brick_4"),
      new agm("underwater_ruin/brick_5"),
      new agm("underwater_ruin/brick_6"),
      new agm("underwater_ruin/brick_7"),
      new agm("underwater_ruin/brick_8")
   };
   private static final agm[] e = new agm[]{
      new agm("underwater_ruin/cracked_1"),
      new agm("underwater_ruin/cracked_2"),
      new agm("underwater_ruin/cracked_3"),
      new agm("underwater_ruin/cracked_4"),
      new agm("underwater_ruin/cracked_5"),
      new agm("underwater_ruin/cracked_6"),
      new agm("underwater_ruin/cracked_7"),
      new agm("underwater_ruin/cracked_8")
   };
   private static final agm[] f = new agm[]{
      new agm("underwater_ruin/mossy_1"),
      new agm("underwater_ruin/mossy_2"),
      new agm("underwater_ruin/mossy_3"),
      new agm("underwater_ruin/mossy_4"),
      new agm("underwater_ruin/mossy_5"),
      new agm("underwater_ruin/mossy_6"),
      new agm("underwater_ruin/mossy_7"),
      new agm("underwater_ruin/mossy_8")
   };
   private static final agm[] g = new agm[]{
      new agm("underwater_ruin/big_brick_1"),
      new agm("underwater_ruin/big_brick_2"),
      new agm("underwater_ruin/big_brick_3"),
      new agm("underwater_ruin/big_brick_8")
   };
   private static final agm[] h = new agm[]{
      new agm("underwater_ruin/big_mossy_1"),
      new agm("underwater_ruin/big_mossy_2"),
      new agm("underwater_ruin/big_mossy_3"),
      new agm("underwater_ruin/big_mossy_8")
   };
   private static final agm[] i = new agm[]{
      new agm("underwater_ruin/big_cracked_1"),
      new agm("underwater_ruin/big_cracked_2"),
      new agm("underwater_ruin/big_cracked_3"),
      new agm("underwater_ruin/big_cracked_8")
   };
   private static final agm[] j = new agm[]{
      new agm("underwater_ruin/big_warm_4"),
      new agm("underwater_ruin/big_warm_5"),
      new agm("underwater_ruin/big_warm_6"),
      new agm("underwater_ruin/big_warm_7")
   };

   private static ebj a(cvf $$0, cvf $$1, agm $$2) {
      return new eas(new ebf(List.of(new ebb(new eap($$0), eak.b, eay.b, $$1.o(), new ebq($$2)))), bid.a(5));
   }

   private static agm a(atw $$0) {
      return ac.a(c, $$0);
   }

   private static agm b(atw $$0) {
      return ac.a(j, $$0);
   }

   public static void a(ebn $$0, hx $$1, dbr $$2, dxr $$3, atw $$4, dzy $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(ebn $$0, atw $$1, dbr $$2, hx $$3, dzy $$4, dxr $$5) {
      hx $$6 = new hx($$3.u(), 90, $$3.w());
      hx $$7 = ebm.a(new hx(15, 0, 15), dab.a, $$2, hx.b).a((ja)$$6);
      dxe $$8 = dxe.a($$6, $$7);
      hx $$9 = new hx(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<hx> $$10 = a($$1, $$9);
      int $$11 = atq.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            hx $$14 = $$10.remove($$13);
            dbr $$15 = dbr.a($$1);
            hx $$16 = ebm.a(new hx(5, 0, 6), dab.a, $$15, hx.b).a((ja)$$14);
            dxe $$17 = dxe.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<hx> a(atw $$0, hx $$1) {
      List<hx> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + atq.a($$0, 1, 8), 0, 16 + atq.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + atq.a($$0, 1, 8), 0, atq.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + atq.a($$0, 1, 8), 0, -16 + atq.a($$0, 4, 8)));
      $$2.add($$1.b(atq.a($$0, 1, 7), 0, 16 + atq.a($$0, 1, 7)));
      $$2.add($$1.b(atq.a($$0, 1, 7), 0, -16 + atq.a($$0, 4, 6)));
      $$2.add($$1.b(16 + atq.a($$0, 1, 7), 0, 16 + atq.a($$0, 3, 8)));
      $$2.add($$1.b(16 + atq.a($$0, 1, 7), 0, atq.a($$0, 1, 7)));
      $$2.add($$1.b(16 + atq.a($$0, 1, 7), 0, -16 + atq.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(ebn $$0, hx $$1, dbr $$2, dxr $$3, atw $$4, dzy $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            agm $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new dzx.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            agm[] $$9 = $$6 ? g : d;
            agm[] $$10 = $$6 ? i : e;
            agm[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new dzx.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new dzx.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new dzx.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dxw {
      private final dzy.a h;
      private final float i;
      private final boolean j;

      public a(ebn $$0, agm $$1, hx $$2, dbr $$3, float $$4, dzy.a $$5, boolean $$6) {
         super(dyd.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(ebn $$0, sd $$1, dbr $$2, float $$3, dzy.a $$4, boolean $$5) {
         super(dyd.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static ebi a(dbr $$0, float $$1, dzy.a $$2) {
         ebj $$3 = $$2 == dzy.a.b ? dzx.b : dzx.a;
         return new ebi().a($$0).a(dab.a).a(new eaq($$1)).a(eao.d).a($$3);
      }

      public static dzx.a a(ebn $$0, sd $$1) {
         dbr $$2 = dbr.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         dzy.a $$4 = dzy.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new dzx.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dyc $$0, sd $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, hx $$1, csu $$2, atw $$3, dxe $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cvh.cv.o().a(cwi.e, Boolean.valueOf($$2.b_($$1).a(arp.a))), 2);
            dfi $$5 = $$2.c_($$1);
            if ($$5 instanceof dfp) {
               ((dfp)$$5).a(this.j ? efa.F : efa.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cbb $$6 = bkz.y.a((csf)$$2.D());
            if ($$6 != null) {
               $$6.fK();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), blp.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.A_()) {
                  $$2.a($$1, cvh.a.o(), 2);
               } else {
                  $$2.a($$1, cvh.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(csz $$0, csx $$1, djk $$2, atw $$3, dxe $$4, crm $$5, hx $$6) {
         int $$7 = $$0.a(dmw.a.c, this.d.u(), this.d.w());
         this.d = new hx(this.d.u(), $$7, this.d.w());
         hx $$8 = ebm.a(new hx(this.b.a().u() - 1, 0, this.b.a().w() - 1), dab.a, this.c.d(), hx.b).a((ja)this.d);
         this.d = new hx(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(hx $$0, crl $$1, hx $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (hx $$7 : hx.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            hx.a $$11 = new hx.a($$8, $$10, $$9);
            dhn $$12 = $$1.a_($$11);

            for (ecx $$13 = $$1.b_($$11); ($$12.i() || $$13.a(arp.a) || $$12.a(ark.al)) && $$10 > $$1.J_() + 1; $$13 = $$1.b_($$11)) {
               $$11.d($$8, --$$10, $$9);
               $$12 = $$1.a_($$11);
            }

            $$4 = Math.min($$4, $$10);
            if ($$10 < $$5 - 2) {
               $$6++;
            }
         }

         int $$14 = Math.abs($$0.u() - $$2.u());
         if ($$5 - $$4 > 2 && $$6 > $$14 - 2) {
            $$3 = $$4 + 1;
         }

         return $$3;
      }
   }
}
