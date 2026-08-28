import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cxk(int d, List<cxj> e) implements cxw {
   public static final int a = 256;
   public static final Codec<cxk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.j.optionalFieldOf("flight_duration", 0).forGetter(cxk::a),
               cxj.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cxk::b)
            )
            .apply($$0, cxk::new)
   );
   public static final zn<ByteBuf, cxk> c = zn.a(zl.g, cxk::a, cxj.d.a(zl.c(256)), cxk::b, cxk::new);

   public cxk(int d, List<cxj> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cul.b $$0, Consumer<xp> $$1, cwj $$2) {
      if (this.d > 0) {
         $$1.accept(xp.c("item.minecraft.firework_rocket.flight").b(xo.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cxj $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xp.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cxj> b() {
      return this.e;
   }
}
