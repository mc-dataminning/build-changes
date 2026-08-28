import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ajk(GameProfile b) implements zj<ajf> {
   public static final za<ByteBuf, ajk> a = za.a(yy.z, ajk::b, ajk::new);

   @Override
   public zl<ajk> a() {
      return ajl.b;
   }

   public void a(ajf $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
