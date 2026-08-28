import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezs(boolean b) implements ezy {
   public static final MapCodec<ezs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(ezs::e)).apply($$0, ezs::new));

   public boolean a(ewp $$0) {
      return $$0.b(ezj.l) == this.b;
   }

   @Override
   public ezz b() {
      return faa.s;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezj.l);
   }

   public static ezy.a c() {
      return () -> new ezs(true);
   }

   public static ezy.a d() {
      return () -> new ezs(false);
   }

   public boolean e() {
      return this.b;
   }
}
