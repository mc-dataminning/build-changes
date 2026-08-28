import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhz(dck d, kb e, Optional<jg<egq>> f) implements dho {
   public static final MapCodec<dhz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dck.b.fieldOf("properties").forGetter(dhz::b),
               kb.g.optionalFieldOf("offset", kb.i).forGetter(dhz::c),
               egq.aj.optionalFieldOf("trigger_game_event").forGetter(dhz::d)
            )
            .apply($$0, dhz::new)
   );

   public dhz(dck $$0) {
      this($$0, kb.i, Optional.of(egq.c));
   }

   @Override
   public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4) {
      iw $$5 = iw.a((jq)$$4).a(this.e);
      ebq $$6 = $$3.dV().a_($$5);
      ebq $$7 = this.d.a($$6);
      if ($$6 != $$7 && $$3.dV().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dhz> a() {
      return a;
   }

   public dck b() {
      return this.d;
   }

   public kb c() {
      return this.e;
   }

   public Optional<jg<egq>> d() {
      return this.f;
   }
}
