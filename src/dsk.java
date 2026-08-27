import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dsk implements dsc {
   public static final Codec<dsk> a = RecordCodecBuilder.create($$0 -> $$0.group(dsc.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dsk::new));
   private final dsc e;

   public dsk(dsc $$0) {
      this.e = $$0;
   }

   public boolean a(cwm $$0, hz $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dsd<?> a() {
      return dsd.k;
   }
}
