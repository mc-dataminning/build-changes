import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dkx(djm e, cvj f) {
   public static final String a = "enabled_features";
   public static final MapCodec<dkx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               djm.b.lenientOptionalFieldOf("DataPacks", djm.a).forGetter(dkx::a), cvl.f.lenientOptionalFieldOf("enabled_features", cvl.h).forGetter(dkx::b)
            )
            .apply($$0, dkx::new)
   );
   public static final Codec<dkx> c = b.codec();
   public static final dkx d = new dkx(djm.a, cvl.h);

   public dkx a(cvj $$0) {
      return new dkx(this.e, this.f.c($$0));
   }

   public djm a() {
      return this.e;
   }

   public cvj b() {
      return this.f;
   }
}
