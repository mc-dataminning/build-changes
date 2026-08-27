import com.mojang.serialization.MapCodec;

public class dem extends dea {
   public static final MapCodec<dem> a = b(dem::new);
   public static final int b = 6;
   public static final dsd c = drt.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final evf[] g = new evf[]{
      dea.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dea.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dea.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dea.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dea.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dea.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dea.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   protected dem(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      ctl $$7 = $$0.g();
      if ($$0.a(awf.aJ) && $$1.c(c) == 0 && dea.a($$7) instanceof dep $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, avi.dr, avj.e, 1.0F, 1.0F);
         $$2.b($$3, deq.a($$8));
         $$2.a($$4, dvw.c, $$3);
         $$4.b(avs.c.b($$7));
         return bpy.a;
      } else {
         return bpy.d;
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bpw.a;
         }

         if ($$3.b(bpv.a).e()) {
            return bpw.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bpw a(dba $$0, io $$1, drd $$2, cly $$3) {
      if (!$$3.t(false)) {
         return bpw.d;
      } else {
         $$3.a(avs.U);
         $$3.gm().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dvw.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dvw.f, $$1);
         }

         return bpw.a;
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1 == it.a && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
