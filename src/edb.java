import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edb implements ecx {
   public static final MapCodec<edb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", jh.c).forGetter($$0x -> $$0x.e)).apply($$0, edb::new)
   );
   private final kl e;

   public edb(kl $$0) {
      this.e = $$0;
   }

   public boolean a(dgk $$0, jh $$1) {
      return !$$0.s($$1.a(this.e));
   }

   @Override
   public ecy<?> a() {
      return ecy.h;
   }
}
