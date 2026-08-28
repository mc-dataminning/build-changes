import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record fbt(ald b, fp.g c) implements fbq {
   public static final MapCodec<fbt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a.fieldOf("storage").forGetter(fbt::c), fp.g.a.fieldOf("path").forGetter(fbt::d)).apply($$0, fbt::new)
   );

   @Override
   public fbp b() {
      return fbr.f;
   }

   private Optional<um> c(exl $$0) {
      tw $$1 = $$0.d().p().aK().a(this.b);

      try {
         List<ut> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof um $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(exl $$0) {
      return this.c($$0).map(um::k).orElse(0.0F);
   }

   @Override
   public int a(exl $$0) {
      return this.c($$0).map(um::g).orElse(0);
   }

   public ald c() {
      return this.b;
   }

   public fp.g d() {
      return this.c;
   }
}
