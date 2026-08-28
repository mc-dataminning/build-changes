import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aip(GameProfile b, @Deprecated(forRemoval = true) boolean c) implements zf<ain> {
   public static final yw<ByteBuf, aip> a = yw.a(yu.u, aip::b, yu.b, aip::e, aip::new);

   @Override
   public zh<aip> a() {
      return ait.b;
   }

   public void a(ain $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }

   @Deprecated(
      forRemoval = true
   )
   public boolean e() {
      return this.c;
   }
}
