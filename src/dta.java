import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dta implements dsx {
   private final jf e;
   private final ih f;
   public static final Codec<dta> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jf.v(16).optionalFieldOf("offset", jf.g).forGetter($$0x -> $$0x.e), ih.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dta::new)
   );

   public dta(jf $$0, ih $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(cwz $$0, ib $$1) {
      ib $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dsy<?> a() {
      return dsy.d;
   }
}
