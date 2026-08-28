import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record djn(did d, cub e) {
   public static final String a = "enabled_features";
   public static final Codec<djn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               did.b.lenientOptionalFieldOf("DataPacks", did.a).forGetter(djn::a), cud.f.lenientOptionalFieldOf("enabled_features", cud.h).forGetter(djn::b)
            )
            .apply($$0, djn::new)
   );
   public static final djn c = new djn(did.a, cud.h);

   public djn a(cub $$0) {
      return new djn(this.d, this.e.c($$0));
   }

   public did a() {
      return this.d;
   }

   public cub b() {
      return this.e;
   }
}
