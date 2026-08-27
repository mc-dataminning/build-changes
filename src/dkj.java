import com.mojang.serialization.MapCodec;

public class dkj extends dcq implements dck {
   public static final MapCodec<dkj> a = b(dkj::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dqi c = dpy.as;
   private static final etc e = dch.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final etc f = dch.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   public dkj(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return new crs(crv.wn);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dpi $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dpi $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dub.c, $$2, dub.a.a($$5));
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if ($$3 instanceof bqt && $$3.ai() != bqg.Q && $$3.ai() != bqg.h) {
         $$3.a($$0, new esj(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ac != $$3.dr() || $$3.ae != $$3.dx())) {
            double $$4 = Math.abs($$3.dr() - $$3.ac);
            double $$5 = Math.abs($$3.dx() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ai().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(crv.rx) ? boh.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new crs(crv.wn, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, auo.yW, aup.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dpi $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dub.c, $$2, dub.a.a($$3, $$8));
         return bof.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
