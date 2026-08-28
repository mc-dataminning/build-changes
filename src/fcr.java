import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcr(boolean b) implements fcx {
   public static final MapCodec<fcr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(fcr::e)).apply($$0, fcr::new));

   public boolean a(ezo $$0) {
      return $$0.b(fci.l) == this.b;
   }

   @Override
   public fcy b() {
      return fcz.s;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fci.l);
   }

   public static fcx.a c() {
      return () -> new fcr(true);
   }

   public static fcx.a d() {
      return () -> new fcr(false);
   }

   public boolean e() {
      return this.b;
   }
}
