import com.google.common.collect.Lists;
import java.util.List;

public class edp {
   static final efb a = a(cyq.I, cyq.J, eit.aS);
   static final efb b = a(cyq.L, cyq.M, eit.aT);
   private static final aiy[] c = new aiy[]{
      new aiy("underwater_ruin/warm_1"),
      new aiy("underwater_ruin/warm_2"),
      new aiy("underwater_ruin/warm_3"),
      new aiy("underwater_ruin/warm_4"),
      new aiy("underwater_ruin/warm_5"),
      new aiy("underwater_ruin/warm_6"),
      new aiy("underwater_ruin/warm_7"),
      new aiy("underwater_ruin/warm_8")
   };
   private static final aiy[] d = new aiy[]{
      new aiy("underwater_ruin/brick_1"),
      new aiy("underwater_ruin/brick_2"),
      new aiy("underwater_ruin/brick_3"),
      new aiy("underwater_ruin/brick_4"),
      new aiy("underwater_ruin/brick_5"),
      new aiy("underwater_ruin/brick_6"),
      new aiy("underwater_ruin/brick_7"),
      new aiy("underwater_ruin/brick_8")
   };
   private static final aiy[] e = new aiy[]{
      new aiy("underwater_ruin/cracked_1"),
      new aiy("underwater_ruin/cracked_2"),
      new aiy("underwater_ruin/cracked_3"),
      new aiy("underwater_ruin/cracked_4"),
      new aiy("underwater_ruin/cracked_5"),
      new aiy("underwater_ruin/cracked_6"),
      new aiy("underwater_ruin/cracked_7"),
      new aiy("underwater_ruin/cracked_8")
   };
   private static final aiy[] f = new aiy[]{
      new aiy("underwater_ruin/mossy_1"),
      new aiy("underwater_ruin/mossy_2"),
      new aiy("underwater_ruin/mossy_3"),
      new aiy("underwater_ruin/mossy_4"),
      new aiy("underwater_ruin/mossy_5"),
      new aiy("underwater_ruin/mossy_6"),
      new aiy("underwater_ruin/mossy_7"),
      new aiy("underwater_ruin/mossy_8")
   };
   private static final aiy[] g = new aiy[]{
      new aiy("underwater_ruin/big_brick_1"),
      new aiy("underwater_ruin/big_brick_2"),
      new aiy("underwater_ruin/big_brick_3"),
      new aiy("underwater_ruin/big_brick_8")
   };
   private static final aiy[] h = new aiy[]{
      new aiy("underwater_ruin/big_mossy_1"),
      new aiy("underwater_ruin/big_mossy_2"),
      new aiy("underwater_ruin/big_mossy_3"),
      new aiy("underwater_ruin/big_mossy_8")
   };
   private static final aiy[] i = new aiy[]{
      new aiy("underwater_ruin/big_cracked_1"),
      new aiy("underwater_ruin/big_cracked_2"),
      new aiy("underwater_ruin/big_cracked_3"),
      new aiy("underwater_ruin/big_cracked_8")
   };
   private static final aiy[] j = new aiy[]{
      new aiy("underwater_ruin/big_warm_4"),
      new aiy("underwater_ruin/big_warm_5"),
      new aiy("underwater_ruin/big_warm_6"),
      new aiy("underwater_ruin/big_warm_7")
   };

   private static efb a(cyo $$0, cyo $$1, aiy $$2) {
      return new eek(new eex(List.of(new eet(new eeh($$0), eec.b, eeq.b, $$1.o(), new efi($$2)))), bkw.a(5));
   }

   private static aiy a(awo $$0) {
      return ac.a(c, $$0);
   }

   private static aiy b(awo $$0) {
      return ac.a(j, $$0);
   }

   public static void a(eff $$0, hz $$1, dfa $$2, ebj $$3, awo $$4, edq $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(eff $$0, awo $$1, dfa $$2, hz $$3, edq $$4, ebj $$5) {
      hz $$6 = new hz($$3.u(), 90, $$3.w());
      hz $$7 = efe.a(new hz(15, 0, 15), ddk.a, $$2, hz.c).a((jd)$$6);
      eaw $$8 = eaw.a($$6, $$7);
      hz $$9 = new hz(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<hz> $$10 = a($$1, $$9);
      int $$11 = awh.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            hz $$14 = $$10.remove($$13);
            dfa $$15 = dfa.a($$1);
            hz $$16 = efe.a(new hz(5, 0, 6), ddk.a, $$15, hz.c).a((jd)$$14);
            eaw $$17 = eaw.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<hz> a(awo $$0, hz $$1) {
      List<hz> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + awh.a($$0, 1, 8), 0, 16 + awh.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + awh.a($$0, 1, 8), 0, awh.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + awh.a($$0, 1, 8), 0, -16 + awh.a($$0, 4, 8)));
      $$2.add($$1.b(awh.a($$0, 1, 7), 0, 16 + awh.a($$0, 1, 7)));
      $$2.add($$1.b(awh.a($$0, 1, 7), 0, -16 + awh.a($$0, 4, 6)));
      $$2.add($$1.b(16 + awh.a($$0, 1, 7), 0, 16 + awh.a($$0, 3, 8)));
      $$2.add($$1.b(16 + awh.a($$0, 1, 7), 0, awh.a($$0, 1, 7)));
      $$2.add($$1.b(16 + awh.a($$0, 1, 7), 0, -16 + awh.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(eff $$0, hz $$1, dfa $$2, ebj $$3, awo $$4, edq $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            aiy $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new edp.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            aiy[] $$9 = $$6 ? g : d;
            aiy[] $$10 = $$6 ? i : e;
            aiy[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new edp.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new edp.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new edp.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends ebo {
      private final edq.a h;
      private final float i;
      private final boolean j;

      public a(eff $$0, aiy $$1, hz $$2, dfa $$3, float $$4, edq.a $$5, boolean $$6) {
         super(ebv.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(eff $$0, sw $$1, dfa $$2, float $$3, edq.a $$4, boolean $$5) {
         super(ebv.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static efa a(dfa $$0, float $$1, edq.a $$2) {
         efb $$3 = $$2 == edq.a.b ? edp.b : edp.a;
         return new efa().a($$0).a(ddk.a).a(new eei($$1)).a(eeg.d).a($$3);
      }

      public static edp.a a(eff $$0, sw $$1) {
         dfa $$2 = dfa.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         edq.a $$4 = edq.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new edp.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(ebu $$0, sw $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, hz $$1, cwc $$2, awo $$3, eaw $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cyq.cv.o().a(czr.e, Boolean.valueOf($$2.b_($$1).a(aue.a))), 2);
            dit $$5 = $$2.c_($$1);
            if ($$5 instanceof dja) {
               ((dja)$$5).a(this.j ? eit.F : eit.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            ceb $$6 = bnu.A.a((cvn)$$2.E());
            if ($$6 != null) {
               $$6.fL();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bok.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.A_()) {
                  $$2.a($$1, cyq.a.o(), 2);
               } else {
                  $$2.a($$1, cyq.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(cwi $$0, cwg $$1, dnc $$2, awo $$3, eaw $$4, cuu $$5, hz $$6) {
         int $$7 = $$0.a(dqo.a.c, this.d.u(), this.d.w());
         this.d = new hz(this.d.u(), $$7, this.d.w());
         hz $$8 = efe.a(new hz(this.b.a().u() - 1, 0, this.b.a().w() - 1), ddk.a, this.c.d(), hz.c).a((jd)this.d);
         this.d = new hz(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(hz $$0, cut $$1, hz $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (hz $$7 : hz.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            hz.a $$11 = new hz.a($$8, $$10, $$9);
            dlf $$12 = $$1.a_($$11);

            for (egp $$13 = $$1.b_($$11); ($$12.i() || $$13.a(aue.a) || $$12.a(atz.al)) && $$10 > $$1.J_() + 1; $$13 = $$1.b_($$11)) {
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
