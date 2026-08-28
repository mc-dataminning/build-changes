import com.mojang.serialization.MapCodec;

public class dli extends dey implements dfb {
   public static final MapCodec<dli> a = b(dli::new);

   @Override
   public MapCodec<dli> a() {
      return a;
   }

   public dli(dsa.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      $$0.b($$2.d(), dfa.sG.o());
   }

   @Override
   public iz a(iz $$0) {
      return $$0.d();
   }
}
