import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dex(kl d, Optional<eew> e, ela f, Optional<jq<ecq>> g) implements dep {
   public static final MapCodec<dex> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kl.f.optionalFieldOf("offset", kl.g).forGetter(dex::b),
               eew.b.optionalFieldOf("predicate").forGetter(dex::c),
               ela.a.fieldOf("block_state").forGetter(dex::d),
               ecq.aj.optionalFieldOf("trigger_game_event").forGetter(dex::e)
            )
            .apply($$0, dex::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dZ(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   public kl b() {
      return this.d;
   }

   public Optional<eew> c() {
      return this.e;
   }

   public ela d() {
      return this.f;
   }

   public Optional<jq<ecq>> e() {
      return this.g;
   }
}
