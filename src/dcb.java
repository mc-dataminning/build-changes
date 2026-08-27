import com.mojang.serialization.MapCodec;

public class dcb extends dcn {
   public static final MapCodec<dcb> a = b(dcb::new);

   @Override
   public MapCodec<dcb> a() {
      return a;
   }

   public dcb(dli.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(aE);
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
