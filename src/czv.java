import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record czv(int d, List<czu> e) implements dai {
   public static final int a = 256;
   public static final Codec<czv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.k.optionalFieldOf("flight_duration", 0).forGetter(czv::a),
               czu.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(czv::b)
            )
            .apply($$0, czv::new)
   );
   public static final yn<ByteBuf, czv> c = yn.a(yl.h, czv::a, czu.d.a(yl.c(256)), czv::b, czv::new);

   public czv(int d, List<czu> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cxd.b $$0, Consumer<wp> $$1, cyx $$2) {
      if (this.d > 0) {
         $$1.accept(wp.c("item.minecraft.firework_rocket.flight").b(wo.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (czu $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(wp.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<czu> b() {
      return this.e;
   }
}
