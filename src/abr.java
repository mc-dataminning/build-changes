import io.netty.buffer.ByteBuf;
import java.util.List;

public record abr(List<atz> b) implements zk<abp> {
   public static final zb<ByteBuf, abr> a = zb.a(atz.a.a(yz.c(64)), abr::b, abr::new);

   @Override
   public zm<abr> a() {
      return abn.g;
   }

   public void a(abp $$0) {
      $$0.a(this);
   }
}
