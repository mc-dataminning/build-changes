import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record evv(akq b, fl.g c) implements evs {
   public static final MapCodec<evv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akq.a.fieldOf("storage").forGetter(evv::c), fl.g.a.fieldOf("path").forGetter(evv::d)).apply($$0, evv::new)
   );

   @Override
   public evr b() {
      return evt.f;
   }

   private Optional<uq> c(erl $$0) {
      ua $$1 = $$0.d().o().aL().a(this.b);

      try {
         List<ux> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof uq $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(erl $$0) {
      return this.c($$0).map(uq::k).orElse(0.0F);
   }

   @Override
   public int a(erl $$0) {
      return this.c($$0).map(uq::g).orElse(0);
   }

   public akq c() {
      return this.b;
   }

   public fl.g d() {
      return this.c;
   }
}
