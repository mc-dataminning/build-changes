import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czz(jq<awm> c) implements czy {
   public static final MapCodec<czz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awm.b.fieldOf("sound").forGetter(czz::b)).apply($$0, czz::new));
   public static final zh<wu, czz> b = zh.a(awm.d, czz::b, czz::new);

   @Override
   public czy.a<czz> a() {
      return czy.a.e;
   }

   @Override
   public boolean a(dfm $$0, cwm $$1, bvh $$2) {
      $$0.a(null, $$2.dv(), this.c.a(), $$2.dm(), 1.0F, 1.0F);
      return true;
   }

   public jq<awm> b() {
      return this.c;
   }
}
