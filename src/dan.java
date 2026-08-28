import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dan(cwn d, ke e, Optional<jj<dxh>> f) implements dac {
   public static final MapCodec<dan> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cwn.b.fieldOf("properties").forGetter(dan::b),
               ke.f.optionalFieldOf("offset", ke.g).forGetter(dan::c),
               dxh.aj.optionalFieldOf("trigger_game_event").forGetter(dan::d)
            )
            .apply($$0, dan::new)
   );

   public dan(cwn $$0) {
      this($$0, ke.g, Optional.of(dxh.c));
   }

   @Override
   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
      ja $$5 = ja.a($$4).a(this.e);
      dsl $$6 = $$3.dR().a_($$5);
      dsl $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dR().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dan> a() {
      return a;
   }

   public cwn b() {
      return this.d;
   }

   public ke c() {
      return this.e;
   }

   public Optional<jj<dxh>> d() {
      return this.f;
   }
}
