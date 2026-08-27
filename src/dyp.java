import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyp implements dyc {
   public static final MapCodec<dyp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(js.v(16).optionalFieldOf("offset", js.g).forGetter($$0x -> $$0x.e), drd.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dyp::new)
   );
   private final js e;
   private final drd f;

   protected dyp(js $$0, drd $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dbu $$0, io $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dyd<?> a() {
      return dyd.g;
   }
}
