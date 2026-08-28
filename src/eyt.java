import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record eyt(int c) implements dcs {
   public static final Codec<eyt> a = Codec.INT.xmap(eyt::new, eyt::b);
   public static final yw<ByteBuf, eyt> b = yu.h.a(eyt::new, eyt::b);
   private static final wy d = wy.c("filled_map.locked").a(o.h);

   public String a() {
      return "map_" + this.c;
   }

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      eyv $$4 = $$0.a(this);
      if ($$4 == null) {
         $$1.accept(wy.c("filled_map.unknown").a(o.h));
      } else {
         dck $$5 = $$3.a(kk.O);
         if ($$3.a(kk.g) == null && $$5 == null) {
            $$1.accept(wy.a("filled_map.id", this.c).a(o.h));
         }

         if ($$4.i || $$5 == dck.a) {
            $$1.accept(d);
         }

         if ($$2.a()) {
            int $$6 = $$5 == dck.b ? 1 : 0;
            int $$7 = Math.min($$4.g + $$6, 4);
            $$1.accept(wy.a("filled_map.scale", 1 << $$7).a(o.h));
            $$1.accept(wy.a("filled_map.level", $$7, 4).a(o.h));
         }
      }
   }

   public int b() {
      return this.c;
   }
}
