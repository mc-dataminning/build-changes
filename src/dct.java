import com.mojang.serialization.MapCodec;

public class dct extends dch {
   public static final MapCodec<dct> a = b(dct::new);
   public static final int b = 6;
   public static final dqi c = dpy.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final etc[] g = new etc[]{
      dch.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dch.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dch.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dch.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dch.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dch.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dch.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dct> a() {
      return a;
   }

   protected dct(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      crn $$7 = $$0.f();
      if ($$0.a(avm.ai) && $$1.c(c) == 0 && dch.a($$7) instanceof dcw $$8) {
         if (!$$4.f()) {
            $$0.g(1);
         }

         $$2.a(null, $$3, auo.dr, aup.e, 1.0F, 1.0F);
         $$2.b($$3, dcx.a($$8));
         $$2.a($$4, dub.c, $$3);
         $$4.b(auz.c.b($$7));
         return boh.a;
      } else {
         return boh.d;
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bof.a;
         }

         if ($$3.b(boe.a).d()) {
            return bof.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bof a(czh $$0, id $$1, dpi $$2, cka $$3) {
      if (!$$3.s(false)) {
         return bof.d;
      } else {
         $$3.a(auz.U);
         $$3.gj().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dub.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dub.f, $$1);
         }

         return bof.a;
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1 == ij.a && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
