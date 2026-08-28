import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dce(ju<bth> d, dbz e, dbz f, dbz g, dbz h) implements dcj {
   public static final MapCodec<dce> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(lz.W).fieldOf("to_apply").forGetter(dce::b),
               dbz.b.fieldOf("min_duration").forGetter(dce::c),
               dbz.b.fieldOf("max_duration").forGetter(dce::d),
               dbz.b.fieldOf("min_amplifier").forGetter(dce::e),
               dbz.b.fieldOf("max_amplifier").forGetter(dce::f)
            )
            .apply($$0, dce::new)
   );

   @Override
   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4) {
      if ($$3 instanceof bva $$5) {
         azs $$6 = $$5.ea();
         Optional<jq<bth>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azk.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azk.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new btj($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dce> a() {
      return a;
   }

   public ju<bth> b() {
      return this.d;
   }

   public dbz c() {
      return this.e;
   }

   public dbz d() {
      return this.f;
   }

   public dbz e() {
      return this.g;
   }

   public dbz f() {
      return this.h;
   }
}
