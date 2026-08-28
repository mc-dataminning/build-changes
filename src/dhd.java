import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhd(dft d, crr e) {
   public static final String a = "enabled_features";
   public static final Codec<dhd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dft.b.lenientOptionalFieldOf("DataPacks", dft.a).forGetter(dhd::a), crt.f.lenientOptionalFieldOf("enabled_features", crt.h).forGetter(dhd::b)
            )
            .apply($$0, dhd::new)
   );
   public static final dhd c = new dhd(dft.a, crt.h);

   public dhd a(crr $$0) {
      return new dhd(this.d, this.e.c($$0));
   }

   public dft a() {
      return this.d;
   }

   public crr b() {
      return this.e;
   }
}
