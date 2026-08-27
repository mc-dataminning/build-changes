import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cwk(int d, List<cwj> e) implements cww {
   public static final int a = 256;
   public static final Codec<cwk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axn.h.optionalFieldOf("flight_duration", 0).forGetter(cwk::a),
               cwj.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cwk::b)
            )
            .apply($$0, cwk::new)
   );
   public static final yv<ByteBuf, cwk> c = yv.a(yt.f, cwk::a, cwj.d.a(yt.c(256)), cwk::b, cwk::new);

   @Override
   public void a(Consumer<wx> $$0, cvj $$1) {
      if (this.d > 0) {
         $$0.accept(wx.c("item.minecraft.firework_rocket.flight").b(ww.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cwj $$2 : this.e) {
         $$2.a($$0);
         $$2.b($$1x -> $$0.accept(wx.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cwj> b() {
      return this.e;
   }
}
