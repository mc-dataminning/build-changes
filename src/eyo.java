import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record eyo(int c) implements dcp {
   public static final Codec<eyo> a = Codec.INT.xmap(eyo::new, eyo::b);
   public static final yw<ByteBuf, eyo> b = yu.h.a(eyo::new, eyo::b);
   private static final wy d = wy.c("filled_map.locked").a(o.h);

   public String a() {
      return "map_" + this.c;
   }

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      eyq $$4 = $$0.a(this);
      if ($$4 == null) {
         $$1.accept(wy.c("filled_map.unknown").a(o.h));
      } else {
         dch $$5 = $$3.a(kk.O);
         if ($$3.a(kk.g) == null && $$5 == null) {
            $$1.accept(wy.a("filled_map.id", this.c).a(o.h));
         }

         if ($$4.i || $$5 == dch.a) {
            $$1.accept(d);
         }

         if ($$2.a()) {
            int $$6 = $$5 == dch.b ? 1 : 0;
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
