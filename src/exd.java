import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record exd(alb b, fl.g c) implements exa {
   public static final MapCodec<exd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alb.a.fieldOf("storage").forGetter(exd::c), fl.g.a.fieldOf("path").forGetter(exd::d)).apply($$0, exd::new)
   );

   @Override
   public ewz b() {
      return exb.f;
   }

   private Optional<uv> c(est $$0) {
      uf $$1 = $$0.d().o().aK().a(this.b);

      try {
         List<vc> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof uv $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(est $$0) {
      return this.c($$0).map(uv::k).orElse(0.0F);
   }

   @Override
   public int a(est $$0) {
      return this.c($$0).map(uv::g).orElse(0);
   }

   public alb c() {
      return this.b;
   }

   public fl.g d() {
      return this.c;
   }
}
