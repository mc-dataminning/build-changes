import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dal(jq<brw> d, dah e, dah f, dah g, dah h) implements daq {
   public static final MapCodec<dal> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kb.a(lu.W).fieldOf("to_apply").forGetter(dal::b),
               dah.b.fieldOf("min_duration").forGetter(dal::c),
               dah.b.fieldOf("max_duration").forGetter(dal::d),
               dah.b.fieldOf("min_amplifier").forGetter(dal::e),
               dah.b.fieldOf("max_amplifier").forGetter(dal::f)
            )
            .apply($$0, dal::new)
   );

   @Override
   public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4) {
      if ($$3 instanceof btl $$5) {
         ayv $$6 = $$5.dT();
         Optional<jm<brw>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(ayn.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(ayn.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.b(new bry($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dal> a() {
      return a;
   }

   public jq<brw> b() {
      return this.d;
   }

   public dah c() {
      return this.e;
   }

   public dah d() {
      return this.f;
   }

   public dah e() {
      return this.g;
   }

   public dah f() {
      return this.h;
   }
}
