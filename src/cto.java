import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cto(cw.c c) implements ctq {
   public static final MapCodec<cto> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cw.c.d.fieldOf("range").forGetter(cto::b)).apply($$0, cto::new));

   public boolean a(cts $$0) {
      return this.c.d((double)$$0.b().a().as());
   }

   @Override
   public MapCodec<cto> a() {
      return a;
   }

   public cw.c b() {
      return this.c;
   }
}
