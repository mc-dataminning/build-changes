import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtb implements dsx {
   public static final Codec<dtb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jf.v(16).optionalFieldOf("offset", ib.c).forGetter($$0x -> $$0x.e)).apply($$0, dtb::new)
   );
   private final jf e;

   public dtb(jf $$0) {
      this.e = $$0;
   }

   public boolean a(cwz $$0, ib $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dsy<?> a() {
      return dsy.h;
   }
}
