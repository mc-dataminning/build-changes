import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxb implements dwx {
   public static final Codec<dxb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jq.v(16).optionalFieldOf("offset", im.c).forGetter($$0x -> $$0x.e)).apply($$0, dxb::new)
   );
   private final jq e;

   public dxb(jq $$0) {
      this.e = $$0;
   }

   public boolean a(dap $$0, im $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public dwy<?> a() {
      return dwy.h;
   }
}
