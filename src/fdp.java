import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record fdp(alg b, fa.g c) implements fdm {
   public static final MapCodec<fdp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a.fieldOf("storage").forGetter(fdp::c), fa.g.a.fieldOf("path").forGetter(fdp::d)).apply($$0, fdp::new)
   );

   @Override
   public fdl b() {
      return fdn.f;
   }

   private Optional<up> c(ezh $$0) {
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
   public float b(ezh $$0) {
      return this.c($$0).map(up::k).orElse(0.0F);
   }

   @Override
   public int a(ezh $$0) {
      return this.c($$0).map(up::g).orElse(0);
   }

   public alg c() {
      return this.b;
   }

   public fa.g d() {
      return this.c;
   }
}
