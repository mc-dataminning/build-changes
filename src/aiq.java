import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aiq(GameProfile b, @Deprecated(forRemoval = true) boolean c) implements zg<aio> {
   public static final yx<ByteBuf, aiq> a = yx.a(yv.u, aiq::b, yv.b, aiq::e, aiq::new);

   @Override
   public zi<aiq> a() {
      return aiu.b;
   }

   public void a(aio $$0) {
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
