import com.google.common.collect.Lists;
import java.util.List;

public class ena {
   static final eon a = a(dgx.I, dgx.J, esp.aW);
   static final eon b = a(dgx.L, dgx.M, esp.aX);
   private static final alb[] c = new alb[]{
      alb.b("underwater_ruin/warm_1"),
      alb.b("underwater_ruin/warm_2"),
      alb.b("underwater_ruin/warm_3"),
      alb.b("underwater_ruin/warm_4"),
      alb.b("underwater_ruin/warm_5"),
      alb.b("underwater_ruin/warm_6"),
      alb.b("underwater_ruin/warm_7"),
      alb.b("underwater_ruin/warm_8")
   };
   private static final alb[] d = new alb[]{
      alb.b("underwater_ruin/brick_1"),
      alb.b("underwater_ruin/brick_2"),
      alb.b("underwater_ruin/brick_3"),
      alb.b("underwater_ruin/brick_4"),
      alb.b("underwater_ruin/brick_5"),
      alb.b("underwater_ruin/brick_6"),
      alb.b("underwater_ruin/brick_7"),
      alb.b("underwater_ruin/brick_8")
   };
   private static final alb[] e = new alb[]{
      alb.b("underwater_ruin/cracked_1"),
      alb.b("underwater_ruin/cracked_2"),
      alb.b("underwater_ruin/cracked_3"),
      alb.b("underwater_ruin/cracked_4"),
      alb.b("underwater_ruin/cracked_5"),
      alb.b("underwater_ruin/cracked_6"),
      alb.b("underwater_ruin/cracked_7"),
      alb.b("underwater_ruin/cracked_8")
   };
   private static final alb[] f = new alb[]{
      alb.b("underwater_ruin/mossy_1"),
      alb.b("underwater_ruin/mossy_2"),
      alb.b("underwater_ruin/mossy_3"),
      alb.b("underwater_ruin/mossy_4"),
      alb.b("underwater_ruin/mossy_5"),
      alb.b("underwater_ruin/mossy_6"),
      alb.b("underwater_ruin/mossy_7"),
      alb.b("underwater_ruin/mossy_8")
   };
   private static final alb[] g = new alb[]{
      alb.b("underwater_ruin/big_brick_1"), alb.b("underwater_ruin/big_brick_2"), alb.b("underwater_ruin/big_brick_3"), alb.b("underwater_ruin/big_brick_8")
   };
   private static final alb[] h = new alb[]{
      alb.b("underwater_ruin/big_mossy_1"), alb.b("underwater_ruin/big_mossy_2"), alb.b("underwater_ruin/big_mossy_3"), alb.b("underwater_ruin/big_mossy_8")
   };
   private static final alb[] i = new alb[]{
      alb.b("underwater_ruin/big_cracked_1"),
      alb.b("underwater_ruin/big_cracked_2"),
      alb.b("underwater_ruin/big_cracked_3"),
      alb.b("underwater_ruin/big_cracked_8")
   };
   private static final alb[] j = new alb[]{
      alb.b("underwater_ruin/big_warm_4"), alb.b("underwater_ruin/big_warm_5"), alb.b("underwater_ruin/big_warm_6"), alb.b("underwater_ruin/big_warm_7")
   };

   private static eon a(dgv $$0, dgv $$1, ala<esy> $$2) {
      return new env(new eoj(List.of(new eof(new ens($$0), enn.b, eoc.b, $$1.o(), new eou($$2)))), bqm.a(5));
   }

   private static alb a(azk $$0) {
      return ad.a(c, $$0);
   }

   private static alb b(azk $$0) {
      return ad.a(j, $$0);
   }

   public static void a(eor $$0, je $$1, dnj $$2, ekt $$3, azk $$4, enb $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(eor $$0, azk $$1, dnj $$2, je $$3, enb $$4, ekt $$5) {
      je $$6 = new je($$3.u(), 90, $$3.w());
      je $$7 = eoq.a(new je(15, 0, 15), dls.a, $$2, je.c).a((ki)$$6);
      ekg $$8 = ekg.a($$6, $$7);
      je $$9 = new je(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<je> $$10 = a($$1, $$9);
      int $$11 = azc.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            je $$14 = $$10.remove($$13);
            dnj $$15 = dnj.a($$1);
            je $$16 = eoq.a(new je(5, 0, 6), dls.a, $$15, je.c).a((ki)$$14);
            ekg $$17 = ekg.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<je> a(azk $$0, je $$1) {
      List<je> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + azc.a($$0, 1, 8), 0, 16 + azc.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azc.a($$0, 1, 8), 0, azc.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + azc.a($$0, 1, 8), 0, -16 + azc.a($$0, 4, 8)));
      $$2.add($$1.b(azc.a($$0, 1, 7), 0, 16 + azc.a($$0, 1, 7)));
      $$2.add($$1.b(azc.a($$0, 1, 7), 0, -16 + azc.a($$0, 4, 6)));
      $$2.add($$1.b(16 + azc.a($$0, 1, 7), 0, 16 + azc.a($$0, 3, 8)));
      $$2.add($$1.b(16 + azc.a($$0, 1, 7), 0, azc.a($$0, 1, 7)));
      $$2.add($$1.b(16 + azc.a($$0, 1, 7), 0, -16 + azc.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(eor $$0, je $$1, dnj $$2, ekt $$3, azk $$4, enb $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            alb $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new ena.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            alb[] $$9 = $$6 ? g : d;
            alb[] $$10 = $$6 ? i : e;
            alb[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new ena.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new ena.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new ena.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends eky {
      private final enb.a h;
      private final float i;
      private final boolean j;

      public a(eor $$0, alb $$1, je $$2, dnj $$3, float $$4, enb.a $$5, boolean $$6) {
         super(elf.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(eor $$0, uf $$1, dnj $$2, float $$3, enb.a $$4, boolean $$5) {
         super(elf.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static eom a(dnj $$0, float $$1, enb.a $$2) {
         eon $$3 = $$2 == enb.a.b ? ena.b : ena.a;
         return new eom().a($$0).a(dls.a).a(new ent($$1)).a(enr.d).a($$3);
      }

      public static ena.a a(eor $$0, uf $$1) {
         dnj $$2 = dnj.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         enb.a $$4 = enb.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new ena.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(ele $$0, uf $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, je $$1, dei $$2, azk $$3, ekg $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dgx.cv.o().b(dhy.e, Boolean.valueOf($$2.b_($$1).a(awy.a))), 2);
            dre $$5 = $$2.c_($$1);
            if ($$5 instanceof drl) {
               ((drl)$$5).a(this.j ? esp.F : esp.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            ckj $$6 = btq.B.a($$2.E(), btp.d);
            if ($$6 != null) {
               $$6.fV();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), btp.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.N()) {
                  $$2.a($$1, dgx.a.o(), 2);
               } else {
                  $$2.a($$1, dgx.G.o(), 2);
               }
            }
         }
      }

      @Override
      public void a(dep $$0, den $$1, dvx $$2, azk $$3, ekg $$4, dcy $$5, je $$6) {
         int $$7 = $$0.a(dzw.a.c, this.d.u(), this.d.w());
         this.d = new je(this.d.u(), $$7, this.d.w());
         je $$8 = eoq.a(new je(this.b.a().u() - 1, 0, this.b.a().w() - 1), dls.a, this.c.d(), je.c).a((ki)this.d);
         this.d = new je(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(je $$0, dcx $$1, je $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (je $$7 : je.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            je.a $$11 = new je.a($$8, $$10, $$9);
            dua $$12 = $$1.a_($$11);

            for (eqb $$13 = $$1.b_($$11); ($$12.l() || $$13.a(awy.a) || $$12.a(aws.an)) && $$10 > $$1.G_() + 1; $$13 = $$1.b_($$11)) {
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
