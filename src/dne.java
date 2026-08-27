import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dne implements dmr {
   public static final Codec<dne> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.v(16).optionalFieldOf("offset", iw.g).forGetter($$0x -> $$0x.e), dgb.b.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, dne::new)
   );
   private final iw e;
   private final dgb f;

   protected dne(iw $$0, dgb $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(crt $$0, ht $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public dms<?> a() {
      return dms.g;
   }
}
