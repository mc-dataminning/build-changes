import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ajj(GameProfile b) implements zq<aje> {
   public static final zh<ByteBuf, ajj> a = zh.a(zf.x, ajj::b, ajj::new);

   @Override
   public zs<ajj> a() {
      return ajk.b;
   }

   public void a(aje $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
