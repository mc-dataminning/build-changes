import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhe(dfu d, crs e) {
   public static final String a = "enabled_features";
   public static final Codec<dhe> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfu.b.lenientOptionalFieldOf("DataPacks", dfu.a).forGetter(dhe::a), cru.f.lenientOptionalFieldOf("enabled_features", cru.h).forGetter(dhe::b)
            )
            .apply($$0, dhe::new)
   );
   public static final dhe c = new dhe(dfu.a, cru.h);

   public dhe a(crs $$0) {
      return new dhe(this.d, this.e.c($$0));
   }

   public dfu a() {
      return this.d;
   }

   public crs b() {
      return this.e;
   }
}
