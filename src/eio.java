import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eio implements eik {
   public static final MapCodec<eio> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ka.v(16).optionalFieldOf("offset", iv.c).forGetter($$0x -> $$0x.e)).apply($$0, eio::new)
   );
   private final ka e;

   public eio(ka $$0) {
      this.e = $$0;
   }

   public boolean a(dkw $$0, iv $$1) {
      return !$$0.t($$1.a(this.e));
   }

   @Override
   public eil<?> a() {
      return eil.h;
   }
}
