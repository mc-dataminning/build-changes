import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eas extends eeu {
   public static final MapCodec<eas> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.l),
               ehz.c.fieldOf("y").forGetter($$0x -> $$0x.e),
               bpd.c.fieldOf("yScale").forGetter($$0x -> $$0x.f),
               dzo.a.fieldOf("lava_level").forGetter($$0x -> $$0x.g),
               eat.b.optionalFieldOf("debug_settings", eat.a).forGetter($$0x -> $$0x.h),
               jp.a(li.f).fieldOf("replaceable").forGetter($$0x -> $$0x.i)
            )
            .apply($$0, eas::new)
   );
   public final ehz e;
   public final bpd f;
   public final dzo g;
   public final eat h;
   public final je<dfc> i;

   public eas(float $$0, ehz $$1, bpd $$2, dzo $$3, eat $$4, je<dfc> $$5) {
      super($$0);
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
   }
}
