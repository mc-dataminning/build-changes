import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record ezh(int c) implements ddd {
   public static final Codec<ezh> a = Codec.INT.xmap(ezh::new, ezh::b);
   public static final yy<ByteBuf, ezh> b = yw.h.a(ezh::new, ezh::b);
   private static final xa d = xa.c("filled_map.locked").a(o.h);

   public String a() {
      return "map_" + this.c;
   }

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      ezj $$4 = $$0.a(this);
      if ($$4 == null) {
         $$1.accept(xa.c("filled_map.unknown").a(o.h));
      } else {
         dcv $$5 = $$3.a(kk.O);
         if ($$3.a(kk.g) == null && $$5 == null) {
            $$1.accept(xa.a("filled_map.id", this.c).a(o.h));
         }

         if ($$4.i || $$5 == dcv.a) {
            $$1.accept(d);
         }

         if ($$2.a()) {
            int $$6 = $$5 == dcv.b ? 1 : 0;
            int $$7 = Math.min($$4.g + $$6, 4);
            $$1.accept(xa.a("filled_map.scale", 1 << $$7).a(o.h));
            $$1.accept(xa.a("filled_map.level", $$7, 4).a(o.h));
         }
      }
   }

   public int b() {
      return this.c;
   }
}
