import com.google.common.collect.Lists;
import java.util.List;

public class eno {
   static final epb a = a(dhl.I, dhl.J, etd.aW);
   static final epb b = a(dhl.L, dhl.M, etd.aX);
   private static final alc[] c = new alc[]{
      alc.b("underwater_ruin/warm_1"),
      alc.b("underwater_ruin/warm_2"),
      alc.b("underwater_ruin/warm_3"),
      alc.b("underwater_ruin/warm_4"),
      alc.b("underwater_ruin/warm_5"),
      alc.b("underwater_ruin/warm_6"),
      alc.b("underwater_ruin/warm_7"),
      alc.b("underwater_ruin/warm_8")
   };
   private static final alc[] d = new alc[]{
      alc.b("underwater_ruin/brick_1"),
      alc.b("underwater_ruin/brick_2"),
      alc.b("underwater_ruin/brick_3"),
      alc.b("underwater_ruin/brick_4"),
      alc.b("underwater_ruin/brick_5"),
      alc.b("underwater_ruin/brick_6"),
      alc.b("underwater_ruin/brick_7"),
      alc.b("underwater_ruin/brick_8")
   };
   private static final alc[] e = new alc[]{
      alc.b("underwater_ruin/cracked_1"),
      alc.b("underwater_ruin/cracked_2"),
      alc.b("underwater_ruin/cracked_3"),
      alc.b("underwater_ruin/cracked_4"),
      alc.b("underwater_ruin/cracked_5"),
      alc.b("underwater_ruin/cracked_6"),
      alc.b("underwater_ruin/cracked_7"),
      alc.b("underwater_ruin/cracked_8")
   };
   private static final alc[] f = new alc[]{
      alc.b("underwater_ruin/mossy_1"),
      alc.b("underwater_ruin/mossy_2"),
      alc.b("underwater_ruin/mossy_3"),
      alc.b("underwater_ruin/mossy_4"),
      alc.b("underwater_ruin/mossy_5"),
      alc.b("underwater_ruin/mossy_6"),
      alc.b("underwater_ruin/mossy_7"),
      alc.b("underwater_ruin/mossy_8")
   };
   private static final alc[] g = new alc[]{
      alc.b("underwater_ruin/big_brick_1"), alc.b("underwater_ruin/big_brick_2"), alc.b("underwater_ruin/big_brick_3"), alc.b("underwater_ruin/big_brick_8")
   };
   private static final alc[] h = new alc[]{
      alc.b("underwater_ruin/big_mossy_1"), alc.b("underwater_ruin/big_mossy_2"), alc.b("underwater_ruin/big_mossy_3"), alc.b("underwater_ruin/big_mossy_8")
   };
   private static final alc[] i = new alc[]{
      alc.b("underwater_ruin/big_cracked_1"),
      alc.b("underwater_ruin/big_cracked_2"),
      alc.b("underwater_ruin/big_cracked_3"),
      alc.b("underwater_ruin/big_cracked_8")
   };
   private static final alc[] j = new alc[]{
      alc.b("underwater_ruin/big_warm_4"), alc.b("underwater_ruin/big_warm_5"), alc.b("underwater_ruin/big_warm_6"), alc.b("underwater_ruin/big_warm_7")
   };

   private static epb a(dhj $$0, dhj $$1, alb<etm> $$2) {
      return new eoj(new eox(List.of(new eot(new eog($$0), eob.b, eoq.b, $$1.o(), new epi($$2)))), bqr.a(5));
   }

   private static alc a(azl $$0) {
      return ad.a(c, $$0);
   }

   private static alc b(azl $$0) {
      return ad.a(j, $$0);
   }

   public static void a(epf $$0, je $$1, dnx $$2, elh $$3, azl $$4, enp $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(epf $$0, azl $$1, dnx $$2, je $$3, enp $$4, elh $$5) {
      je $$6 = new je($$3.u(), 90, $$3.w());
      je $$7 = epe.a(new je(15, 0, 15), dmg.a, $$2, je.c).a((ki)$$6);
      eku $$8 = eku.a($$6, $$7);
      je $$9 = new je(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<je> $$10 = a($$1, $$9);
      int $$11 = azd.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            je $$14 = $$10.remove($$13);
            dnx $$15 = dnx.a($$1);
            je $$16 = epe.a(new je(5, 0, 6), dmg.a, $$15, je.c).a((ki)$$14);
            eku $$17 = eku.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<je> a(azl $$0, je $$1) {
      List<je> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + azd.a($$0, 1, 8), 0, 16 + azd.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azd.a($$0, 1, 8), 0, azd.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azd.a($$0, 1, 8), 0, -16 + azd.a($$0, 4, 8)));
      $$2.add($$1.b(azd.a($$0, 1, 7), 0, 16 + azd.a($$0, 1, 7)));
      $$2.add($$1.b(azd.a($$0, 1, 7), 0, -16 + azd.a($$0, 4, 6)));
      $$2.add($$1.b(16 + azd.a($$0, 1, 7), 0, 16 + azd.a($$0, 3, 8)));
      $$2.add($$1.b(16 + azd.a($$0, 1, 7), 0, azd.a($$0, 1, 7)));
      $$2.add($$1.b(16 + azd.a($$0, 1, 7), 0, -16 + azd.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(epf $$0, je $$1, dnx $$2, elh $$3, azl $$4, enp $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alc $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eno.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alc[] $$9 = $$6 ? g : d;
            alc[] $$10 = $$6 ? i : e;
            alc[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eno.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eno.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eno.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends elm {
      private final enp.a h;
      private final float i;
      private final boolean j;

      public a(epf $$0, alc $$1, je $$2, dnx $$3, float $$4, enp.a $$5, boolean $$6) {
         super(elt.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(epf $$0, uf $$1, dnx $$2, float $$3, enp.a $$4, boolean $$5) {
         super(elt.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static epa a(dnx $$0, float $$1, enp.a $$2) {
         epb $$3 = $$2 == enp.a.b ? eno.b : eno.a;
         return new epa().a($$0).a(dmg.a).a(new eoh($$1)).a(eof.d).a($$3);
      }

      public static eno.a a(epf $$0, uf $$1) {
         dnx $$2 = dnx.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         enp.a $$4 = enp.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eno.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(els $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, je $$1, dew $$2, azl $$3, eku $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dhl.cv.o().b(dim.e, Boolean.valueOf($$2.b_($$1).a(awz.a))), 2);
            drs $$5 = $$2.c_($$1);
            if ($$5 instanceof drz) {
               ((drz)$$5).a(this.j ? etd.F : etd.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cko $$6 = btv.B.a($$2.E(), btu.d);
            if ($$6 != null) {
               $$6.fW();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), btu.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.N()) {
                  $$2.a($$1, dhl.a.o(), 2);
               } else {
                  $$2.a($$1, dhl.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
         int $$7 = $$0.a(eak.a.c, this.d.u(), this.d.w());
         this.d = new je(this.d.u(), $$7, this.d.w());
         je $$8 = epe.a(new je(this.b.a().u() - 1, 0, this.b.a().w() - 1), dmg.a, this.c.d(), je.c).a((ki)this.d);
         this.d = new je(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(je $$0, ddl $$1, je $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (je $$7 : je.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            je.a $$11 = new je.a($$8, $$10, $$9);
            duo $$12 = $$1.a_($$11);

            for (eqp $$13 = $$1.b_($$11); ($$12.l() || $$13.a(awz.a) || $$12.a(awt.an)) && $$10 > $$1.G_() + 1; $$13 = $$1.b_($$11)) {
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
