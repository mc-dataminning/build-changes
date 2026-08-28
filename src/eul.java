import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record eul(alb b, fh.g c) implements eui {
   public static final MapCodec<eul> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alb.a.fieldOf("storage").forGetter(eul::c), fh.g.a.fieldOf("path").forGetter(eul::d)).apply($$0, eul::new)
   );

   @Override
   public euh b() {
      return euj.f;
   }

   private Optional<vh> c(eqd $$0) {
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
   public float b(eqd $$0) {
      return this.c($$0).map(vh::k).orElse(0.0F);
   }

   @Override
   public int a(eqd $$0) {
      return this.c($$0).map(vh::g).orElse(0);
   }

   public alb c() {
      return this.b;
   }

   public fh.g d() {
      return this.c;
   }
}
