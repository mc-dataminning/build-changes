import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cwt(int d, List<cws> e) implements cxf {
   public static final int a = 256;
   public static final Codec<cwt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.j.optionalFieldOf("flight_duration", 0).forGetter(cwt::a),
               cws.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cwt::b)
            )
            .apply($$0, cwt::new)
   );
   public static final ys<ByteBuf, cwt> c = ys.a(yq.g, cwt::a, cws.d.a(yq.c(256)), cwt::b, cwt::new);

   public cwt(int d, List<cws> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(ctv.b $$0, Consumer<wu> $$1, cvt $$2) {
      if (this.d > 0) {
         $$1.accept(wu.c("item.minecraft.firework_rocket.flight").b(wt.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cws $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(wu.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cws> b() {
      return this.e;
   }
}
