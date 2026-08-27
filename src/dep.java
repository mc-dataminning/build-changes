import com.mojang.serialization.MapCodec;

public class dep extends ddy {
   public static final MapCodec<dep> a = b(dep::new);
   protected static final evd b = ddy.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dep> a() {
      return a;
   }

   public dep(dra.d $$0) {
      super($$0);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return !$$1.u($$2.d());
   }
}
