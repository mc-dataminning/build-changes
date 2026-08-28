import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dby(cxw d, ki e, Optional<jn<dyx>> f) implements dbn {
   public static final MapCodec<dby> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cxw.b.fieldOf("properties").forGetter(dby::b),
               ki.f.optionalFieldOf("offset", ki.g).forGetter(dby::c),
               dyx.aj.optionalFieldOf("trigger_game_event").forGetter(dby::d)
            )
            .apply($$0, dby::new)
   );

   public dby(cxw $$0) {
      this($$0, ki.g, Optional.of(dyx.c));
   }

   @Override
   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4) {
      je $$5 = je.a((jx)$$4).a(this.e);
      dua $$6 = $$3.dS().a_($$5);
      dua $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dS().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dby> a() {
      return a;
   }

   public cxw b() {
      return this.d;
   }

   public ki c() {
      return this.e;
   }

   public Optional<jn<dyx>> d() {
      return this.f;
   }
}
