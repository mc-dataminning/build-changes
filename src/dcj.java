import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dcj(List<dyl.c> d) implements ddp {
   public static final Codec<dcj> a = dyl.c.b.xmap(dcj::new, dcj::a);
   public static final ze<ByteBuf, dcj> b = dyl.c.c.a(zc.a()).a(dcj::new, dcj::a);
   public static final dcj c = new dcj(List.of());

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      $$1.accept(xg.a("container.beehive.bees", this.d.size(), 3).a(o.h));
   }

   public List<dyl.c> a() {
      return this.d;
   }
}
