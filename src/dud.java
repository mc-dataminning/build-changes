import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dud implements dtv {
   public static final Codec<dud> a = RecordCodecBuilder.create($$0 -> $$0.group(dtv.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dud::new));
   private final dtv e;

   public dud(dtv $$0) {
      this.e = $$0;
   }

   public boolean a(cxw $$0, ib $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dtw<?> a() {
      return dtw.k;
   }
}
