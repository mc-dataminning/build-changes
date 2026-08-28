import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class een implements edz {
   public static final MapCodec<een> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(km.v(16).optionalFieldOf("offset", km.h).forGetter($$0x -> $$0x.e), dwx.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, een::new)
   );
   private final km e;
   private final dwx f;

   protected een(km $$0, dwx $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dhg $$0, ji $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eea<?> a() {
      return eea.g;
   }
}
