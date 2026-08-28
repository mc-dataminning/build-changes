import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlq extends dlb implements dmd {
   public static final MapCodec<dlq> c = b(dlq::new);
   protected static final ezq g = dhm.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dlq> a() {
      return c;
   }

   protected dlq(dur.d $$0) {
      super($$0, jk.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dus $$0) {
      return $$0.a(dho.G);
   }

   @Override
   protected dhm b() {
      return dho.md;
   }

   @Override
   protected boolean o(dus $$0) {
      return !$$0.a(dho.kJ);
   }

   @Override
   public boolean a(@Nullable cnx $$0, ddo $$1, jf $$2, dus $$3, eqs $$4) {
      return false;
   }

   @Override
   public boolean a(dek $$0, jf $$1, dus $$2, eqt $$3) {
      return false;
   }

   @Override
   protected int a(azn $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      eqt $$1 = $$0.q().b_($$0.a());
      return $$1.a(axb.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eqt b_(dus $$0) {
      return equ.c.a(false);
   }
}
