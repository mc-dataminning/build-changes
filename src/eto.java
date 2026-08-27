import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;

public class eto extends eta {
   public static final Codec<eto> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axu.a(cxj.a.g, "shape").forGetter($$0x -> $$0x.c),
                  axu.a(cxj.b, "colors").forGetter($$0x -> $$0x.d),
                  axu.a(cxj.b, "fade_colors").forGetter($$0x -> $$0x.e),
                  axu.a(Codec.BOOL, "trail").forGetter($$0x -> $$0x.f),
                  axu.a(Codec.BOOL, "twinkle").forGetter($$0x -> $$0x.h)
               )
            )
            .apply($$0, eto::new)
   );
   public static final cxj b = new cxj(cxj.a.a, IntList.of(), IntList.of(), false, false);
   final Optional<cxj.a> c;
   final Optional<IntList> d;
   final Optional<IntList> e;
   final Optional<Boolean> f;
   final Optional<Boolean> h;

   public eto(List<euu> $$0, Optional<cxj.a> $$1, Optional<IntList> $$2, Optional<IntList> $$3, Optional<Boolean> $$4, Optional<Boolean> $$5) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.h = $$5;
   }

   @Override
   protected cuh a(cuh $$0, erp $$1) {
      $$0.a(ke.S, b, this::a);
      return $$0;
   }

   private cxj a(cxj $$0) {
      return new cxj(this.c.orElseGet($$0::a), this.d.orElseGet($$0::b), this.e.orElseGet($$0::c), this.f.orElseGet($$0::d), this.h.orElseGet($$0::e));
   }

   @Override
   public etc b() {
      return etd.I;
   }
}
