import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dbx(List<dxz.c> d) implements ddd {
   public static final Codec<dbx> a = dxz.c.b.xmap(dbx::new, dbx::a);
   public static final yy<ByteBuf, dbx> b = dxz.c.c.a(yw.a()).a(dbx::new, dbx::a);
   public static final dbx c = new dbx(List.of());

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      $$1.accept(xa.a("container.beehive.bees", this.d.size(), 3).a(o.h));
   }

   public List<dxz.c> a() {
      return this.d;
   }
}
