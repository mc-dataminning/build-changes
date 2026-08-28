import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record afb(xg b, Optional<byte[]> c) implements zo<acf> {
   public static final ze<ByteBuf, afb> a = ze.a(xi.f, afb::b, zc.n.a(zc::a), afb::e, afb::new);

   @Override
   public zq<afb> a() {
      return agy.at;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public Optional<byte[]> e() {
      return this.c;
   }
}
