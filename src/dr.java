import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dr extends de<dr.a> {
   @Override
   public Codec<dr.a> a() {
      return dr.a.a;
   }

   public void a(aqi $$0, in $$1) {
      double $$2 = $$0.ds() - (double)$$1.u();
      double $$3 = $$0.dy() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bc> b, ct.c c) implements de.a {
      public static final Codec<dr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axh.a(br.b, "player").forGetter(dr.a::a), axh.a(ct.c.d, "distance", ct.c.c).forGetter(dr.a::b)).apply($$0, dr.a::new)
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
