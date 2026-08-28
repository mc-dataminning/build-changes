import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ajr(GameProfile b) implements zo<ajm> {
   public static final ze<ByteBuf, ajr> a = ze.a(zc.z, ajr::b, ajr::new);

   @Override
   public zq<ajr> a() {
      return ajs.b;
   }

   public void a(ajm $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
