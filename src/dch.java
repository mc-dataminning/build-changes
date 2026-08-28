import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dch(je<awk> c) implements dcg {
   public static final MapCodec<dch> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awk.b.fieldOf("sound").forGetter(dch::b)).apply($$0, dch::new));
   public static final yu<wh, dch> b = yu.a(awk.d, dch::b, dch::new);

   @Override
   public dcg.a<dch> a() {
      return dcg.a.e;
   }

   @Override
   public boolean a(dip $$0, cys $$1, bwz $$2) {
      $$0.a(null, $$2.dv(), this.c.a(), $$2.dm(), 1.0F, 1.0F);
      return true;
   }

   public je<awk> b() {
      return this.c;
   }
}
