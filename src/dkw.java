import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkw extends deh implements deb, dip {
   public static final MapCodec<dkw> a = b(dkw::new);
   protected static final float b = 6.0F;
   protected static final evd c = ddy.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dkw> a() {
      return a;
   }

   protected dkw(dra.d $$0) {
      super($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c;
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.d($$1, $$2, it.b) && !$$0.a(dea.kJ);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      return $$1.a(awb.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      drb $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return true;
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   protected emu b_(drb $$0) {
      return emv.c.a(false);
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      drb $$4 = dea.bx.n();
      drb $$5 = $$4.a(dme.d, drx.a);
      io $$6 = $$2.c();
      if ($$0.a_($$6).a(dea.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
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
