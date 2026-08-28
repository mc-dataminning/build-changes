import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aje(GameProfile b) implements zw<ajc> {
   public static final zn<ByteBuf, aje> a = zl.u.a(aje::new, aje::b);

   @Override
   public zy<aje> a() {
      return aji.b;
   }

   public void a(ajc $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
