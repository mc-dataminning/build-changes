import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmu implements dmr {
   private final iw e;
   private final hx f;
   public static final Codec<dmu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.v(16).optionalFieldOf("offset", iw.g).forGetter($$0x -> $$0x.e), hx.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dmu::new)
   );

   public dmu(iw $$0, hx $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(crt $$0, ht $$1) {
      ht $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dms<?> a() {
      return dms.d;
   }
}
