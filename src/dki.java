import com.mojang.serialization.MapCodec;

public class dki extends ddy implements deb {
   public static final MapCodec<dki> a = b(dki::new);

   @Override
   public MapCodec<dki> a() {
      return a;
   }

   public dki(dra.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      $$0.b($$2.d(), dea.sG.n());
   }

   @Override
   public io a(io $$0) {
      return $$0.d();
   }
}
