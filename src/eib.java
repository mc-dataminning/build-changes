import com.google.common.collect.Lists;
import java.util.List;

public class eib {
   static final ejn a = a(dcj.I, dcj.J, eni.aU);
   static final ejn b = a(dcj.L, dcj.M, eni.aV);
   private static final ajv[] c = new ajv[]{
      new ajv("underwater_ruin/warm_1"),
      new ajv("underwater_ruin/warm_2"),
      new ajv("underwater_ruin/warm_3"),
      new ajv("underwater_ruin/warm_4"),
      new ajv("underwater_ruin/warm_5"),
      new ajv("underwater_ruin/warm_6"),
      new ajv("underwater_ruin/warm_7"),
      new ajv("underwater_ruin/warm_8")
   };
   private static final ajv[] d = new ajv[]{
      new ajv("underwater_ruin/brick_1"),
      new ajv("underwater_ruin/brick_2"),
      new ajv("underwater_ruin/brick_3"),
      new ajv("underwater_ruin/brick_4"),
      new ajv("underwater_ruin/brick_5"),
      new ajv("underwater_ruin/brick_6"),
      new ajv("underwater_ruin/brick_7"),
      new ajv("underwater_ruin/brick_8")
   };
   private static final ajv[] e = new ajv[]{
      new ajv("underwater_ruin/cracked_1"),
      new ajv("underwater_ruin/cracked_2"),
      new ajv("underwater_ruin/cracked_3"),
      new ajv("underwater_ruin/cracked_4"),
      new ajv("underwater_ruin/cracked_5"),
      new ajv("underwater_ruin/cracked_6"),
      new ajv("underwater_ruin/cracked_7"),
      new ajv("underwater_ruin/cracked_8")
   };
   private static final ajv[] f = new ajv[]{
      new ajv("underwater_ruin/mossy_1"),
      new ajv("underwater_ruin/mossy_2"),
      new ajv("underwater_ruin/mossy_3"),
      new ajv("underwater_ruin/mossy_4"),
      new ajv("underwater_ruin/mossy_5"),
      new ajv("underwater_ruin/mossy_6"),
      new ajv("underwater_ruin/mossy_7"),
      new ajv("underwater_ruin/mossy_8")
   };
   private static final ajv[] g = new ajv[]{
      new ajv("underwater_ruin/big_brick_1"),
      new ajv("underwater_ruin/big_brick_2"),
      new ajv("underwater_ruin/big_brick_3"),
      new ajv("underwater_ruin/big_brick_8")
   };
   private static final ajv[] h = new ajv[]{
      new ajv("underwater_ruin/big_mossy_1"),
      new ajv("underwater_ruin/big_mossy_2"),
      new ajv("underwater_ruin/big_mossy_3"),
      new ajv("underwater_ruin/big_mossy_8")
   };
   private static final ajv[] i = new ajv[]{
      new ajv("underwater_ruin/big_cracked_1"),
      new ajv("underwater_ruin/big_cracked_2"),
      new ajv("underwater_ruin/big_cracked_3"),
      new ajv("underwater_ruin/big_cracked_8")
   };
   private static final ajv[] j = new ajv[]{
      new ajv("underwater_ruin/big_warm_4"),
      new ajv("underwater_ruin/big_warm_5"),
      new ajv("underwater_ruin/big_warm_6"),
      new ajv("underwater_ruin/big_warm_7")
   };

   private static ejn a(dch $$0, dch $$1, ajv $$2) {
      return new eiw(new ejj(List.of(new ejf(new eit($$0), eio.b, ejc.b, $$1.n(), new eju($$2)))), bnh.a(5));
   }

   private static ajv a(axt $$0) {
      return ac.a(c, $$0);
   }

   private static ajv b(axt $$0) {
      return ac.a(j, $$0);
   }

   public static void a(ejr $$0, id $$1, dit $$2, efv $$3, axt $$4, eic $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(ejr $$0, axt $$1, dit $$2, id $$3, eic $$4, efv $$5) {
      id $$6 = new id($$3.u(), 90, $$3.w());
      id $$7 = ejq.a(new id(15, 0, 15), dhd.a, $$2, id.c).a((ji)$$6);
      efi $$8 = efi.a($$6, $$7);
      id $$9 = new id(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<id> $$10 = a($$1, $$9);
      int $$11 = axm.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            id $$14 = $$10.remove($$13);
            dit $$15 = dit.a($$1);
            id $$16 = ejq.a(new id(5, 0, 6), dhd.a, $$15, id.c).a((ji)$$14);
            efi $$17 = efi.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<id> a(axt $$0, id $$1) {
      List<id> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + axm.a($$0, 1, 8), 0, 16 + axm.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + axm.a($$0, 1, 8), 0, axm.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + axm.a($$0, 1, 8), 0, -16 + axm.a($$0, 4, 8)));
      $$2.add($$1.b(axm.a($$0, 1, 7), 0, 16 + axm.a($$0, 1, 7)));
      $$2.add($$1.b(axm.a($$0, 1, 7), 0, -16 + axm.a($$0, 4, 6)));
      $$2.add($$1.b(16 + axm.a($$0, 1, 7), 0, 16 + axm.a($$0, 3, 8)));
      $$2.add($$1.b(16 + axm.a($$0, 1, 7), 0, axm.a($$0, 1, 7)));
      $$2.add($$1.b(16 + axm.a($$0, 1, 7), 0, -16 + axm.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(ejr $$0, id $$1, dit $$2, efv $$3, axt $$4, eic $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            ajv $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eib.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            ajv[] $$9 = $$6 ? g : d;
            ajv[] $$10 = $$6 ? i : e;
            ajv[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eib.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eib.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eib.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends ega {
      private final eic.a h;
      private final float i;
      private final boolean j;

      public a(ejr $$0, ajv $$1, id $$2, dit $$3, float $$4, eic.a $$5, boolean $$6) {
         super(egh.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(ejr $$0, to $$1, dit $$2, float $$3, eic.a $$4, boolean $$5) {
         super(egh.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static ejm a(dit $$0, float $$1, eic.a $$2) {
         ejn $$3 = $$2 == eic.a.b ? eib.b : eib.a;
         return new ejm().a($$0).a(dhd.a).a(new eiu($$1)).a(eis.d).a($$3);
      }

      public static eib.a a(ejr $$0, to $$1) {
         dit $$2 = dit.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         eic.a $$4 = eic.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eib.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(egg $$0, to $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, id $$1, czv $$2, axt $$3, efi $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dcj.cv.n().a(ddk.e, Boolean.valueOf($$2.b_($$1).a(avj.a))), 2);
            dmo $$5 = $$2.c_($$1);
            if ($$5 instanceof dmv) {
               ((dmv)$$5).a(this.j ? eni.F : eni.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cgu $$6 = bqg.B.a((czg)$$2.E());
            if ($$6 != null) {
               $$6.fS();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bqx.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dcj.a.n(), 2);
               } else {
                  $$2.a($$1, dcj.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
         int $$7 = $$0.a(dva.a.c, this.d.u(), this.d.w());
         this.d = new id(this.d.u(), $$7, this.d.w());
         id $$8 = ejq.a(new id(this.b.a().u() - 1, 0, this.b.a().w() - 1), dhd.a, this.c.d(), id.c).a((ji)this.d);
         this.d = new id(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(id $$0, cym $$1, id $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (id $$7 : id.a($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            id.a $$11 = new id.a($$8, $$10, $$9);
            dpi $$12 = $$1.a_($$11);

            for (elb $$13 = $$1.b_($$11); ($$12.i() || $$13.a(avj.a) || $$12.a(ave.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
