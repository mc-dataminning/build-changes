import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ahu(GameProfile b) implements yp<ahs> {
   public static final yg<ByteBuf, ahu> a = ye.t.a(ahu::new, ahu::b);

   @Override
   public yr<ahu> a() {
      return ahy.b;
   }

   public void a(ahs $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
