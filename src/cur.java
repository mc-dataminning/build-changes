import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cur(ctl d, cia e) {
   public static final String a = "enabled_features";
   public static final Codec<cur> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ctl.b.optionalFieldOf("DataPacks", ctl.a).forGetter(cur::a), cic.f.optionalFieldOf("enabled_features", cic.h).forGetter(cur::b))
            .apply($$0, cur::new)
   );
   public static final cur c = new cur(ctl.a, cic.h);

   public cur a(cia $$0) {
      return new cur(this.d, this.e.b($$0));
   }

   public ctl a() {
      return this.d;
   }

   public cia b() {
      return this.e;
   }
}
