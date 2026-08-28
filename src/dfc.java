import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfc(ddt d, cqn e) {
   public static final String a = "enabled_features";
   public static final Codec<dfc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ddt.b.lenientOptionalFieldOf("DataPacks", ddt.a).forGetter(dfc::a), cqp.g.lenientOptionalFieldOf("enabled_features", cqp.i).forGetter(dfc::b)
            )
            .apply($$0, dfc::new)
   );
   public static final dfc c = new dfc(ddt.a, cqp.i);

   public dfc a(cqn $$0) {
      return new dfc(this.d, this.e.c($$0));
   }

   public ddt a() {
      return this.d;
   }

   public cqn b() {
      return this.e;
   }
}
