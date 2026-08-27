import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dob implements dny {
   private final iw e;
   private final hx f;
   public static final Codec<dob> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.v(16).optionalFieldOf("offset", iw.g).forGetter($$0x -> $$0x.e), hx.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, dob::new)
   );

   public dob(iw $$0, hx $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(csu $$0, ht $$1) {
      ht $$2 = $$1.a(this.e);
      return $$0.a_($$2).d($$0, $$2, this.f);
   }

   @Override
   public dnz<?> a() {
      return dnz.d;
   }
}
