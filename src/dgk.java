import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgk(jz d, Optional<ehf> e, enj f, Optional<je<eez>> g) implements dgc {
   public static final MapCodec<dgk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jz.g.optionalFieldOf("offset", jz.i).forGetter(dgk::b),
               ehf.b.optionalFieldOf("predicate").forGetter(dgk::c),
               enj.a.fieldOf("block_state").forGetter(dgk::d),
               eez.aj.optionalFieldOf("trigger_game_event").forGetter(dgk::e)
            )
            .apply($$0, dgk::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4) {
      iu $$5 = iu.a((jo)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dY(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   public jz b() {
      return this.d;
   }

   public Optional<ehf> c() {
      return this.e;
   }

   public enj d() {
      return this.f;
   }

   public Optional<je<eez>> e() {
      return this.g;
   }
}
