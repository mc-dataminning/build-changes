import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dea(jk<bwg> c) implements ddy {
   public static final MapCodec<dea> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jv.a(mi.W).fieldOf("effects").forGetter(dea::b)).apply($$0, dea::new));
   public static final ze<wp, dea> b = ze.a(zc.c(mi.W), dea::b, dea::new);

   public dea(jg<bwg> $$0) {
      this(jk.a($$0));
   }

   @Override
   public ddy.a<dea> a() {
      return ddy.a.b;
   }

   @Override
   public boolean a(dkj $$0, dak $$1, byf $$2) {
      boolean $$3 = false;

      for (jg<bwg> $$4 : this.c) {
         if ($$2.e($$4)) {
            $$3 = true;
         }
      }

      return $$3;
   }

   public jk<bwg> b() {
      return this.c;
   }
}
