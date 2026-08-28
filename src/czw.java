import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czw(jn<brm> d, czs e, czs f, czs g, czs h) implements dab {
   public static final MapCodec<czw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jy.a(lr.V).fieldOf("to_apply").forGetter(czw::b),
               czs.b.fieldOf("min_duration").forGetter(czw::c),
               czs.b.fieldOf("max_duration").forGetter(czw::d),
               czs.b.fieldOf("min_amplifier").forGetter(czw::e),
               czs.b.fieldOf("max_amplifier").forGetter(czw::f)
            )
            .apply($$0, czw::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
      if ($$3 instanceof btb $$5) {
         ayo $$6 = $$5.dT();
         Optional<jj<brm>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(ayg.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(ayg.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.b(new bro($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<czw> a() {
      return a;
   }

   public jn<brm> b() {
      return this.d;
   }

   public czs c() {
      return this.e;
   }

   public czs d() {
      return this.f;
   }

   public czs e() {
      return this.g;
   }

   public czs f() {
      return this.h;
   }
}
