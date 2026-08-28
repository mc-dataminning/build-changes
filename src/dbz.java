import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dbz(int d, List<dby> e) implements dcp {
   public static final int a = 256;
   public static final Codec<dbz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.k.optionalFieldOf("flight_duration", 0).forGetter(dbz::a),
               dby.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(dbz::b)
            )
            .apply($$0, dbz::new)
   );
   public static final yw<ByteBuf, dbz> c = yw.a(yu.h, dbz::a, dby.d.a(yu.c(256)), dbz::b, dbz::new);

   public dbz(int d, List<dby> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      if (this.d > 0) {
         $$1.accept(wy.c("item.minecraft.firework_rocket.flight").b(wx.v).f(String.valueOf(this.d)).a(o.h));
      }

      dby $$4 = null;
      int $$5 = 0;

      for (dby $$6 : this.e) {
         if ($$4 == null) {
            $$4 = $$6;
            $$5 = 1;
         } else if ($$4.equals($$6)) {
            $$5++;
         } else {
            a($$1, $$4, $$5);
            $$4 = $$6;
            $$5 = 1;
         }
      }

      if ($$4 != null) {
         a($$1, $$4, $$5);
      }
   }

   private static void a(Consumer<wy> $$0, dby $$1, int $$2) {
      wy $$3 = $$1.a().a();
      if ($$2 == 1) {
         $$0.accept(wy.a("item.minecraft.firework_rocket.single_star", $$3).a(o.h));
      } else {
         $$0.accept(wy.a("item.minecraft.firework_rocket.multiple_stars", $$2, $$3).a(o.h));
      }

      $$1.a((Consumer<wy>)($$1x -> $$0.accept(wy.b("  ").b($$1x))));
   }

   public int a() {
      return this.d;
   }

   public List<dby> b() {
      return this.e;
   }
}
