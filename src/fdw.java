import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record fdw(alg b, fb.g c) implements fdt {
   public static final MapCodec<fdw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a.fieldOf("storage").forGetter(fdw::c), fb.g.a.fieldOf("path").forGetter(fdw::d)).apply($$0, fdw::new)
   );

   @Override
   public fds b() {
      return fdu.f;
   }

   private Optional<up> c(ezo $$0) {
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
   public float b(ezo $$0) {
      return this.c($$0).map(up::k).orElse(0.0F);
   }

   @Override
   public int a(ezo $$0) {
      return this.c($$0).map(up::g).orElse(0);
   }

   public alg c() {
      return this.b;
   }

   public fb.g d() {
      return this.c;
   }
}
