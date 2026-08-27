import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czr(cyl d, cmg e) {
   public static final String a = "enabled_features";
   public static final Codec<czr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cyl.b.optionalFieldOf("DataPacks", cyl.a).forGetter(czr::a), cmi.f.optionalFieldOf("enabled_features", cmi.h).forGetter(czr::b))
            .apply($$0, czr::new)
   );
   public static final czr c = new czr(cyl.a, cmi.h);

   public czr a(cmg $$0) {
      return new czr(this.d, this.e.b($$0));
   }

   public cyl a() {
      return this.d;
   }

   public cmg b() {
      return this.e;
   }
}
