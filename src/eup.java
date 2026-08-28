import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record eup(ale b, fh.g c) implements eum {
   public static final MapCodec<eup> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a.fieldOf("storage").forGetter(eup::c), fh.g.a.fieldOf("path").forGetter(eup::d)).apply($$0, eup::new)
   );

   @Override
   public eul b() {
      return eun.f;
   }

   private Optional<vh> c(eqh $$0) {
      ur $$1 = $$0.d().o().aL().a(this.b);

      try {
         List<vo> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof vh $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(eqh $$0) {
      return this.c($$0).map(vh::k).orElse(0.0F);
   }

   @Override
   public int a(eqh $$0) {
      return this.c($$0).map(vh::g).orElse(0);
   }

   public ale c() {
      return this.b;
   }

   public fh.g d() {
      return this.c;
   }
}
