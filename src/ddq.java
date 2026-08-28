import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddq(jk<bvx> c) implements ddo {
   public static final MapCodec<ddq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jv.a(mi.W).fieldOf("effects").forGetter(ddq::b)).apply($$0, ddq::new));
   public static final za<wn, ddq> b = za.a(yy.c(mi.W), ddq::b, ddq::new);

   public ddq(jg<bvx> $$0) {
      this(jk.a($$0));
   }

   @Override
   public ddo.a<ddq> a() {
      return ddo.a.b;
   }

   @Override
   public boolean a(djz $$0, daa $$1, bxw $$2) {
      boolean $$3 = false;

      for (jg<bvx> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public jk<bvx> b() {
      return this.c;
   }
}
