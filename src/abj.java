import io.netty.buffer.ByteBuf;
import java.util.List;

public record abj(ala<? extends ka<?>> b, List<ke.a> c) implements zk<abh> {
   private static final zb<ByteBuf, ala<? extends ka<?>>> d = alb.b.a(ala::a, ala::a);
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
