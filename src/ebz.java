import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebz implements ebv {
   public static final MapCodec<ebz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kj.v(16).optionalFieldOf("offset", jf.c).forGetter($$0x -> $$0x.e)).apply($$0, ebz::new)
   );
   private final kj e;

   public ebz(kj $$0) {
      this.e = $$0;
   }

   public boolean a(dfg $$0, jf $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public ebw<?> a() {
      return ebw.h;
   }
}
