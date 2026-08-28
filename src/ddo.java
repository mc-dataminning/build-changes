import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddo(jj<bvv> c) implements ddm {
   public static final MapCodec<ddo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ju.a(mh.W).fieldOf("effects").forGetter(ddo::b)).apply($$0, ddo::new));
   public static final yy<wl, ddo> b = yy.a(yw.c(mh.W), ddo::b, ddo::new);

   public ddo(jf<bvv> $$0) {
      this(jj.a($$0));
   }

   @Override
   public ddm.a<ddo> a() {
      return ddm.a.b;
   }

   @Override
   public boolean a(djx $$0, czy $$1, bxu $$2) {
      boolean $$3 = false;

      for (jf<bvv> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public jj<bvv> b() {
      return this.c;
   }
}
