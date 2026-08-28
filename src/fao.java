import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fao(alz b) implements fam {
   public static final MapCodec<fao> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alz.a.fieldOf("source").forGetter(fao::c)).apply($$0, fao::new));

   @Override
   public fal a() {
      return fan.b;
   }

   @Override
   public vu a(ewp $$0) {
      return $$0.d().p().aK().a(this.b);
   }

   @Override
   public Set<bbn<?>> b() {
      return Set.of();
   }

   public alz c() {
      return this.b;
   }
}
