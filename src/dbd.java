import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbd(cxd d, kh e, Optional<jm<dxz>> f) implements das {
   public static final MapCodec<dbd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cxd.b.fieldOf("properties").forGetter(dbd::b),
               kh.f.optionalFieldOf("offset", kh.g).forGetter(dbd::c),
               dxz.aj.optionalFieldOf("trigger_game_event").forGetter(dbd::d)
            )
            .apply($$0, dbd::new)
   );

   public dbd(cxd $$0) {
      this($$0, kh.g, Optional.of(dxz.c));
   }

   @Override
   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exc $$4) {
      jd $$5 = jd.a((jw)$$4).a(this.e);
      dtc $$6 = $$3.dO().a_($$5);
      dtc $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dO().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dbd> a() {
      return a;
   }

   public cxd b() {
      return this.d;
   }

   public kh c() {
      return this.e;
   }

   public Optional<jm<dxz>> d() {
      return this.f;
   }
}
