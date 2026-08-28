import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egy extends ehl {
   public static final MapCodec<egy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyw.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, egy::new)
   );
   private final dyw c;

   private egy(dyw $$0) {
      this.c = $$0;
   }

   public static egy a(dyw $$0) {
      return new egy($$0);
   }

   @Override
   protected boolean a(ehk $$0, azc $$1, iz $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ehn<?> b() {
      return ehn.a;
   }
}
