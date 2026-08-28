import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdm(boolean b) implements fds {
   public static final MapCodec<fdm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(fdm::e)).apply($$0, fdm::new));

   public boolean a(faj $$0) {
      return $$0.b(fdd.l) == this.b;
   }

   @Override
   public fdt b() {
      return fdu.s;
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(fdd.l);
   }

   public static fds.a c() {
      return () -> new fdm(true);
   }

   public static fds.a d() {
      return () -> new fdm(false);
   }

   public boolean e() {
      return this.b;
   }
}
