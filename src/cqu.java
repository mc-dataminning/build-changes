import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqu(cpp d, cei e) {
   public static final String a = "enabled_features";
   public static final Codec<cqu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cpp.b.optionalFieldOf("DataPacks", cpp.a).forGetter(cqu::a), cek.e.optionalFieldOf("enabled_features", cek.g).forGetter(cqu::b))
            .apply($$0, cqu::new)
   );
   public static final cqu c = new cqu(cpp.a, cek.g);

   public cqu a(cei $$0) {
      return new cqu(this.d, this.e.b($$0));
   }

   public cpp a() {
      return this.d;
   }

   public cei b() {
      return this.e;
   }
}
