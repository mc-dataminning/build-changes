import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dkv(djk e, cvh f) {
   public static final String a = "enabled_features";
   public static final MapCodec<dkv> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               djk.b.lenientOptionalFieldOf("DataPacks", djk.a).forGetter(dkv::a), cvj.f.lenientOptionalFieldOf("enabled_features", cvj.h).forGetter(dkv::b)
            )
            .apply($$0, dkv::new)
   );
   public static final Codec<dkv> c = b.codec();
   public static final dkv d = new dkv(djk.a, cvj.h);

   public dkv a(cvh $$0) {
      return new dkv(this.e, this.f.c($$0));
   }

   public djk a() {
      return this.e;
   }

   public cvh b() {
      return this.f;
   }
}
