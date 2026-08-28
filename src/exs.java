import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;

public class exs extends exd {
   public static final MapCodec<exs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  czd.a.g.optionalFieldOf("shape").forGetter($$0x -> $$0x.c),
                  czd.b.optionalFieldOf("colors").forGetter($$0x -> $$0x.d),
                  czd.b.optionalFieldOf("fade_colors").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.optionalFieldOf("trail").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.optionalFieldOf("twinkle").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, exs::new)
   );
   public static final czd b = new czd(czd.a.a, IntList.of(), IntList.of(), false, false);
   final Optional<czd.a> c;
   final Optional<IntList> d;
   final Optional<IntList> e;
   final Optional<Boolean> f;
   final Optional<Boolean> h;

   public exs(List<eyz> $$0, Optional<czd.a> $$1, Optional<IntList> $$2, Optional<IntList> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.h = $$5;
   }

   @Override
   protected cwo a(cwo $$0, evq $$1) {
      $$0.a(kv.ae, b, this::a);
      return $$0;
   }

   private czd a(czd $$0) {
      return new czd(this.c.orElseGet($$0::a), this.d.orElseGet($$0::b), this.e.orElseGet($$0::c), this.f.orElseGet($$0::d), this.h.orElseGet($$0::e));
   }

   @Override
   public exf<exs> b() {
      return exg.L;
   }
}
