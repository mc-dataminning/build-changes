import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezm(boolean b) implements ezs {
   public static final MapCodec<ezm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(ezm::e)).apply($$0, ezm::new));

   public boolean a(ewh $$0) {
      return $$0.b(ezd.l) == this.b;
   }

   @Override
   public ezt b() {
      return ezu.s;
   }

   @Override
   public Set<eza<?>> a() {
      return Set.of(ezd.l);
   }

   public static ezs.a c() {
      return () -> new ezm(true);
   }

   public static ezs.a d() {
      return () -> new ezm(false);
   }

   public boolean e() {
      return this.b;
   }
}
