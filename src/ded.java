import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ded(ju<bui> d, ddy e, ddy f, ddy g, ddy h) implements dei {
   public static final MapCodec<ded> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(mb.W).fieldOf("to_apply").forGetter(ded::b),
               ddy.b.fieldOf("min_duration").forGetter(ded::c),
               ddy.b.fieldOf("max_duration").forGetter(ded::d),
               ddy.b.fieldOf("min_amplifier").forGetter(ded::e),
               ddy.b.fieldOf("max_amplifier").forGetter(ded::f)
            )
            .apply($$0, ded::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddq $$2, bvf $$3, fbs $$4) {
      if ($$3 instanceof bwb $$5) {
         bam $$6 = $$5.dY();
         Optional<jq<bui>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(bae.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(bae.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new buk($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   public ju<bui> b() {
      return this.d;
   }

   public ddy c() {
      return this.e;
   }

   public ddy d() {
      return this.f;
   }

   public ddy e() {
      return this.g;
   }

   public ddy f() {
      return this.h;
   }
}
