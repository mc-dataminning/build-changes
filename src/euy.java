import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record euy(akk b, fi.g c) implements euv {
   public static final MapCodec<euy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akk.a.fieldOf("storage").forGetter(euy::c), fi.g.a.fieldOf("path").forGetter(euy::d)).apply($$0, euy::new)
   );

   @Override
   public euu b() {
      return euw.f;
   }

   private Optional<un> c(eqo $$0) {
      tx $$1 = $$0.d().o().aL().a(this.b);

      try {
         List<uu> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof un $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(eqo $$0) {
      return this.c($$0).map(un::k).orElse(0.0F);
   }

   @Override
   public int a(eqo $$0) {
      return this.c($$0).map(un::g).orElse(0);
   }

   public akk c() {
      return this.b;
   }

   public fi.g d() {
      return this.c;
   }
}
