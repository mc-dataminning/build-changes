import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;

public class euv extends eug {
   public static final MapCodec<euv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  cye.a.g.optionalFieldOf("shape").forGetter($$0x -> $$0x.c),
                  cye.b.optionalFieldOf("colors").forGetter($$0x -> $$0x.d),
                  cye.b.optionalFieldOf("fade_colors").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.optionalFieldOf("trail").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.optionalFieldOf("twinkle").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, euv::new)
   );
   public static final cye b = new cye(cye.a.a, IntList.of(), IntList.of(), false, false);
   final Optional<cye.a> c;
   final Optional<IntList> d;
   final Optional<IntList> e;
   final Optional<Boolean> f;
   final Optional<Boolean> h;

   public euv(List<ewe> $$0, Optional<cye.a> $$1, Optional<IntList> $$2, Optional<IntList> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.h = $$5;
   }

   @Override
   protected cvl a(cvl $$0, est $$1) {
      $$0.a(kr.W, b, this::a);
      return $$0;
   }

   private cye a(cye $$0) {
      return new cye(this.c.orElseGet($$0::a), this.d.orElseGet($$0::b), this.e.orElseGet($$0::c), this.f.orElseGet($$0::d), this.h.orElseGet($$0::e));
   }

   @Override
   public eui<euv> b() {
      return euj.L;
   }
}
