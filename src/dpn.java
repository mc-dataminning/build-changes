import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dpn implements dpf {
   public static final Codec<dpn> a = RecordCodecBuilder.create($$0 -> $$0.group(dpf.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dpn::new));
   private final dpf e;

   public dpn(dpf $$0) {
      this.e = $$0;
   }

   public boolean a(ctt $$0, hv $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dpg<?> a() {
      return dpg.k;
   }
}
