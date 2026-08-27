import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmf implements dmb {
   public static final Codec<dmf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ib.v(16).optionalFieldOf("offset", gw.b).forGetter($$0x -> $$0x.e)).apply($$0, dmf::new)
   );
   private final ib e;

   public dmf(ib $$0) {
      this.e = $$0;
   }

   public boolean a(cqr $$0, gw $$1) {
      return !$$0.r($$1.a(this.e));
   }

   @Override
   public dmc<?> a() {
      return dmc.h;
   }
}
