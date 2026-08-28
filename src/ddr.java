import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddr(dck d, cpl e) {
   public static final String a = "enabled_features";
   public static final Codec<ddr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dck.b.lenientOptionalFieldOf("DataPacks", dck.a).forGetter(ddr::a), cpn.e.lenientOptionalFieldOf("enabled_features", cpn.g).forGetter(ddr::b)
            )
            .apply($$0, ddr::new)
   );
   public static final ddr c = new ddr(dck.a, cpn.g);

   public ddr a(cpl $$0) {
      return new ddr(this.d, this.e.c($$0));
   }

   public dck a() {
      return this.d;
   }

   public cpl b() {
      return this.e;
   }
}
