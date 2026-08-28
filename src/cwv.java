import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cwv(int d, List<cwu> e) implements cxh {
   public static final int a = 256;
   public static final Codec<cwv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.j.optionalFieldOf("flight_duration", 0).forGetter(cwv::a),
               cwu.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cwv::b)
            )
            .apply($$0, cwv::new)
   );
   public static final ys<ByteBuf, cwv> c = ys.a(yq.g, cwv::a, cwu.d.a(yq.c(256)), cwv::b, cwv::new);

   public cwv(int d, List<cwu> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(ctx.b $$0, Consumer<wu> $$1, cvv $$2) {
      if (this.d > 0) {
         $$1.accept(wu.c("item.minecraft.firework_rocket.flight").b(wt.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cwu $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(wu.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cwu> b() {
      return this.e;
   }
}
