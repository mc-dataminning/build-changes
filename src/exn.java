import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record exn(int c) implements dbx {
   public static final Codec<exn> a = Codec.INT.xmap(exn::new, exn::b);
   public static final yu<ByteBuf, exn> b = ys.h.a(exn::new, exn::b);
   private static final ww d = ww.c("filled_map.locked").a(n.h);

   public String a() {
      return "map_" + this.c;
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      exp $$4 = $$0.a(this);
      if ($$4 == null) {
         $$1.accept(ww.c("filled_map.unknown").a(n.h));
      } else {
         dbp $$5 = $$3.a(kj.O);
         if ($$3.a(kj.g) == null && $$5 == null) {
            $$1.accept(ww.a("filled_map.id", this.c).a(n.h));
         }

         if ($$4.h || $$5 == dbp.a) {
            $$1.accept(d);
         }

         if ($$2.a()) {
            int $$6 = $$5 == dbp.b ? 1 : 0;
            int $$7 = Math.min($$4.f + $$6, 4);
            $$1.accept(ww.a("filled_map.scale", 1 << $$7).a(n.h));
            $$1.accept(ww.a("filled_map.level", $$7, 4).a(n.h));
         }
      }
   }

   public int b() {
      return this.c;
   }
}
