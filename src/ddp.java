import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddp(dci d, cpj e) {
   public static final String a = "enabled_features";
   public static final Codec<ddp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dci.b.lenientOptionalFieldOf("DataPacks", dci.a).forGetter(ddp::a), cpl.e.lenientOptionalFieldOf("enabled_features", cpl.g).forGetter(ddp::b)
            )
            .apply($$0, ddp::new)
   );
   public static final ddp c = new ddp(dci.a, cpl.g);

   public ddp a(cpj $$0) {
      return new ddp(this.d, this.e.c($$0));
   }

   public dci a() {
      return this.d;
   }

   public cpj b() {
      return this.e;
   }
}
