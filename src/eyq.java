import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record eyq(all b, fo.g c) implements eyn {
   public static final MapCodec<eyq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(all.a.fieldOf("storage").forGetter(eyq::c), fo.g.a.fieldOf("path").forGetter(eyq::d)).apply($$0, eyq::new)
   );

   @Override
   public eym b() {
      return eyo.f;
   }

   private Optional<vd> c(eug $$0) {
      un $$1 = $$0.d().o().aK().a(this.b);

      try {
         List<vk> $$2 = this.c.a($$1);
         if ($$2.size() == 1 && $$2.get(0) instanceof vd $$3) {
            return Optional.of($$3);
         }
      } catch (CommandSyntaxException var6) {
      }

      return Optional.empty();
   }

   @Override
   public float b(eug $$0) {
      return this.c($$0).map(vd::k).orElse(0.0F);
   }

   @Override
   public int a(eug $$0) {
      return this.c($$0).map(vd::g).orElse(0);
   }

   public all c() {
      return this.b;
   }

   public fo.g d() {
      return this.c;
   }
}
