import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record eso(akh b, ev.g c) implements esl {
   public static final Codec<eso> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akh.a.fieldOf("storage").forGetter(eso::c), ev.g.a.fieldOf("path").forGetter(eso::d)).apply($$0, eso::new)
   );

   @Override
   public esk b() {
      return esm.f;
   }

   private Optional<uq> c(eol $$0) {
      ua $$1 = $$0.d().o().aL().a(this.b);

      try {
         List<ux> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof uq $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(eol $$0) {
      return this.c($$0).map(uq::k).orElse(0.0F);
   }

   @Override
   public int a(eol $$0) {
      return this.c($$0).map(uq::g).orElse(0);
   }

   public akh c() {
      return this.b;
   }

   public ev.g d() {
      return this.c;
   }
}
