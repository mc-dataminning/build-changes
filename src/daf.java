import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record daf(int d, List<dae> e) implements das {
   public static final int a = 256;
   public static final Codec<daf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.k.optionalFieldOf("flight_duration", 0).forGetter(daf::a),
               dae.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(daf::b)
            )
            .apply($$0, daf::new)
   );
   public static final zt<ByteBuf, daf> c = zt.a(zr.h, daf::a, dae.d.a(zr.c(256)), daf::b, daf::new);

   public daf(int d, List<dae> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cxl.b $$0, Consumer<xv> $$1, czh $$2) {
      if (this.d > 0) {
         $$1.accept(xv.c("item.minecraft.firework_rocket.flight").b(xu.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (dae $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xv.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<dae> b() {
      return this.e;
   }
}
