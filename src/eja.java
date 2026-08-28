import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eja implements eiw {
   public static final MapCodec<eja> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.v(16).optionalFieldOf("offset", iw.c).forGetter($$0x -> $$0x.e)).apply($$0, eja::new)
   );
   private final kb e;

   public eja(kb $$0) {
      this.e = $$0;
   }

   public boolean a(dli $$0, iw $$1) {
      return !$$0.t($$1.a(this.e));
   }

   @Override
   public eix<?> a() {
      return eix.h;
   }
}
