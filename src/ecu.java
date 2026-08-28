import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecu implements ecg {
   public static final MapCodec<ecu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kk.v(16).optionalFieldOf("offset", kk.g).forGetter($$0x -> $$0x.e), dvd.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, ecu::new)
   );
   private final kk e;
   private final dvd f;

   protected ecu(kk $$0, dvd $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dfs $$0, jg $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public ech<?> a() {
      return ech.g;
   }
}
