import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dad(jv<bto> c) implements dab {
   public static final MapCodec<dad> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kg.a(mc.W).fieldOf("effects").forGetter(dad::b)).apply($$0, dad::new));
   public static final yn<wa, dad> b = yn.a(yl.c(mc.W), dad::b, dad::new);

   public dad(jr<bto> $$0) {
      this(jv.a($$0));
   }

   @Override
   public dab.a<dad> a() {
      return dab.a.b;
   }

   @Override
   public boolean a(dgi $$0, cwp $$1, bvh $$2) {
      boolean $$3 = false;

      for (jr<bto> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public jv<bto> b() {
      return this.c;
   }
}
