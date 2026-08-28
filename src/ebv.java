import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebv implements ebr {
   public static final MapCodec<ebv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ki.v(16).optionalFieldOf("offset", je.c).forGetter($$0x -> $$0x.e)).apply($$0, ebv::new)
   );
   private final ki e;

   public ebv(ki $$0) {
      this.e = $$0;
   }

   public boolean a(dfd $$0, je $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public ebs<?> a() {
      return ebs.h;
   }
}
