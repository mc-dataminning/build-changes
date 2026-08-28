import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record evz(akr b, fl.g c) implements evw {
   public static final MapCodec<evz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akr.a.fieldOf("storage").forGetter(evz::c), fl.g.a.fieldOf("path").forGetter(evz::d)).apply($$0, evz::new)
   );

   @Override
   public evv b() {
      return evx.f;
   }

   private Optional<ur> c(erp $$0) {
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
   public float b(erp $$0) {
      return this.c($$0).map(ur::k).orElse(0.0F);
   }

   @Override
   public int a(erp $$0) {
      return this.c($$0).map(ur::g).orElse(0);
   }

   public akr c() {
      return this.b;
   }

   public fl.g d() {
      return this.c;
   }
}
