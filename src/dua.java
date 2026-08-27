import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dua extends dug {
   final avd<dac> a;
   public static final Codec<dua> e = RecordCodecBuilder.create($$0 -> a($$0).and(avd.a(kj.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dua::new));

   protected dua(jg $$0, avd<dac> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dnb $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dtw<?> a() {
      return dtw.b;
   }
}
