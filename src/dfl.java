import com.mojang.serialization.MapCodec;

public class dfl extends deu {
   public static final MapCodec<dfl> a = b(dfl::new);
   protected static final ewf b = deu.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dfl> a() {
      return a;
   }

   public dfl(drw.d $$0) {
      super($$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return !$$1.u($$2.d());
   }
}
