import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record evg(akk b, fi.g c) implements evd {
   public static final MapCodec<evg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akk.a.fieldOf("storage").forGetter(evg::c), fi.g.a.fieldOf("path").forGetter(evg::d)).apply($$0, evg::new)
   );

   @Override
   public evc b() {
      return eve.f;
   }

   private Optional<un> c(eqw $$0) {
      tx $$1 = $$0.d().o().aM().a(this.b);

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
   public float b(eqw $$0) {
      return this.c($$0).map(un::k).orElse(0.0F);
   }

   @Override
   public int a(eqw $$0) {
      return this.c($$0).map(un::g).orElse(0);
   }

   public akk c() {
      return this.b;
   }

   public fi.g d() {
      return this.c;
   }
}
