import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dco(ji<bvf> c) implements dcm {
   public static final MapCodec<dco> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jt.a(mg.W).fieldOf("effects").forGetter(dco::b)).apply($$0, dco::new));
   public static final yw<wj, dco> b = yw.a(yu.c(mg.W), dco::b, dco::new);

   public dco(je<bvf> $$0) {
      this(ji.a($$0));
   }

   @Override
   public dcm.a<dco> a() {
      return dcm.a.b;
   }

   @Override
   public boolean a(div $$0, cyy $$1, bxc $$2) {
      boolean $$3 = false;

      for (je<bvf> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public ji<bvf> b() {
      return this.c;
   }
}
