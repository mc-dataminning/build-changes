import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dkf(div e, cut f) {
   public static final String a = "enabled_features";
   public static final MapCodec<dkf> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               div.b.lenientOptionalFieldOf("DataPacks", div.a).forGetter(dkf::a), cuv.f.lenientOptionalFieldOf("enabled_features", cuv.h).forGetter(dkf::b)
            )
            .apply($$0, dkf::new)
   );
   public static final Codec<dkf> c = b.codec();
   public static final dkf d = new dkf(div.a, cuv.h);

   public dkf a(cut $$0) {
      return new dkf(this.e, this.f.c($$0));
   }

   public div a() {
      return this.e;
   }

   public cut b() {
      return this.f;
   }
}
