import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record aje(GameProfile b, @Deprecated(forRemoval = true) boolean c) implements zo<ajc> {
   public static final zf<ByteBuf, aje> a = zf.a(zd.w, aje::b, zd.b, aje::e, aje::new);

   @Override
   public zq<aje> a() {
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
