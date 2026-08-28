import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgz(jk<bvx> d, dgu e, dgu f, dgu g, dgu h) implements dhe {
   public static final MapCodec<dgz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jv.a(mi.W).fieldOf("to_apply").forGetter(dgz::b),
               dgu.b.fieldOf("min_duration").forGetter(dgz::c),
               dgu.b.fieldOf("max_duration").forGetter(dgz::d),
               dgu.b.fieldOf("min_amplifier").forGetter(dgz::e),
               dgu.b.fieldOf("max_amplifier").forGetter(dgz::f)
            )
            .apply($$0, dgz::new)
   );

   @Override
   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4) {
      if ($$3 instanceof bxw $$5) {
         azz $$6 = $$5.dY();
         Optional<jg<bvx>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azq.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azq.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bvz($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   public jk<bvx> b() {
      return this.d;
   }

   public dgu c() {
      return this.e;
   }

   public dgu d() {
      return this.f;
   }

   public dgu e() {
      return this.g;
   }

   public dgu f() {
      return this.h;
   }
}
