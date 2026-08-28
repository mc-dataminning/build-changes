import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record ezx(aku b, fp.g c) implements ezu {
   public static final MapCodec<ezx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a.fieldOf("storage").forGetter(ezx::c), fp.g.a.fieldOf("path").forGetter(ezx::d)).apply($$0, ezx::new)
   );

   @Override
   public ezt b() {
      return ezv.f;
   }

   private Optional<ug> c(evp $$0) {
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
   public float b(evp $$0) {
      return this.c($$0).map(ug::k).orElse(0.0F);
   }

   @Override
   public int a(evp $$0) {
      return this.c($$0).map(ug::g).orElse(0);
   }

   public aku c() {
      return this.b;
   }

   public fp.g d() {
      return this.c;
   }
}
