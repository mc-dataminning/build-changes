import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class euo extends eug {
   public static final MapCodec<euo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  arx.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ayl.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, euo::new)
   );
   private final Optional<String> b;
   private final Optional<arx<String>> c;
   private final Optional<Integer> d;

   public euo(List<ewe> $$0, Optional<arx<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cvl a(cvl $$0, est $$1) {
      $$0.a(kr.L, cyu.a, this::a);
      return $$0;
   }

   private cyu a(cyu $$0) {
      return new cyu(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public eui<euo> b() {
      return euj.M;
   }
}
