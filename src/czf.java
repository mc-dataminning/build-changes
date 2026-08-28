import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record czf(int d, List<cze> e) implements czs {
   public static final int a = 256;
   public static final Codec<czf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.k.optionalFieldOf("flight_duration", 0).forGetter(czf::a),
               cze.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(czf::b)
            )
            .apply($$0, czf::new)
   );
   public static final yn<ByteBuf, czf> c = yn.a(yl.h, czf::a, cze.d.a(yl.c(256)), czf::b, czf::new);

   public czf(int d, List<cze> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cwl.b $$0, Consumer<wp> $$1, cyh $$2) {
      if (this.d > 0) {
         $$1.accept(wp.c("item.minecraft.firework_rocket.flight").b(wo.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cze $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(wp.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cze> b() {
      return this.e;
   }
}
