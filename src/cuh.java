import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cuh(int c, List<cug> d) implements cus {
   private static final int e = 256;
   public static final Codec<cuh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awu.a(awu.h, "flight_duration", Integer.valueOf(0)).forGetter(cuh::a),
               awu.a(awu.a(cug.b.listOf(), 256), "explosions", List.of()).forGetter(cuh::b)
            )
            .apply($$0, cuh::new)
   );
   public static final yg<ByteBuf, cuh> b = yg.a(ye.f, cuh::a, cug.c.a(ye.c(256)), cuh::b, cuh::new);

   @Override
   public void a(Consumer<wi> $$0, cti $$1) {
      if (this.c > 0) {
         $$0.accept(wi.c("item.minecraft.firework_rocket.flight").b(wh.v).f(String.valueOf(this.c)).a(n.h));
      }

      for (cug $$2 : this.d) {
         $$2.a($$0);
         $$2.b($$1x -> $$0.accept(wi.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.c;
   }

   public List<cug> b() {
      return this.d;
   }
}
