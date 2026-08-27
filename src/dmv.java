import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmv implements dmr {
   public static final Codec<dmv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.v(16).optionalFieldOf("offset", ht.b).forGetter($$0x -> $$0x.e)).apply($$0, dmv::new)
   );
   private final iw e;

   public dmv(iw $$0) {
      this.e = $$0;
   }

   public boolean a(crt $$0, ht $$1) {
      return !$$0.r($$1.a(this.e));
   }

   @Override
   public dms<?> a() {
      return dms.h;
   }
}
