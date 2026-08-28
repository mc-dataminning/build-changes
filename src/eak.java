import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eak extends eaq {
   final awu<dfy> a;
   public static final MapCodec<eak> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(awu.a(lu.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, eak::new)
   );

   protected eak(kh $$0, awu<dfy> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dtc $$0) {
      return $$0.a(this.a);
   }

   @Override
   public eag<?> a() {
      return eag.b;
   }
}
