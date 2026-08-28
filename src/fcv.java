import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record fcv(ale b, fa.g c) implements fcs {
   public static final MapCodec<fcv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a.fieldOf("storage").forGetter(fcv::c), fa.g.a.fieldOf("path").forGetter(fcv::d)).apply($$0, fcv::new)
   );

   @Override
   public fcr b() {
      return fct.f;
   }

   private Optional<un> c(eyn $$0) {
      tx $$1 = $$0.d().p().aK().a(this.b);

      try {
         List<uu> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof un $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(eyn $$0) {
      return this.c($$0).map(un::k).orElse(0.0F);
   }

   @Override
   public int a(eyn $$0) {
      return this.c($$0).map(un::g).orElse(0);
   }

   public ale c() {
      return this.b;
   }

   public fa.g d() {
      return this.c;
   }
}
