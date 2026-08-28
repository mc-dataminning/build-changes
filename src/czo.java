import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czo(jq<awk> c) implements czn {
   public static final MapCodec<czo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awk.b.fieldOf("sound").forGetter(czo::b)).apply($$0, czo::new));
   public static final zg<wt, czo> b = zg.a(awk.d, czo::b, czo::new);

   @Override
   public czn.a<czo> a() {
      return czn.a.e;
   }

   @Override
   public boolean a(dfb $$0, cwb $$1, bva $$2) {
      $$0.a(null, $$2.dx(), this.c.a(), $$2.dn(), 1.0F, 1.0F);
      return true;
   }

   public jq<awk> b() {
      return this.c;
   }
}
