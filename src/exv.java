import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record exv(ale b, fm.g c) implements exs {
   public static final MapCodec<exv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a.fieldOf("storage").forGetter(exv::c), fm.g.a.fieldOf("path").forGetter(exv::d)).apply($$0, exv::new)
   );

   @Override
   public exr b() {
      return ext.f;
   }

   private Optional<uw> c(etl $$0) {
      ug $$1 = $$0.d().o().aK().a(this.b);

      try {
         List<vd> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof uw $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(etl $$0) {
      return this.c($$0).map(uw::k).orElse(0.0F);
   }

   @Override
   public int a(etl $$0) {
      return this.c($$0).map(uw::g).orElse(0);
   }

   public ale c() {
      return this.b;
   }

   public fm.g d() {
      return this.c;
   }
}
