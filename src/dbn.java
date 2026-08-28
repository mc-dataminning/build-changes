import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dbn(int d, List<dbm> e) implements dcd {
   public static final int a = 256;
   public static final Codec<dbn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.k.optionalFieldOf("flight_duration", 0).forGetter(dbn::a),
               dbm.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(dbn::b)
            )
            .apply($$0, dbn::new)
   );
   public static final yw<ByteBuf, dbn> c = yw.a(yu.h, dbn::a, dbm.d.a(yu.c(256)), dbn::b, dbn::new);

   public dbn(int d, List<dbm> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      if (this.d > 0) {
         $$1.accept(wy.c("item.minecraft.firework_rocket.flight").b(wx.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (dbm $$4 : this.e) {
         $$4.a($$1);
         $$4.b($$1x -> $$1.accept(wy.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<dbm> b() {
      return this.e;
   }
}
