import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record eyx(alj b, fo.g c) implements eyu {
   public static final MapCodec<eyx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alj.a.fieldOf("storage").forGetter(eyx::c), fo.g.a.fieldOf("path").forGetter(eyx::d)).apply($$0, eyx::new)
   );

   @Override
   public eyt b() {
      return eyv.f;
   }

   private Optional<vb> c(eun $$0) {
      ul $$1 = $$0.d().p().aK().a(this.b);

      try {
         List<vi> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof vb $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(eun $$0) {
      return this.c($$0).map(vb::k).orElse(0.0F);
   }

   @Override
   public int a(eun $$0) {
      return this.c($$0).map(vb::g).orElse(0);
   }

   public alj c() {
      return this.b;
   }

   public fo.g d() {
      return this.c;
   }
}
