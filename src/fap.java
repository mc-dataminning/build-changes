import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;

public class fap extends faa {
   public static final MapCodec<fap> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  dbg.a.g.optionalFieldOf("shape").forGetter($$0x -> $$0x.c),
                  dbg.b.optionalFieldOf("colors").forGetter($$0x -> $$0x.d),
                  dbg.b.optionalFieldOf("fade_colors").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.optionalFieldOf("trail").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.optionalFieldOf("twinkle").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, fap::new)
   );
   public static final dbg b = new dbg(dbg.a.a, IntList.of(), IntList.of(), false, false);
   final Optional<dbg.a> c;
   final Optional<IntList> d;
   final Optional<IntList> e;
   final Optional<Boolean> f;
   final Optional<Boolean> h;

   public fap(List<fbw> $$0, Optional<dbg.a> $$1, Optional<IntList> $$2, Optional<IntList> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.h = $$5;
   }

   @Override
   protected cys a(cys $$0, eyn $$1) {
      $$0.a(kj.ai, b, this::a);
      return $$0;
   }

   private dbg a(dbg $$0) {
      return new dbg(this.c.orElseGet($$0::a), this.d.orElseGet($$0::b), this.e.orElseGet($$0::c), this.f.orElseGet($$0::d), this.h.orElseGet($$0::e));
   }

   @Override
   public fac<fap> b() {
      return fad.L;
   }
}
