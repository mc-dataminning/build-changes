import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record die(dgu d, css e) {
   public static final String a = "enabled_features";
   public static final Codec<die> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dgu.b.lenientOptionalFieldOf("DataPacks", dgu.a).forGetter(die::a), csu.g.lenientOptionalFieldOf("enabled_features", csu.i).forGetter(die::b)
            )
            .apply($$0, die::new)
   );
   public static final die c = new die(dgu.a, csu.i);

   public die a(css $$0) {
      return new die(this.d, this.e.c($$0));
   }

   public dgu a() {
      return this.d;
   }

   public css b() {
      return this.e;
   }
}
