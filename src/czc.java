import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record czc(int d, List<czb> e) implements czp {
   public static final int a = 256;
   public static final Codec<czc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayv.k.optionalFieldOf("flight_duration", 0).forGetter(czc::a),
               czb.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(czc::b)
            )
            .apply($$0, czc::new)
   );
   public static final zh<ByteBuf, czc> c = zh.a(zf.h, czc::a, czb.d.a(zf.c(256)), czc::b, czc::new);

   public czc(int d, List<czb> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cwi.b $$0, Consumer<xj> $$1, cye $$2) {
      if (this.d > 0) {
         $$1.accept(xj.c("item.minecraft.firework_rocket.flight").b(xi.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (czb $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xj.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<czb> b() {
      return this.e;
   }
}
