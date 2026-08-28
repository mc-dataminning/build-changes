import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dbj(List<dxj.c> d) implements dcp {
   public static final Codec<dbj> a = dxj.c.b.xmap(dbj::new, dbj::a);
   public static final yw<ByteBuf, dbj> b = dxj.c.c.a(yu.a()).a(dbj::new, dbj::a);
   public static final dbj c = new dbj(List.of());

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      $$1.accept(wy.a("container.beehive.bees", this.d.size(), 3).a(o.h));
   }

   public List<dxj.c> a() {
      return this.d;
   }
}
