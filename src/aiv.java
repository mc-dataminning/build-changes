import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aiv(GameProfile b) implements yw<aiq> {
   public static final yn<ByteBuf, aiv> a = yn.a(yl.y, aiv::b, aiv::new);

   @Override
   public yy<aiv> a() {
      return aiw.b;
   }

   public void a(aiq $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
