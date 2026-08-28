import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dkk(diz e, cuw f) {
   public static final String a = "enabled_features";
   public static final MapCodec<dkk> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               diz.b.lenientOptionalFieldOf("DataPacks", diz.a).forGetter(dkk::a), cuy.f.lenientOptionalFieldOf("enabled_features", cuy.h).forGetter(dkk::b)
            )
            .apply($$0, dkk::new)
   );
   public static final Codec<dkk> c = b.codec();
   public static final dkk d = new dkk(diz.a, cuy.h);

   public dkk a(cuw $$0) {
      return new dkk(this.e, this.f.c($$0));
   }

   public diz a() {
      return this.e;
   }

   public cuw b() {
      return this.f;
   }
}
