import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgm(jj<bvk> d, dgh e, dgh f, dgh g, dgh h) implements dgr {
   public static final MapCodec<dgm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ju.a(mh.W).fieldOf("to_apply").forGetter(dgm::b),
               dgh.b.fieldOf("min_duration").forGetter(dgm::c),
               dgh.b.fieldOf("max_duration").forGetter(dgm::d),
               dgh.b.fieldOf("min_amplifier").forGetter(dgm::e),
               dgh.b.fieldOf("max_amplifier").forGetter(dgm::f)
            )
            .apply($$0, dgm::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4) {
      if ($$3 instanceof bxj $$5) {
         azv $$6 = $$5.dX();
         Optional<jf<bvk>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azm.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azm.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bvm($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   public jj<bvk> b() {
      return this.d;
   }

   public dgh c() {
      return this.e;
   }

   public dgh d() {
      return this.f;
   }

   public dgh e() {
      return this.g;
   }

   public dgh f() {
      return this.h;
   }
}
