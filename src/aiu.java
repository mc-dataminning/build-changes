import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aiu(GameProfile b) implements yv<aip> {
   public static final ym<ByteBuf, aiu> a = ym.a(yk.y, aiu::b, aiu::new);

   @Override
   public yx<aiu> a() {
      return aiv.b;
   }

   public void a(aip $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
