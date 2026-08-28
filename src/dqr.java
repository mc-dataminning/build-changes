import com.mojang.serialization.MapCodec;

public class dqr extends drf {
   public static final MapCodec<dqr> a = b(dqr::new);

   @Override
   public MapCodec<dqr> a() {
      return a;
   }

   public dqr(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(e);
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(e, $$0.g().g());
   }
}
