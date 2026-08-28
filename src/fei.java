import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fei(alk b) implements feg {
   public static final MapCodec<fei> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alk.a.fieldOf("source").forGetter(fei::c)).apply($$0, fei::new));

   @Override
   public fef a() {
      return feh.b;
   }

   @Override
   public va a(faj $$0) {
      return $$0.d().p().aK().a(this.b);
   }

   @Override
   public Set<bbb<?>> b() {
      return Set.of();
   }

   public alk c() {
      return this.b;
   }
}
