import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cyv(int d, List<cyu> e) implements czi {
   public static final int a = 256;
   public static final Codec<cyv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.k.optionalFieldOf("flight_duration", 0).forGetter(cyv::a),
               cyu.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cyv::b)
            )
            .apply($$0, cyv::new)
   );
   public static final zj<ByteBuf, cyv> c = zj.a(zh.h, cyv::a, cyu.d.a(zh.c(256)), cyv::b, cyv::new);

   public cyv(int d, List<cyu> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cwb.b $$0, Consumer<xl> $$1, cxx $$2) {
      if (this.d > 0) {
         $$1.accept(xl.c("item.minecraft.firework_rocket.flight").b(xk.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cyu $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xl.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cyu> b() {
      return this.e;
   }
}
