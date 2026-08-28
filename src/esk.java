import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;

public class esk extends eru {
   public static final MapCodec<esk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  cxi.a.g.optionalFieldOf("shape").forGetter($$0x -> $$0x.c),
                  cxi.b.optionalFieldOf("colors").forGetter($$0x -> $$0x.d),
                  cxi.b.optionalFieldOf("fade_colors").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.optionalFieldOf("trail").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.optionalFieldOf("twinkle").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, esk::new)
   );
   public static final cxi b = new cxi(cxi.a.a, IntList.of(), IntList.of(), false, false);
   final Optional<cxi.a> c;
   final Optional<IntList> d;
   final Optional<IntList> e;
   final Optional<Boolean> f;
   final Optional<Boolean> h;

   public esk(List<ets> $$0, Optional<cxi.a> $$1, Optional<IntList> $$2, Optional<IntList> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.h = $$5;
   }

   @Override
   protected cup a(cup $$0, eqi $$1) {
      $$0.a(km.T, b, this::a);
      return $$0;
   }

   private cxi a(cxi $$0) {
      return new cxi(this.c.orElseGet($$0::a), this.d.orElseGet($$0::b), this.e.orElseGet($$0::c), this.f.orElseGet($$0::d), this.h.orElseGet($$0::e));
   }

   @Override
   public erw<esk> b() {
      return erx.L;
   }
}
