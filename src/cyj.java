import com.mojang.serialization.MapCodec;

public class cyj extends cyv {
   public static final MapCodec<cyj> a = b(cyj::new);

   @Override
   public MapCodec<cyj> a() {
      return a;
   }

   public cyj(dhh.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(aE);
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
