import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cxj(int d, List<cxi> e) implements cxv {
   public static final int a = 256;
   public static final Codec<cxj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.j.optionalFieldOf("flight_duration", 0).forGetter(cxj::a),
               cxi.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cxj::b)
            )
            .apply($$0, cxj::new)
   );
   public static final zn<ByteBuf, cxj> c = zn.a(zl.g, cxj::a, cxi.d.a(zl.c(256)), cxj::b, cxj::new);

   public cxj(int d, List<cxi> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cuk.b $$0, Consumer<xp> $$1, cwi $$2) {
      if (this.d > 0) {
         $$1.accept(xp.c("item.minecraft.firework_rocket.flight").b(xo.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cxi $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xp.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cxi> b() {
      return this.e;
   }
}
