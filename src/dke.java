import com.mojang.serialization.MapCodec;

public class dke extends djm {
   public static final MapCodec<dke> a = b(dke::new);
   protected static final fbu b = djm.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dke> a() {
      return a;
   }

   public dke(dww.d $$0) {
      super($$0);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return !$$1.u($$2.e());
   }
}
