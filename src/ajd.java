import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ajd(GameProfile b) implements zc<aiy> {
   public static final yt<ByteBuf, ajd> a = yt.a(yr.y, ajd::b, ajd::new);

   @Override
   public ze<ajd> a() {
      return aje.b;
   }

   public void a(aiy $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
