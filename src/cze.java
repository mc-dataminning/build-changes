import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cze(int d, List<czd> e) implements czr {
   public static final int a = 256;
   public static final Codec<cze> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.k.optionalFieldOf("flight_duration", 0).forGetter(cze::a),
               czd.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cze::b)
            )
            .apply($$0, cze::new)
   );
   public static final yn<ByteBuf, cze> c = yn.a(yl.h, cze::a, czd.d.a(yl.c(256)), cze::b, cze::new);

   public cze(int d, List<czd> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cwk.b $$0, Consumer<wp> $$1, cyg $$2) {
      if (this.d > 0) {
         $$1.accept(wp.c("item.minecraft.firework_rocket.flight").b(wo.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (czd $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(wp.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<czd> b() {
      return this.e;
   }
}
