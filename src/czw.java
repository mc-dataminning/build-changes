import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record czw(int d, List<czv> e) implements daj {
   public static final int a = 256;
   public static final Codec<czw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azd.k.optionalFieldOf("flight_duration", 0).forGetter(czw::a),
               czv.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(czw::b)
            )
            .apply($$0, czw::new)
   );
   public static final zi<ByteBuf, czw> c = zi.a(zg.h, czw::a, czv.d.a(zg.c(256)), czw::b, czw::new);

   public czw(int d, List<czv> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cxc.b $$0, Consumer<xk> $$1, cyy $$2) {
      if (this.d > 0) {
         $$1.accept(xk.c("item.minecraft.firework_rocket.flight").b(xj.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (czv $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xk.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<czv> b() {
      return this.e;
   }
}
