import com.google.common.collect.Lists;
import java.util.List;

public class epy {
   static final erl a = a(djo.L, djo.M, evn.bb);
   static final erl b = a(djo.O, djo.P, evn.bc);
   private static final akv[] c = new akv[]{
      akv.b("underwater_ruin/warm_1"),
      akv.b("underwater_ruin/warm_2"),
      akv.b("underwater_ruin/warm_3"),
      akv.b("underwater_ruin/warm_4"),
      akv.b("underwater_ruin/warm_5"),
      akv.b("underwater_ruin/warm_6"),
      akv.b("underwater_ruin/warm_7"),
      akv.b("underwater_ruin/warm_8")
   };
   private static final akv[] d = new akv[]{
      akv.b("underwater_ruin/brick_1"),
      akv.b("underwater_ruin/brick_2"),
      akv.b("underwater_ruin/brick_3"),
      akv.b("underwater_ruin/brick_4"),
      akv.b("underwater_ruin/brick_5"),
      akv.b("underwater_ruin/brick_6"),
      akv.b("underwater_ruin/brick_7"),
      akv.b("underwater_ruin/brick_8")
   };
   private static final akv[] e = new akv[]{
      akv.b("underwater_ruin/cracked_1"),
      akv.b("underwater_ruin/cracked_2"),
      akv.b("underwater_ruin/cracked_3"),
      akv.b("underwater_ruin/cracked_4"),
      akv.b("underwater_ruin/cracked_5"),
      akv.b("underwater_ruin/cracked_6"),
      akv.b("underwater_ruin/cracked_7"),
      akv.b("underwater_ruin/cracked_8")
   };
   private static final akv[] f = new akv[]{
      akv.b("underwater_ruin/mossy_1"),
      akv.b("underwater_ruin/mossy_2"),
      akv.b("underwater_ruin/mossy_3"),
      akv.b("underwater_ruin/mossy_4"),
      akv.b("underwater_ruin/mossy_5"),
      akv.b("underwater_ruin/mossy_6"),
      akv.b("underwater_ruin/mossy_7"),
      akv.b("underwater_ruin/mossy_8")
   };
   private static final akv[] g = new akv[]{
      akv.b("underwater_ruin/big_brick_1"), akv.b("underwater_ruin/big_brick_2"), akv.b("underwater_ruin/big_brick_3"), akv.b("underwater_ruin/big_brick_8")
   };
   private static final akv[] h = new akv[]{
      akv.b("underwater_ruin/big_mossy_1"), akv.b("underwater_ruin/big_mossy_2"), akv.b("underwater_ruin/big_mossy_3"), akv.b("underwater_ruin/big_mossy_8")
   };
   private static final akv[] i = new akv[]{
      akv.b("underwater_ruin/big_cracked_1"),
      akv.b("underwater_ruin/big_cracked_2"),
      akv.b("underwater_ruin/big_cracked_3"),
      akv.b("underwater_ruin/big_cracked_8")
   };
   private static final akv[] j = new akv[]{
      akv.b("underwater_ruin/big_warm_4"), akv.b("underwater_ruin/big_warm_5"), akv.b("underwater_ruin/big_warm_6"), akv.b("underwater_ruin/big_warm_7")
   };

   private static erl a(djm $$0, djm $$1, aku<evw> $$2) {
      return new eqt(new erh(List.of(new erd(new eqq($$0), eql.b, era.b, $$1.m(), new ers($$2)))), brm.a(5));
   }

   private static akv a(azh $$0) {
      return af.a(c, $$0);
   }

   private static akv b(azh $$0) {
      return af.a(j, $$0);
   }

   public static void a(erp $$0, ji $$1, dqe $$2, enr $$3, azh $$4, epz $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(erp $$0, azh $$1, dqe $$2, ji $$3, epz $$4, enr $$5) {
      ji $$6 = new ji($$3.u(), 90, $$3.w());
      ji $$7 = ero.a(new ji(15, 0, 15), dol.a, $$2, ji.c).a((km)$$6);
      ene $$8 = ene.a($$6, $$7);
      ji $$9 = new ji(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<ji> $$10 = a($$1, $$9);
      int $$11 = ayz.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            ji $$14 = $$10.remove($$13);
            dqe $$15 = dqe.a($$1);
            ji $$16 = ero.a(new ji(5, 0, 6), dol.a, $$15, ji.c).a((km)$$14);
            ene $$17 = ene.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<ji> a(azh $$0, ji $$1) {
      List<ji> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ayz.a($$0, 1, 8), 0, 16 + ayz.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayz.a($$0, 1, 8), 0, ayz.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayz.a($$0, 1, 8), 0, -16 + ayz.a($$0, 4, 8)));
      $$2.add($$1.b(ayz.a($$0, 1, 7), 0, 16 + ayz.a($$0, 1, 7)));
      $$2.add($$1.b(ayz.a($$0, 1, 7), 0, -16 + ayz.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ayz.a($$0, 1, 7), 0, 16 + ayz.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ayz.a($$0, 1, 7), 0, ayz.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ayz.a($$0, 1, 7), 0, -16 + ayz.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(erp $$0, ji $$1, dqe $$2, enr $$3, azh $$4, epz $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            akv $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new epy.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            akv[] $$9 = $$6 ? g : d;
            akv[] $$10 = $$6 ? i : e;
            akv[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new epy.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new epy.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new epy.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends enw {
      private final epz.a h;
      private final float i;
      private final boolean j;

      public a(erp $$0, akv $$1, ji $$2, dqe $$3, float $$4, epz.a $$5, boolean $$6) {
         super(eod.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(erp $$0, tq $$1, dqe $$2, float $$3, epz.a $$4, boolean $$5) {
         super(eod.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static erk a(dqe $$0, float $$1, epz.a $$2) {
         erl $$3 = $$2 == epz.a.b ? epy.b : epy.a;
         return new erk().a($$0).a(dol.a).a(new eqr($$1)).a(eqp.d).a($$3);
      }

      public static epy.a a(erp $$0, tq $$1) {
         dqe $$2 = dqe.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         epz.a $$4 = epz.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new epy.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(eoc $$0, tq $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, ji $$1, dgz $$2, azh $$3, ene $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, djo.cD.m().b(dkp.e, Boolean.valueOf($$2.b_($$1).a(awv.a))), 2);
            dtz $$5 = $$2.c_($$1);
            if ($$5 instanceof dug) {
               ((dug)$$5).a(this.j ? evn.E : evn.D, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            clm $$6 = bus.K.a($$2.a(), bur.d);
            if ($$6 != null) {
               $$6.fY();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bur.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.P()) {
                  $$2.a($$1, djo.a.m(), 2);
               } else {
                  $$2.a($$1, djo.J.m(), 2);
               }
            }
         }
      }

      @Override
      public void a(dhg $$0, dhe $$1, dyt $$2, azh $$3, ene $$4, dfo $$5, ji $$6) {
         int $$7 = $$0.a(ecs.a.c, this.d.u(), this.d.w());
         this.d = new ji(this.d.u(), $$7, this.d.w());
         ji $$8 = ero.a(new ji(this.b.a().u() - 1, 0, this.b.a().w() - 1), dol.a, this.c.d(), ji.c).a((km)this.d);
         this.d = new ji(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(ji $$0, dfn $$1, ji $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (ji $$7 : ji.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            ji.a $$11 = new ji.a($$8, $$10, $$9);
            dwx $$12 = $$1.a_($$11);

            for (esz $$13 = $$1.b_($$11); ($$12.l() || $$13.a(awv.a) || $$12.a(awp.ap)) && $$10 > $$1.L_() + 1; $$13 = $$1.b_($$11)) {
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
