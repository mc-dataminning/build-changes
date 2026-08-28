import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcp(cya d, kj e, Optional<jo<dzp>> f) implements dce {
   public static final MapCodec<dcp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cya.b.fieldOf("properties").forGetter(dcp::b),
               kj.f.optionalFieldOf("offset", kj.g).forGetter(dcp::c),
               dzp.aj.optionalFieldOf("trigger_game_event").forGetter(dcp::d)
            )
            .apply($$0, dcp::new)
   );

   public dcp(cya $$0) {
      this($$0, kj.g, Optional.of(dzp.c));
   }

   @Override
   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4) {
      jf $$5 = jf.a((jy)$$4).a(this.e);
      dus $$6 = $$3.dS().a_($$5);
      dus $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dS().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   public cya b() {
      return this.d;
   }

   public kj c() {
      return this.e;
   }

   public Optional<jo<dzp>> d() {
      return this.f;
   }
}
