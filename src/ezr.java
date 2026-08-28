import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezr(boolean b) implements ezx {
   public static final MapCodec<ezr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(ezr::e)).apply($$0, ezr::new));

   public boolean a(ewo $$0) {
      return $$0.b(ezi.l) == this.b;
   }

   @Override
   public ezy b() {
      return ezz.s;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(ezi.l);
   }

   public static ezx.a c() {
      return () -> new ezr(true);
   }

   public static ezx.a d() {
      return () -> new ezr(false);
   }

   public boolean e() {
      return this.b;
   }
}
