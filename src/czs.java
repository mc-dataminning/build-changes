import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czs(jq<awn> c) implements czr {
   public static final MapCodec<czs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awn.b.fieldOf("sound").forGetter(czs::b)).apply($$0, czs::new));
   public static final zj<ww, czs> b = zj.a(awn.d, czs::b, czs::new);

   @Override
   public czr.a<czs> a() {
      return czr.a.e;
   }

   @Override
   public boolean a(dff $$0, cwf $$1, bve $$2) {
      $$0.a(null, $$2.dy(), this.c.a(), $$2.do(), 1.0F, 1.0F);
      return true;
   }

   public jq<awn> b() {
      return this.c;
   }
}
