import io.netty.buffer.ByteBuf;
import java.util.List;

public record abr(alk<? extends kd<?>> b, List<kh.a> c) implements zs<abp> {
   private static final zj<ByteBuf, alk<? extends kd<?>>> d = all.b.a(alk::a, alk::a);
   public static final zj<wi, abr> a = zj.a(d, abr::b, kh.a.a.a(zh.a()), abr::e, abr::new);

   @Override
   public zu<abr> a() {
      return abv.b;
   }

   public void a(abp $$0) {
      $$0.a(this);
   }

   public List<kh.a> e() {
      return this.c;
   }
}
