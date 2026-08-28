import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record eus(alf b, fh.g c) implements eup {
   public static final MapCodec<eus> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a.fieldOf("storage").forGetter(eus::c), fh.g.a.fieldOf("path").forGetter(eus::d)).apply($$0, eus::new)
   );

   @Override
   public euo b() {
      return euq.f;
   }

   private Optional<vi> c(eqk $$0) {
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
   public float b(eqk $$0) {
      return this.c($$0).map(vi::k).orElse(0.0F);
   }

   @Override
   public int a(eqk $$0) {
      return this.c($$0).map(vi::g).orElse(0);
   }

   public alf c() {
      return this.b;
   }

   public fh.g d() {
      return this.c;
   }
}
