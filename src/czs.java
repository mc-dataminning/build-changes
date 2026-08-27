import com.mojang.serialization.MapCodec;

public class czs extends dae {
   public static final MapCodec<czs> a = b(czs::new);

   @Override
   public MapCodec<czs> a() {
      return a;
   }

   public czs(diz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(aE);
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
