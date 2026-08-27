import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyg implements dyc {
   public static final MapCodec<dyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(js.v(16).optionalFieldOf("offset", io.c).forGetter($$0x -> $$0x.e)).apply($$0, dyg::new)
   );
   private final js e;

   public dyg(js $$0) {
      this.e = $$0;
   }

   public boolean a(dbu $$0, io $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dyd<?> a() {
      return dyd.h;
   }
}
