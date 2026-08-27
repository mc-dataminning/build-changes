import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dme extends dgg implements dip {
   public static final MapCodec<dme> c = b(dme::new);
   public static final drz<drx> d = dgg.b;
   protected static final float e = 6.0F;
   protected static final evd f = ddy.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dme> a() {
      return c;
   }

   public dme(dra.d $$0) {
      super($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return f;
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.d($$1, $$2, it.b) && !$$0.a(dea.kJ);
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return new cto(dea.bw);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      drb $$1 = super.a($$0);
      if ($$1 != null) {
         emu $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(awb.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      if ($$0.c(d) == drx.a) {
         drb $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == drx.b;
      } else {
         emu $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awb.a) && $$4.e() == 8;
      }
   }

   @Override
   protected emu b_(drb $$0) {
      return emv.c.a(false);
   }

   @Override
   public boolean a(@Nullable clw $$0, dad $$1, io $$2, drb $$3, emt $$4) {
      return false;
   }

   @Override
   public boolean a(day $$0, io $$1, drb $$2, emu $$3) {
      return false;
   }
}
