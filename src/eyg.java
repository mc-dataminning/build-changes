import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record eyg(alh b, fn.g c) implements eyd {
   public static final MapCodec<eyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.a.fieldOf("storage").forGetter(eyg::c), fn.g.a.fieldOf("path").forGetter(eyg::d)).apply($$0, eyg::new)
   );

   @Override
   public eyc b() {
      return eye.f;
   }

   private Optional<uz> c(etw $$0) {
      uj $$1 = $$0.d().o().aK().a(this.b);

      try {
         List<vg> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof uz $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(etw $$0) {
      return this.c($$0).map(uz::k).orElse(0.0F);
   }

   @Override
   public int a(etw $$0) {
      return this.c($$0).map(uz::g).orElse(0);
   }

   public alh c() {
      return this.b;
   }

   public fn.g d() {
      return this.c;
   }
}
