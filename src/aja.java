import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aja(GameProfile b) implements zs<aiy> {
   public static final zj<ByteBuf, aja> a = zh.u.a(aja::new, aja::b);

   @Override
   public zu<aja> a() {
      return aje.b;
   }

   public void a(aiy $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
