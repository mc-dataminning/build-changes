import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cxi(int d, List<cxh> e) implements cxu {
   public static final int a = 256;
   public static final Codec<cxi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayg.j.optionalFieldOf("flight_duration", 0).forGetter(cxi::a),
               cxh.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cxi::b)
            )
            .apply($$0, cxi::new)
   );
   public static final zm<ByteBuf, cxi> c = zm.a(zk.g, cxi::a, cxh.d.a(zk.c(256)), cxi::b, cxi::new);

   public cxi(int d, List<cxh> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cuj.b $$0, Consumer<xo> $$1, cwh $$2) {
      if (this.d > 0) {
         $$1.accept(xo.c("item.minecraft.firework_rocket.flight").b(xn.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cxh $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xo.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cxh> b() {
      return this.e;
   }
}
