import com.mojang.serialization.MapCodec;

public class cxi extends cxu {
   public static final MapCodec<cxi> a = b(cxi::new);

   @Override
   public MapCodec<cxi> a() {
      return a;
   }

   public cxi(dga.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(aE);
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
