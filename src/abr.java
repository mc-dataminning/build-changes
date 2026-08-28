import io.netty.buffer.ByteBuf;
import java.util.List;

public record abr(List<auj> b) implements zq<abn> {
   public static final zh<ByteBuf, abr> a = zh.a(auj.a.a(zf.a()), abr::b, abr::new);

   @Override
   public zs<abr> a() {
      return abt.d;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }
}
