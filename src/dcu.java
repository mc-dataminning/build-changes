import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcu(dbo d, cpn e) {
   public static final String a = "enabled_features";
   public static final Codec<dcu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbo.b.lenientOptionalFieldOf("DataPacks", dbo.a).forGetter(dcu::a), cpp.f.lenientOptionalFieldOf("enabled_features", cpp.h).forGetter(dcu::b)
            )
            .apply($$0, dcu::new)
   );
   public static final dcu c = new dcu(dbo.a, cpp.h);

   public dcu a(cpn $$0) {
      return new dcu(this.d, this.e.c($$0));
   }

   public dbo a() {
      return this.d;
   }

   public cpn b() {
      return this.e;
   }
}
