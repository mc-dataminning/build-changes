import com.mojang.serialization.MapCodec;

public class ddj extends ddv {
   public static final MapCodec<ddj> a = b(ddj::new);

   @Override
   public MapCodec<ddj> a() {
      return a;
   }

   public ddj(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(aE);
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
