import com.google.common.collect.Lists;
import java.util.List;

public class due {
   static final dvq a = a(cpo.I, cpo.J, dzg.aG);
   static final dvq b = a(cpo.L, cpo.M, dzg.aH);
   private static final acq[] c = new acq[]{
      new acq("underwater_ruin/warm_1"),
      new acq("underwater_ruin/warm_2"),
      new acq("underwater_ruin/warm_3"),
      new acq("underwater_ruin/warm_4"),
      new acq("underwater_ruin/warm_5"),
      new acq("underwater_ruin/warm_6"),
      new acq("underwater_ruin/warm_7"),
      new acq("underwater_ruin/warm_8")
   };
   private static final acq[] d = new acq[]{
      new acq("underwater_ruin/brick_1"),
      new acq("underwater_ruin/brick_2"),
      new acq("underwater_ruin/brick_3"),
      new acq("underwater_ruin/brick_4"),
      new acq("underwater_ruin/brick_5"),
      new acq("underwater_ruin/brick_6"),
      new acq("underwater_ruin/brick_7"),
      new acq("underwater_ruin/brick_8")
   };
   private static final acq[] e = new acq[]{
      new acq("underwater_ruin/cracked_1"),
      new acq("underwater_ruin/cracked_2"),
      new acq("underwater_ruin/cracked_3"),
      new acq("underwater_ruin/cracked_4"),
      new acq("underwater_ruin/cracked_5"),
      new acq("underwater_ruin/cracked_6"),
      new acq("underwater_ruin/cracked_7"),
      new acq("underwater_ruin/cracked_8")
   };
   private static final acq[] f = new acq[]{
      new acq("underwater_ruin/mossy_1"),
      new acq("underwater_ruin/mossy_2"),
      new acq("underwater_ruin/mossy_3"),
      new acq("underwater_ruin/mossy_4"),
      new acq("underwater_ruin/mossy_5"),
      new acq("underwater_ruin/mossy_6"),
      new acq("underwater_ruin/mossy_7"),
      new acq("underwater_ruin/mossy_8")
   };
   private static final acq[] g = new acq[]{
      new acq("underwater_ruin/big_brick_1"),
      new acq("underwater_ruin/big_brick_2"),
      new acq("underwater_ruin/big_brick_3"),
      new acq("underwater_ruin/big_brick_8")
   };
   private static final acq[] h = new acq[]{
      new acq("underwater_ruin/big_mossy_1"),
      new acq("underwater_ruin/big_mossy_2"),
      new acq("underwater_ruin/big_mossy_3"),
      new acq("underwater_ruin/big_mossy_8")
   };
   private static final acq[] i = new acq[]{
      new acq("underwater_ruin/big_cracked_1"),
      new acq("underwater_ruin/big_cracked_2"),
      new acq("underwater_ruin/big_cracked_3"),
      new acq("underwater_ruin/big_cracked_8")
   };
   private static final acq[] j = new acq[]{
      new acq("underwater_ruin/big_warm_4"),
      new acq("underwater_ruin/big_warm_5"),
      new acq("underwater_ruin/big_warm_6"),
      new acq("underwater_ruin/big_warm_7")
   };

   private static dvq a(cpn $$0, cpn $$1, acq $$2) {
      return new duz(new dvm(List.of(new dvi(new duw($$0), dur.b, dvf.b, $$1.n(), new dvx($$2)))), bcz.a(5));
   }

   private static acq a(apf $$0) {
      return ac.a(c, $$0);
   }

   private static acq b(apf $$0) {
      return ac.a(j, $$0);
   }

   public static void a(dvu $$0, gu $$1, cvz $$2, dsf $$3, apf $$4, duf $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(dvu $$0, apf $$1, cvz $$2, gu $$3, duf $$4, dsf $$5) {
      gu $$6 = new gu($$3.u(), 90, $$3.w());
      gu $$7 = dvt.a(new gu(15, 0, 15), cui.a, $$2, gu.b).a((hz)$$6);
      drs $$8 = drs.a($$6, $$7);
      gu $$9 = new gu(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<gu> $$10 = a($$1, $$9);
      int $$11 = apa.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            gu $$14 = $$10.remove($$13);
            cvz $$15 = cvz.a($$1);
            gu $$16 = dvt.a(new gu(5, 0, 6), cui.a, $$15, gu.b).a((hz)$$14);
            drs $$17 = drs.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<gu> a(apf $$0, gu $$1) {
      List<gu> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + apa.a($$0, 1, 8), 0, 16 + apa.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + apa.a($$0, 1, 8), 0, apa.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + apa.a($$0, 1, 8), 0, -16 + apa.a($$0, 4, 8)));
      $$2.add($$1.b(apa.a($$0, 1, 7), 0, 16 + apa.a($$0, 1, 7)));
      $$2.add($$1.b(apa.a($$0, 1, 7), 0, -16 + apa.a($$0, 4, 6)));
      $$2.add($$1.b(16 + apa.a($$0, 1, 7), 0, 16 + apa.a($$0, 3, 8)));
      $$2.add($$1.b(16 + apa.a($$0, 1, 7), 0, apa.a($$0, 1, 7)));
      $$2.add($$1.b(16 + apa.a($$0, 1, 7), 0, -16 + apa.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(dvu $$0, gu $$1, cvz $$2, dsf $$3, apf $$4, duf $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            acq $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new due.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            acq[] $$9 = $$6 ? g : d;
            acq[] $$10 = $$6 ? i : e;
            acq[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new due.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new due.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new due.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends dsk {
      private final duf.a h;
      private final float i;
      private final boolean j;

      public a(dvu $$0, acq $$1, gu $$2, cvz $$3, float $$4, duf.a $$5, boolean $$6) {
         super(dsr.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(dvu $$0, qr $$1, cvz $$2, float $$3, duf.a $$4, boolean $$5) {
         super(dsr.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static dvp a(cvz $$0, float $$1, duf.a $$2) {
         dvq $$3 = $$2 == duf.a.b ? due.b : due.a;
         return new dvp().a($$0).a(cui.a).a(new dux($$1)).a(duv.d).a($$3);
      }

      public static due.a a(dvu $$0, qr $$1) {
         cvz $$2 = cvz.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         duf.a $$4 = duf.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new due.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(dsq $$0, qr $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, gu $$1, cnb $$2, apf $$3, drs $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, cpo.cv.n().a(cqp.d, Boolean.valueOf($$2.b_($$1).a(anb.a))), 2);
            czn $$5 = $$2.c_($$1);
            if ($$5 instanceof czu) {
               ((czu)$$5).a(this.j ? dzg.F : dzg.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            bvq $$6 = bfn.y.a((cmm)$$2.C());
            if ($$6 != null) {
               $$6.fF();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bgd.d, null, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.t_()) {
                  $$2.a($$1, cpo.a.n(), 2);
               } else {
                  $$2.a($$1, cpo.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(cng $$0, cne $$1, ddy $$2, apf $$3, drs $$4, clt $$5, gu $$6) {
         int $$7 = $$0.a(dhk.a.c, this.d.u(), this.d.w());
         this.d = new gu(this.d.u(), $$7, this.d.w());
         gu $$8 = dvt.a(new gu(this.b.a().u() - 1, 0, this.b.a().w() - 1), cui.a, this.c.d(), gu.b).a((hz)this.d);
         this.d = new gu(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(gu $$0, cls $$1, gu $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (gu $$7 : gu.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            gu.a $$11 = new gu.a($$8, $$10, $$9);
            dcb $$12 = $$1.a_($$11);

            for (dxe $$13 = $$1.b_($$11); ($$12.i() || $$13.a(anb.a) || $$12.a(amw.ak)) && $$10 > $$1.C_() + 1; $$13 = $$1.b_($$11)) {
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
