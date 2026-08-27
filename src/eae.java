import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eae implements eab {
   private final jv e;
   private final iw f;
   public static final Codec<eae> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jv.v(16).optionalFieldOf("offset", jv.g).forGetter($$0x -> $$0x.e), iw.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, eae::new)
   );

   public eae(jv $$0, iw $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dcv $$0, ir $$1) {
      ir $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public eac<?> a() {
      return eac.d;
   }
}
