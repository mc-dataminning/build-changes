import com.mojang.serialization.MapCodec;

public class dis extends dii implements deb {
   public static final MapCodec<dis> a = b(dis::new);

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   public dis(dra.d $$0) {
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
      $$0.a($$2.d(), dit.c(), 2);
   }

   @Override
   public io a(io $$0) {
      return $$0.d();
   }
}
