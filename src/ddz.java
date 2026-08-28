import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddz(cyp d, km e, Optional<jr<ebr>> f) implements ddo {
   public static final MapCodec<ddz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cyp.b.fieldOf("properties").forGetter(ddz::b),
               km.g.optionalFieldOf("offset", km.h).forGetter(ddz::c),
               ebr.aj.optionalFieldOf("trigger_game_event").forGetter(ddz::d)
            )
            .apply($$0, ddz::new)
   );

   public ddz(cyp $$0) {
      this($$0, km.h, Optional.of(ebr.c));
   }

   @Override
   public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.e);
      dwv $$6 = $$3.dW().a_($$5);
      dwv $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dW().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<ddz> a() {
      return a;
   }

   public cyp b() {
      return this.d;
   }

   public km c() {
      return this.e;
   }

   public Optional<jr<ebr>> d() {
      return this.f;
   }
}
