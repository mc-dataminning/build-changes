import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebh implements ebd {
   public static final MapCodec<ebh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ki.v(16).optionalFieldOf("offset", je.c).forGetter($$0x -> $$0x.e)).apply($$0, ebh::new)
   );
   private final ki e;

   public ebh(ki $$0) {
      this.e = $$0;
   }

   public boolean a(dep $$0, je $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public ebe<?> a() {
      return ebe.h;
   }
}
