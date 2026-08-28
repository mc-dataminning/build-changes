import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aiu(GameProfile b) implements yw<aip> {
   public static final yn<ByteBuf, aiu> a = yn.a(yl.y, aiu::b, aiu::new);

   @Override
   public yy<aiu> a() {
      return aiv.b;
   }

   public void a(aip $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
