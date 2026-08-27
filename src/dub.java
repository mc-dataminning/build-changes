import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dub extends dug {
   private final ip<dac> e;
   public static final Codec<dub> a = RecordCodecBuilder.create($$0 -> a($$0).and(ja.a(kj.f).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dub::new));

   public dub(jg $$0, ip<dac> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dnb $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dtw<?> a() {
      return dtw.a;
   }
}
