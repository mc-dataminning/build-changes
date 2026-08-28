import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dcn(int d, List<dcm> e) implements ddd {
   public static final int a = 256;
   public static final Codec<dcn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.k.optionalFieldOf("flight_duration", 0).forGetter(dcn::a),
               dcm.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(dcn::b)
            )
            .apply($$0, dcn::new)
   );
   public static final yy<ByteBuf, dcn> c = yy.a(yw.h, dcn::a, dcm.d.a(yw.c(256)), dcn::b, dcn::new);

   public dcn(int d, List<dcm> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      if (this.d > 0) {
         $$1.accept(xa.c("item.minecraft.firework_rocket.flight").b(wz.v).f(String.valueOf(this.d)).a(o.h));
      }

      dcm $$4 = null;
      int $$5 = 0;

      for (dcm $$6 : this.e) {
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

   private static void a(Consumer<xa> $$0, dcm $$1, int $$2) {
      xa $$3 = $$1.a().a();
      if ($$2 == 1) {
         $$0.accept(xa.a("item.minecraft.firework_rocket.single_star", $$3).a(o.h));
      } else {
         $$0.accept(xa.a("item.minecraft.firework_rocket.multiple_stars", $$2, $$3).a(o.h));
      }

      $$1.a((Consumer<xa>)($$1x -> $$0.accept(xa.b("  ").b($$1x))));
   }

   public int a() {
      return this.d;
   }

   public List<dcm> b() {
      return this.e;
   }
}
