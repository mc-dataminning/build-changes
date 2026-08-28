import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dam(cwm d, ke e, Optional<jj<dxg>> f) implements dab {
   public static final MapCodec<dam> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cwm.b.fieldOf("properties").forGetter(dam::b),
               ke.f.optionalFieldOf("offset", ke.g).forGetter(dam::c),
               dxg.aj.optionalFieldOf("trigger_game_event").forGetter(dam::d)
            )
            .apply($$0, dam::new)
   );

   public dam(cwm $$0) {
      this($$0, ke.g, Optional.of(dxg.c));
   }

   @Override
   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
      ja $$5 = ja.a($$4).a(this.e);
      dsk $$6 = $$3.dQ().a_($$5);
      dsk $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dQ().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dam> a() {
      return a;
   }

   public cwm b() {
      return this.d;
   }

   public ke c() {
      return this.e;
   }

   public Optional<jj<dxg>> d() {
      return this.f;
   }
}
