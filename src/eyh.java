import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record eyh(int c) implements dci {
   public static final Codec<eyh> a = Codec.INT.xmap(eyh::new, eyh::b);
   public static final yw<ByteBuf, eyh> b = yu.h.a(eyh::new, eyh::b);
   private static final wy d = wy.c("filled_map.locked").a(n.h);

   public String a() {
      return "map_" + this.c;
   }

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      eyj $$4 = $$0.a(this);
      if ($$4 == null) {
         $$1.accept(wy.c("filled_map.unknown").a(n.h));
      } else {
         dca $$5 = $$3.a(kj.O);
         if ($$3.a(kj.g) == null && $$5 == null) {
            $$1.accept(wy.a("filled_map.id", this.c).a(n.h));
         }

         if ($$4.i || $$5 == dca.a) {
            $$1.accept(d);
         }

         if ($$2.a()) {
            int $$6 = $$5 == dca.b ? 1 : 0;
            int $$7 = Math.min($$4.g + $$6, 4);
            $$1.accept(wy.a("filled_map.scale", 1 << $$7).a(n.h));
            $$1.accept(wy.a("filled_map.level", $$7, 4).a(n.h));
         }
      }
   }

   public int b() {
      return this.c;
   }
}
