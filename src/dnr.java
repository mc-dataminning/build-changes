import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnr extends dnb implements doe {
   public static final MapCodec<dnr> c = b(dnr::new);
   protected static final fbt g = djl.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dnr> a() {
      return c;
   }

   protected dnr(dwv.d $$0) {
      super($$0, jn.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dww $$0) {
      return $$0.a(djn.J);
   }

   @Override
   protected djl b() {
      return djn.mF;
   }

   @Override
   protected boolean o(dww $$0) {
      return !$$0.a(djn.ll);
   }

   @Override
   public boolean a(@Nullable cow $$0, dfm $$1, ji $$2, dww $$3, esx $$4) {
      return false;
   }

   @Override
   public boolean a(dgi $$0, ji $$1, dww $$2, esy $$3) {
      return false;
   }

   @Override
   protected int a(azh $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected esy b_(dww $$0) {
      return esz.c.a(false);
   }
}
