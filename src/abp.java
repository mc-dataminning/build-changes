import io.netty.buffer.ByteBuf;
import java.util.List;

public record abp(ali<? extends kd<?>> b, List<kh.a> c) implements zq<abn> {
   private static final zh<ByteBuf, ali<? extends kd<?>>> d = alj.b.a(ali::a, ali::a);
   public static final zh<wg, abp> a = zh.a(d, abp::b, kh.a.a.a(zf.a()), abp::e, abp::new);

   @Override
   public zs<abp> a() {
      return abt.b;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public List<kh.a> e() {
      return this.c;
   }
}
