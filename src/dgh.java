import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgh(das d, jz e, Optional<je<eeo>> f) implements dfw {
   public static final MapCodec<dgh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               das.b.fieldOf("properties").forGetter(dgh::b),
               jz.g.optionalFieldOf("offset", jz.i).forGetter(dgh::c),
               eeo.aj.optionalFieldOf("trigger_game_event").forGetter(dgh::d)
            )
            .apply($$0, dgh::new)
   );

   public dgh(das $$0) {
      this($$0, jz.i, Optional.of(eeo.c));
   }

   @Override
   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4) {
      iu $$5 = iu.a((jo)$$4).a(this.e);
      dzo $$6 = $$3.dV().a_($$5);
      dzo $$7 = this.d.a($$6);
      if ($$6 != $$7 && $$3.dV().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dgh> a() {
      return a;
   }

   public das b() {
      return this.d;
   }

   public jz c() {
      return this.e;
   }

   public Optional<je<eeo>> d() {
      return this.f;
   }
}
