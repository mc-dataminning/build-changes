import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record czg(int d, List<czf> e) implements czt {
   public static final int a = 256;
   public static final Codec<czg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.k.optionalFieldOf("flight_duration", 0).forGetter(czg::a),
               czf.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(czg::b)
            )
            .apply($$0, czg::new)
   );
   public static final yn<ByteBuf, czg> c = yn.a(yl.h, czg::a, czf.d.a(yl.c(256)), czg::b, czg::new);

   public czg(int d, List<czf> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cwm.b $$0, Consumer<wp> $$1, cyi $$2) {
      if (this.d > 0) {
         $$1.accept(wp.c("item.minecraft.firework_rocket.flight").b(wo.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (czf $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(wp.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<czf> b() {
      return this.e;
   }
}
