import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;

public class evj extends euu {
   public static final MapCodec<evj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  cyi.a.g.optionalFieldOf("shape").forGetter($$0x -> $$0x.c),
                  cyi.b.optionalFieldOf("colors").forGetter($$0x -> $$0x.d),
                  cyi.b.optionalFieldOf("fade_colors").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.optionalFieldOf("trail").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.optionalFieldOf("twinkle").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, evj::new)
   );
   public static final cyi b = new cyi(cyi.a.a, IntList.of(), IntList.of(), false, false);
   final Optional<cyi.a> c;
   final Optional<IntList> d;
   final Optional<IntList> e;
   final Optional<Boolean> f;
   final Optional<Boolean> h;

   public evj(List<ews> $$0, Optional<cyi.a> $$1, Optional<IntList> $$2, Optional<IntList> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.h = $$5;
   }

   @Override
   protected cvp a(cvp $$0, eth $$1) {
      $$0.a(kr.Z, b, this::a);
      return $$0;
   }

   private cyi a(cyi $$0) {
      return new cyi(this.c.orElseGet($$0::a), this.d.orElseGet($$0::b), this.e.orElseGet($$0::c), this.f.orElseGet($$0::d), this.h.orElseGet($$0::e));
   }

   @Override
   public euw<evj> b() {
      return eux.L;
   }
}
