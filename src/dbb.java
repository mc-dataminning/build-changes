import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbb(cxb d, kh e, Optional<jm<dxw>> f) implements daq {
   public static final MapCodec<dbb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cxb.b.fieldOf("properties").forGetter(dbb::b),
               kh.f.optionalFieldOf("offset", kh.g).forGetter(dbb::c),
               dxw.aj.optionalFieldOf("trigger_game_event").forGetter(dbb::d)
            )
            .apply($$0, dbb::new)
   );

   public dbb(cxb $$0) {
      this($$0, kh.g, Optional.of(dxw.c));
   }

   @Override
   public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4) {
      jd $$5 = jd.a((jw)$$4).a(this.e);
      dta $$6 = $$3.dQ().a_($$5);
      dta $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dQ().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dbb> a() {
      return a;
   }

   public cxb b() {
      return this.d;
   }

   public kh c() {
      return this.e;
   }

   public Optional<jm<dxw>> d() {
      return this.f;
   }
}
