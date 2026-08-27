import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dky extends dej implements ded, dir {
   public static final MapCodec<dky> a = b(dky::new);
   protected static final float b = 6.0F;
   protected static final evf c = dea.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   protected dky(drc.d $$0) {
      super($$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c;
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.d($$1, $$2, it.b) && !$$0.a(dec.kJ);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      return $$1.a(awc.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      drd $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return true;
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   protected emw b_(drd $$0) {
      return emx.c.a(false);
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      drd $$4 = dec.bx.n();
      drd $$5 = $$4.a(dmg.d, drz.a);
      io $$6 = $$2.c();
      if ($$0.a_($$6).a(dec.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cly $$0, daf $$1, io $$2, drd $$3, emv $$4) {
      return false;
   }

   @Override
   public boolean a(dba $$0, io $$1, drd $$2, emw $$3) {
      return false;
   }
}
