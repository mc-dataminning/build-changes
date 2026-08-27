import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwd extends dwj {
   final avr<dby> a;
   public static final Codec<dwd> e = RecordCodecBuilder.create($$0 -> a($$0).and(avr.a(ks.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dwd::new));

   protected dwd(jg $$0, avr<dby> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(doz $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dvz<?> a() {
      return dvz.b;
   }
}
