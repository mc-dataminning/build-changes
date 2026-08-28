import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emv extends emq {
   public static final MapCodec<emv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brj.b(emq.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, emv::new)
   );
   private final brj<emq> b;

   public emv(brj<emq> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(azh $$0, eel $$1) {
      return this.b.b($$0).a($$0, $$1);
   }

   @Override
   public emr<?> a() {
      return emr.f;
   }
}
