import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edl implements ecx {
   public static final MapCodec<edl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kl.v(16).optionalFieldOf("offset", kl.g).forGetter($$0x -> $$0x.e), dvv.a.fieldOf("state").forGetter($$0x -> $$0x.f))
            .apply($$0, edl::new)
   );
   private final kl e;
   private final dvv f;

   protected edl(kl $$0, dvv $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public boolean a(dgk $$0, jh $$1) {
      return this.f.a($$0, $$1.a(this.e));
   }

   @Override
   public ecy<?> a() {
      return ecy.g;
   }
}
