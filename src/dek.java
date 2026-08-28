import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dek(ju<bum> d, def e, def f, def g, def h) implements dep {
   public static final MapCodec<dek> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kf.a(mb.W).fieldOf("to_apply").forGetter(dek::b),
               def.b.fieldOf("min_duration").forGetter(dek::c),
               def.b.fieldOf("max_duration").forGetter(dek::d),
               def.b.fieldOf("min_amplifier").forGetter(dek::e),
               def.b.fieldOf("max_amplifier").forGetter(dek::f)
            )
            .apply($$0, dek::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4) {
      if ($$3 instanceof bwf $$5) {
         bam $$6 = $$5.dZ();
         Optional<jq<bum>> $$7 = this.d.a($$6);
         if ($$7.isPresent()) {
            int $$8 = Math.round(bae.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0F);
            int $$9 = Math.max(0, Math.round(bae.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new buo($$7.get(), $$8, $$9));
         }
      }
   }

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   public ju<bum> b() {
      return this.d;
   }

   public def c() {
      return this.e;
   }

   public def d() {
      return this.f;
   }

   public def e() {
      return this.g;
   }

   public def f() {
      return this.h;
   }
}
