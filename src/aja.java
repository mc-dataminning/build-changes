import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aja(GameProfile b, @Deprecated(forRemoval = true) boolean c) implements zk<aiy> {
   public static final zb<ByteBuf, aja> a = zb.a(yz.v, aja::b, yz.b, aja::e, aja::new);

   @Override
   public zm<aja> a() {
      return aje.b;
   }

   public void a(aiy $$0) {
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
