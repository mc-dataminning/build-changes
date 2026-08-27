import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuj(ctd d, chs e) {
   public static final String a = "enabled_features";
   public static final Codec<cuj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctd.b.optionalFieldOf("DataPacks", ctd.a).forGetter(cuj::a), chu.f.optionalFieldOf("enabled_features", chu.h).forGetter(cuj::b))
            .apply($$0, cuj::new)
   );
   public static final cuj c = new cuj(ctd.a, chu.h);

   public cuj a(chs $$0) {
      return new cuj(this.d, this.e.b($$0));
   }

   public ctd a() {
      return this.d;
   }

   public chs b() {
      return this.e;
   }
}
