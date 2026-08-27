import com.mojang.serialization.MapCodec;

public class dhj extends dhw {
   public static final MapCodec<dhj> a = b(dhj::new);

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public dhj(drc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(aE);
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(aE, $$0.g().g());
   }
}
