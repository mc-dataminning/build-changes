import com.mojang.serialization.MapCodec;

public class dkk extends dea implements ded {
   public static final MapCodec<dkk> a = b(dkk::new);

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   public dkk(drc.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      $$0.b($$2.d(), dec.sG.n());
   }

   @Override
   public io a(io $$0) {
      return $$0.d();
   }
}
