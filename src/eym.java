import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record eym(ali b, fo.g c) implements eyj {
   public static final MapCodec<eym> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a.fieldOf("storage").forGetter(eym::c), fo.g.a.fieldOf("path").forGetter(eym::d)).apply($$0, eym::new)
   );

   @Override
   public eyi b() {
      return eyk.f;
   }

   private Optional<va> c(euc $$0) {
      uk $$1 = $$0.d().o().aK().a(this.b);

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
   public float b(euc $$0) {
      return this.c($$0).map(va::k).orElse(0.0F);
   }

   @Override
   public int a(euc $$0) {
      return this.c($$0).map(va::g).orElse(0);
   }

   public ali c() {
      return this.b;
   }

   public fo.g d() {
      return this.c;
   }
}
