import io.netty.buffer.ByteBuf;
import java.util.List;

public record abp(alq<? extends jt<?>> b, List<jx.a> c) implements zo<abn> {
   private static final ze<ByteBuf, alq<? extends jt<?>>> d = alr.b.a(alq::a, alq::a);
   public static final ze<vy, abp> a = ze.a(d, abp::b, jx.a.a.a(zc.a()), abp::e, abp::new);

   @Override
   public zq<abp> a() {
      return abt.b;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public List<jx.a> e() {
      return this.c;
   }
}
