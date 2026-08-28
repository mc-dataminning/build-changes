import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aji(GameProfile b) implements zh<ajd> {
   public static final yy<ByteBuf, aji> a = yy.a(yw.z, aji::b, aji::new);

   @Override
   public zj<aji> a() {
      return ajj.b;
   }

   public void a(ajd $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
