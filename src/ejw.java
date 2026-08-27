import com.google.common.collect.Lists;
import java.util.List;

public class ejw {
   static final eli a = a(dec.I, dec.J, epf.bf);
   static final eli b = a(dec.L, dec.M, epf.bg);
   private static final akn[] c = new akn[]{
      new akn("underwater_ruin/warm_1"),
      new akn("underwater_ruin/warm_2"),
      new akn("underwater_ruin/warm_3"),
      new akn("underwater_ruin/warm_4"),
      new akn("underwater_ruin/warm_5"),
      new akn("underwater_ruin/warm_6"),
      new akn("underwater_ruin/warm_7"),
      new akn("underwater_ruin/warm_8")
   };
   private static final akn[] d = new akn[]{
      new akn("underwater_ruin/brick_1"),
      new akn("underwater_ruin/brick_2"),
      new akn("underwater_ruin/brick_3"),
      new akn("underwater_ruin/brick_4"),
      new akn("underwater_ruin/brick_5"),
      new akn("underwater_ruin/brick_6"),
      new akn("underwater_ruin/brick_7"),
      new akn("underwater_ruin/brick_8")
   };
   private static final akn[] e = new akn[]{
      new akn("underwater_ruin/cracked_1"),
      new akn("underwater_ruin/cracked_2"),
      new akn("underwater_ruin/cracked_3"),
      new akn("underwater_ruin/cracked_4"),
      new akn("underwater_ruin/cracked_5"),
      new akn("underwater_ruin/cracked_6"),
      new akn("underwater_ruin/cracked_7"),
      new akn("underwater_ruin/cracked_8")
   };
   private static final akn[] f = new akn[]{
      new akn("underwater_ruin/mossy_1"),
      new akn("underwater_ruin/mossy_2"),
      new akn("underwater_ruin/mossy_3"),
      new akn("underwater_ruin/mossy_4"),
      new akn("underwater_ruin/mossy_5"),
      new akn("underwater_ruin/mossy_6"),
      new akn("underwater_ruin/mossy_7"),
      new akn("underwater_ruin/mossy_8")
   };
   private static final akn[] g = new akn[]{
      new akn("underwater_ruin/big_brick_1"),
      new akn("underwater_ruin/big_brick_2"),
      new akn("underwater_ruin/big_brick_3"),
      new akn("underwater_ruin/big_brick_8")
   };
   private static final akn[] h = new akn[]{
      new akn("underwater_ruin/big_mossy_1"),
      new akn("underwater_ruin/big_mossy_2"),
      new akn("underwater_ruin/big_mossy_3"),
      new akn("underwater_ruin/big_mossy_8")
   };
   private static final akn[] i = new akn[]{
      new akn("underwater_ruin/big_cracked_1"),
      new akn("underwater_ruin/big_cracked_2"),
      new akn("underwater_ruin/big_cracked_3"),
      new akn("underwater_ruin/big_cracked_8")
   };
   private static final akn[] j = new akn[]{
      new akn("underwater_ruin/big_warm_4"),
      new akn("underwater_ruin/big_warm_5"),
      new akn("underwater_ruin/big_warm_6"),
      new akn("underwater_ruin/big_warm_7")
   };

   private static eli a(dea $$0, dea $$1, akm<epm> $$2) {
      return new ekr(new ele(List.of(new ela(new eko($$0), ekj.b, ekx.b, $$1.n(), new elp($$2)))), boy.a(5));
   }

   private static akn a(aym $$0) {
      return ac.a(c, $$0);
   }

   private static akn b(aym $$0) {
      return ac.a(j, $$0);
   }

   public static void a(elm $$0, io $$1, dkn $$2, ehq $$3, aym $$4, ejx $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(elm $$0, aym $$1, dkn $$2, io $$3, ejx $$4, ehq $$5) {
      io $$6 = new io($$3.u(), 90, $$3.w());
      io $$7 = ell.a(new io(15, 0, 15), dix.a, $$2, io.c).a((js)$$6);
      ehd $$8 = ehd.a($$6, $$7);
      io $$9 = new io(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<io> $$10 = a($$1, $$9);
      int $$11 = ayf.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            io $$14 = $$10.remove($$13);
            dkn $$15 = dkn.a($$1);
            io $$16 = ell.a(new io(5, 0, 6), dix.a, $$15, io.c).a((js)$$14);
            ehd $$17 = ehd.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<io> a(aym $$0, io $$1) {
      List<io> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ayf.a($$0, 1, 8), 0, 16 + ayf.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayf.a($$0, 1, 8), 0, ayf.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayf.a($$0, 1, 8), 0, -16 + ayf.a($$0, 4, 8)));
      $$2.add($$1.b(ayf.a($$0, 1, 7), 0, 16 + ayf.a($$0, 1, 7)));
      $$2.add($$1.b(ayf.a($$0, 1, 7), 0, -16 + ayf.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ayf.a($$0, 1, 7), 0, 16 + ayf.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ayf.a($$0, 1, 7), 0, ayf.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ayf.a($$0, 1, 7), 0, -16 + ayf.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(elm $$0, io $$1, dkn $$2, ehq $$3, aym $$4, ejx $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            akn $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new ejw.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            akn[] $$9 = $$6 ? g : d;
            akn[] $$10 = $$6 ? i : e;
            akn[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new ejw.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new ejw.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new ejw.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends ehv {
      private final ejx.a h;
      private final float i;
      private final boolean j;

      public a(elm $$0, akn $$1, io $$2, dkn $$3, float $$4, ejx.a $$5, boolean $$6) {
         super(eic.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(elm $$0, ud $$1, dkn $$2, float $$3, ejx.a $$4, boolean $$5) {
         super(eic.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static elh a(dkn $$0, float $$1, ejx.a $$2) {
         eli $$3 = $$2 == ejx.a.b ? ejw.b : ejw.a;
         return new elh().a($$0).a(dix.a).a(new ekp($$1)).a(ekn.d).a($$3);
      }

      public static ejw.a a(elm $$0, ud $$1) {
         dkn $$2 = dkn.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         ejx.a $$4 = ejx.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new ejw.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(eib $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, io $$1, dbo $$2, aym $$3, ehd $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dec.cv.n().a(dfd.e, Boolean.valueOf($$2.b_($$1).a(awc.a))), 2);
            doi $$5 = $$2.c_($$1);
            if ($$5 instanceof dop) {
               ((dop)$$5).a(this.j ? epf.F : epf.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            cis $$6 = bsc.B.a((daz)$$2.E());
            if ($$6 != null) {
               $$6.fT();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bsu.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dec.a.n(), 2);
               } else {
                  $$2.a($$1, dec.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(dbu $$0, dbs $$1, dta $$2, aym $$3, ehd $$4, dag $$5, io $$6) {
         int $$7 = $$0.a(dwv.a.c, this.d.u(), this.d.w());
         this.d = new io(this.d.u(), $$7, this.d.w());
         io $$8 = ell.a(new io(this.b.a().u() - 1, 0, this.b.a().w() - 1), dix.a, this.c.d(), io.c).a((js)this.d);
         this.d = new io(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(io $$0, daf $$1, io $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (io $$7 : io.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            io.a $$11 = new io.a($$8, $$10, $$9);
            drd $$12 = $$1.a_($$11);

            for (emw $$13 = $$1.b_($$11); ($$12.i() || $$13.a(awc.a) || $$12.a(avx.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
