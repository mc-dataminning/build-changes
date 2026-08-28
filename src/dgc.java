import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgc(ji<bvh> d, dfx e, dfx f, dfx g, dfx h) implements dgh {
   public static final MapCodec<dgc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jt.a(mg.W).fieldOf("to_apply").forGetter(dgc::b),
               dfx.b.fieldOf("min_duration").forGetter(dgc::c),
               dfx.b.fieldOf("max_duration").forGetter(dgc::d),
               dfx.b.fieldOf("min_amplifier").forGetter(dgc::e),
               dfx.b.fieldOf("max_amplifier").forGetter(dgc::f)
            )
            .apply($$0, dgc::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4) {
      if ($$3 instanceof bxe $$5) {
         azv $$6 = $$5.dY();
         Optional<je<bvh>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azm.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azm.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bvj($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dgc> a() {
      return a;
   }

   public ji<bvh> b() {
      return this.d;
   }

   public dfx c() {
      return this.e;
   }

   public dfx d() {
      return this.f;
   }

   public dfx e() {
      return this.g;
   }

   public dfx f() {
      return this.h;
   }
}
