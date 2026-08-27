import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record cy(cl.d c) implements br {
   public static final MapCodec<cy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(asu.a(cl.d.d, "size", cl.d.c).forGetter(cy::b)).apply($$0, cy::new));

   public static cy a(cl.d $$0) {
      return new cy($$0);
   }

   @Override
   public boolean a(bkq $$0, ame $$1, @Nullable eju $$2) {
      return $$0 instanceof cbr $$3 ? this.c.d($$3.gg()) : false;
   }

   @Override
   public br.a a() {
      return br.b.e;
   }

   public cl.d b() {
      return this.c;
   }
}
