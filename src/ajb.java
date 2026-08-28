import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record ajb(GameProfile b, @Deprecated(forRemoval = true) boolean c) implements zl<aiz> {
   public static final zc<ByteBuf, ajb> a = zc.a(za.w, ajb::b, za.b, ajb::e, ajb::new);

   @Override
   public zn<ajb> a() {
      return ajf.b;
   }

   public void a(aiz $$0) {
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
