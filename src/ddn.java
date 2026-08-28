import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddn(jf<awo> c) implements ddm {
   public static final MapCodec<ddn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awo.b.fieldOf("sound").forGetter(ddn::b)).apply($$0, ddn::new));
   public static final yy<wl, ddn> b = yy.a(awo.d, ddn::b, ddn::new);

   @Override
   public ddm.a<ddn> a() {
      return ddm.a.e;
   }

   @Override
   public boolean a(djx $$0, czy $$1, bxu $$2) {
      $$0.a(null, $$2.dv(), this.c.a(), $$2.dm(), 1.0F, 1.0F);
      return true;
   }

   public jf<awo> b() {
      return this.c;
   }
}
