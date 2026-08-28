import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dax(List<dwu.c> d) implements dcd {
   public static final Codec<dax> a = dwu.c.b.xmap(dax::new, dax::a);
   public static final yw<ByteBuf, dax> b = dwu.c.c.a(yu.a()).a(dax::new, dax::a);
   public static final dax c = new dax(List.of());

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      $$1.accept(wy.a("container.beehive.bees", this.d.size(), 3).a(n.h));
   }

   public List<dwu.c> a() {
      return this.d;
   }
}
