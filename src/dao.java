import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dao(czi d, cmy e) {
   public static final String a = "enabled_features";
   public static final Codec<dao> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(czi.b.optionalFieldOf("DataPacks", czi.a).forGetter(dao::a), cna.f.optionalFieldOf("enabled_features", cna.h).forGetter(dao::b))
            .apply($$0, dao::new)
   );
   public static final dao c = new dao(czi.a, cna.h);

   public dao a(cmy $$0) {
      return new dao(this.d, this.e.b($$0));
   }

   public czi a() {
      return this.d;
   }

   public cmy b() {
      return this.e;
   }
}
