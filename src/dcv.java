import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcv(kl d, Optional<ecq> e, eiu f, Optional<jq<eak>> g) implements dcn {
   public static final MapCodec<dcv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kl.f.optionalFieldOf("offset", kl.g).forGetter(dcv::b),
               ecq.b.optionalFieldOf("predicate").forGetter(dcv::c),
               eiu.a.fieldOf("block_state").forGetter(dcv::d),
               eak.aj.optionalFieldOf("trigger_game_event").forGetter(dcv::e)
            )
            .apply($$0, dcv::new)
   );

   @Override
   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.eb(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dcv> a() {
      return a;
   }

   public kl b() {
      return this.d;
   }

   public Optional<ecq> c() {
      return this.e;
   }

   public eiu d() {
      return this.f;
   }

   public Optional<jq<eak>> e() {
      return this.g;
   }
}
