import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czx(jn<brn> d, czt e, czt f, czt g, czt h) implements dac {
   public static final MapCodec<czx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jy.a(lr.V).fieldOf("to_apply").forGetter(czx::b),
               czt.b.fieldOf("min_duration").forGetter(czx::c),
               czt.b.fieldOf("max_duration").forGetter(czx::d),
               czt.b.fieldOf("min_amplifier").forGetter(czx::e),
               czt.b.fieldOf("max_amplifier").forGetter(czx::f)
            )
            .apply($$0, czx::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
      if ($$3 instanceof btc $$5) {
         ayo $$6 = $$5.dU();
         Optional<jj<brn>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(ayg.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(ayg.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.b(new brp($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<czx> a() {
      return a;
   }

   public jn<brn> b() {
      return this.d;
   }

   public czt c() {
      return this.e;
   }

   public czt d() {
      return this.f;
   }

   public czt e() {
      return this.g;
   }

   public czt f() {
      return this.h;
   }
}
