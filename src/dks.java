import com.mojang.serialization.MapCodec;

public class dks extends dki implements dgb {
   public static final MapCodec<dks> a = b(dks::new);

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   public dks(dtb.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return $$0.a_($$1.e()).i();
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      $$0.a($$2.e(), dkt.c(), 2);
   }

   @Override
   public jd a(jd $$0) {
      return $$0.e();
   }
}
