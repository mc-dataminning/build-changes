import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ail(GameProfile b) implements ze<aij> {
   public static final yv<ByteBuf, ail> a = yt.t.a(ail::new, ail::b);

   @Override
   public zg<ail> a() {
      return aip.b;
   }

   public void a(aij $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
