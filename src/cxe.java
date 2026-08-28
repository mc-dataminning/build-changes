import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cxe(int d, List<cxd> e) implements cxq {
   public static final int a = 256;
   public static final Codec<cxe> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayc.j.optionalFieldOf("flight_duration", 0).forGetter(cxe::a),
               cxd.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cxe::b)
            )
            .apply($$0, cxe::new)
   );
   public static final zj<ByteBuf, cxe> c = zj.a(zh.g, cxe::a, cxd.d.a(zh.c(256)), cxe::b, cxe::new);

   public cxe(int d, List<cxd> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cuf.b $$0, Consumer<xl> $$1, cwd $$2) {
      if (this.d > 0) {
         $$1.accept(xl.c("item.minecraft.firework_rocket.flight").b(xk.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cxd $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xl.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cxd> b() {
      return this.e;
   }
}
