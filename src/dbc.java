import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dbc(List<dxc.c> d) implements dci {
   public static final Codec<dbc> a = dxc.c.b.xmap(dbc::new, dbc::a);
   public static final yw<ByteBuf, dbc> b = dxc.c.c.a(yu.a()).a(dbc::new, dbc::a);
   public static final dbc c = new dbc(List.of());

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      $$1.accept(wy.a("container.beehive.bees", this.d.size(), 3).a(n.h));
   }

   public List<dxc.c> a() {
      return this.d;
   }
}
