import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record faq(alp b, fo.g c) implements fan {
   public static final MapCodec<faq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alp.a.fieldOf("storage").forGetter(faq::c), fo.g.a.fieldOf("path").forGetter(faq::d)).apply($$0, faq::new)
   );

   @Override
   public fam b() {
      return fao.f;
   }

   private Optional<vc> c(ewi $$0) {
      um $$1 = $$0.d().p().aK().a(this.b);

      try {
         List<vj> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof vc $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(ewi $$0) {
      return this.c($$0).map(vc::k).orElse(0.0F);
   }

   @Override
   public int a(ewi $$0) {
      return this.c($$0).map(vc::g).orElse(0);
   }

   public alp c() {
      return this.b;
   }

   public fo.g d() {
      return this.c;
   }
}
