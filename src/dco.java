import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dco(cxz d, kk e, Optional<jp<eaa>> f) implements dcd {
   public static final MapCodec<dco> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cxz.b.fieldOf("properties").forGetter(dco::b),
               kk.f.optionalFieldOf("offset", kk.g).forGetter(dco::c),
               eaa.aj.optionalFieldOf("trigger_game_event").forGetter(dco::d)
            )
            .apply($$0, dco::new)
   );

   public dco(cxz $$0) {
      this($$0, kk.g, Optional.of(eaa.c));
   }

   @Override
   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4) {
      jg $$5 = jg.a((jz)$$4).a(this.e);
      dvd $$6 = $$3.dX().a_($$5);
      dvd $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dX().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dco> a() {
      return a;
   }

   public cxz b() {
      return this.d;
   }

   public kk c() {
      return this.e;
   }

   public Optional<jp<eaa>> d() {
      return this.f;
   }
}
