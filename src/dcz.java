import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dcz(int d, List<dcy> e) implements ddp {
   public static final int a = 256;
   public static final Codec<dcz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azg.k.optionalFieldOf("flight_duration", 0).forGetter(dcz::a),
               dcy.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(dcz::b)
            )
            .apply($$0, dcz::new)
   );
   public static final ze<ByteBuf, dcz> c = ze.a(zc.h, dcz::a, dcy.d.a(zc.c(256)), dcz::b, dcz::new);

   public dcz(int d, List<dcy> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      if (this.d > 0) {
         $$1.accept(xg.c("item.minecraft.firework_rocket.flight").b(xf.v).f(String.valueOf(this.d)).a(o.h));
      }

      dcy $$4 = null;
      int $$5 = 0;

      for (dcy $$6 : this.e) {
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

   private static void a(Consumer<xg> $$0, dcy $$1, int $$2) {
      xg $$3 = $$1.a().a();
      if ($$2 == 1) {
         $$0.accept(xg.a("item.minecraft.firework_rocket.single_star", $$3).a(o.h));
      } else {
         $$0.accept(xg.a("item.minecraft.firework_rocket.multiple_stars", $$2, $$3).a(o.h));
      }

      $$1.a((Consumer<xg>)($$1x -> $$0.accept(xg.b("  ").b($$1x))));
   }

   public int a() {
      return this.d;
   }

   public List<dcy> b() {
      return this.e;
   }
}
