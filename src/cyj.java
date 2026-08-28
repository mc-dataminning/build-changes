import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cyj(int d, List<cyi> e) implements cyw {
   public static final int a = 256;
   public static final Codec<cyj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aym.j.optionalFieldOf("flight_duration", 0).forGetter(cyj::a),
               cyi.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cyj::b)
            )
            .apply($$0, cyj::new)
   );
   public static final zb<ByteBuf, cyj> c = zb.a(yz.g, cyj::a, cyi.d.a(yz.c(256)), cyj::b, cyj::new);

   public cyj(int d, List<cyi> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cvk.b $$0, Consumer<xd> $$1, cxh $$2) {
      if (this.d > 0) {
         $$1.accept(xd.c("item.minecraft.firework_rocket.flight").b(xc.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cyi $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xd.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cyi> b() {
      return this.e;
   }
}
