import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhw(dgm d, csk e) {
   public static final String a = "enabled_features";
   public static final Codec<dhw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dgm.b.lenientOptionalFieldOf("DataPacks", dgm.a).forGetter(dhw::a), csm.f.lenientOptionalFieldOf("enabled_features", csm.h).forGetter(dhw::b)
            )
            .apply($$0, dhw::new)
   );
   public static final dhw c = new dhw(dgm.a, csm.h);

   public dhw a(csk $$0) {
      return new dhw(this.d, this.e.c($$0));
   }

   public dgm a() {
      return this.d;
   }

   public csk b() {
      return this.e;
   }
}
