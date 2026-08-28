import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ajp(GameProfile b) implements zr<ajk> {
   public static final zi<ByteBuf, ajp> a = zi.a(zg.y, ajp::b, ajp::new);

   @Override
   public zt<ajp> a() {
      return ajq.b;
   }

   public void a(ajk $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
