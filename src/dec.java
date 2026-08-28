import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dec(cys d, km e, Optional<jr<ebu>> f) implements ddr {
   public static final MapCodec<dec> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cys.b.fieldOf("properties").forGetter(dec::b),
               km.g.optionalFieldOf("offset", km.h).forGetter(dec::c),
               ebu.aj.optionalFieldOf("trigger_game_event").forGetter(dec::d)
            )
            .apply($$0, dec::new)
   );

   public dec(cys $$0) {
      this($$0, km.h, Optional.of(ebu.c));
   }

   @Override
   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.e);
      dwy $$6 = $$3.dV().a_($$5);
      dwy $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dV().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   public cys b() {
      return this.d;
   }

   public km c() {
      return this.e;
   }

   public Optional<jr<ebu>> d() {
      return this.f;
   }
}
