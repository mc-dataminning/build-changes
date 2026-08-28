import io.netty.buffer.ByteBuf;
import java.util.List;

public record abr(ald<? extends jv<?>> b, List<jz.a> c) implements zv<abp> {
   private static final zm<ByteBuf, ald<? extends jv<?>>> d = ale.b.a(ald::a, ald::a);
   public static final zm<wl, abr> a = zm.a(d, abr::b, jz.a.a.a(zk.a()), abr::e, abr::new);

   @Override
   public zx<abr> a() {
      return abv.b;
   }

   public void a(abp $$0) {
      $$0.a(this);
   }

   public List<jz.a> e() {
      return this.c;
   }
}
