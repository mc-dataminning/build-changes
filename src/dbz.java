import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dbz(List<dyb.c> d) implements ddf {
   public static final Codec<dbz> a = dyb.c.b.xmap(dbz::new, dbz::a);
   public static final za<ByteBuf, dbz> b = dyb.c.c.a(yy.a()).a(dbz::new, dbz::a);
   public static final dbz c = new dbz(List.of());

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      $$1.accept(xc.a("container.beehive.bees", this.d.size(), 3).a(o.h));
   }

   public List<dyb.c> a() {
      return this.d;
   }
}
