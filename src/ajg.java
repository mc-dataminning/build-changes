import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ajg(GameProfile b) implements zf<ajb> {
   public static final yw<ByteBuf, ajg> a = yw.a(yu.z, ajg::b, ajg::new);

   @Override
   public zh<ajg> a() {
      return ajh.b;
   }

   public void a(ajb $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
