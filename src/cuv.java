import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cuv(int d, List<cuu> e) implements cvg {
   public static final int a = 256;
   public static final Codec<cuv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.a(axe.h, "flight_duration", Integer.valueOf(0)).forGetter(cuv::a),
               axe.a(axe.a(cuu.c.listOf(), 256), "explosions", List.of()).forGetter(cuv::b)
            )
            .apply($$0, cuv::new)
   );
   public static final yq<ByteBuf, cuv> c = yq.a(yo.f, cuv::a, cuu.d.a(yo.c(256)), cuv::b, cuv::new);

   @Override
   public void a(Consumer<ws> $$0, ctu $$1) {
      if (this.d > 0) {
         $$0.accept(ws.c("item.minecraft.firework_rocket.flight").b(wr.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cuu $$2 : this.e) {
         $$2.a($$0);
         $$2.b($$1x -> $$0.accept(ws.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cuu> b() {
      return this.e;
   }
}
