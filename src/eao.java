import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eao implements eab {
   public static final Codec<eao> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jv.v(16).optionalFieldOf("offset", jv.g).forGetter($$0x -> $$0x.e), dtc.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, eao::new)
   );
   private final jv e;
   private final dtc f;

   protected eao(jv $$0, dtc $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dcv $$0, ir $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eac<?> a() {
      return eac.g;
   }
}
