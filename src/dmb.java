import com.mojang.serialization.MapCodec;

public class dmb extends deh implements deb {
   public static final MapCodec<dmb> a = b(dmb::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dsb c = drr.as;
   private static final evd e = ddy.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final evd f = ddy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dmb> a() {
      return a;
   }

   public dmb(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return new cto(ctr.wr);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(drb $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         drb $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dvu.c, $$2, dvu.a.a($$5));
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if ($$3 instanceof bso && $$3.ak() != bsa.Q && $$3.ak() != bsa.h) {
         $$3.a($$0, new euk(0.8F, 0.75, 0.8F));
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
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(ctr.ry) ? bpw.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cto(ctr.wr, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, avh.zp, avi.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         drb $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dvu.c, $$2, dvu.a.a($$3, $$8));
         return bpu.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
