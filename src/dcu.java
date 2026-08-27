import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcu(dbo d, cop e) {
   public static final String a = "enabled_features";
   public static final Codec<dcu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(dbo.b.optionalFieldOf("DataPacks", dbo.a).forGetter(dcu::a), cor.f.optionalFieldOf("enabled_features", cor.h).forGetter(dcu::b))
            .apply($$0, dcu::new)
   );
   public static final dcu c = new dcu(dbo.a, cor.h);

   public dcu a(cop $$0) {
      return new dcu(this.d, this.e.b($$0));
   }

   public dbo a() {
      return this.d;
   }

   public cop b() {
      return this.e;
   }
}
