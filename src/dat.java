import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dat(jq<awu> c) implements das {
   public static final MapCodec<dat> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awu.b.fieldOf("sound").forGetter(dat::b)).apply($$0, dat::new));
   public static final zi<wv, dat> b = zi.a(awu.d, dat::b, dat::new);

   @Override
   public das.a<dat> a() {
      return das.a.e;
   }

   @Override
   public boolean a(dgz $$0, cxg $$1, bvx $$2) {
      $$0.a(null, $$2.dw(), this.c.a(), $$2.dn(), 1.0F, 1.0F);
      return true;
   }

   public jq<awu> b() {
      return this.c;
   }
}
