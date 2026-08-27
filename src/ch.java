import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ch(cl.d c, Optional<bq> d) implements br {
   public static final MapCodec<ch> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(asg.a(cl.d.d, "blocks_set_on_fire", cl.d.c).forGetter(ch::b), asg.a(bq.a, "entity_struck").forGetter(ch::c)).apply($$0, ch::new)
   );

   public static ch a(cl.d $$0) {
      return new ch($$0, Optional.empty());
   }

   @Override
   public br.a a() {
      return br.b.b;
   }

   @Override
   public boolean a(bjt $$0, alq $$1, @Nullable eif $$2) {
      return !($$0 instanceof bki $$3) ? false : this.c.d($$3.s()) && (this.d.isEmpty() || $$3.t().anyMatch($$2x -> this.d.get().a($$1, $$2, $$2x)));
   }

   public cl.d b() {
      return this.c;
   }

   public Optional<bq> c() {
      return this.d;
   }
}
