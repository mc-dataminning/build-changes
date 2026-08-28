import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record fdh(alg b, fa.g c) implements fde {
   public static final MapCodec<fdh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a.fieldOf("storage").forGetter(fdh::c), fa.g.a.fieldOf("path").forGetter(fdh::d)).apply($$0, fdh::new)
   );

   @Override
   public fdd b() {
      return fdf.f;
   }

   private Optional<up> c(eyz $$0) {
      tz $$1 = $$0.d().p().aK().a(this.b);

      try {
         List<uw> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof up $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(eyz $$0) {
      return this.c($$0).map(up::k).orElse(0.0F);
   }

   @Override
   public int a(eyz $$0) {
      return this.c($$0).map(up::g).orElse(0);
   }

   public alg c() {
      return this.b;
   }

   public fa.g d() {
      return this.c;
   }
}
