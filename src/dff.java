import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dff(ddw d, cqq e) {
   public static final String a = "enabled_features";
   public static final Codec<dff> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ddw.b.lenientOptionalFieldOf("DataPacks", ddw.a).forGetter(dff::a), cqs.g.lenientOptionalFieldOf("enabled_features", cqs.i).forGetter(dff::b)
            )
            .apply($$0, dff::new)
   );
   public static final dff c = new dff(ddw.a, cqs.i);

   public dff a(cqq $$0) {
      return new dff(this.d, this.e.c($$0));
   }

   public ddw a() {
      return this.d;
   }

   public cqq b() {
      return this.e;
   }
}
