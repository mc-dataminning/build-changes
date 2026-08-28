import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cyf(int d, List<cye> e) implements cyr {
   public static final int a = 256;
   public static final Codec<cyf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayl.j.optionalFieldOf("flight_duration", 0).forGetter(cyf::a),
               cye.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cyf::b)
            )
            .apply($$0, cyf::new)
   );
   public static final zb<ByteBuf, cyf> c = zb.a(yz.g, cyf::a, cye.d.a(yz.c(256)), cyf::b, cyf::new);

   public cyf(int d, List<cye> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cvg.b $$0, Consumer<xd> $$1, cxf $$2) {
      if (this.d > 0) {
         $$1.accept(xd.c("item.minecraft.firework_rocket.flight").b(xc.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cye $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xd.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cye> b() {
      return this.e;
   }
}
