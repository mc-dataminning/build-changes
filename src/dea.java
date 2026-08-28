import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dea(cyq d, km e, Optional<jr<ebs>> f) implements ddp {
   public static final MapCodec<dea> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cyq.b.fieldOf("properties").forGetter(dea::b),
               km.g.optionalFieldOf("offset", km.h).forGetter(dea::c),
               ebs.aj.optionalFieldOf("trigger_game_event").forGetter(dea::d)
            )
            .apply($$0, dea::new)
   );

   public dea(cyq $$0) {
      this($$0, km.h, Optional.of(ebs.c));
   }

   @Override
   public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.e);
      dww $$6 = $$3.dV().a_($$5);
      dww $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dV().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   public cyq b() {
      return this.d;
   }

   public km c() {
      return this.e;
   }

   public Optional<jr<ebs>> d() {
      return this.f;
   }
}
