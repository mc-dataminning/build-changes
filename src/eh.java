import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eh extends dv<eh.a> {
   @Override
   public Codec<eh.a> a() {
      return eh.a.a;
   }

   public void a(aqv $$0, jd $$1) {
      double $$2 = $$0.dt() - (double)$$1.u();
      double $$3 = $$0.dz() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bg> b, dh.c c) implements dv.a {
      public static final Codec<eh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(eh.a::a), dh.c.d.optionalFieldOf("distance", dh.c.c).forGetter(eh.a::b))
               .apply($$0, eh.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public dh.c b() {
         return this.c;
      }
   }
}
