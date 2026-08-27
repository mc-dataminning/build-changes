import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record cy(cl.d c) implements br {
   public static final MapCodec<cy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(arb.a(cl.d.d, "size", cl.d.c).forGetter(cy::b)).apply($$0, cy::new));

   public static cy a(cl.d $$0) {
      return new cy($$0);
   }

   @Override
   public boolean a(bil $$0, akn $$1, @Nullable ehi $$2) {
      return $$0 instanceof bzm $$3 ? this.c.d($$3.gb()) : false;
   }

   @Override
   public br.a a() {
      return br.b.e;
   }

   public cl.d b() {
      return this.c;
   }
}
