import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class el extends dz<el.a> {
   @Override
   public Codec<el.a> a() {
      return el.a.a;
   }

   public void a(are $$0, ji $$1) {
      double $$2 = $$0.dz() - (double)$$1.u();
      double $$3 = $$0.dF() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bi> b, dk.c c) implements dz.a {
      public static final Codec<el.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(el.a::a), dk.c.d.optionalFieldOf("distance", dk.c.c).forGetter(el.a::b))
               .apply($$0, el.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public dk.c b() {
         return this.c;
      }
   }
}
