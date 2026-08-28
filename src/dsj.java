import com.mojang.serialization.MapCodec;

public class dsj extends dlu implements dlx {
   public static final MapCodec<dsj> a = b(dsj::new);

   @Override
   public MapCodec<dsj> a() {
      return a;
   }

   public dsj(dzn.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      $$0.b($$2.e(), dlw.tm.m());
   }

   @Override
   public iu a(iu $$0) {
      return $$0.e();
   }
}
