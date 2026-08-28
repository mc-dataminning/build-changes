import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record ezt(int c) implements ddp {
   public static final Codec<ezt> a = Codec.INT.xmap(ezt::new, ezt::b);
   public static final ze<ByteBuf, ezt> b = zc.h.a(ezt::new, ezt::b);
   private static final xg d = xg.c("filled_map.locked").a(o.h);

   public String a() {
      return "map_" + this.c;
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      ezv $$4 = $$0.a(this);
      if ($$4 == null) {
         $$1.accept(xg.c("filled_map.unknown").a(o.h));
      } else {
         ddh $$5 = $$3.a(kl.O);
         if ($$3.a(kl.g) == null && $$5 == null) {
            $$1.accept(xg.a("filled_map.id", this.c).a(o.h));
         }

         if ($$4.i || $$5 == ddh.a) {
            $$1.accept(d);
         }

         if ($$2.a()) {
            int $$6 = $$5 == ddh.b ? 1 : 0;
            int $$7 = Math.min($$4.g + $$6, 4);
            $$1.accept(xg.a("filled_map.scale", 1 << $$7).a(o.h));
            $$1.accept(xg.a("filled_map.level", $$7, 4).a(o.h));
         }
      }
   }

   public int b() {
      return this.c;
   }
}
