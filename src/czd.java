import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record czd(int d, List<czc> e) implements czq {
   public static final int a = 256;
   public static final Codec<czd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.k.optionalFieldOf("flight_duration", 0).forGetter(czd::a),
               czc.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(czd::b)
            )
            .apply($$0, czd::new)
   );
   public static final ym<ByteBuf, czd> c = ym.a(yk.h, czd::a, czc.d.a(yk.c(256)), czd::b, czd::new);

   public czd(int d, List<czc> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cwj.b $$0, Consumer<wo> $$1, cyf $$2) {
      if (this.d > 0) {
         $$1.accept(wo.c("item.minecraft.firework_rocket.flight").b(wn.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (czc $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(wo.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<czc> b() {
      return this.e;
   }
}
