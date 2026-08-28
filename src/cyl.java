import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cyl(int d, List<cyk> e) implements cyy {
   public static final int a = 256;
   public static final Codec<cyl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.k.optionalFieldOf("flight_duration", 0).forGetter(cyl::a),
               cyk.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cyl::b)
            )
            .apply($$0, cyl::new)
   );
   public static final zf<ByteBuf, cyl> c = zf.a(zd.h, cyl::a, cyk.d.a(zd.c(256)), cyl::b, cyl::new);

   public cyl(int d, List<cyk> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cvt.b $$0, Consumer<xh> $$1, cxp $$2) {
      if (this.d > 0) {
         $$1.accept(xh.c("item.minecraft.firework_rocket.flight").b(xg.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cyk $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xh.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cyk> b() {
      return this.e;
   }
}
