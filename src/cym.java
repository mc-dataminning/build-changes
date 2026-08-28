import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record cym(int d, List<cyl> e) implements cyz {
   public static final int a = 256;
   public static final Codec<cym> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayo.j.optionalFieldOf("flight_duration", 0).forGetter(cym::a),
               cyl.c.sizeLimitedListOf(256).optionalFieldOf("explosions", List.of()).forGetter(cym::b)
            )
            .apply($$0, cym::new)
   );
   public static final zc<ByteBuf, cym> c = zc.a(za.h, cym::a, cyl.d.a(za.c(256)), cym::b, cym::new);

   public cym(int d, List<cyl> e) {
      if (e.size() > 256) {
         throw new IllegalArgumentException("Got " + e.size() + " explosions, but maximum is 256");
      } else {
         this.d = d;
         this.e = e;
      }
   }

   @Override
   public void a(cvn.b $$0, Consumer<xe> $$1, cxk $$2) {
      if (this.d > 0) {
         $$1.accept(xe.c("item.minecraft.firework_rocket.flight").b(xd.v).f(String.valueOf(this.d)).a(n.h));
      }

      for (cyl $$3 : this.e) {
         $$3.a($$1);
         $$3.b($$1x -> $$1.accept(xe.b("  ").b($$1x)));
      }
   }

   public int a() {
      return this.d;
   }

   public List<cyl> b() {
      return this.e;
   }
}
