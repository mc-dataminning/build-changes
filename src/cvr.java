import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cvr(int d, List<cvq> e) implements cwd {
   public static final int a = 256;
   public static final Codec<cvr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axh.a(axh.h, "flight_duration", Integer.valueOf(0)).forGetter(cvr::a),
               axh.a(axh.a(cvq.c.listOf(), 256), "explosions", List.of()).forGetter(cvr::b)
            )
            .apply($$0, cvr::new)
   );
   public static final ys<ByteBuf, cvr> c = ys.a(yq.f, cvr::a, cvq.d.a(yq.c(256)), cvr::b, cvr::new);

   @Override
   public void a(Consumer<wu> $$0, cuq $$1) {
      if (this.d > 0) {
         $$0.accept(wu.c("item.minecraft.firework_rocket.flight").b(wt.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cvq $$2 : this.e) {
         $$2.a($$0);
         $$2.b($$1x -> $$0.accept(wu.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cvq> b() {
      return this.e;
   }
}
