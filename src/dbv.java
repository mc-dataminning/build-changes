import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbv(ki d, Optional<ebd> e, ehh f, Optional<jn<dyx>> g) implements dbn {
   public static final MapCodec<dbv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ki.f.optionalFieldOf("offset", ki.g).forGetter(dbv::b),
               ebd.b.optionalFieldOf("predicate").forGetter(dbv::c),
               ehh.a.fieldOf("block_state").forGetter(dbv::d),
               dyx.aj.optionalFieldOf("trigger_game_event").forGetter(dbv::e)
            )
            .apply($$0, dbv::new)
   );

   @Override
   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4) {
      je $$5 = je.a((jx)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dV(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dbv> a() {
      return a;
   }

   public ki b() {
      return this.d;
   }

   public Optional<ebd> c() {
      return this.e;
   }

   public ehh d() {
      return this.f;
   }

   public Optional<jn<dyx>> e() {
      return this.g;
   }
}
