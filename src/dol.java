import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dol extends dhv implements dhp, dmd {
   public static final MapCodec<dol> a = b(dol::new);
   protected static final float b = 6.0F;
   protected static final ezq c = dhm.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dol> a() {
      return a;
   }

   protected dol(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.c($$1, $$2, jk.b) && !$$0.a(dho.kJ);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      return $$1.a(axb.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      dus $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.l()) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return $$0.a_($$1.d()).a(dho.G);
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   protected eqt b_(dus $$0) {
      return equ.c.a(false);
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      dus $$4 = dho.bx.n();
      dus $$5 = $$4.b(dpt.d, dvo.a);
      jf $$6 = $$2.d();
      $$0.a($$2, $$4, 2);
      $$0.a($$6, $$5, 2);
   }

   @Override
   public boolean a(@Nullable cnx $$0, ddo $$1, jf $$2, dus $$3, eqs $$4) {
      return false;
   }

   @Override
   public boolean a(dek $$0, jf $$1, dus $$2, eqt $$3) {
      return false;
   }
}
