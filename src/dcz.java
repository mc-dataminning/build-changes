import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcz(jf<awm> c) implements dcy {
   public static final MapCodec<dcz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(awm.b.fieldOf("sound").forGetter(dcz::b)).apply($$0, dcz::new));
   public static final yw<wj, dcz> b = yw.a(awm.d, dcz::b, dcz::new);

   @Override
   public dcy.a<dcz> a() {
      return dcy.a.e;
   }

   @Override
   public boolean a(djh $$0, czk $$1, bxj $$2) {
      $$0.a(null, $$2.du(), this.c.a(), $$2.dl(), 1.0F, 1.0F);
      return true;
   }

   public jf<awm> b() {
      return this.c;
   }
}
