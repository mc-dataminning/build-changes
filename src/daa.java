import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record daa(cyu d, cmn e) {
   public static final String a = "enabled_features";
   public static final Codec<daa> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cyu.b.optionalFieldOf("DataPacks", cyu.a).forGetter(daa::a), cmp.f.optionalFieldOf("enabled_features", cmp.h).forGetter(daa::b))
            .apply($$0, daa::new)
   );
   public static final daa c = new daa(cyu.a, cmp.h);

   public daa a(cmn $$0) {
      return new daa(this.d, this.e.b($$0));
   }

   public cyu a() {
      return this.d;
   }

   public cmn b() {
      return this.e;
   }
}
