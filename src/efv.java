import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efv implements efs {
   private final kn e;
   private final jo f;
   public static final MapCodec<efv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kn.v(16).optionalFieldOf("offset", kn.i).forGetter($$0x -> $$0x.e), jo.g.fieldOf("direction").forGetter($$0x -> $$0x.f))
            .apply($$0, efv::new)
   );

   public efv(kn $$0, jo $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dio $$0, jj $$1) {
      jj $$2 = $$1.a(this.e);
      return $$0.a_($$2).c($$0, $$2, this.f);
   }

   @Override
   public eft<?> a() {
      return eft.d;
   }
}
