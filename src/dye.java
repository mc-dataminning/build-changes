import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dye implements dya {
   public static final MapCodec<dye> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(js.v(16).optionalFieldOf("offset", io.c).forGetter($$0x -> $$0x.e)).apply($$0, dye::new)
   );
   private final js e;

   public dye(js $$0) {
      this.e = $$0;
   }

   public boolean a(dbs $$0, io $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dyb<?> a() {
      return dyb.h;
   }
}
