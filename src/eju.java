import com.google.common.collect.Lists;
import java.util.List;

public class eju {
   static final elg a = a(dea.I, dea.J, epd.bf);
   static final elg b = a(dea.L, dea.M, epd.bg);
   private static final akm[] c = new akm[]{
      new akm("underwater_ruin/warm_1"),
      new akm("underwater_ruin/warm_2"),
      new akm("underwater_ruin/warm_3"),
      new akm("underwater_ruin/warm_4"),
      new akm("underwater_ruin/warm_5"),
      new akm("underwater_ruin/warm_6"),
      new akm("underwater_ruin/warm_7"),
      new akm("underwater_ruin/warm_8")
   };
   private static final akm[] d = new akm[]{
      new akm("underwater_ruin/brick_1"),
      new akm("underwater_ruin/brick_2"),
      new akm("underwater_ruin/brick_3"),
      new akm("underwater_ruin/brick_4"),
      new akm("underwater_ruin/brick_5"),
      new akm("underwater_ruin/brick_6"),
      new akm("underwater_ruin/brick_7"),
      new akm("underwater_ruin/brick_8")
   };
   private static final akm[] e = new akm[]{
      new akm("underwater_ruin/cracked_1"),
      new akm("underwater_ruin/cracked_2"),
      new akm("underwater_ruin/cracked_3"),
      new akm("underwater_ruin/cracked_4"),
      new akm("underwater_ruin/cracked_5"),
      new akm("underwater_ruin/cracked_6"),
      new akm("underwater_ruin/cracked_7"),
      new akm("underwater_ruin/cracked_8")
   };
   private static final akm[] f = new akm[]{
      new akm("underwater_ruin/mossy_1"),
      new akm("underwater_ruin/mossy_2"),
      new akm("underwater_ruin/mossy_3"),
      new akm("underwater_ruin/mossy_4"),
      new akm("underwater_ruin/mossy_5"),
      new akm("underwater_ruin/mossy_6"),
      new akm("underwater_ruin/mossy_7"),
      new akm("underwater_ruin/mossy_8")
   };
   private static final akm[] g = new akm[]{
      new akm("underwater_ruin/big_brick_1"),
      new akm("underwater_ruin/big_brick_2"),
      new akm("underwater_ruin/big_brick_3"),
      new akm("underwater_ruin/big_brick_8")
   };
   private static final akm[] h = new akm[]{
      new akm("underwater_ruin/big_mossy_1"),
      new akm("underwater_ruin/big_mossy_2"),
      new akm("underwater_ruin/big_mossy_3"),
      new akm("underwater_ruin/big_mossy_8")
   };
   private static final akm[] i = new akm[]{
      new akm("underwater_ruin/big_cracked_1"),
      new akm("underwater_ruin/big_cracked_2"),
      new akm("underwater_ruin/big_cracked_3"),
      new akm("underwater_ruin/big_cracked_8")
   };
   private static final akm[] j = new akm[]{
      new akm("underwater_ruin/big_warm_4"),
      new akm("underwater_ruin/big_warm_5"),
      new akm("underwater_ruin/big_warm_6"),
      new akm("underwater_ruin/big_warm_7")
   };

   private static elg a(ddy $$0, ddy $$1, akl<epk> $$2) {
      return new ekp(new elc(List.of(new eky(new ekm($$0), ekh.b, ekv.b, $$1.n(), new eln($$2)))), bow.a(5));
   }

   private static akm a(ayk $$0) {
      return ac.a(c, $$0);
   }

   private static akm b(ayk $$0) {
      return ac.a(j, $$0);
   }

   public static void a(elk $$0, io $$1, dkl $$2, eho $$3, ayk $$4, ejv $$5) {
      boolean $$6 = $$4.i() <= $$5.f;
      float $$7 = $$6 ? 0.9F : 0.8F;
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$6 && $$4.i() <= $$5.g) {
         a($$0, $$4, $$2, $$1, $$5, $$3);
      }
   }

   private static void a(elk $$0, ayk $$1, dkl $$2, io $$3, ejv $$4, eho $$5) {
      io $$6 = new io($$3.u(), 90, $$3.w());
      io $$7 = elj.a(new io(15, 0, 15), div.a, $$2, io.c).a((js)$$6);
      ehb $$8 = ehb.a($$6, $$7);
      io $$9 = new io(Math.min($$6.u(), $$7.u()), $$6.v(), Math.min($$6.w(), $$7.w()));
      List<io> $$10 = a($$1, $$9);
      int $$11 = ayd.a($$1, 4, 8);

      for (int $$12 = 0; $$12 < $$11; $$12++) {
         if (!$$10.isEmpty()) {
            int $$13 = $$1.a($$10.size());
            io $$14 = $$10.remove($$13);
            dkl $$15 = dkl.a($$1);
            io $$16 = elj.a(new io(5, 0, 6), div.a, $$15, io.c).a((js)$$14);
            ehb $$17 = ehb.a($$14, $$16);
            if (!$$17.a($$8)) {
               a($$0, $$14, $$15, $$5, $$1, $$4, false, 0.8F);
            }
         }
      }
   }

   private static List<io> a(ayk $$0, io $$1) {
      List<io> $$2 = Lists.newArrayList();
      $$2.add($$1.b(-16 + ayd.a($$0, 1, 8), 0, 16 + ayd.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayd.a($$0, 1, 8), 0, ayd.a($$0, 1, 7)));
      $$2.add($$1.b(-16 + ayd.a($$0, 1, 8), 0, -16 + ayd.a($$0, 4, 8)));
      $$2.add($$1.b(ayd.a($$0, 1, 7), 0, 16 + ayd.a($$0, 1, 7)));
      $$2.add($$1.b(ayd.a($$0, 1, 7), 0, -16 + ayd.a($$0, 4, 6)));
      $$2.add($$1.b(16 + ayd.a($$0, 1, 7), 0, 16 + ayd.a($$0, 3, 8)));
      $$2.add($$1.b(16 + ayd.a($$0, 1, 7), 0, ayd.a($$0, 1, 7)));
      $$2.add($$1.b(16 + ayd.a($$0, 1, 7), 0, -16 + ayd.a($$0, 4, 8)));
      return $$2;
   }

   private static void a(elk $$0, io $$1, dkl $$2, eho $$3, ayk $$4, ejv $$5, boolean $$6, float $$7) {
      switch ($$5.e) {
         case a:
         default:
            akm $$8 = $$6 ? b($$4) : a($$4);
            $$3.a(new eju.a($$0, $$8, $$1, $$2, $$7, $$5.e, $$6));
            break;
         case b:
            akm[] $$9 = $$6 ? g : d;
            akm[] $$10 = $$6 ? i : e;
            akm[] $$11 = $$6 ? h : f;
            int $$12 = $$4.a($$9.length);
            $$3.a(new eju.a($$0, $$9[$$12], $$1, $$2, $$7, $$5.e, $$6));
            $$3.a(new eju.a($$0, $$10[$$12], $$1, $$2, 0.7F, $$5.e, $$6));
            $$3.a(new eju.a($$0, $$11[$$12], $$1, $$2, 0.5F, $$5.e, $$6));
      }
   }

   public static class a extends eht {
      private final ejv.a h;
      private final float i;
      private final boolean j;

      public a(elk $$0, akm $$1, io $$2, dkl $$3, float $$4, ejv.a $$5, boolean $$6) {
         super(eia.H, 0, $$0, $$1, $$1.toString(), a($$3, $$4, $$5), $$2);
         this.i = $$4;
         this.h = $$5;
         this.j = $$6;
      }

      private a(elk $$0, ud $$1, dkl $$2, float $$3, ejv.a $$4, boolean $$5) {
         super(eia.H, $$1, $$0, $$3x -> a($$2, $$3, $$4));
         this.i = $$3;
         this.h = $$4;
         this.j = $$5;
      }

      private static elf a(dkl $$0, float $$1, ejv.a $$2) {
         elg $$3 = $$2 == ejv.a.b ? eju.b : eju.a;
         return new elf().a($$0).a(div.a).a(new ekn($$1)).a(ekl.d).a($$3);
      }

      public static eju.a a(elk $$0, ud $$1) {
         dkl $$2 = dkl.valueOf($$1.l("Rot"));
         float $$3 = $$1.j("Integrity");
         ejv.a $$4 = ejv.a.valueOf($$1.l("BiomeType"));
         boolean $$5 = $$1.q("IsLarge");
         return new eju.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      @Override
      protected void a(ehz $$0, ud $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", this.c.d().name());
         $$1.a("Integrity", this.i);
         $$1.a("BiomeType", this.h.toString());
         $$1.a("IsLarge", this.j);
      }

      @Override
      protected void a(String $$0, io $$1, dbm $$2, ayk $$3, ehb $$4) {
         if ("chest".equals($$0)) {
            $$2.a($$1, dea.cv.n().a(dfb.e, Boolean.valueOf($$2.b_($$1).a(awb.a))), 2);
            dog $$5 = $$2.c_($$1);
            if ($$5 instanceof don) {
               ((don)$$5).a(this.j ? epd.F : epd.E, $$3.g());
            }
         } else if ("drowned".equals($$0)) {
            ciq $$6 = bsa.B.a((dax)$$2.E());
            if ($$6 != null) {
               $$6.fT();
               $$6.a($$1, 0.0F, 0.0F);
               $$6.a($$2, $$2.d_($$1), bss.d, null);
               $$2.a_($$6);
               if ($$1.v() > $$2.z_()) {
                  $$2.a($$1, dea.a.n(), 2);
               } else {
                  $$2.a($$1, dea.G.n(), 2);
               }
            }
         }
      }

      @Override
      public void a(dbs $$0, dbq $$1, dsy $$2, ayk $$3, ehb $$4, dae $$5, io $$6) {
         int $$7 = $$0.a(dwt.a.c, this.d.u(), this.d.w());
         this.d = new io(this.d.u(), $$7, this.d.w());
         io $$8 = elj.a(new io(this.b.a().u() - 1, 0, this.b.a().w() - 1), div.a, this.c.d(), io.c).a((js)this.d);
         this.d = new io(this.d.u(), this.a(this.d, $$0, $$8), this.d.w());
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }

      private int a(io $$0, dad $$1, io $$2) {
         int $$3 = $$0.v();
         int $$4 = 512;
         int $$5 = $$3 - 1;
         int $$6 = 0;

         for (io $$7 : io.c($$0, $$2)) {
            int $$8 = $$7.u();
            int $$9 = $$7.w();
            int $$10 = $$0.v() - 1;
            io.a $$11 = new io.a($$8, $$10, $$9);
            drb $$12 = $$1.a_($$11);

            for (emu $$13 = $$1.b_($$11); ($$12.i() || $$13.a(awb.a) || $$12.a(avw.am)) && $$10 > $$1.I_() + 1; $$13 = $$1.b_($$11)) {
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
