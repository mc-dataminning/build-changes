import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record afa(xp b, Optional<byte[]> c) implements zw<aci> {
   public static final zn<ByteBuf, afa> a = zn.a(xr.f, afa::b, zl.k.a(zl::a), afa::e, afa::new);

   @Override
   public zy<afa> a() {
      return agu.ap;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
