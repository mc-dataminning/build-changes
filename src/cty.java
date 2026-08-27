import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cty(int c, List<ctx> d) implements cuj {
   private static final int e = 16;
   public static final Codec<cty> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aws.a(aws.h, "flight_duration", Integer.valueOf(0)).forGetter(cty::a),
               aws.a(aws.a(ctx.b.listOf(), 16), "explosions", List.of()).forGetter(cty::b)
            )
            .apply($$0, cty::new)
   );
   public static final ye<ByteBuf, cty> b = ye.a(yc.f, cty::a, ctx.c.a(yc.c(16)), cty::b, cty::new);

   @Override
   public void a(Consumer<wg> $$0, csz $$1) {
      if (this.c > 0) {
         $$0.accept(wg.c("item.minecraft.firework_rocket.flight").b(wf.v).f(String.valueOf(this.c)).a(n.h));
      }

      for (ctx $$2 : this.d) {
         $$2.a($$0);
         $$2.b($$1x -> $$0.accept(wg.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.c;
   }

   public List<ctx> b() {
      return this.d;
   }
}
