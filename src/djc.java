import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djc extends din implements djp {
   public static final MapCodec<djc> c = b(djc::new);
   protected static final ewj g = dey.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<djc> a() {
      return c;
   }

   protected djc(dsa.d $$0) {
      super($$0, je.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dsb $$0) {
      return $$0.a(dfa.G);
   }

   @Override
   protected dey b() {
      return dfa.md;
   }

   @Override
   protected boolean m(dsb $$0) {
      return !$$0.a(dfa.kJ);
   }

   @Override
   public boolean a(@Nullable cmw $$0, dbd $$1, iz $$2, dsb $$3, ent $$4) {
      return false;
   }

   @Override
   public boolean a(dby $$0, iz $$1, dsb $$2, enu $$3) {
      return false;
   }

   @Override
   protected int a(azg $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());
      return $$1.a(awu.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected enu b_(dsb $$0) {
      return env.c.a(false);
   }
}
