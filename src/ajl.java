import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ajl(GameProfile b) implements zs<ajg> {
   public static final zj<ByteBuf, ajl> a = zj.a(zh.w, ajl::b, ajl::new);

   @Override
   public zu<ajl> a() {
      return ajm.b;
   }

   public void a(ajg $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
