import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaf implements eac {
   private final kh e;
   private final ji f;
   public static final MapCodec<eaf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.v(16).optionalFieldOf("offset", kh.g).forGetter($$0x -> $$0x.e), ji.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, eaf::new)
   );

   public eaf(kh $$0, ji $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(ddq $$0, jd $$1) {
      jd $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public ead<?> a() {
      return ead.d;
   }
}
