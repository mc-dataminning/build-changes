import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaz extends ebm {
   public static final Codec<eaz> a = RecordCodecBuilder.create($$0 -> $$0.group(dsx.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, eaz::new));
   private final dsx c;

   private eaz(dsx $$0) {
      this.c = $$0;
   }

   public static eaz a(dsx $$0) {
      return new eaz($$0);
   }

   @Override
   protected boolean a(ebl $$0, awt $$1, ib $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public ebo<?> b() {
      return ebo.a;
   }
}
