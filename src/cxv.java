import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cxv(cwp d, clh e) {
   public static final String a = "enabled_features";
   public static final Codec<cxv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwp.b.optionalFieldOf("DataPacks", cwp.a).forGetter(cxv::a), clj.f.optionalFieldOf("enabled_features", clj.h).forGetter(cxv::b))
            .apply($$0, cxv::new)
   );
   public static final cxv c = new cxv(cwp.a, clj.h);

   public cxv a(clh $$0) {
      return new cxv(this.d, this.e.b($$0));
   }

   public cwp a() {
      return this.d;
   }

   public clh b() {
      return this.e;
   }
}
