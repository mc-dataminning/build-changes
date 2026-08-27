import com.mojang.serialization.MapCodec;

public class dmd extends dej implements ded {
   public static final MapCodec<dmd> a = b(dmd::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dsd c = drt.as;
   private static final evf e = dea.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final evf f = dea.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   public dmd(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return new ctq(ctt.wr);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(drd $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         drd $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dvw.c, $$2, dvw.a.a($$5));
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if ($$3 instanceof bsq && $$3.ak() != bsc.Q && $$3.ak() != bsc.h) {
         $$3.a($$0, new eum(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ad != $$3.du() || $$3.af != $$3.dA())) {
            double $$4 = Math.abs($$3.du() - $$3.ad);
            double $$5 = Math.abs($$3.dA() - $$3.af);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ai().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(ctt.ry) ? bpy.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new ctq(ctt.wr, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, avi.zp, avj.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         drd $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dvw.c, $$2, dvw.a.a($$3, $$8));
         return bpw.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
