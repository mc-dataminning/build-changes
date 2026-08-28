import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcj(ki d, Optional<ebr> e, ehv f, Optional<jn<dzl>> g) implements dcb {
   public static final MapCodec<dcj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ki.f.optionalFieldOf("offset", ki.g).forGetter(dcj::b),
               ebr.b.optionalFieldOf("predicate").forGetter(dcj::c),
               ehv.a.fieldOf("block_state").forGetter(dcj::d),
               dzl.aj.optionalFieldOf("trigger_game_event").forGetter(dcj::e)
            )
            .apply($$0, dcj::new)
   );

   @Override
   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4) {
      je $$5 = je.a((jx)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dV(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dcj> a() {
      return a;
   }

   public ki b() {
      return this.d;
   }

   public Optional<ebr> c() {
      return this.e;
   }

   public ehv d() {
      return this.f;
   }

   public Optional<jn<dzl>> e() {
      return this.g;
   }
}
