import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;

public class erg extends eqs {
   public static final MapCodec<erg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  cwj.a.g.optionalFieldOf("shape").forGetter($$0x -> $$0x.c),
                  cwj.b.optionalFieldOf("colors").forGetter($$0x -> $$0x.d),
                  cwj.b.optionalFieldOf("fade_colors").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.optionalFieldOf("trail").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.optionalFieldOf("twinkle").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, erg::new)
   );
   public static final cwj b = new cwj(cwj.a.a, IntList.of(), IntList.of(), false, false);
   final Optional<cwj.a> c;
   final Optional<IntList> d;
   final Optional<IntList> e;
   final Optional<Boolean> f;
   final Optional<Boolean> h;

   public erg(List<esn> $$0, Optional<cwj.a> $$1, Optional<IntList> $$2, Optional<IntList> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.h = $$5;
   }

   @Override
   protected ctq a(ctq $$0, eph $$1) {
      $$0.a(kb.S, b, this::a);
      return $$0;
   }

   private cwj a(cwj $$0) {
      return new cwj(this.c.orElseGet($$0::a), this.d.orElseGet($$0::b), this.e.orElseGet($$0::c), this.f.orElseGet($$0::d), this.h.orElseGet($$0::e));
   }

   @Override
   public equ b() {
      return eqv.I;
   }
}
