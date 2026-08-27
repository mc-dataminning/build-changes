import com.google.common.collect.Lists;
import java.util.List;

public class eja {
   static final ekm a = a(ddg.I, ddg.J, eoj.aX);
   static final ekm b = a(ddg.L, ddg.M, eoj.aY);
   private static final akh[] c = new akh[]{
      new akh("underwater_ruin/warm_1"),
      new akh("underwater_ruin/warm_2"),
      new akh("underwater_ruin/warm_3"),
      new akh("underwater_ruin/warm_4"),
      new akh("underwater_ruin/warm_5"),
      new akh("underwater_ruin/warm_6"),
      new akh("underwater_ruin/warm_7"),
      new akh("underwater_ruin/warm_8")
   };
   private static final akh[] d = new akh[]{
      new akh("underwater_ruin/brick_1"),
      new akh("underwater_ruin/brick_2"),
      new akh("underwater_ruin/brick_3"),
      new akh("underwater_ruin/brick_4"),
      new akh("underwater_ruin/brick_5"),
      new akh("underwater_ruin/brick_6"),
      new akh("underwater_ruin/brick_7"),
      new akh("underwater_ruin/brick_8")
   };
   private static final akh[] e = new akh[]{
      new akh("underwater_ruin/cracked_1"),
      new akh("underwater_ruin/cracked_2"),
      new akh("underwater_ruin/cracked_3"),
      new akh("underwater_ruin/cracked_4"),
      new akh("underwater_ruin/cracked_5"),
      new akh("underwater_ruin/cracked_6"),
      new akh("underwater_ruin/cracked_7"),
      new akh("underwater_ruin/cracked_8")
   };
   private static final akh[] f = new akh[]{
      new akh("underwater_ruin/mossy_1"),
      new akh("underwater_ruin/mossy_2"),
      new akh("underwater_ruin/mossy_3"),
      new akh("underwater_ruin/mossy_4"),
      new akh("underwater_ruin/mossy_5"),
      new akh("underwater_ruin/mossy_6"),
      new akh("underwater_ruin/mossy_7"),
      new akh("underwater_ruin/mossy_8")
   };
   private static final akh[] g = new akh[]{
      new akh("underwater_ruin/big_brick_1"),
      new akh("underwater_ruin/big_brick_2"),
      new akh("underwater_ruin/big_brick_3"),
      new akh("underwater_ruin/big_brick_8")
   };
   private static final akh[] h = new akh[]{
      new akh("underwater_ruin/big_mossy_1"),
      new akh("underwater_ruin/big_mossy_2"),
      new akh("underwater_ruin/big_mossy_3"),
      new akh("underwater_ruin/big_mossy_8")
   };
   private static final akh[] i = new akh[]{
      new akh("underwater_ruin/big_cracked_1"),
      new akh("underwater_ruin/big_cracked_2"),
      new akh("underwater_ruin/big_cracked_3"),
      new akh("underwater_ruin/big_cracked_8")
   };
   private static final akh[] j = new akh[]{
      new akh("underwater_ruin/big_warm_4"),
      new akh("underwater_ruin/big_warm_5"),
      new akh("underwater_ruin/big_warm_6"),
      new akh("underwater_ruin/big_warm_7")
   };

   private static ekm a(dde $$0, dde $$1, akg<eoq> $$2) {
      return new ejv(new eki(List.of(new eke(new ejs($$0), ejn.b, ekb.b, $$1.n(), new ekt($$2)))), boo.a(5));
   }

   private static akh a(ayg $$0) {
      return ac.a(c, $$0);
   }

   private static akh b(ayg $$0) {
      return ac.a(j, $$0);
   }

   public static void a(ekq $$0, in $$1, djr $$2, egu $$3, ayg $$4, ejb $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(ekq $$0, ayg $$1, djr $$2, in $$3, ejb $$4, egu $$5) {
      in $$6 = new in($$3.u(), 90, $$3.w());
      in $$7 = ekp.a(new in(15, 0, 15), dib.a, $$2, in.c).a((jr)$$6);
      egh $$8 = egh.a($$6, $$7);
      in $$9 = new in(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<in> $$10 = a($$1, $$9);
      int $$11 = axz.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            in $$14 = $$10.remove($$13);
            djr $$15 = djr.a($$1);
            in $$16 = ekp.a(new in(5, 0, 6), dib.a, $$15, in.c).a((jr)$$14);
            egh $$17 = egh.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<in> a(ayg $$0, in $$1) {
      List<in> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + axz.a($$0, 1, 8), 0, 16 + axz.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + axz.a($$0, 1, 8), 0, axz.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + axz.a($$0, 1, 8), 0, -16 + axz.a($$0, 4, 8)));
      $$2.add($$1.b(axz.a($$0, 1, 7), 0, 16 + axz.a($$0, 1, 7)));
      $$2.add($$1.b(axz.a($$0, 1, 7), 0, -16 + axz.a($$0, 4, 6)));
      $$2.add($$1.b(16 + axz.a($$0, 1, 7), 0, 16 + axz.a($$0, 3, 8)));
      $$2.add($$1.b(16 + axz.a($$0, 1, 7), 0, axz.a($$0, 1, 7)));
      $$2.add($$1.b(16 + axz.a($$0, 1, 7), 0, -16 + axz.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(ekq $$0, in $$1, djr $$2, egu $$3, ayg $$4, ejb $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            akh $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eja.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            akh[] $$9 = $$6 ? g : d;
            akh[] $$10 = $$6 ? i : e;
            akh[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eja.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eja.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eja.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends egz {
      private final ejb.a h;
      private final float i;
      private final boolean j;

      public a(ekq $$0, akh $$1, in $$2, djr $$3, float $$4, ejb.a $$5, boolean $$6) {
         super(ehg.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(ekq $$0, ua $$1, djr $$2, float $$3, ejb.a $$4, boolean $$5) {
         super(ehg.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static ekl a(djr $$0, float $$1, ejb.a $$2) {
         ekm $$3 = $$2 == ejb.a.b ? eja.b : eja.a;
         return new ekl().a($$0).a(dib.a).a(new ejt($$1)).a(ejr.d).a($$3);
      }

      public static eja.a a(ekq $$0, ua $$1) {
         djr $$2 = djr.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         ejb.a $$4 = ejb.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eja.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(ehf $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, in $$1, das $$2, ayg $$3, egh $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, ddg.cv.n().a(deh.e, Boolean.valueOf($$2.b_($$1).a(avw.a))), 2);
            dnm $$5 = $$2.c_($$1);
            if ($$5 instanceof dnt) {
               ((dnt)$$5).a(this.j ? eoj.F : eoj.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cib $$6 = brn.B.a((dad)$$2.E());
            if ($$6 != null) {
               $$6.fT();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bse.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, ddg.a.n(), 2);
               } else {
                  $$2.a($$1, ddg.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(day $$0, daw $$1, dse $$2, ayg $$3, egh $$4, czk $$5, in $$6) {
         int $$7 = $$0.a(dvz.a.c, this.d.u(), this.d.w());
         this.d = new in(this.d.u(), $$7, this.d.w());
         in $$8 = ekp.a(new in(this.b.a().u() - 1, 0, this.b.a().w() - 1), dib.a, this.c.d(), in.c).a((jr)this.d);
         this.d = new in(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(in $$0, czj $$1, in $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (in $$7 : in.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            in.a $$11 = new in.a($$8, $$10, $$9);
            dqh $$12 = $$1.a_($$11);

            for (ema $$13 = $$1.b_($$11); ($$12.i() || $$13.a(avw.a) || $$12.a(avr.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
