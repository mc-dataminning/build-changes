import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record ezj(int c) implements ddf {
   public static final Codec<ezj> a = Codec.INT.xmap(ezj::new, ezj::b);
   public static final za<ByteBuf, ezj> b = yy.h.a(ezj::new, ezj::b);
   private static final xc d = xc.c("filled_map.locked").a(o.h);

   public String a() {
      return "map_" + this.c;
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      ezl $$4 = $$0.a(this);
      if ($$4 == null) {
         $$1.accept(xc.c("filled_map.unknown").a(o.h));
      } else {
         dcx $$5 = $$3.a(kl.O);
         if ($$3.a(kl.g) == null && $$5 == null) {
            $$1.accept(xc.a("filled_map.id", this.c).a(o.h));
         }

         if ($$4.i || $$5 == dcx.a) {
            $$1.accept(d);
         }

         if ($$2.a()) {
            int $$6 = $$5 == dcx.b ? 1 : 0;
            int $$7 = Math.min($$4.g + $$6, 4);
            $$1.accept(xc.a("filled_map.scale", 1 << $$7).a(o.h));
            $$1.accept(xc.a("filled_map.level", $$7, 4).a(o.h));
         }
      }
   }

   public int b() {
      return this.c;
   }
}
