import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ahs(GameProfile b) implements yn<ahq> {
   public static final ye<ByteBuf, ahs> a = yc.t.a(ahs::new, ahs::b);

   @Override
   public yp<ahs> a() {
      return ahw.b;
   }

   public void a(ahq $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
