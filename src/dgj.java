import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgj(jj<bvk> d, dge e, dge f, dge g, dge h) implements dgo {
   public static final MapCodec<dgj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ju.a(mh.W).fieldOf("to_apply").forGetter(dgj::b),
               dge.b.fieldOf("min_duration").forGetter(dgj::c),
               dge.b.fieldOf("max_duration").forGetter(dgj::d),
               dge.b.fieldOf("min_amplifier").forGetter(dgj::e),
               dge.b.fieldOf("max_amplifier").forGetter(dgj::f)
            )
            .apply($$0, dgj::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4) {
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
   public MapCodec<dgj> a() {
      return a;
   }

   public jj<bvk> b() {
      return this.d;
   }

   public dge c() {
      return this.e;
   }

   public dge d() {
      return this.f;
   }

   public dge e() {
      return this.g;
   }

   public dge f() {
      return this.h;
   }
}
