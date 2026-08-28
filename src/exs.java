import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exs(boolean b) implements exy {
   public static final MapCodec<exs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(exs::e)).apply($$0, exs::new));

   public boolean a(eun $$0) {
      return $$0.b(exj.l) == this.b;
   }

   @Override
   public exz b() {
      return eya.s;
   }

   @Override
   public Set<exg<?>> a() {
      return Set.of(exj.l);
   }

   public static exy.a c() {
      return () -> new exs(true);
   }

   public static exy.a d() {
      return () -> new exs(false);
   }

   public boolean e() {
      return this.b;
   }
}
