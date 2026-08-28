import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ajd(GameProfile b) implements zv<ajb> {
   public static final zm<ByteBuf, ajd> a = zk.u.a(ajd::new, ajd::b);

   @Override
   public zx<ajd> a() {
      return ajh.b;
   }

   public void a(ajb $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
