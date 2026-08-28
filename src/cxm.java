import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cxm(int d, List<cxl> e) implements cxy {
   public static final int a = 256;
   public static final Codec<cxm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.j.optionalFieldOf("flight_duration", 0).forGetter(cxm::a),
               cxl.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cxm::b)
            )
            .apply($$0, cxm::new)
   );
   public static final yx<ByteBuf, cxm> c = yx.a(yv.g, cxm::a, cxl.d.a(yv.c(256)), cxm::b, cxm::new);

   public cxm(int d, List<cxl> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cul.b $$0, Consumer<wz> $$1, cwm $$2) {
      if (this.d > 0) {
         $$1.accept(wz.c("item.minecraft.firework_rocket.flight").b(wy.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cxl $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(wz.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cxl> b() {
      return this.e;
   }
}
