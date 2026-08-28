import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dlh(djw e, cvs f) {
   public static final String a = "enabled_features";
   public static final MapCodec<dlh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               djw.b.lenientOptionalFieldOf("DataPacks", djw.a).forGetter(dlh::a), cvu.f.lenientOptionalFieldOf("enabled_features", cvu.h).forGetter(dlh::b)
            )
            .apply($$0, dlh::new)
   );
   public static final Codec<dlh> c = b.codec();
   public static final dlh d = new dlh(djw.a, cvu.h);

   public dlh a(cvs $$0) {
      return new dlh(this.e, this.f.c($$0));
   }

   public djw a() {
      return this.e;
   }

   public cvs b() {
      return this.f;
   }
}
