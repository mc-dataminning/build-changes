import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record faa(akv b, fp.g c) implements ezx {
   public static final MapCodec<faa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akv.a.fieldOf("storage").forGetter(faa::c), fp.g.a.fieldOf("path").forGetter(faa::d)).apply($$0, faa::new)
   );

   @Override
   public ezw b() {
      return ezy.f;
   }

   private Optional<ug> c(evs $$0) {
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
   public float b(evs $$0) {
      return this.c($$0).map(ug::k).orElse(0.0F);
   }

   @Override
   public int a(evs $$0) {
      return this.c($$0).map(ug::g).orElse(0);
   }

   public akv c() {
      return this.b;
   }

   public fp.g d() {
      return this.c;
   }
}
