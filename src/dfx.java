import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfx(deo d, crf e) {
   public static final String a = "enabled_features";
   public static final Codec<dfx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               deo.b.lenientOptionalFieldOf("DataPacks", deo.a).forGetter(dfx::a), crh.g.lenientOptionalFieldOf("enabled_features", crh.i).forGetter(dfx::b)
            )
            .apply($$0, dfx::new)
   );
   public static final dfx c = new dfx(deo.a, crh.i);

   public dfx a(crf $$0) {
      return new dfx(this.d, this.e.c($$0));
   }

   public deo a() {
      return this.d;
   }

   public crf b() {
      return this.e;
   }
}
