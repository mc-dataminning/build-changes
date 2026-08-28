import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record fax(alz b, fo.g c) implements fau {
   public static final MapCodec<fax> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alz.a.fieldOf("storage").forGetter(fax::c), fo.g.a.fieldOf("path").forGetter(fax::d)).apply($$0, fax::new)
   );

   @Override
   public fat b() {
      return fav.f;
   }

   private Optional<vn> c(ewp $$0) {
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
   public float b(ewp $$0) {
      return this.c($$0).map(vn::k).orElse(0.0F);
   }

   @Override
   public int a(ewp $$0) {
      return this.c($$0).map(vn::g).orElse(0);
   }

   public alz c() {
      return this.b;
   }

   public fo.g d() {
      return this.c;
   }
}
