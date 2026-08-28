import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aij(GameProfile b, @Deprecated(forRemoval = true) boolean c) implements zb<aih> {
   public static final ys<ByteBuf, aij> a = ys.a(yq.u, aij::b, yq.b, aij::e, aij::new);

   @Override
   public zd<aij> a() {
      return ain.b;
   }

   public void a(aih $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }

   @Deprecated(
      forRemoval = true
   )
   public boolean e() {
      return this.c;
   }
}
