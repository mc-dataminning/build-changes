import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cxh(int d, List<cxg> e) implements cxt {
   public static final int a = 256;
   public static final Codec<cxh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayf.j.optionalFieldOf("flight_duration", 0).forGetter(cxh::a),
               cxg.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cxh::b)
            )
            .apply($$0, cxh::new)
   );
   public static final zm<ByteBuf, cxh> c = zm.a(zk.g, cxh::a, cxg.d.a(zk.c(256)), cxh::b, cxh::new);

   public cxh(int d, List<cxg> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cui.b $$0, Consumer<xo> $$1, cwg $$2) {
      if (this.d > 0) {
         $$1.accept(xo.c("item.minecraft.firework_rocket.flight").b(xn.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cxg $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xo.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cxg> b() {
      return this.e;
   }
}
