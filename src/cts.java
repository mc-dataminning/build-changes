import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cts(csm d, chb e) {
   public static final String a = "enabled_features";
   public static final Codec<cts> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(csm.b.optionalFieldOf("DataPacks", csm.a).forGetter(cts::a), chd.f.optionalFieldOf("enabled_features", chd.h).forGetter(cts::b))
            .apply($$0, cts::new)
   );
   public static final cts c = new cts(csm.a, chd.h);

   public cts a(chb $$0) {
      return new cts(this.d, this.e.b($$0));
   }

   public csm a() {
      return this.d;
   }

   public chb b() {
      return this.e;
   }
}
