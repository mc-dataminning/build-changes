import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record evt(akt b, ez.g c) implements evq {
   public static final Codec<evt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(akt.a.fieldOf("storage").forGetter(evt::c), ez.g.a.fieldOf("path").forGetter(evt::d)).apply($$0, evt::new)
   );

   @Override
   public evp b() {
      return evr.f;
   }

   private Optional<va> c(erp $$0) {
      uk $$1 = $$0.d().o().aL().a(this.b);

      try {
         List<vh> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof va $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(erp $$0) {
      return this.c($$0).map(va::k).orElse(0.0F);
   }

   @Override
   public int a(erp $$0) {
      return this.c($$0).map(va::g).orElse(0);
   }

   public akt c() {
      return this.b;
   }

   public ez.g d() {
      return this.c;
   }
}
