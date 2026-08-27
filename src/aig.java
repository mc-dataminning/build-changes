import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aig(GameProfile b) implements zb<aie> {
   public static final ys<ByteBuf, aig> a = yq.t.a(aig::new, aig::b);

   @Override
   public zd<aig> a() {
      return aik.b;
   }

   public void a(aie $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
