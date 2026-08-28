import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dba(kh d, Optional<eaf> e, egi f, Optional<jm<dxz>> g) implements das {
   public static final MapCodec<dba> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kh.f.optionalFieldOf("offset", kh.g).forGetter(dba::b),
               eaf.b.optionalFieldOf("predicate").forGetter(dba::c),
               egi.a.fieldOf("block_state").forGetter(dba::d),
               dxz.aj.optionalFieldOf("trigger_game_event").forGetter(dba::e)
            )
            .apply($$0, dba::new)
   );

   @Override
   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exa $$4) {
      jd $$5 = jd.a((jw)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dS(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dba> a() {
      return a;
   }

   public kh b() {
      return this.d;
   }

   public Optional<eaf> c() {
      return this.e;
   }

   public egi d() {
      return this.f;
   }

   public Optional<jm<dxz>> e() {
      return this.g;
   }
}
