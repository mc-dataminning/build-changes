import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cxk(int d, List<cxj> e) implements cxx {
   public static final int a = 256;
   public static final Codec<cxk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.a(axu.h, "flight_duration", Integer.valueOf(0)).forGetter(cxk::a),
               axu.a(axu.a(cxj.c.listOf(), 256), "explosions", List.of()).forGetter(cxk::b)
            )
            .apply($$0, cxk::new)
   );
   public static final zc<ByteBuf, cxk> c = zc.a(za.g, cxk::a, cxj.d.a(za.c(256)), cxk::b, cxk::new);

   @Override
   public void a(Consumer<xe> $$0, cwi $$1) {
      if (this.d > 0) {
         $$0.accept(xe.c("item.minecraft.firework_rocket.flight").a(xd.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cxj $$2 : this.e) {
         $$2.a($$0);
         $$2.b($$1x -> $$0.accept(xe.b("  ").a($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cxj> b() {
      return this.e;
   }
}
