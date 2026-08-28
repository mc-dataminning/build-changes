import com.mojang.serialization.MapCodec;

public class epp extends eqe {
   public static final MapCodec<epp> a = btg.b(0, 256).fieldOf("count").xmap(epp::new, $$0 -> $$0.c);
   private final btg c;

   private epp(btg $$0) {
      this.c = $$0;
   }

   public static epp a(btg $$0) {
      return new epp($$0);
   }

   public static epp a(int $$0) {
      return a(btd.a($$0));
   }

   @Override
   protected int a(azv $$0, iu $$1) {
      return this.c.a($$0);
   }

   @Override
   public eqb<?> b() {
      return eqb.f;
   }
}
