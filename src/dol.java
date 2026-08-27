import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dol implements dod {
   public static final Codec<dol> a = RecordCodecBuilder.create($$0 -> $$0.group(dod.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dol::new));
   private final dod e;

   public dol(dod $$0) {
      this.e = $$0;
   }

   public boolean a(csz $$0, hx $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public doe<?> a() {
      return doe.k;
   }
}
