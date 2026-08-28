import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ehc implements egu {
   public static final MapCodec<ehc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egu.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, ehc::new)
   );
   private final egu e;

   public ehc(egu $$0) {
      this.e = $$0;
   }

   public boolean a(djo $$0, iu $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public egv<?> a() {
      return egv.k;
   }
}
