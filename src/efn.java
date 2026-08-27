import com.google.common.collect.Lists;
import java.util.List;

public class efn {
   static final egz a = a(dac.I, dac.J, eks.aS);
   static final egz b = a(dac.L, dac.M, eks.aT);
   private static final ajh[] c = new ajh[]{
      new ajh("underwater_ruin/warm_1"),
      new ajh("underwater_ruin/warm_2"),
      new ajh("underwater_ruin/warm_3"),
      new ajh("underwater_ruin/warm_4"),
      new ajh("underwater_ruin/warm_5"),
      new ajh("underwater_ruin/warm_6"),
      new ajh("underwater_ruin/warm_7"),
      new ajh("underwater_ruin/warm_8")
   };
   private static final ajh[] d = new ajh[]{
      new ajh("underwater_ruin/brick_1"),
      new ajh("underwater_ruin/brick_2"),
      new ajh("underwater_ruin/brick_3"),
      new ajh("underwater_ruin/brick_4"),
      new ajh("underwater_ruin/brick_5"),
      new ajh("underwater_ruin/brick_6"),
      new ajh("underwater_ruin/brick_7"),
      new ajh("underwater_ruin/brick_8")
   };
   private static final ajh[] e = new ajh[]{
      new ajh("underwater_ruin/cracked_1"),
      new ajh("underwater_ruin/cracked_2"),
      new ajh("underwater_ruin/cracked_3"),
      new ajh("underwater_ruin/cracked_4"),
      new ajh("underwater_ruin/cracked_5"),
      new ajh("underwater_ruin/cracked_6"),
      new ajh("underwater_ruin/cracked_7"),
      new ajh("underwater_ruin/cracked_8")
   };
   private static final ajh[] f = new ajh[]{
      new ajh("underwater_ruin/mossy_1"),
      new ajh("underwater_ruin/mossy_2"),
      new ajh("underwater_ruin/mossy_3"),
      new ajh("underwater_ruin/mossy_4"),
      new ajh("underwater_ruin/mossy_5"),
      new ajh("underwater_ruin/mossy_6"),
      new ajh("underwater_ruin/mossy_7"),
      new ajh("underwater_ruin/mossy_8")
   };
   private static final ajh[] g = new ajh[]{
      new ajh("underwater_ruin/big_brick_1"),
      new ajh("underwater_ruin/big_brick_2"),
      new ajh("underwater_ruin/big_brick_3"),
      new ajh("underwater_ruin/big_brick_8")
   };
   private static final ajh[] h = new ajh[]{
      new ajh("underwater_ruin/big_mossy_1"),
      new ajh("underwater_ruin/big_mossy_2"),
      new ajh("underwater_ruin/big_mossy_3"),
      new ajh("underwater_ruin/big_mossy_8")
   };
   private static final ajh[] i = new ajh[]{
      new ajh("underwater_ruin/big_cracked_1"),
      new ajh("underwater_ruin/big_cracked_2"),
      new ajh("underwater_ruin/big_cracked_3"),
      new ajh("underwater_ruin/big_cracked_8")
   };
   private static final ajh[] j = new ajh[]{
      new ajh("underwater_ruin/big_warm_4"),
      new ajh("underwater_ruin/big_warm_5"),
      new ajh("underwater_ruin/big_warm_6"),
      new ajh("underwater_ruin/big_warm_7")
   };

   private static egz a(daa $$0, daa $$1, ajh $$2) {
      return new egi(new egv(List.of(new egr(new egf($$0), ega.b, ego.b, $$1.o(), new ehg($$2)))), bme.a(5));
   }

   private static ajh a(axd $$0) {
      return ac.a(c, $$0);
   }

   private static ajh b(axd $$0) {
      return ac.a(j, $$0);
   }

   public static void a(ehd $$0, ib $$1, dgm $$2, edh $$3, axd $$4, efo $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(ehd $$0, axd $$1, dgm $$2, ib $$3, efo $$4, edh $$5) {
      ib $$6 = new ib($$3.u(), 90, $$3.w());
      ib $$7 = ehc.a(new ib(15, 0, 15), dew.a, $$2, ib.c).a((jg)$$6);
      ecu $$8 = ecu.a($$6, $$7);
      ib $$9 = new ib(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<ib> $$10 = a($$1, $$9);
      int $$11 = aww.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            ib $$14 = $$10.remove($$13);
            dgm $$15 = dgm.a($$1);
            ib $$16 = ehc.a(new ib(5, 0, 6), dew.a, $$15, ib.c).a((jg)$$14);
            ecu $$17 = ecu.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<ib> a(axd $$0, ib $$1) {
      List<ib> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + aww.a($$0, 1, 8), 0, 16 + aww.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aww.a($$0, 1, 8), 0, aww.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + aww.a($$0, 1, 8), 0, -16 + aww.a($$0, 4, 8)));
      $$2.add($$1.b(aww.a($$0, 1, 7), 0, 16 + aww.a($$0, 1, 7)));
      $$2.add($$1.b(aww.a($$0, 1, 7), 0, -16 + aww.a($$0, 4, 6)));
      $$2.add($$1.b(16 + aww.a($$0, 1, 7), 0, 16 + aww.a($$0, 3, 8)));
      $$2.add($$1.b(16 + aww.a($$0, 1, 7), 0, aww.a($$0, 1, 7)));
      $$2.add($$1.b(16 + aww.a($$0, 1, 7), 0, -16 + aww.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(ehd $$0, ib $$1, dgm $$2, edh $$3, axd $$4, efo $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ajh $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new efn.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ajh[] $$9 = $$6 ? g : d;
            ajh[] $$10 = $$6 ? i : e;
            ajh[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new efn.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new efn.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new efn.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends edm {
      private final efo.a h;
      private final float i;
      private final boolean j;

      public a(ehd $$0, ajh $$1, ib $$2, dgm $$3, float $$4, efo.a $$5, boolean $$6) {
         super(edt.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(ehd $$0, ta $$1, dgm $$2, float $$3, efo.a $$4, boolean $$5) {
         super(edt.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static egy a(dgm $$0, float $$1, efo.a $$2) {
         egz $$3 = $$2 == efo.a.b ? efn.b : efn.a;
         return new egy().a($$0).a(dew.a).a(new egg($$1)).a(ege.d).a($$3);
      }

      public static efn.a a(ehd $$0, ta $$1) {
         dgm $$2 = dgm.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         efo.a $$4 = efo.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new efn.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(eds $$0, ta $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, ib $$1, cxo $$2, axd $$3, ecu $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dac.cv.o().a(dbd.e, Boolean.valueOf($$2.b_($$1).a(aus.a))), 2);
            dkg $$5 = $$2.c_($$1);
            if ($$5 instanceof dkn) {
               ((dkn)$$5).a(this.j ? eks.F : eks.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cfm $$6 = bpc.B.a((cwz)$$2.E());
            if ($$6 != null) {
               $$6.fS();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bps.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dac.a.o(), 2);
               } else {
                  $$2.a($$1, dac.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(cxu $$0, cxs $$1, dow $$2, axd $$3, ecu $$4, cwg $$5, ib $$6) {
         int $$7 = $$0.a(dsm.a.c, this.d.u(), this.d.w());
         this.d = new ib(this.d.u(), $$7, this.d.w());
         ib $$8 = ehc.a(new ib(this.b.a().u() - 1, 0, this.b.a().w() - 1), dew.a, this.c.d(), ib.c).a((jg)this.d);
         this.d = new ib(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(ib $$0, cwf $$1, ib $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (ib $$7 : ib.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            ib.a $$11 = new ib.a($$8, $$10, $$9);
            dmz $$12 = $$1.a_($$11);

            for (ein $$13 = $$1.b_($$11); ($$12.i() || $$13.a(aus.a) || $$12.a(aun.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
