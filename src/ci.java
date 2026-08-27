import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ci(cm.d c, Optional<br> d) implements bs {
   public static final MapCodec<ci> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(avu.a(cm.d.d, "blocks_set_on_fire", cm.d.c).forGetter(ci::b), avu.a(br.a, "entity_struck").forGetter(ci::c)).apply($$0, ci::new)
   );

   public static ci a(cm.d $$0) {
      return new ci($$0, Optional.empty());
   }

   @Override
   public bs.a a() {
      return bs.b.b;
   }

   @Override
   public boolean a(bof $$0, apa $$1, @Nullable eov $$2) {
      return !($$0 instanceof bow $$3) ? false : this.c.d($$3.s()) && (this.d.isEmpty() || $$3.u().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public cm.d b() {
      return this.c;
   }

   public Optional<br> c() {
      return this.d;
   }
}
