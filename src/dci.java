import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dci(ji<bvc> c) implements dcg {
   public static final MapCodec<dci> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jt.a(mg.W).fieldOf("effects").forGetter(dci::b)).apply($$0, dci::new));
   public static final yu<wh, dci> b = yu.a(ys.c(mg.W), dci::b, dci::new);

   public dci(je<bvc> $$0) {
      this(ji.a($$0));
   }

   @Override
   public dcg.a<dci> a() {
      return dcg.a.b;
   }

   @Override
   public boolean a(dip $$0, cys $$1, bwz $$2) {
      boolean $$3 = false;

      for (je<bvc> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public ji<bvc> b() {
      return this.c;
   }
}
