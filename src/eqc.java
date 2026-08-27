import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;

public class eqc extends epo {
   public static final Codec<eqc> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axe.a(cuu.a.g, "shape").forGetter($$0x -> $$0x.c),
                  axe.a(cuu.b, "colors").forGetter($$0x -> $$0x.d),
                  axe.a(cuu.b, "fade_colors").forGetter($$0x -> $$0x.e),
                  axe.a(Codec.BOOL, "trail").forGetter($$0x -> $$0x.f),
                  axe.a(Codec.BOOL, "twinkle").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, eqc::new)
   );
   public static final cuu b = new cuu(cuu.a.a, IntList.of(), IntList.of(), false, false);
   final Optional<cuu.a> c;
   final Optional<IntList> d;
   final Optional<IntList> e;
   final Optional<Boolean> f;
   final Optional<Boolean> h;

   public eqc(List<erh> $$0, Optional<cuu.a> $$1, Optional<IntList> $$2, Optional<IntList> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.h = $$5;
   }

   @Override
   protected csd a(csd $$0, eoa $$1) {
      $$0.a(jz.J, b, this::a);
      return $$0;
   }

   private cuu a(cuu $$0) {
      return new cuu(this.c.orElseGet($$0::a), this.d.orElseGet($$0::b), this.e.orElseGet($$0::c), this.f.orElseGet($$0::d), this.h.orElseGet($$0::e));
   }

   @Override
   public epq b() {
      return epr.G;
   }
}
