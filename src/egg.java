import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egg implements efs {
   public static final MapCodec<egg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kn.v(16).optionalFieldOf("offset", kn.i).forGetter($$0x -> $$0x.e), dym.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, egg::new)
   );
   private final kn e;
   private final dym f;

   protected egg(kn $$0, dym $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dio $$0, jj $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public eft<?> a() {
      return eft.g;
   }
}
