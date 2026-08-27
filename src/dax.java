import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dax(czr d, cnu e) {
   public static final String a = "enabled_features";
   public static final Codec<dax> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(czr.b.optionalFieldOf("DataPacks", czr.a).forGetter(dax::a), cnw.f.optionalFieldOf("enabled_features", cnw.h).forGetter(dax::b))
            .apply($$0, dax::new)
   );
   public static final dax c = new dax(czr.a, cnw.h);

   public dax a(cnu $$0) {
      return new dax(this.d, this.e.b($$0));
   }

   public czr a() {
      return this.d;
   }

   public cnu b() {
      return this.e;
   }
}
