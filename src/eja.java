import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eja implements eim {
   public static final MapCodec<eja> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.v(16).optionalFieldOf("offset", kb.i).forGetter($$0x -> $$0x.e), ebg.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eja::new)
   );
   private final kb e;
   private final ebg f;

   protected eja(kb $$0, ebg $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dky $$0, iw $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public ein<?> a() {
      return ein.g;
   }
}
