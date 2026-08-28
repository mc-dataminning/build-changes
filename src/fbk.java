import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fbk(ald b) implements fbi {
   public static final MapCodec<fbk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ald.a.fieldOf("source").forGetter(fbk::c)).apply($$0, fbk::new));

   @Override
   public fbh a() {
      return fbj.b;
   }

   @Override
   public ut a(exl $$0) {
      return $$0.d().p().aK().a(this.b);
   }

   @Override
   public Set<bat<?>> b() {
      return Set.of();
   }

   public ald c() {
      return this.b;
   }
}
