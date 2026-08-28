import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efd implements eep {
   public static final MapCodec<efd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", kl.g).forGetter($$0x -> $$0x.e), dxn.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, efd::new)
   );
   private final kl e;
   private final dxn f;

   protected efd(kl $$0, dxn $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dhy $$0, jh $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eeq<?> a() {
      return eeq.g;
   }
}
