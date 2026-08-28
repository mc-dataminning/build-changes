import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cyr(int d, List<cyq> e) implements cze {
   public static final int a = 256;
   public static final Codec<cyr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayt.k.optionalFieldOf("flight_duration", 0).forGetter(cyr::a),
               cyq.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cyr::b)
            )
            .apply($$0, cyr::new)
   );
   public static final zg<ByteBuf, cyr> c = zg.a(ze.h, cyr::a, cyq.d.a(ze.c(256)), cyr::b, cyr::new);

   public cyr(int d, List<cyq> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cvx.b $$0, Consumer<xi> $$1, cxt $$2) {
      if (this.d > 0) {
         $$1.accept(xi.c("item.minecraft.firework_rocket.flight").b(xh.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cyq $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xi.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cyq> b() {
      return this.e;
   }
}
