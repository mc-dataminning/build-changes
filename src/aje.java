import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aje(GameProfile b, @Deprecated(forRemoval = true) boolean c) implements zw<ajc> {
   public static final zn<ByteBuf, aje> a = zn.a(zl.u, aje::b, zl.b, aje::e, aje::new);

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

   @Deprecated(
      forRemoval = true
   )
   public boolean e() {
      return this.c;
   }
}
