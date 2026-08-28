import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record djt(dij e, cuh f) {
   public static final String a = "enabled_features";
   public static final MapCodec<djt> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dij.b.lenientOptionalFieldOf("DataPacks", dij.a).forGetter(djt::a), cuj.f.lenientOptionalFieldOf("enabled_features", cuj.h).forGetter(djt::b)
            )
            .apply($$0, djt::new)
   );
   public static final Codec<djt> c = b.codec();
   public static final djt d = new djt(dij.a, cuj.h);

   public djt a(cuh $$0) {
      return new djt(this.e, this.f.c($$0));
   }

   public dij a() {
      return this.e;
   }

   public cuh b() {
      return this.f;
   }
}
