import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxt implements dxg {
   public static final Codec<dxt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jr.v(16).optionalFieldOf("offset", jr.g).forGetter($$0x -> $$0x.e), dqh.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dxt::new)
   );
   private final jr e;
   private final dqh f;

   protected dxt(jr $$0, dqh $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(day $$0, in $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dxh<?> a() {
      return dxh.g;
   }
}
