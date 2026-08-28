import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnt extends dnd implements dog {
   public static final MapCodec<dnt> c = b(dnt::new);
   protected static final fbv g = djn.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dnt> a() {
      return c;
   }

   protected dnt(dwx.d $$0) {
      super($$0, jn.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dwy $$0) {
      return $$0.a(djp.J);
   }

   @Override
   protected djn b() {
      return djp.mF;
   }

   @Override
   protected boolean o(dwy $$0) {
      return !$$0.a(djp.ll);
   }

   @Override
   public boolean a(@Nullable coy $$0, dfo $$1, ji $$2, dwy $$3, esz $$4) {
      return false;
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dwy $$2, eta $$3) {
      return false;
   }

   @Override
   protected int a(azh $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eta b_(dwy $$0) {
      return etb.c.a(false);
   }
}
