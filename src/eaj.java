import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eaj implements eab {
   public static final Codec<eaj> a = RecordCodecBuilder.create($$0 -> $$0.group(eab.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, eaj::new));
   private final eab e;

   public eaj(eab $$0) {
      this.e = $$0;
   }

   public boolean a(dcv $$0, ir $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eac<?> a() {
      return eac.k;
   }
}
