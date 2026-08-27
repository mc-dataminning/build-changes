import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxt(cwn d, clf e) {
   public static final String a = "enabled_features";
   public static final Codec<cxt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwn.b.optionalFieldOf("DataPacks", cwn.a).forGetter(cxt::a), clh.f.optionalFieldOf("enabled_features", clh.h).forGetter(cxt::b))
            .apply($$0, cxt::new)
   );
   public static final cxt c = new cxt(cwn.a, clh.h);

   public cxt a(clf $$0) {
      return new cxt(this.d, this.e.b($$0));
   }

   public cwn a() {
      return this.d;
   }

   public clf b() {
      return this.e;
   }
}
