import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dec(ju<bue> d, ddx e, ddx f, ddx g, ddx h) implements deh {
   public static final MapCodec<dec> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(mb.W).fieldOf("to_apply").forGetter(dec::b),
               ddx.b.fieldOf("min_duration").forGetter(dec::c),
               ddx.b.fieldOf("max_duration").forGetter(dec::d),
               ddx.b.fieldOf("min_amplifier").forGetter(dec::e),
               ddx.b.fieldOf("max_amplifier").forGetter(dec::f)
            )
            .apply($$0, dec::new)
   );

   @Override
   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4) {
      if ($$3 instanceof bvx $$5) {
         bac $$6 = $$5.dZ();
         Optional<jq<bue>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(azu.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(azu.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new bug($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   public ju<bue> b() {
      return this.d;
   }

   public ddx c() {
      return this.e;
   }

   public ddx d() {
      return this.f;
   }

   public ddx e() {
      return this.g;
   }

   public ddx f() {
      return this.h;
   }
}
