import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aie(GameProfile b) implements yz<aic> {
   public static final yq<ByteBuf, aie> a = yo.t.a(aie::new, aie::b);

   @Override
   public zb<aie> a() {
      return aii.b;
   }

   public void a(aic $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
