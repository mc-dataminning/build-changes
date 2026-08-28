import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dal(int d, List<dak> e) implements day {
   public static final int a = 256;
   public static final Codec<dal> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.k.optionalFieldOf("flight_duration", 0).forGetter(dal::a),
               dak.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(dal::b)
            )
            .apply($$0, dal::new)
   );
   public static final yt<ByteBuf, dal> c = yt.a(yr.h, dal::a, dak.d.a(yr.c(256)), dal::b, dal::new);

   public dal(int d, List<dak> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cxu.b $$0, Consumer<wv> $$1, czn $$2) {
      if (this.d > 0) {
         $$1.accept(wv.c("item.minecraft.firework_rocket.flight").b(wu.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (dak $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(wv.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<dak> b() {
      return this.e;
   }
}
