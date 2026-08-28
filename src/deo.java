import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deo(ddf d, cqh e) {
   public static final String a = "enabled_features";
   public static final Codec<deo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ddf.b.lenientOptionalFieldOf("DataPacks", ddf.a).forGetter(deo::a), cqj.g.lenientOptionalFieldOf("enabled_features", cqj.i).forGetter(deo::b)
            )
            .apply($$0, deo::new)
   );
   public static final deo c = new deo(ddf.a, cqj.i);

   public deo a(cqh $$0) {
      return new deo(this.d, this.e.c($$0));
   }

   public ddf a() {
      return this.d;
   }

   public cqh b() {
      return this.e;
   }
}
