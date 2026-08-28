import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record ezz(aku b, fp.g c) implements ezw {
   public static final MapCodec<ezz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a.fieldOf("storage").forGetter(ezz::c), fp.g.a.fieldOf("path").forGetter(ezz::d)).apply($$0, ezz::new)
   );

   @Override
   public ezv b() {
      return ezx.f;
   }

   private Optional<ug> c(evr $$0) {
      tq $$1 = $$0.d().p().aK().a(this.b);

      try {
         List<un> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof ug $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(evr $$0) {
      return this.c($$0).map(ug::k).orElse(0.0F);
   }

   @Override
   public int a(evr $$0) {
      return this.c($$0).map(ug::g).orElse(0);
   }

   public aku c() {
      return this.b;
   }

   public fp.g d() {
      return this.c;
   }
}
