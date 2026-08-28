import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cww(int d, List<cwv> e) implements cxi {
   public static final int a = 256;
   public static final Codec<cww> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axo.j.optionalFieldOf("flight_duration", 0).forGetter(cww::a),
               cwv.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cww::b)
            )
            .apply($$0, cww::new)
   );
   public static final ys<ByteBuf, cww> c = ys.a(yq.g, cww::a, cwv.d.a(yq.c(256)), cww::b, cww::new);

   public cww(int d, List<cwv> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cty.b $$0, Consumer<wu> $$1, cvw $$2) {
      if (this.d > 0) {
         $$1.accept(wu.c("item.minecraft.firework_rocket.flight").b(wt.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cwv $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(wu.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cwv> b() {
      return this.e;
   }
}
