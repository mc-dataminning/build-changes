import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record euq(alf b, fh.g c) implements eun {
   public static final MapCodec<euq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a.fieldOf("storage").forGetter(euq::c), fh.g.a.fieldOf("path").forGetter(euq::d)).apply($$0, euq::new)
   );

   @Override
   public eum b() {
      return euo.f;
   }

   private Optional<vi> c(eqi $$0) {
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
   public float b(eqi $$0) {
      return this.c($$0).map(vi::k).orElse(0.0F);
   }

   @Override
   public int a(eqi $$0) {
      return this.c($$0).map(vi::g).orElse(0);
   }

   public alf c() {
      return this.b;
   }

   public fh.g d() {
      return this.c;
   }
}
