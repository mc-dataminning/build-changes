import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhj(jk<bwg> d, dhe e, dhe f, dhe g, dhe h) implements dho {
   public static final MapCodec<dhj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jv.a(mi.W).fieldOf("to_apply").forGetter(dhj::b),
               dhe.b.fieldOf("min_duration").forGetter(dhj::c),
               dhe.b.fieldOf("max_duration").forGetter(dhj::d),
               dhe.b.fieldOf("min_amplifier").forGetter(dhj::e),
               dhe.b.fieldOf("max_amplifier").forGetter(dhj::f)
            )
            .apply($$0, dhj::new)
   );

   @Override
   public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4) {
      if ($$3 instanceof byf $$5) {
         bai $$6 = $$5.dY();
         Optional<jg<bwg>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azz.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azz.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bwi($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public jk<bwg> b() {
      return this.d;
   }

   public dhe c() {
      return this.e;
   }

   public dhe d() {
      return this.f;
   }

   public dhe e() {
      return this.g;
   }

   public dhe f() {
      return this.h;
   }
}
