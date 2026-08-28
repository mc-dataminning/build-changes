import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ajf(GameProfile b, @Deprecated(forRemoval = true) boolean c) implements zp<ajd> {
   public static final zg<ByteBuf, ajf> a = zg.a(ze.w, ajf::b, ze.b, ajf::e, ajf::new);

   @Override
   public zr<ajf> a() {
      return ajj.b;
   }

   public void a(ajd $$0) {
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
