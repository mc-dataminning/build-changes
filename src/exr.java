import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record exr(alc b, fl.g c) implements exo {
   public static final MapCodec<exr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alc.a.fieldOf("storage").forGetter(exr::c), fl.g.a.fieldOf("path").forGetter(exr::d)).apply($$0, exr::new)
   );

   @Override
   public exn b() {
      return exp.f;
   }

   private Optional<uv> c(eth $$0) {
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
   public float b(eth $$0) {
      return this.c($$0).map(uv::k).orElse(0.0F);
   }

   @Override
   public int a(eth $$0) {
      return this.c($$0).map(uv::g).orElse(0);
   }

   public alc c() {
      return this.b;
   }

   public fl.g d() {
      return this.c;
   }
}
