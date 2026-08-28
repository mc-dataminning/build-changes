import io.netty.buffer.ByteBuf;
import java.util.List;

public record abj(alb<? extends ka<?>> b, List<ke.a> c) implements zk<abh> {
   private static final zb<ByteBuf, alb<? extends ka<?>>> d = alc.b.a(alb::a, alb::a);
   public static final zb<wa, abj> a = zb.a(d, abj::b, ke.a.a.a(yz.a()), abj::e, abj::new);

   @Override
   public zm<abj> a() {
      return abn.b;
   }

   public void a(abh $$0) {
      $$0.a(this);
   }

   public List<ke.a> e() {
      return this.c;
   }
}
