import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eip implements eim {
   private final kb e;
   private final jc f;
   public static final MapCodec<eip> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.v(16).optionalFieldOf("offset", kb.i).forGetter($$0x -> $$0x.e), jc.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, eip::new)
   );

   public eip(kb $$0, jc $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dky $$0, iw $$1) {
      iw $$2 = $$1.a(this.e);
      return $$0.a_($$2).c($$0, $$2, this.f);
   }

   @Override
   public ein<?> a() {
      return ein.d;
   }
}
