import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class efd implements eev {
   public static final MapCodec<efd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eev.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, efd::new)
   );
   private final eev e;

   public efd(eev $$0) {
      this.e = $$0;
   }

   public boolean a(dhy $$0, ji $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public eew<?> a() {
      return eew.k;
   }
}
