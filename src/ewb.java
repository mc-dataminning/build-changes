import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record ewb(akr b, fl.g c) implements evy {
   public static final MapCodec<ewb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akr.a.fieldOf("storage").forGetter(ewb::c), fl.g.a.fieldOf("path").forGetter(ewb::d)).apply($$0, ewb::new)
   );

   @Override
   public evx b() {
      return evz.f;
   }

   private Optional<ur> c(err $$0) {
      ub $$1 = $$0.d().o().aL().a(this.b);

      try {
         List<uy> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof ur $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(err $$0) {
      return this.c($$0).map(ur::k).orElse(0.0F);
   }

   @Override
   public int a(err $$0) {
      return this.c($$0).map(ur::g).orElse(0);
   }

   public akr c() {
      return this.b;
   }

   public fl.g d() {
      return this.c;
   }
}
