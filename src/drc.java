import com.mojang.serialization.MapCodec;

public class drc extends diz {
   public static final MapCodec<drc> c = b(drc::new);

   @Override
   public MapCodec<drc> a() {
      return c;
   }

   public drc(dww.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : djo.a.m();
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dwx $$0) {
      return $$0.a(awp.aV);
   }

   @Override
   protected boolean g(dwx $$0) {
      return true;
   }
}
