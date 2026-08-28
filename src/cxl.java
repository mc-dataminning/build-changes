import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cxl(int d, List<cxk> e) implements cxx {
   public static final int a = 256;
   public static final Codec<cxl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.j.optionalFieldOf("flight_duration", 0).forGetter(cxl::a),
               cxk.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cxl::b)
            )
            .apply($$0, cxl::new)
   );
   public static final zn<ByteBuf, cxl> c = zn.a(zl.g, cxl::a, cxk.d.a(zl.c(256)), cxl::b, cxl::new);

   public cxl(int d, List<cxk> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cum.b $$0, Consumer<xp> $$1, cwk $$2) {
      if (this.d > 0) {
         $$1.accept(xp.c("item.minecraft.firework_rocket.flight").b(xo.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cxk $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xp.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cxk> b() {
      return this.e;
   }
}
