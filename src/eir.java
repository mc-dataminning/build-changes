import com.google.common.collect.Lists;
import java.util.List;

public class eir {
   static final ekd a = a(dcx.I, dcx.J, eny.aX);
   static final ekd b = a(dcx.L, dcx.M, eny.aY);
   private static final akf[] c = new akf[]{
      new akf("underwater_ruin/warm_1"),
      new akf("underwater_ruin/warm_2"),
      new akf("underwater_ruin/warm_3"),
      new akf("underwater_ruin/warm_4"),
      new akf("underwater_ruin/warm_5"),
      new akf("underwater_ruin/warm_6"),
      new akf("underwater_ruin/warm_7"),
      new akf("underwater_ruin/warm_8")
   };
   private static final akf[] d = new akf[]{
      new akf("underwater_ruin/brick_1"),
      new akf("underwater_ruin/brick_2"),
      new akf("underwater_ruin/brick_3"),
      new akf("underwater_ruin/brick_4"),
      new akf("underwater_ruin/brick_5"),
      new akf("underwater_ruin/brick_6"),
      new akf("underwater_ruin/brick_7"),
      new akf("underwater_ruin/brick_8")
   };
   private static final akf[] e = new akf[]{
      new akf("underwater_ruin/cracked_1"),
      new akf("underwater_ruin/cracked_2"),
      new akf("underwater_ruin/cracked_3"),
      new akf("underwater_ruin/cracked_4"),
      new akf("underwater_ruin/cracked_5"),
      new akf("underwater_ruin/cracked_6"),
      new akf("underwater_ruin/cracked_7"),
      new akf("underwater_ruin/cracked_8")
   };
   private static final akf[] f = new akf[]{
      new akf("underwater_ruin/mossy_1"),
      new akf("underwater_ruin/mossy_2"),
      new akf("underwater_ruin/mossy_3"),
      new akf("underwater_ruin/mossy_4"),
      new akf("underwater_ruin/mossy_5"),
      new akf("underwater_ruin/mossy_6"),
      new akf("underwater_ruin/mossy_7"),
      new akf("underwater_ruin/mossy_8")
   };
   private static final akf[] g = new akf[]{
      new akf("underwater_ruin/big_brick_1"),
      new akf("underwater_ruin/big_brick_2"),
      new akf("underwater_ruin/big_brick_3"),
      new akf("underwater_ruin/big_brick_8")
   };
   private static final akf[] h = new akf[]{
      new akf("underwater_ruin/big_mossy_1"),
      new akf("underwater_ruin/big_mossy_2"),
      new akf("underwater_ruin/big_mossy_3"),
      new akf("underwater_ruin/big_mossy_8")
   };
   private static final akf[] i = new akf[]{
      new akf("underwater_ruin/big_cracked_1"),
      new akf("underwater_ruin/big_cracked_2"),
      new akf("underwater_ruin/big_cracked_3"),
      new akf("underwater_ruin/big_cracked_8")
   };
   private static final akf[] j = new akf[]{
      new akf("underwater_ruin/big_warm_4"),
      new akf("underwater_ruin/big_warm_5"),
      new akf("underwater_ruin/big_warm_6"),
      new akf("underwater_ruin/big_warm_7")
   };

   private static ekd a(dcv $$0, dcv $$1, akf $$2) {
      return new ejm(new ejz(List.of(new ejv(new ejj($$0), eje.b, ejs.b, $$1.n(), new ekk($$2)))), bns.a(5));
   }

   private static akf a(ayd $$0) {
      return ac.a(c, $$0);
   }

   private static akf b(ayd $$0) {
      return ac.a(j, $$0);
   }

   public static void a(ekh $$0, im $$1, dji $$2, egl $$3, ayd $$4, eis $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(ekh $$0, ayd $$1, dji $$2, im $$3, eis $$4, egl $$5) {
      im $$6 = new im($$3.u(), 90, $$3.w());
      im $$7 = ekg.a(new im(15, 0, 15), dhs.a, $$2, im.c).a((jq)$$6);
      efy $$8 = efy.a($$6, $$7);
      im $$9 = new im(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<im> $$10 = a($$1, $$9);
      int $$11 = axw.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            im $$14 = $$10.remove($$13);
            dji $$15 = dji.a($$1);
            im $$16 = ekg.a(new im(5, 0, 6), dhs.a, $$15, im.c).a((jq)$$14);
            efy $$17 = efy.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<im> a(ayd $$0, im $$1) {
      List<im> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + axw.a($$0, 1, 8), 0, 16 + axw.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + axw.a($$0, 1, 8), 0, axw.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + axw.a($$0, 1, 8), 0, -16 + axw.a($$0, 4, 8)));
      $$2.add($$1.b(axw.a($$0, 1, 7), 0, 16 + axw.a($$0, 1, 7)));
      $$2.add($$1.b(axw.a($$0, 1, 7), 0, -16 + axw.a($$0, 4, 6)));
      $$2.add($$1.b(16 + axw.a($$0, 1, 7), 0, 16 + axw.a($$0, 3, 8)));
      $$2.add($$1.b(16 + axw.a($$0, 1, 7), 0, axw.a($$0, 1, 7)));
      $$2.add($$1.b(16 + axw.a($$0, 1, 7), 0, -16 + axw.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(ekh $$0, im $$1, dji $$2, egl $$3, ayd $$4, eis $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            akf $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eir.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            akf[] $$9 = $$6 ? g : d;
            akf[] $$10 = $$6 ? i : e;
            akf[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eir.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eir.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eir.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends egq {
      private final eis.a h;
      private final float i;
      private final boolean j;

      public a(ekh $$0, akf $$1, im $$2, dji $$3, float $$4, eis.a $$5, boolean $$6) {
         super(egx.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(ekh $$0, ty $$1, dji $$2, float $$3, eis.a $$4, boolean $$5) {
         super(egx.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static ekc a(dji $$0, float $$1, eis.a $$2) {
         ekd $$3 = $$2 == eis.a.b ? eir.b : eir.a;
         return new ekc().a($$0).a(dhs.a).a(new ejk($$1)).a(eji.d).a($$3);
      }

      public static eir.a a(ekh $$0, ty $$1) {
         dji $$2 = dji.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eis.a $$4 = eis.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eir.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(egw $$0, ty $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, im $$1, daj $$2, ayd $$3, efy $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dcx.cv.n().a(ddy.e, Boolean.valueOf($$2.b_($$1).a(avt.a))), 2);
            dnd $$5 = $$2.c_($$1);
            if ($$5 instanceof dnk) {
               ((dnk)$$5).a(this.j ? eny.F : eny.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            chf $$6 = bqr.B.a((czu)$$2.E());
            if ($$6 != null) {
               $$6.fT();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bri.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dcx.a.n(), 2);
               } else {
                  $$2.a($$1, dcx.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(dap $$0, dan $$1, drv $$2, ayd $$3, efy $$4, czb $$5, im $$6) {
         int $$7 = $$0.a(dvq.a.c, this.d.u(), this.d.w());
         this.d = new im(this.d.u(), $$7, this.d.w());
         im $$8 = ekg.a(new im(this.b.a().u() - 1, 0, this.b.a().w() - 1), dhs.a, this.c.d(), im.c).a((jq)this.d);
         this.d = new im(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(im $$0, cza $$1, im $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (im $$7 : im.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            im.a $$11 = new im.a($$8, $$10, $$9);
            dpy $$12 = $$1.a_($$11);

            for (elr $$13 = $$1.b_($$11); ($$12.i() || $$13.a(avt.a) || $$12.a(avo.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
