import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dae(int d, List<dad> e) implements dar {
   public static final int a = 256;
   public static final Codec<dae> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.k.optionalFieldOf("flight_duration", 0).forGetter(dae::a),
               dad.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(dae::b)
            )
            .apply($$0, dae::new)
   );
   public static final zt<ByteBuf, dae> c = zt.a(zr.h, dae::a, dad.d.a(zr.c(256)), dae::b, dae::new);

   public dae(int d, List<dad> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cxk.b $$0, Consumer<xv> $$1, czg $$2) {
      if (this.d > 0) {
         $$1.accept(xv.c("item.minecraft.firework_rocket.flight").b(xu.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (dad $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xv.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<dad> b() {
      return this.e;
   }
}
