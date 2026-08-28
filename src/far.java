import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record far(alz b, fo.g c) implements fao {
   public static final MapCodec<far> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alz.a.fieldOf("storage").forGetter(far::c), fo.g.a.fieldOf("path").forGetter(far::d)).apply($$0, far::new)
   );

   @Override
   public fan b() {
      return fap.f;
   }

   private Optional<vn> c(ewh $$0) {
      ux $$1 = $$0.d().p().aK().a(this.b);

      try {
         List<vu> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof vn $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(ewh $$0) {
      return this.c($$0).map(vn::k).orElse(0.0F);
   }

   @Override
   public int a(ewh $$0) {
      return this.c($$0).map(vn::g).orElse(0);
   }

   public alz c() {
      return this.b;
   }

   public fo.g d() {
      return this.c;
   }
}
