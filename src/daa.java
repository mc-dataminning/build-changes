import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record daa(int d, List<czz> e) implements dan {
   public static final int a = 256;
   public static final Codec<daa> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.k.optionalFieldOf("flight_duration", 0).forGetter(daa::a),
               czz.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(daa::b)
            )
            .apply($$0, daa::new)
   );
   public static final zt<ByteBuf, daa> c = zt.a(zr.h, daa::a, czz.d.a(zr.c(256)), daa::b, daa::new);

   public daa(int d, List<czz> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cxg.b $$0, Consumer<xv> $$1, czc $$2) {
      if (this.d > 0) {
         $$1.accept(xv.c("item.minecraft.firework_rocket.flight").b(xu.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (czz $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xv.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<czz> b() {
      return this.e;
   }
}
