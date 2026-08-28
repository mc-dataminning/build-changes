import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhx(dgn d, cso e) {
   public static final String a = "enabled_features";
   public static final Codec<dhx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dgn.b.lenientOptionalFieldOf("DataPacks", dgn.a).forGetter(dhx::a), csq.g.lenientOptionalFieldOf("enabled_features", csq.i).forGetter(dhx::b)
            )
            .apply($$0, dhx::new)
   );
   public static final dhx c = new dhx(dgn.a, csq.i);

   public dhx a(cso $$0) {
      return new dhx(this.d, this.e.c($$0));
   }

   public dgn a() {
      return this.d;
   }

   public cso b() {
      return this.e;
   }
}
