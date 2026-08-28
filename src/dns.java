import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dns extends dnc implements dof {
   public static final MapCodec<dns> c = b(dns::new);
   protected static final fbu g = djm.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dns> a() {
      return c;
   }

   protected dns(dww.d $$0) {
      super($$0, jn.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dwx $$0) {
      return $$0.a(djo.J);
   }

   @Override
   protected djm b() {
      return djo.mF;
   }

   @Override
   protected boolean o(dwx $$0) {
      return !$$0.a(djo.ll);
   }

   @Override
   public boolean a(@Nullable cox $$0, dfn $$1, ji $$2, dwx $$3, esy $$4) {
      return false;
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwx $$2, esz $$3) {
      return false;
   }

   @Override
   protected int a(azh $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      esz $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected esz b_(dwx $$0) {
      return eta.c.a(false);
   }
}
