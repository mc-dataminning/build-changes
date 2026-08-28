import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record euo(ale b, fh.g c) implements eul {
   public static final MapCodec<euo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a.fieldOf("storage").forGetter(euo::c), fh.g.a.fieldOf("path").forGetter(euo::d)).apply($$0, euo::new)
   );

   @Override
   public euk b() {
      return eum.f;
   }

   private Optional<vh> c(eqg $$0) {
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
   public float b(eqg $$0) {
      return this.c($$0).map(vh::k).orElse(0.0F);
   }

   @Override
   public int a(eqg $$0) {
      return this.c($$0).map(vh::g).orElse(0);
   }

   public ale c() {
      return this.b;
   }

   public fh.g d() {
      return this.c;
   }
}
