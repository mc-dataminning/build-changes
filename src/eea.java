import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eea extends een {
   public static final Codec<eea> a = RecordCodecBuilder.create($$0 -> $$0.group(dvy.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eea::new));
   private final dvy c;

   private eea(dvy $$0) {
      this.c = $$0;
   }

   public static eea a(dvy $$0) {
      return new eea($$0);
   }

   @Override
   protected boolean a(eem $$0, axr $$1, ib $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eep<?> b() {
      return eep.a;
   }
}
