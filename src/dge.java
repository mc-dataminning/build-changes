import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dge(jz d, Optional<egu> e, emy f, Optional<je<eeo>> g) implements dfw {
   public static final MapCodec<dge> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jz.g.optionalFieldOf("offset", jz.i).forGetter(dge::b),
               egu.b.optionalFieldOf("predicate").forGetter(dge::c),
               emy.a.fieldOf("block_state").forGetter(dge::d),
               eeo.aj.optionalFieldOf("trigger_game_event").forGetter(dge::e)
            )
            .apply($$0, dge::new)
   );

   @Override
   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4) {
      iu $$5 = iu.a((jo)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dY(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dge> a() {
      return a;
   }

   public jz b() {
      return this.d;
   }

   public Optional<egu> c() {
      return this.e;
   }

   public emy d() {
      return this.f;
   }

   public Optional<je<eeo>> e() {
      return this.g;
   }
}
