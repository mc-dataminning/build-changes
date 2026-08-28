import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dcp(int d, List<dco> e) implements ddf {
   public static final int a = 256;
   public static final Codec<dcp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayy.k.optionalFieldOf("flight_duration", 0).forGetter(dcp::a),
               dco.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(dcp::b)
            )
            .apply($$0, dcp::new)
   );
   public static final za<ByteBuf, dcp> c = za.a(yy.h, dcp::a, dco.d.a(yy.c(256)), dcp::b, dcp::new);

   public dcp(int d, List<dco> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      if (this.d > 0) {
         $$1.accept(xc.c("item.minecraft.firework_rocket.flight").b(xb.v).f(String.valueOf(this.d)).a(o.h));
      }

      dco $$4 = null;
      int $$5 = 0;

      for (dco $$6 : this.e) {
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

   private static void a(Consumer<xc> $$0, dco $$1, int $$2) {
      xc $$3 = $$1.a().a();
      if ($$2 == 1) {
         $$0.accept(xc.a("item.minecraft.firework_rocket.single_star", $$3).a(o.h));
      } else {
         $$0.accept(xc.a("item.minecraft.firework_rocket.multiple_stars", $$2, $$3).a(o.h));
      }

      $$1.a((Consumer<xc>)($$1x -> $$0.accept(xc.b("  ").b($$1x))));
   }

   public int a() {
      return this.d;
   }

   public List<dco> b() {
      return this.e;
   }
}
