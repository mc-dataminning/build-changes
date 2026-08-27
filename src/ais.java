import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ais(GameProfile b) implements zl<aiq> {
   public static final zc<ByteBuf, ais> a = za.u.a(ais::new, ais::b);

   @Override
   public zn<ais> a() {
      return aiw.b;
   }

   public void a(aiq $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }
}
