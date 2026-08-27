import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eae extends ear {
   public static final Codec<eae> a = RecordCodecBuilder.create($$0 -> $$0.group(dsc.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eae::new));
   private final dsc c;

   private eae(dsc $$0) {
      this.c = $$0;
   }

   public static eae a(dsc $$0) {
      return new eae($$0);
   }

   @Override
   protected boolean a(eaq $$0, awp $$1, hz $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eat<?> b() {
      return eat.a;
   }
}
