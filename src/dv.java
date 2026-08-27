import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dv extends dh<dv.a> {
   @Override
   public Codec<dv.a> a() {
      return dv.a.a;
   }

   public void a(aqu $$0, ir $$1) {
      double $$2 = $$0.dz() - (double)$$1.u();
      double $$3 = $$0.dF() - (double)$$1.w();
      double $$4 = $$2 * $$2 + $$3 * $$3;
      this.a($$0, $$1x -> $$1x.a($$4));
   }

   public static record a(Optional<bd> b, cu.c c) implements dh.a {
      public static final Codec<dv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(dv.a::a), axu.a(cu.c.d, "distance", cu.c.c).forGetter(dv.a::b)).apply($$0, dv.a::new)
      );

      public boolean a(double $$0) {
         return this.c.e($$0);
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public cu.c b() {
         return this.c;
      }
   }
}
