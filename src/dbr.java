import com.mojang.serialization.MapCodec;

public class dbr extends dbh implements cxb {
   public static final MapCodec<dbr> a = b(dbr::new);

   @Override
   public MapCodec<dbr> a() {
      return a;
   }

   public dbr(djo.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return $$0.a_($$1.d()).i();
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      $$0.a($$2.d(), dbs.c(), 2);
   }

   @Override
   public hx a(hx $$0) {
      return $$0.d();
   }
}
