import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record eur(alf b, fh.g c) implements euo {
   public static final MapCodec<eur> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a.fieldOf("storage").forGetter(eur::c), fh.g.a.fieldOf("path").forGetter(eur::d)).apply($$0, eur::new)
   );

   @Override
   public eun b() {
      return eup.f;
   }

   private Optional<vi> c(eqj $$0) {
      us $$1 = $$0.d().o().aL().a(this.b);

      try {
         List<vp> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof vi $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(eqj $$0) {
      return this.c($$0).map(vi::k).orElse(0.0F);
   }

   @Override
   public int a(eqj $$0) {
      return this.c($$0).map(vi::g).orElse(0);
   }

   public alf c() {
      return this.b;
   }

   public fh.g d() {
      return this.c;
   }
}
