import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aim(GameProfile b) implements ze<aik> {
   public static final yv<ByteBuf, aim> a = yt.t.a(aim::new, aim::b);

   @Override
   public zg<aim> a() {
      return aiq.b;
   }

   public void a(aik $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
