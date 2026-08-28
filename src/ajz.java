import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ajz(GameProfile b) implements aac<aju> {
   public static final zt<ByteBuf, ajz> a = zt.a(zr.y, ajz::b, ajz::new);

   @Override
   public aae<ajz> a() {
      return aka.b;
   }

   public void a(aju $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
