import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyn implements dya {
   public static final MapCodec<dyn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(js.v(16).optionalFieldOf("offset", js.g).forGetter($$0x -> $$0x.e), drb.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dyn::new)
   );
   private final js e;
   private final drb f;

   protected dyn(js $$0, drb $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dbs $$0, io $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dyb<?> a() {
      return dyb.g;
   }
}
