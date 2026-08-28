import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dif(dgv d, cst e) {
   public static final String a = "enabled_features";
   public static final Codec<dif> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dgv.b.lenientOptionalFieldOf("DataPacks", dgv.a).forGetter(dif::a), csv.g.lenientOptionalFieldOf("enabled_features", csv.i).forGetter(dif::b)
            )
            .apply($$0, dif::new)
   );
   public static final dif c = new dif(dgv.a, csv.i);

   public dif a(cst $$0) {
      return new dif(this.d, this.e.c($$0));
   }

   public dgv a() {
      return this.d;
   }

   public cst b() {
      return this.e;
   }
}
