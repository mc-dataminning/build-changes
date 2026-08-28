import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record del(ju<bun> d, deg e, deg f, deg g, deg h) implements deq {
   public static final MapCodec<del> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(mb.W).fieldOf("to_apply").forGetter(del::b),
               deg.b.fieldOf("min_duration").forGetter(del::c),
               deg.b.fieldOf("max_duration").forGetter(del::d),
               deg.b.fieldOf("min_amplifier").forGetter(del::e),
               deg.b.fieldOf("max_amplifier").forGetter(del::f)
            )
            .apply($$0, del::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4) {
      if ($$3 instanceof bwg $$5) {
         bam $$6 = $$5.dZ();
         Optional<jq<bun>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(bae.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(bae.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bup($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<del> a() {
      return a;
   }

   public ju<bun> b() {
      return this.d;
   }

   public deg c() {
      return this.e;
   }

   public deg d() {
      return this.f;
   }

   public deg e() {
      return this.g;
   }

   public deg f() {
      return this.h;
   }
}
