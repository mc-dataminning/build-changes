import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhc(dbn d, ka e, Optional<jf<eft>> f) implements dgr {
   public static final MapCodec<dhc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dbn.b.fieldOf("properties").forGetter(dhc::b),
               ka.g.optionalFieldOf("offset", ka.i).forGetter(dhc::c),
               eft.aj.optionalFieldOf("trigger_game_event").forGetter(dhc::d)
            )
            .apply($$0, dhc::new)
   );

   public dhc(dbn $$0) {
      this($$0, ka.i, Optional.of(eft.c));
   }

   @Override
   public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4) {
      iv $$5 = iv.a((jp)$$4).a(this.e);
      eat $$6 = $$3.dU().a_($$5);
      eat $$7 = this.d.a($$6);
      if ($$6 != $$7 && $$3.dU().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   public dbn b() {
      return this.d;
   }

   public ka c() {
      return this.e;
   }

   public Optional<jf<eft>> d() {
      return this.f;
   }
}
