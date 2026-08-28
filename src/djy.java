import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record djy(dio e, cum f) {
   public static final String a = "enabled_features";
   public static final MapCodec<djy> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dio.b.lenientOptionalFieldOf("DataPacks", dio.a).forGetter(djy::a), cuo.f.lenientOptionalFieldOf("enabled_features", cuo.h).forGetter(djy::b)
            )
            .apply($$0, djy::new)
   );
   public static final Codec<djy> c = b.codec();
   public static final djy d = new djy(dio.a, cuo.h);

   public djy a(cum $$0) {
      return new djy(this.e, this.f.c($$0));
   }

   public dio a() {
      return this.e;
   }

   public cum b() {
      return this.f;
   }
}
