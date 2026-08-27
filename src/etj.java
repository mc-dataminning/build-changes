import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record etj(akm b, ew.g c) implements etg {
   public static final MapCodec<etj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akm.a.fieldOf("storage").forGetter(etj::c), ew.g.a.fieldOf("path").forGetter(etj::d)).apply($$0, etj::new)
   );

   @Override
   public etf b() {
      return eth.f;
   }

   private Optional<ut> c(epf $$0) {
      ud $$1 = $$0.d().o().aL().a(this.b);

      try {
         List<va> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof ut $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(epf $$0) {
      return this.c($$0).map(ut::k).orElse(0.0F);
   }

   @Override
   public int a(epf $$0) {
      return this.c($$0).map(ut::g).orElse(0);
   }

   public akm c() {
      return this.b;
   }

   public ew.g d() {
      return this.c;
   }
}
