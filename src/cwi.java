import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cwi(int d, List<cwh> e) implements cwu {
   public static final int a = 256;
   public static final Codec<cwi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axm.h.optionalFieldOf("flight_duration", 0).forGetter(cwi::a),
               cwh.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cwi::b)
            )
            .apply($$0, cwi::new)
   );
   public static final yv<ByteBuf, cwi> c = yv.a(yt.f, cwi::a, cwh.d.a(yt.c(256)), cwi::b, cwi::new);

   @Override
   public void a(Consumer<wx> $$0, cvh $$1) {
      if (this.d > 0) {
         $$0.accept(wx.c("item.minecraft.firework_rocket.flight").b(ww.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cwh $$2 : this.e) {
         $$2.a($$0);
         $$2.b($$1x -> $$0.accept(wx.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cwh> b() {
      return this.e;
   }
}
