import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aje(GameProfile b) implements zd<aiz> {
   public static final yu<ByteBuf, aje> a = yu.a(ys.y, aje::b, aje::new);

   @Override
   public zf<aje> a() {
      return ajf.b;
   }

   public void a(aiz $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
