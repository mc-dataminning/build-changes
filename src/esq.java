import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;

public class esq extends esb {
   public static final MapCodec<esq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  cws.a.g.optionalFieldOf("shape").forGetter($$0x -> $$0x.c),
                  cws.b.optionalFieldOf("colors").forGetter($$0x -> $$0x.d),
                  cws.b.optionalFieldOf("fade_colors").forGetter($$0x -> $$0x.e),
                  Codec.BOOL.optionalFieldOf("trail").forGetter($$0x -> $$0x.f),
                  Codec.BOOL.optionalFieldOf("twinkle").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, esq::new)
   );
   public static final cws b = new cws(cws.a.a, IntList.of(), IntList.of(), false, false);
   final Optional<cws.a> c;
   final Optional<IntList> d;
   final Optional<IntList> e;
   final Optional<Boolean> f;
   final Optional<Boolean> h;

   public esq(List<etz> $$0, Optional<cws.a> $$1, Optional<IntList> $$2, Optional<IntList> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.h = $$5;
   }

   @Override
   protected cua a(cua $$0, eqo $$1) {
      $$0.a(kn.T, b, this::a);
      return $$0;
   }

   private cws a(cws $$0) {
      return new cws(this.c.orElseGet($$0::a), this.d.orElseGet($$0::b), this.e.orElseGet($$0::c), this.f.orElseGet($$0::d), this.h.orElseGet($$0::e));
   }

   @Override
   public esd<esq> b() {
      return ese.L;
   }
}
