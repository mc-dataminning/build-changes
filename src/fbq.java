import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fbq(boolean b) implements fbw {
   public static final MapCodec<fbq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(fbq::e)).apply($$0, fbq::new));

   public boolean a(eyn $$0) {
      return $$0.b(fbh.l) == this.b;
   }

   @Override
   public fbx b() {
      return fby.s;
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(fbh.l);
   }

   public static fbw.a c() {
      return () -> new fbq(true);
   }

   public static fbw.a d() {
      return () -> new fbq(false);
   }

   public boolean e() {
      return this.b;
   }
}
