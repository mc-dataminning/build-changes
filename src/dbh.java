import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dbh(int d, List<dbg> e) implements dbx {
   public static final int a = 256;
   public static final Codec<dbh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.k.optionalFieldOf("flight_duration", 0).forGetter(dbh::a),
               dbg.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(dbh::b)
            )
            .apply($$0, dbh::new)
   );
   public static final yu<ByteBuf, dbh> c = yu.a(ys.h, dbh::a, dbg.d.a(ys.c(256)), dbh::b, dbh::new);

   public dbh(int d, List<dbg> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      if (this.d > 0) {
         $$1.accept(ww.c("item.minecraft.firework_rocket.flight").b(wv.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (dbg $$4 : this.e) {
         $$4.a($$1);
         $$4.b($$1x -> $$1.accept(ww.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<dbg> b() {
      return this.e;
   }
}
