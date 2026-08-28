import com.mojang.serialization.MapCodec;

public class dqe extends dqs {
   public static final MapCodec<dqe> a = b(dqe::new);

   @Override
   public MapCodec<dqe> a() {
      return a;
   }

   public dqe(eas.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(e);
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(e, $$0.g().g());
   }
}
