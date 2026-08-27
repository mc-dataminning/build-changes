import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsf implements dsc {
   private final jd e;
   private final ie f;
   public static final Codec<dsf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.v(16).optionalFieldOf("offset", jd.g).forGetter($$0x -> $$0x.e), ie.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dsf::new)
   );

   public dsf(jd $$0, ie $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cwm $$0, hz $$1) {
      hz $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dsd<?> a() {
      return dsd.d;
   }
}
