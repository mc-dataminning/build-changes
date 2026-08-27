import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class df extends cv<df.a> {
   @Override
   public Codec<df.a> a() {
      return df.a.a;
   }

   public void a(anf $$0, hx $$1) {
      double $$2 = $$0.dq() - (double)$$1.u();
      double $$3 = $$0.dw() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bb> b, ck.c c) implements cv.a {
      public static final Codec<df.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atx.a(bp.b, "player").forGetter(df.a::a), atx.a(ck.c.d, "distance", ck.c.c).forGetter(df.a::b)).apply($$0, df.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public ck.c b() {
         return this.c;
      }
   }
}
