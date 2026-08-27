import com.google.common.collect.Lists;
import java.util.List;

public class eer {
   static final egd a = a(czh.I, czh.J, ejw.aS);
   static final egd b = a(czh.L, czh.M, ejw.aT);
   private static final ajc[] c = new ajc[]{
      new ajc("underwater_ruin/warm_1"),
      new ajc("underwater_ruin/warm_2"),
      new ajc("underwater_ruin/warm_3"),
      new ajc("underwater_ruin/warm_4"),
      new ajc("underwater_ruin/warm_5"),
      new ajc("underwater_ruin/warm_6"),
      new ajc("underwater_ruin/warm_7"),
      new ajc("underwater_ruin/warm_8")
   };
   private static final ajc[] d = new ajc[]{
      new ajc("underwater_ruin/brick_1"),
      new ajc("underwater_ruin/brick_2"),
      new ajc("underwater_ruin/brick_3"),
      new ajc("underwater_ruin/brick_4"),
      new ajc("underwater_ruin/brick_5"),
      new ajc("underwater_ruin/brick_6"),
      new ajc("underwater_ruin/brick_7"),
      new ajc("underwater_ruin/brick_8")
   };
   private static final ajc[] e = new ajc[]{
      new ajc("underwater_ruin/cracked_1"),
      new ajc("underwater_ruin/cracked_2"),
      new ajc("underwater_ruin/cracked_3"),
      new ajc("underwater_ruin/cracked_4"),
      new ajc("underwater_ruin/cracked_5"),
      new ajc("underwater_ruin/cracked_6"),
      new ajc("underwater_ruin/cracked_7"),
      new ajc("underwater_ruin/cracked_8")
   };
   private static final ajc[] f = new ajc[]{
      new ajc("underwater_ruin/mossy_1"),
      new ajc("underwater_ruin/mossy_2"),
      new ajc("underwater_ruin/mossy_3"),
      new ajc("underwater_ruin/mossy_4"),
      new ajc("underwater_ruin/mossy_5"),
      new ajc("underwater_ruin/mossy_6"),
      new ajc("underwater_ruin/mossy_7"),
      new ajc("underwater_ruin/mossy_8")
   };
   private static final ajc[] g = new ajc[]{
      new ajc("underwater_ruin/big_brick_1"),
      new ajc("underwater_ruin/big_brick_2"),
      new ajc("underwater_ruin/big_brick_3"),
      new ajc("underwater_ruin/big_brick_8")
   };
   private static final ajc[] h = new ajc[]{
      new ajc("underwater_ruin/big_mossy_1"),
      new ajc("underwater_ruin/big_mossy_2"),
      new ajc("underwater_ruin/big_mossy_3"),
      new ajc("underwater_ruin/big_mossy_8")
   };
   private static final ajc[] i = new ajc[]{
      new ajc("underwater_ruin/big_cracked_1"),
      new ajc("underwater_ruin/big_cracked_2"),
      new ajc("underwater_ruin/big_cracked_3"),
      new ajc("underwater_ruin/big_cracked_8")
   };
   private static final ajc[] j = new ajc[]{
      new ajc("underwater_ruin/big_warm_4"),
      new ajc("underwater_ruin/big_warm_5"),
      new ajc("underwater_ruin/big_warm_6"),
      new ajc("underwater_ruin/big_warm_7")
   };

   private static egd a(czf $$0, czf $$1, ajc $$2) {
      return new efm(new efz(List.of(new efv(new efj($$0), efe.b, efs.b, $$1.o(), new egk($$2)))), bln.a(5));
   }

   private static ajc a(awt $$0) {
      return ac.a(c, $$0);
   }

   private static ajc b(awt $$0) {
      return ac.a(j, $$0);
   }

   public static void a(egh $$0, ib $$1, dfr $$2, ecl $$3, awt $$4, ees $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(egh $$0, awt $$1, dfr $$2, ib $$3, ees $$4, ecl $$5) {
      ib $$6 = new ib($$3.u(), 90, $$3.w());
      ib $$7 = egg.a(new ib(15, 0, 15), deb.a, $$2, ib.c).a((jf)$$6);
      eby $$8 = eby.a($$6, $$7);
      ib $$9 = new ib(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<ib> $$10 = a($$1, $$9);
      int $$11 = awm.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            ib $$14 = $$10.remove($$13);
            dfr $$15 = dfr.a($$1);
            ib $$16 = egg.a(new ib(5, 0, 6), deb.a, $$15, ib.c).a((jf)$$14);
            eby $$17 = eby.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<ib> a(awt $$0, ib $$1) {
      List<ib> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + awm.a($$0, 1, 8), 0, 16 + awm.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + awm.a($$0, 1, 8), 0, awm.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + awm.a($$0, 1, 8), 0, -16 + awm.a($$0, 4, 8)));
      $$2.add($$1.b(awm.a($$0, 1, 7), 0, 16 + awm.a($$0, 1, 7)));
      $$2.add($$1.b(awm.a($$0, 1, 7), 0, -16 + awm.a($$0, 4, 6)));
      $$2.add($$1.b(16 + awm.a($$0, 1, 7), 0, 16 + awm.a($$0, 3, 8)));
      $$2.add($$1.b(16 + awm.a($$0, 1, 7), 0, awm.a($$0, 1, 7)));
      $$2.add($$1.b(16 + awm.a($$0, 1, 7), 0, -16 + awm.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(egh $$0, ib $$1, dfr $$2, ecl $$3, awt $$4, ees $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ajc $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eer.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ajc[] $$9 = $$6 ? g : d;
            ajc[] $$10 = $$6 ? i : e;
            ajc[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eer.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eer.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eer.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends ecq {
      private final ees.a h;
      private final float i;
      private final boolean j;

      public a(egh $$0, ajc $$1, ib $$2, dfr $$3, float $$4, ees.a $$5, boolean $$6) {
         super(ecx.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(egh $$0, sy $$1, dfr $$2, float $$3, ees.a $$4, boolean $$5) {
         super(ecx.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static egc a(dfr $$0, float $$1, ees.a $$2) {
         egd $$3 = $$2 == ees.a.b ? eer.b : eer.a;
         return new egc().a($$0).a(deb.a).a(new efk($$1)).a(efi.d).a($$3);
      }

      public static eer.a a(egh $$0, sy $$1) {
         dfr $$2 = dfr.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         ees.a $$4 = ees.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eer.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(ecw $$0, sy $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, ib $$1, cwt $$2, awt $$3, eby $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, czh.cv.o().a(dai.e, Boolean.valueOf($$2.b_($$1).a(auj.a))), 2);
            djl $$5 = $$2.c_($$1);
            if ($$5 instanceof djs) {
               ((djs)$$5).a(this.j ? ejw.F : ejw.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            ceu $$6 = bol.A.a((cwe)$$2.E());
            if ($$6 != null) {
               $$6.fQ();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bpb.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.A_()) {
                  $$2.a($$1, czh.a.o(), 2);
               } else {
                  $$2.a($$1, czh.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(cwz $$0, cwx $$1, dob $$2, awt $$3, eby $$4, cvl $$5, ib $$6) {
         int $$7 = $$0.a(drq.a.c, this.d.u(), this.d.w());
         this.d = new ib(this.d.u(), $$7, this.d.w());
         ib $$8 = egg.a(new ib(this.b.a().u() - 1, 0, this.b.a().w() - 1), deb.a, this.c.d(), ib.c).a((jf)this.d);
         this.d = new ib(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(ib $$0, cvk $$1, ib $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (ib $$7 : ib.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            ib.a $$11 = new ib.a($$8, $$10, $$9);
            dme $$12 = $$1.a_($$11);

            for (ehr $$13 = $$1.b_($$11); ($$12.i() || $$13.a(auj.a) || $$12.a(aue.al)) && $$10 > $$1.J_() + 1; $$13 = $$1.b_($$11)) {
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
