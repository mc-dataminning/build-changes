import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhx(dgn d, csn e) {
   public static final String a = "enabled_features";
   public static final Codec<dhx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dgn.b.lenientOptionalFieldOf("DataPacks", dgn.a).forGetter(dhx::a), csp.f.lenientOptionalFieldOf("enabled_features", csp.h).forGetter(dhx::b)
            )
            .apply($$0, dhx::new)
   );
   public static final dhx c = new dhx(dgn.a, csp.h);

   public dhx a(csn $$0) {
      return new dhx(this.d, this.e.c($$0));
   }

   public dgn a() {
      return this.d;
   }

   public csn b() {
      return this.e;
   }
}
