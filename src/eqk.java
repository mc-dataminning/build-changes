import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;

public class eqk extends epw {
   public static final Codec<eqk> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axh.a(cvq.a.g, "shape").forGetter($$0x -> $$0x.c),
                  axh.a(cvq.b, "colors").forGetter($$0x -> $$0x.d),
                  axh.a(cvq.b, "fade_colors").forGetter($$0x -> $$0x.e),
                  axh.a(Codec.BOOL, "trail").forGetter($$0x -> $$0x.f),
                  axh.a(Codec.BOOL, "twinkle").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, eqk::new)
   );
   public static final cvq b = new cvq(cvq.a.a, IntList.of(), IntList.of(), false, false);
   final Optional<cvq.a> c;
   final Optional<IntList> d;
   final Optional<IntList> e;
   final Optional<Boolean> f;
   final Optional<Boolean> h;

   public eqk(List<erq> $$0, Optional<cvq.a> $$1, Optional<IntList> $$2, Optional<IntList> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.h = $$5;
   }

   @Override
   protected csz a(csz $$0, eol $$1) {
      $$0.a(ka.Q, b, this::a);
      return $$0;
   }

   private cvq a(cvq $$0) {
      return new cvq(this.c.orElseGet($$0::a), this.d.orElseGet($$0::b), this.e.orElseGet($$0::c), this.f.orElseGet($$0::d), this.h.orElseGet($$0::e));
   }

   @Override
   public epy b() {
      return epz.I;
   }
}
