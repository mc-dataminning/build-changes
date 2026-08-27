import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class div extends dch implements dcb, dgo {
   public static final MapCodec<div> a = b(div::new);
   protected static final float b = 6.0F;
   protected static final est c = dby.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<div> a() {
      return a;
   }

   protected div(doy.d $$0) {
      super($$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c;
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.d($$1, $$2, ih.b) && !$$0.a(dca.kJ);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      eks $$1 = $$0.q().b_($$0.a());
      return $$1.a(avh.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      doz $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      return true;
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return true;
   }

   @Override
   protected eks c_(doz $$0) {
      return ekt.c.a(false);
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      doz $$4 = dca.bx.n();
      doz $$5 = $$4.a(dkd.d, dpv.a);
      ib $$6 = $$2.c();
      if ($$0.a_($$6).a(dca.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cjt $$0, cyd $$1, ib $$2, doz $$3, ekr $$4) {
      return false;
   }

   @Override
   public boolean a(cyy $$0, ib $$1, doz $$2, eks $$3) {
      return false;
   }
}
