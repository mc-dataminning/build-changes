import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dbm(List<dxo.c> d) implements dcs {
   public static final Codec<dbm> a = dxo.c.b.xmap(dbm::new, dbm::a);
   public static final yw<ByteBuf, dbm> b = dxo.c.c.a(yu.a()).a(dbm::new, dbm::a);
   public static final dbm c = new dbm(List.of());

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      $$1.accept(wy.a("container.beehive.bees", this.d.size(), 3).a(o.h));
   }

   public List<dxo.c> a() {
      return this.d;
   }
}
