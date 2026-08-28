import com.mojang.serialization.MapCodec;

public class dnc extends dms implements dim {
   public static final MapCodec<dnc> a = b(dnc::new);

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   public dnc(dvn.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      $$0.a($$2.e(), dnd.c(), 2);
   }

   @Override
   public jh a(jh $$0) {
      return $$0.e();
   }
}
