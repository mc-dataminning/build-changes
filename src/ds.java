import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ds extends df<ds.a> {
   @Override
   public Codec<ds.a> a() {
      return ds.a.a;
   }

   public void a(aqo $$0, io $$1) {
      double $$2 = $$0.du() - (double)$$1.u();
      double $$3 = $$0.dA() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bc> b, ct.c c) implements df.a {
      public static final Codec<ds.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(br.b.optionalFieldOf("player").forGetter(ds.a::a), ct.c.d.optionalFieldOf("distance", ct.c.c).forGetter(ds.a::b))
               .apply($$0, ds.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public ct.c b() {
         return this.c;
      }
   }
}
