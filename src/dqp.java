import com.mojang.serialization.MapCodec;

public class dqp extends drd {
   public static final MapCodec<dqp> a = b(dqp::new);

   @Override
   public MapCodec<dqp> a() {
      return a;
   }

   public dqp(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(e);
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(e, $$0.g().g());
   }
}
