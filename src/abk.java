import io.netty.buffer.ByteBuf;
import java.util.List;

public record abk(ald<? extends kb<?>> b, List<kf.a> c) implements zl<abi> {
   private static final zc<ByteBuf, ald<? extends kb<?>>> d = ale.b.a(ald::a, ald::a);
   public static final zc<wb, abk> a = zc.a(d, abk::b, kf.a.a.a(za.a()), abk::e, abk::new);

   @Override
   public zn<abk> a() {
      return abo.b;
   }

   public void a(abi $$0) {
      $$0.a(this);
   }

   public List<kf.a> e() {
      return this.c;
   }
}
